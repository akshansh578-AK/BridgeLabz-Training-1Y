public class Main2 {
    public static void main(String[] args) {

        RideDispatcher system = new RideDispatcher();

        // ---------------- DRIVERS ----------------
        system.addDriver(new Driver("D101", "Amit"));
        system.addDriver(new Driver("D102", "Ravi"));
        system.addDriver(new Driver("D103", "Neha"));
        system.addDriver(new Driver("D101", "Duplicate Amit")); // duplicate

        // ---------------- RIDE REQUESTS ----------------
        system.addRequest(new RideRequest("R1", "John", 2, 5));
        system.addRequest(new RideRequest("R2", "Alice", 5, 3));
        system.addRequest(new RideRequest("R3", "Bob", 4, 10));
        system.addRequest(new RideRequest("R4", "David", 5, 2));

        // ---------------- STATUS BEFORE DISPATCH ----------------
        system.showStatus();

        // ---------------- DISPATCH RIDES ----------------
        system.dispatchRides();

        // ---------------- COMPLETED HISTORY ----------------
        system.showRideHistory();
    }
}