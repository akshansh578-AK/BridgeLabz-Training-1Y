import java.util.*;

class Booking {
    String bookingId;
    String userName;
    boolean isVIP;

    public Booking(String bookingId, String userName, boolean isVIP) {
        this.bookingId = bookingId;
        this.userName = userName;
        this.isVIP = isVIP;
    }

    @Override
    public String toString() {
        return bookingId + " | " + userName + " | VIP: " + isVIP;
    }
}

public class EventBookingSystem {

    // All confirmed bookings
    private List<Booking> bookingList = new ArrayList<>();

    // Unique users
    private Set<String> users = new HashSet<>();

    // Normal booking queue
    private Queue<Booking> bookingQueue = new LinkedList<>();

    // VIP priority queue
    private PriorityQueue<Booking> vipQueue =
            new PriorityQueue<>((a, b) -> {
                if (a.isVIP == b.isVIP) return 0;
                return a.isVIP ? -1 : 1; // VIP first
            });

    // ---------------- REGISTER USER ----------------
    public void registerUser(String userName) {
        if (users.add(userName)) {
            System.out.println("User registered: " + userName);
        } else {
            System.out.println("Duplicate user ignored: " + userName);
        }
    }

    // ---------------- ADD BOOKING ----------------
    public void addBooking(Booking b) {

        if (!users.contains(b.userName)) {
            System.out.println("User not registered: " + b.userName);
            return;
        }

        bookingQueue.add(b);
        vipQueue.add(b);

        System.out.println("Booking received: " + b);
    }

    // ---------------- PROCESS BOOKINGS ----------------
    public void processBookings() {

        System.out.println("\n--- PROCESSING BOOKINGS ---");

        while (!vipQueue.isEmpty()) {

            Booking b = vipQueue.poll();
            bookingQueue.remove(b);

            bookingList.add(b);

            System.out.println("Confirmed: " + b);
        }
    }

    // ---------------- DISPLAY BOOKINGS ----------------
    public void showBookings() {

        System.out.println("\n=== CONFIRMED BOOKINGS ===");

        for (Booking b : bookingList) {
            System.out.println(b);
        }

        System.out.println("\nTotal Bookings: " + bookingList.size());
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        EventBookingSystem system = new EventBookingSystem();

        // Register users
        system.registerUser("Amit");
        system.registerUser("Ravi");
        system.registerUser("Neha");
        system.registerUser("Amit"); // duplicate

        // Add bookings
        system.addBooking(new Booking("B101", "Amit", false));
        system.addBooking(new Booking("B102", "Ravi", true));   // VIP
        system.addBooking(new Booking("B103", "Neha", false));
        system.addBooking(new Booking("B104", "Amit", true));   // VIP

        // Process bookings
        system.processBookings();

        // Show final list
        system.showBookings();
    }
}