public class Driver {
    private String driverId;
    private String name;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
    }

    public String getDriverId() {
        return driverId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return driverId + " - " + name;
    }

    // Avoid duplicate drivers based on ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Driver)) return false;
        Driver d = (Driver) o;
        return driverId.equals(d.driverId);
    }

    @Override
    public int hashCode() {
        return driverId.hashCode();
    }
}