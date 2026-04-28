package com.logistics.routestracker.checkpoints;

public class DeliveryCheckpoint extends Checkpoint {

    public DeliveryCheckpoint(String id, String loc, double dist, double exp, double act) {
        super(id, loc, dist, exp, act);
    }

    public boolean isCritical() {
        return true;
    }

    public String getType() {
        return "DeliveryCheckpoint";
    }

    public double calculatePenalty() {
        if (!isDelayed()) {
            return 0;
        }
        return (actualDuration - expectedDuration) * 2;
    }
}