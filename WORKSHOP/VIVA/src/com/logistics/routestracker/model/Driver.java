package com.logistics.routestracker.model;

import com.logistics.routestracker.list.RouteLinkedList;
import com.logistics.routestracker.checkpoints.Checkpoint;

public class Driver {
    String driverId;
    String name;
    public RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public void printSummary() {
        System.out.println("Driver: " + driverId + " - " + name);
        System.out.println("Route Summary:");

        routeHistory.printRoute();

        double dist = routeHistory.computeTotalDistance();
        double pen = routeHistory.computeTotalPenalty();

        System.out.println("Total Distance: " + dist + " km");
        System.out.println("Total Penalty: " + pen);
        System.out.println("Route Score: " + (dist - pen));
        System.out.println("Critical Route Check: " +
                (routeHistory.checkCritical() ? "All required checkpoints present" : "Missing critical checkpoints"));
    }
}