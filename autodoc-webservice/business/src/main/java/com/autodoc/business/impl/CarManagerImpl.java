package com.autodoc.business.impl;

import com.autodoc.business.contract.CarManager;
import com.autodoc.dao.contract.CarDao;
import com.autodoc.dao.impl.CarDaoImpl;
import com.autodoc.model.Car;

public class CarManagerImpl implements CarManager {

    private CarDao carDao;

    @Override
    public Car getCar() {
        carDao = new CarDaoImpl();
        System.out.println("from business");
        return carDao.getCar();
    }
}
