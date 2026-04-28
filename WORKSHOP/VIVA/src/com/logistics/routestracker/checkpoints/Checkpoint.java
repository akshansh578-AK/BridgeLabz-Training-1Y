package com.logistics.routestracker.checkpoints;

public abstract class Checkpoint {
    protected String checkpointId;
    protected String locationName;
    protected double distanceFromLast;
    protected double expectedDuration;
    protected double actualDuration;

    public Checkpoint(String id, String location, double distance, double expected, double actual) {
        this.checkpointId = id;
        this.locationName = location;
        this.distanceFromLast = distance;
        this.expectedDuration = expected;
        this.actualDuration = actual;
    }

    public String getCheckpointId() {
        return checkpointId;
    }

    public String getLocationName() {
        return locationName;
    }

    public double getDistance() {
        return distanceFromLast;
    }

    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    public abstract boolean isCritical();

    public abstract String getType();

    public abstract double calculatePenalty();
}