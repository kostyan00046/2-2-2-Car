package web.service;

import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarDao {
    private final List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 2010));
        cars.add(new Car("Honda", "Civic", 2015));
        cars.add(new Car("Ford", "Focus", 2020));
        cars.add(new Car("Mazda", "CX-5", 2018));
        cars.add(new Car("Nissan", "Leaf", 2017));
    }

    @Override
    public List<Car> findAll() {
        return cars;
    }

    @Override
    public List<Car> findByCount(int count) {
        return cars.subList(0, Math.min(cars.size(), count));
    }
}
