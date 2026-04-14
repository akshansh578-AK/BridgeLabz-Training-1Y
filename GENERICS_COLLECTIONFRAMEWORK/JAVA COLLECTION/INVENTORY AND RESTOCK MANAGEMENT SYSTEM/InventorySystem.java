import java.util.*;

class Product {
    String name;
    double price;
    int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return name + " | Price: " + price + " | Stock: " + stock;
    }
}

public class InventorySystem {

    // Unique product names
    private Set<String> productSet = new HashSet<>();

    // Product details
    private List<Product> productList = new ArrayList<>();

    // Restock queue
    private Queue<Product> restockQueue = new LinkedList<>();

    // Undo restock stack
    private Stack<Product> undoStack = new Stack<>();

    // ---------------- ADD PRODUCT ----------------
    public void addProduct(String name, double price, int stock) {
        if (productSet.add(name)) {
            Product p = new Product(name, price, stock);
            productList.add(p);
            System.out.println("Added: " + p);
        } else {
            System.out.println("Duplicate product ignored: " + name);
        }
    }

    // ---------------- LOW STOCK CHECK ----------------
    public void checkLowStock(int threshold) {
        for (Product p : productList) {
            if (p.stock <= threshold) {
                restockQueue.add(p);
                System.out.println("Added to restock: " + p);
            }
        }
    }

    // ---------------- RESTOCK PROCESS ----------------
    public void processRestock(int addStock) {
        System.out.println("\n--- Processing Restock ---");

        while (!restockQueue.isEmpty()) {
            Product p = restockQueue.poll();
            p.stock += addStock;
            undoStack.push(p);
            System.out.println("Restocked: " + p);
        }
    }

    // ---------------- UNDO RESTOCK ----------------
    public void undoRestock() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }

        Product p = undoStack.pop();
        p.stock -= 1; // undo last restock (simple rollback)
        System.out.println("Undo Restock: " + p);
    }

    // ---------------- DISPLAY ----------------
    public void showProducts() {
        System.out.println("\n--- PRODUCT LIST ---");
        for (Product p : productList) {
            System.out.println(p);
        }
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        InventorySystem system = new InventorySystem();

        // Add products
        system.addProduct("Milk", 50, 5);
        system.addProduct("Bread", 30, 2);
        system.addProduct("Rice", 100, 10);
        system.addProduct("Milk", 50, 5); // duplicate

        // Show inventory
        system.showProducts();

        // Find low stock items
        system.checkLowStock(3);

        // Restock
        system.processRestock(10);

        // Undo last restock
        system.undoRestock();

        // Final inventory
        system.showProducts();
    }
}