package sample;

import com.autodoc.business.contract.CarManager;
import com.autodoc.business.impl.CarManagerImpl;
import com.autodoc.model.Car;

public class Env {

    private CarManager carManager;

    Car getCarFromBusiness(){
        carManager = new CarManagerImpl();
        System.out.println("from web");
        return carManager.getCar();
    }

    public static void main(String[] args) {
        new Env().getCarFromBusiness();
    }
}
