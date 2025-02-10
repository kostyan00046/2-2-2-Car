package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla", 2010));
        cars.add(new Car("Honda", "Civic", 2015));
        cars.add(new Car("Ford", "Focus", 2020));
        cars.add(new Car("Mazda", "CX-5", 2018));
        cars.add(new Car("Nissan", "Leaf", 2017));
    }

    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
