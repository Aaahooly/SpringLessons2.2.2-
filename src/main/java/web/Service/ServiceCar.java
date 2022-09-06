package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Component
public class ServiceCar {

    private final CarDao carDao;

    @Autowired
    public ServiceCar(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> index(Integer count) {
        return carDao.index(count);
    }
}
