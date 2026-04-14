import java.util.*;

class Package {
    String packageId;
    String customerName;
    String status; // DELIVERY / RETURN

    public Package(String packageId, String customerName, String status) {
        this.packageId = packageId;
        this.customerName = customerName;
        this.status = status;
    }

    @Override
    public String toString() {
        return packageId + " | " + customerName + " | " + status;
    }
}

public class WarehouseSystem {

    // Pending deliveries
    private Queue<Package> deliveryQueue = new LinkedList<>();

    // Unique package IDs
    private Set<String> packageIds = new HashSet<>();

    // Delivered packages
    private List<Package> deliveredList = new ArrayList<>();

    // Returned / cancelled packages
    private Stack<Package> returnStack = new Stack<>();

    // ---------------- ADD PACKAGE ----------------
    public void addPackage(Package p) {

        if (packageIds.add(p.packageId)) {
            deliveryQueue.add(p);
            System.out.println("Added to queue: " + p);
        } else {
            System.out.println("Duplicate package ignored: " + p.packageId);
        }
    }

    // ---------------- PROCESS DELIVERY ----------------
    public void processDeliveries() {

        System.out.println("\n--- PROCESSING DELIVERIES ---");

        Random random = new Random();

        while (!deliveryQueue.isEmpty()) {

            Package p = deliveryQueue.poll();

            // simulate success/failure
            boolean success = random.nextBoolean();

            if (success) {
                p.status = "DELIVERED";
                deliveredList.add(p);
                System.out.println("Delivered: " + p);
            } else {
                p.status = "RETURNED";
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

        WarehouseSystem system = new WarehouseSystem();

        // Add packages
        system.addPackage(new Package("P101", "Amit", "PENDING"));
        system.addPackage(new Package("P102", "Ravi", "PENDING"));
        system.addPackage(new Package("P103", "Neha", "PENDING"));
        system.addPackage(new Package("P101", "Duplicate Amit", "PENDING")); // duplicate

        // Process deliveries
        system.processDeliveries();

        // Show summary
        system.showSummary();
    }
}