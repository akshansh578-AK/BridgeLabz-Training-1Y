import java.util.*;

public class InventoryManager {

    private Map<String, Integer> stock = new HashMap<>();

    // 1. Add new product
    public void addProduct(String name, int quantity) {
        stock.put(name, quantity);
    }

    // 2. Customer purchase (reduce stock)
    public void buyProduct(String name, int quantity) {
        if (!stock.containsKey(name)) {
            System.out.println(name + " is not stocked.");
            return;
        }

        int current = stock.get(name);
        int updated = current - quantity;

        if (updated <= 0) {
            stock.remove(name); // or stock.put(name, 0)
            System.out.println(name + " is now OUT OF STOCK.");
        } else {
            stock.put(name, updated);
        }
    }

    // 3. Restock product
    public void restockProduct(String name, int quantity) {
        stock.put(name, stock.getOrDefault(name, 0) + quantity);
    }

    // 4. Query stock
    public void checkStock(String name) {
        if (!stock.containsKey(name)) {
            System.out.println(name + " is not stocked.");
        } else {
            System.out.println(name + " available: " + stock.get(name));
        }
    }

    // 5. Show out of stock products
    public void showOutOfStock() {
        System.out.println("\nOut of Stock Products:");
        for (String key : stock.keySet()) {
            if (stock.get(key) == 0) {
                System.out.println(key);
            }
        }

        if (stock.isEmpty()) {
            System.out.println("All products are out of stock or removed.");
        }
    }

    // Display all stock
    public void displayStock() {
        System.out.println("\nCurrent Inventory:");
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        InventoryManager store = new InventoryManager();

        // 1. Add products
        store.addProduct("Rice", 10);
        store.addProduct("Sugar", 5);
        store.addProduct("Milk", 8);

        store.displayStock();

        // 2. Customer purchases
        store.buyProduct("Rice", 4);
        store.buyProduct("Sugar", 5); // becomes out of stock
        store.buyProduct("Oil", 2);   // not stocked

        store.displayStock();

        // 3. Restock
        store.restockProduct("Sugar", 10);
        store.restockProduct("Oil", 5);

        store.displayStock();

        // 4. Query stock
        store.checkStock("Milk");
        store.checkStock("Sugar");

        // 5. Out of stock list
        store.showOutOfStock();
    }
}