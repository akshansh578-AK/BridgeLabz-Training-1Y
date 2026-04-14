import java.util.*;

class Parcel {
    String deliveryId;
    String customerName;
    int priority; // higher = more urgent

    public Parcel(String deliveryId, String customerName, int priority) {
        this.deliveryId = deliveryId;
        this.customerName = customerName;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return deliveryId + " | " + customerName + " | Priority: " + priority;
    }
}

public class CourierSystem {

    // Completed deliveries
    private List<Parcel> completedList = new ArrayList<>();

    // Unique delivery IDs
    private Set<String> deliveryIds = new HashSet<>();

    // Normal pending queue
    private Queue<Parcel> normalQueue = new LinkedList<>();

    // Priority queue (high priority first)
    private PriorityQueue<Parcel> priorityQueue =
            new PriorityQueue<>((a, b) -> b.priority - a.priority);

    // ---------------- ADD PARCEL ----------------
    public void addParcel(Parcel p) {

        if (!deliveryIds.add(p.deliveryId)) {
            System.out.println("Duplicate parcel ignored: " + p.deliveryId);
            return;
        }

        normalQueue.add(p);
        priorityQueue.add(p);

        System.out.println("Parcel added: " + p);
    }

    // ---------------- PROCESS DELIVERY ----------------
    public void processDeliveries(int agents) {

        System.out.println("\n--- DELIVERY STARTED ---");

        int usedAgents = 0;

        while (!priorityQueue.isEmpty() && usedAgents < agents) {

            Parcel p = priorityQueue.poll();
            normalQueue.remove(p);

            completedList.add(p);

            System.out.println("Delivered (Priority): " + p);

            usedAgents++;
        }

        // Remaining normal deliveries
        while (!normalQueue.isEmpty() && usedAgents < agents) {

            Parcel p = normalQueue.poll();
            priorityQueue.remove(p);

            completedList.add(p);

            System.out.println("Delivered (Normal): " + p);

            usedAgents++;
        }

        System.out.println("\nDelivery cycle completed.");
    }

    // ---------------- COMPLETED LIST ----------------
    public void showCompleted() {

        System.out.println("\n=== COMPLETED DELIVERIES ===");

        for (Parcel p : completedList) {
            System.out.println(p);
        }

        System.out.println("Total Delivered: " + completedList.size());
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        CourierSystem system = new CourierSystem();

        // Add parcels
        system.addParcel(new Parcel("D101", "Amit", 5));
        system.addParcel(new Parcel("D102", "Ravi", 2));
        system.addParcel(new Parcel("D103", "Neha", 8));
        system.addParcel(new Parcel("D104", "John", 3));
        system.addParcel(new Parcel("D101", "Duplicate Amit", 5)); // duplicate

        // Process deliveries (2 agents available)
        system.processDeliveries(2);

        // Show completed deliveries
        system.showCompleted();
    }
}