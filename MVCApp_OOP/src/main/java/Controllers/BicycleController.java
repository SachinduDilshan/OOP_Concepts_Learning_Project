package Controllers;

import Models.Bicycle;
import DatabaseAccessLayer.BicycleAccessLogic;

public class BicycleController {

    Bicycle objBike;
    BicycleAccessLogic bal;

    public BicycleController() {
        bal = new BicycleAccessLogic();
    }

    public Bicycle addBike(int Gear, float Speed) {
        objBike = new Bicycle(Gear, Speed);
        return objBike;
    }

    public boolean insertBikeToDB(Bicycle bike) {
        boolean result = bal.addBicycleTODB(bike);
        return result;
    }
}
