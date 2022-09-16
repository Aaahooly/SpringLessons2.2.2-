package web.Service;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;


@Service
public class CarServiceImpl implements CarService {

     private final CarDao carDaoListImpl;

    public CarServiceImpl(CarDao carDaoListImpl) {
        this.carDaoListImpl = carDaoListImpl;
    }

    public List<Car> index(Integer count) {
        System.out.println(count);
    if (count == null || (count >= 5)) {
            return carDaoListImpl.getCarList();
        } else return carDaoListImpl.getCarList().subList(0, count);
    }
}
