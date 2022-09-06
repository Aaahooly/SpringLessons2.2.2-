package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Honda", "Civic", 2006));
        carList.add(new Car("Chevrolet", "Cruze", 2008));
        carList.add(new Car("Toyota", "Camry", 2018));
        carList.add(new Car("Nissan", "Juke", 2000));
        carList.add(new Car("Lada", "Vesta", 2022));
    }

    public List<Car> index(Integer count) {
        System.out.println(count);
        List<Car> resList = new ArrayList<>();
        if (count == null) {
            return carList;
        } else if (count == 2) {
            for (int i = 0; i < count; i++) {
                resList.add(carList.get(i));
            }
            return resList;
        } else if (count == 3) {
            for (int i = 0; i < count; i++) {
                resList.add(carList.get(i));
            }
            return resList;
        } else if (count >= 5) {
            return carList;
        }
        return carList;
    }
}
