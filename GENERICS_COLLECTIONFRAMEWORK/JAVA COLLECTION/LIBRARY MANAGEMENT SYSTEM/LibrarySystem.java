import java.util.*;

class Book {
    String bookId;
    String title;

    public Book(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    @Override
    public String toString() {
        return bookId + " | " + title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book b = (Book) o;
        return bookId.equals(b.bookId);
    }

    @Override
    public int hashCode() {
        return bookId.hashCode();
    }
}

public class LibrarySystem {

    // All books
    private List<Book> bookList = new ArrayList<>();

    // Unique members
    private Set<String> members = new HashSet<>();

    // Issue queue
    private Queue<Book> issueQueue = new LinkedList<>();

    // Recently returned books
    private Stack<Book> returnStack = new Stack<>();

    // ---------------- ADD BOOK ----------------
    public void addBook(Book b) {
        bookList.add(b);
        System.out.println("Book added: " + b);
    }

    // ---------------- MEMBER REGISTRATION ----------------
    public void registerMember(String id) {
        if (members.add(id)) {
            System.out.println("Member registered: " + id);
        } else {
            System.out.println("Duplicate member ignored: " + id);
        }
    }

    // ---------------- REQUEST ISSUE ----------------
    public void requestIssue(Book b) {
        issueQueue.add(b);
        System.out.println("Issue request added: " + b);
    }

    // ---------------- ISSUE BOOKS ----------------
    public void processIssues() {

        System.out.println("\n--- ISSUING BOOKS ---");

        while (!issueQueue.isEmpty()) {
            Book b = issueQueue.poll();
            System.out.println("Issued: " + b);
        }
    }

    // ---------------- RETURN BOOK ----------------
    public void returnBook(Book b) {
        returnStack.push(b);
        System.out.println("Returned: " + b);
    }

    // ---------------- RE-ISSUE LAST RETURNED ----------------
    public void reIssueLastReturned() {

        if (returnStack.isEmpty()) {
            System.out.println("No books to re-issue.");
            return;
        }

        Book b = returnStack.pop();
        System.out.println("Re-issued: " + b);
    }

    // ---------------- DISPLAY BOOKS ----------------
    public void showBooks() {
        System.out.println("\n=== BOOK LIST ===");
        for (Book b : bookList) {
            System.out.println(b);
        }
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        LibrarySystem system = new LibrarySystem();

        // Add books
        system.addBook(new Book("B101", "Java Basics"));
        system.addBook(new Book("B102", "Data Structures"));
        system.addBook(new Book("B103", "DBMS"));

        // Register members
        system.registerMember("M101");
        system.registerMember("M102");
        system.registerMember("M101"); // duplicate

        // Issue requests
        system.requestIssue(new Book("B101", "Java Basics"));
        system.requestIssue(new Book("B102", "Data Structures"));

        // Process issue queue
        system.processIssues();

        // Return books
        system.returnBook(new Book("B101", "Java Basics"));
        system.returnBook(new Book("B102", "Data Structures"));

        // Re-issue last returned
        system.reIssueLastReturned();

        // Show books
        system.showBooks();
    }
}