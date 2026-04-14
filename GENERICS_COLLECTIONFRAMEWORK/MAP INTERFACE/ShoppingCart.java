import java.util.*;

public class ShoppingCart {

    private LinkedHashMap<String, Double> cart = new LinkedHashMap<>();

    // 1. Add product (in insertion order)
    public void addProduct(String name, double price) {
        cart.put(name, price);
    }

    // 2. Remove product (simulate user removing item / quantity zero)
    public void removeProduct(String name) {
        if (cart.containsKey(name)) {
            cart.remove(name);
        } else {
            System.out.println(name + " not found in cart");
        }
    }

    // 3. Display products (preserves insertion order)
    public void displayCart() {
        System.out.println("\nCart Items (Insertion Order):");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + " -> ₹" + entry.getValue());
        }
    }

    // 4. Calculate total bill
    public double calculateTotal() {
        double total = 0;

        for (double price : cart.values()) {
            total += price;
        }

        return total;
    }

    // 5. Generate bill with discount
    public void printBill() {

        double total = calculateTotal();

        System.out.println("\n----- BILL SUMMARY -----");
        displayCart();

        System.out.println("\nTotal: ₹" + total);

        if (total > 5000) {
            double discount = total * 0.10;
            double finalAmount = total - discount;

            System.out.println("Discount Applied (10%): ₹" + discount);
            System.out.println("Final Amount: ₹" + finalAmount);
        } else {
            System.out.println("No discount applied");
        }
    }

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // 1. Add products
        cart.addProduct("Laptop", 45000);
        cart.addProduct("Mouse", 500);
        cart.addProduct("Keyboard", 1500);
        cart.addProduct("USB Cable", 300);
        cart.addProduct("Headphones", 2000);

        // 2. Display cart
        cart.displayCart();

        // 3. Remove an item
        cart.removeProduct("USB Cable");

        // 4. Display again
        cart.displayCart();

        // 5. Final bill
        cart.printBill();
    }
}