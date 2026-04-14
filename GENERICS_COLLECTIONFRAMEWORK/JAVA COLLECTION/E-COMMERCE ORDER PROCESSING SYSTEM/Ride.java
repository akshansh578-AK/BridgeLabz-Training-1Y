public class Ride {
    private RideRequest request;
    private Driver driver;

    public Ride(RideRequest request, Driver driver) {
        this.request = request;
        this.driver = driver;
    }

    @Override
    public String toString() {
        return request.getRequestId() + " served by " + driver.getName();
    }
}