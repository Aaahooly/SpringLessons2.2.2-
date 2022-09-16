package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoListImpl implements CarDao {

    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Honda", "Civic", 2006));
        carList.add(new Car("Chevrolet", "Cruze", 2008));
        carList.add(new Car("Toyota", "Camry", 2018));
        carList.add(new Car("Nissan", "Juke", 2000));
        carList.add(new Car("Lada", "Vesta", 2022));
    }

    public List<Car> getCarList() {
        return carList;
    }
}
