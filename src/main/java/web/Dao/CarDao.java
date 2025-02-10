package web.Dao;


import web.model.Car;

import java.util.List;

public interface CarDao {
        List<Car> findAll();
        List<Car> findByCount(int count);
    }

