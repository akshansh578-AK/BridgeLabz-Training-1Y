import java.util.*;

public class RideDispatcher {

    // pending requests (FIFO basic queue)
    private Queue<RideRequest> requestQueue = new LinkedList<>();

    // high priority queue
    private PriorityQueue<RideRequest> priorityQueue =
            new PriorityQueue<>((a, b) -> {
                if (b.getPriority() == a.getPriority()) {
                    return a.getDistance() - b.getDistance();
                }
                return b.getPriority() - a.getPriority();
            });

    // available drivers
    private Set<Driver> drivers = new HashSet<>();

    // completed rides
    private List<Ride> rideHistory = new ArrayList<>();

    // ---------------- DRIVER MANAGEMENT ----------------

    public void addDriver(Driver d) {
        if (drivers.add(d)) {
            System.out.println("Driver added: " + d);
        } else {
            System.out.println("Duplicate driver ignored: " + d);
        }
    }

    // ---------------- REQUEST MANAGEMENT ----------------

    public void addRequest(RideRequest r) {
        requestQueue.add(r);
        priorityQueue.add(r);
        System.out.println("Request added: " + r);
    }

    // ---------------- DISPATCH LOGIC ----------------

    public void dispatchRides() {

        System.out.println("\n=== DISPATCH STARTED ===");

        Iterator<Driver> driverIterator = drivers.iterator();

        while (!priorityQueue.isEmpty() && driverIterator.hasNext()) {

            RideRequest request = priorityQueue.poll();
            requestQueue.remove(request);

            Driver driver = driverIterator.next();

            Ride ride = new Ride(request, driver);
            rideHistory.add(ride);

            System.out.println("Assigned: " + ride);
        }

        if (!priorityQueue.isEmpty()) {
            System.out.println("\nPending requests remain (no drivers available).");
        }

        System.out.println("\nDispatch completed.");
    }

    // ---------------- HISTORY ----------------

    public void showRideHistory() {
        System.out.println("\n=== COMPLETED RIDES ===");
        for (Ride r : rideHistory) {
            System.out.println(r);
        }
    }

    // ---------------- STATUS ----------------

    public void showStatus() {
        System.out.println("\nPending Requests (Queue): " + requestQueue.size());
        System.out.println("Priority Requests: " + priorityQueue.size());
        System.out.println("Available Drivers: " + drivers.size());
    }
}