package web.service;

import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final CarDao carDao;
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    public List<Car> getCars(int count) {
        return carDao.findByCount(count);
    }
}