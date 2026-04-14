import java.util.*;

public class OrderProcessor {

    private List<Order> orderList = new ArrayList<>();
    private Set<Order> orderSet = new HashSet<>();
    private Queue<Order> orderQueue = new LinkedList<>();
    private Stack<Order> failedStack = new Stack<>();

    // 1. Add order
    public void addOrder(Order order) {
        orderList.add(order);
    }

    // 2. Remove duplicates using Set
    public void removeDuplicates() {
        orderSet.clear();

        System.out.println("\nRemoving duplicates...");

        for (Order o : orderList) {
            if (!orderSet.add(o)) {
                System.out.println("Duplicate removed: " + o);
            }
        }

        // rebuild list without duplicates
        orderList = new ArrayList<>(orderSet);
    }

    // 3. Load queue for processing
    public void loadQueue() {
        orderQueue.clear();
        orderQueue.addAll(orderList);
    }

    // 4. Process orders (FIFO)
    public void processOrders() {
        System.out.println("\nProcessing Orders:");

        Random random = new Random();

        while (!orderQueue.isEmpty()) {
            Order o = orderQueue.poll();

            // simulate failure randomly
            if (random.nextInt(10) < 3) {
                System.out.println("FAILED: " + o);
                failedStack.push(o);
            } else {
                System.out.println("SUCCESS: " + o);
            }
        }
    }

    // 5. Retry failed orders (LIFO)
    public void retryFailedOrders() {
        System.out.println("\nRetrying Failed Orders:");

        while (!failedStack.isEmpty()) {
            Order o = failedStack.pop();

            System.out.println("RETRY SUCCESS: " + o);
        }
    }

    // Display all orders
    public void displayAll() {
        System.out.println("\nAll Orders:");
        for (Order o : orderList) {
            System.out.println(o);
        }
    }
}