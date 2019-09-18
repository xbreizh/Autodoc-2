package com.autodoc.dao.impl;

import com.autodoc.dao.contract.CarDao;
import com.autodoc.model.Car;

public class CarDaoImpl implements CarDao {
    @Override
    public Car getCar() {
        return new Car();
    }
}
