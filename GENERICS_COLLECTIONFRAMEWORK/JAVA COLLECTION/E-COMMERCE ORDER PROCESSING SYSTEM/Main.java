public class Main {
    public static void main(String[] args) {

        OrderProcessor system = new OrderProcessor();

        // 1. Add orders
        system.addOrder(new Order("O101", "Amit", 1200));
        system.addOrder(new Order("O102", "Ravi", 500));
        system.addOrder(new Order("O103", "Neha", 800));
        system.addOrder(new Order("O101", "Amit Duplicate", 1200)); // duplicate

        // 2. Display all
        system.displayAll();

        // 3. Remove duplicates
        system.removeDuplicates();

        // 4. Load queue and process
        system.loadQueue();
        system.processOrders();

        // 5. Retry failed orders
        system.retryFailedOrders();
    }
}