class Product {
    double price;

    public double getPrice() { return price; }
}

class Mobile extends Product {}
class Laptop extends Product {}

class PriceUtil {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) {
            total += p.getPrice();
        }
        return total;
    }
}