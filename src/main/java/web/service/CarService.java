package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarDao carDao;

    public List<Car> getAllCars() {
        return carDao.findAll();
    }

    public List<Car> getCars(int count) {
        return carDao.findByCount(count);
    }
}
