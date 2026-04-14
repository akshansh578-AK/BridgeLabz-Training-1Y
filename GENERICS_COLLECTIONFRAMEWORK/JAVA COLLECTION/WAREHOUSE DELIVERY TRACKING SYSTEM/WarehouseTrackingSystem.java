import java.util.*;

class Package {
    String packageId;
    String customerName;

    public Package(String packageId, String customerName) {
        this.packageId = packageId;
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return packageId + " | " + customerName;
    }
}

public class WarehouseTrackingSystem {

    // Pending deliveries
    private Queue<Package> pendingQueue = new LinkedList<>();

    // Unique package IDs
    private Set<String> packageIds = new HashSet<>();

    // Delivered packages
    private List<Package> deliveredList = new ArrayList<>();

    // Returned/cancelled packages
    private Stack<Package> returnStack = new Stack<>();

    // ---------------- ADD PACKAGE ----------------
    public void addPackage(Package p) {

        if (!packageIds.add(p.packageId)) {
            System.out.println("Duplicate package ignored: " + p.packageId);
            return;
        }

        pendingQueue.add(p);
        System.out.println("Added: " + p);
    }

    // ---------------- PROCESS DELIVERY ----------------
    public void processDeliveries() {

        System.out.println("\n--- PROCESSING DELIVERIES ---");

        Random random = new Random();

        while (!pendingQueue.isEmpty()) {

            Package p = pendingQueue.poll();

            boolean success = random.nextBoolean();

            if (success) {
                deliveredList.add(p);
                System.out.println("Delivered: " + p);
            } else {
                returnStack.push(p);
                System.out.println("Returned: " + p);
            }
        }
    }

    // ---------------- SUMMARY ----------------
    public void showSummary() {

        System.out.println("\n=== DELIVERY SUMMARY ===");

        System.out.println("\nDelivered Packages:");
        for (Package p : deliveredList) {
            System.out.println(p);
        }

        System.out.println("\nReturned Packages:");
        for (Package p : returnStack) {
            System.out.println(p);
        }

        System.out.println("\nTotal Delivered: " + deliveredList.size());
        System.out.println("Total Returned: " + returnStack.size());
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        WarehouseTrackingSystem system = new WarehouseTrackingSystem();

        // Add packages
        system.addPackage(new Package("P101", "Amit"));
        system.addPackage(new Package("P102", "Ravi"));
        system.addPackage(new Package("P103", "Neha"));
        system.addPackage(new Package("P101", "Duplicate Amit")); // duplicate

        // Process deliveries
        system.processDeliveries();

        // Show summary
        system.showSummary();
    }
}