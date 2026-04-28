package com.logistics.routestracker.checkpoints;

public class RestCheckpoint extends Checkpoint {

    public RestCheckpoint(String id, String loc, double dist, double exp, double act) {
        super(id, loc, dist, exp, act);
    }

    public boolean isCritical() {
        return false;
    }

    public String getType() {
        return "RestCheckpoint";
    }

    public double calculatePenalty() {
        if (!isDelayed()) {
            return 0;
        }
        double delay = actualDuration - expectedDuration;
        return delay > 30 ? delay * 0.5 : 0;
    }
}