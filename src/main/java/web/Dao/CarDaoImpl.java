package web.Dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    public CarDaoImpl() {
        cars = getAllCars();
    }
    @Override
    public List<Car> getAllCars() {
        List<Car> init = new ArrayList<>();
        init.add(new Car("Skoda", "CZE", 2020));
        init.add(new Car("BMW", "GER", 2011));
        init.add(new Car("Aston Martin", "GBR", 1999));
        init.add(new Car("Lotus", "GBR", 2010));
        init.add(new Car("Nissan", "JPN", 2023));
        return init;
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
