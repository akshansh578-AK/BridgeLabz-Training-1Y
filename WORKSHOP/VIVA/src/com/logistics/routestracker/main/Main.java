package com.logistics.routestracker.main;

import com.logistics.routestracker.model.Driver;
import com.logistics.routestracker.checkpoints.*;

public class Main {
    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita Nair");

        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 30, 60, 70));
        d.routeHistory.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20, 30, 30));
        d.routeHistory.addCheckpoint(new RestCheckpoint("C3", "Motel X", 10, 20, 55));
        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 60, 90, 105));

        d.printSummary();
    }
}