import java.util.*;

public class LibraryCatalog {

    private Map<String, String> books = new HashMap<>();

    // 1. Add book
    public void addBook(String isbn, String title) {
        books.put(isbn, title);
    }

    // 2. Search by ISBN
    public void searchByISBN(String isbn) {
        if (books.containsKey(isbn)) {
            System.out.println("Book Found: " + books.get(isbn));
        } else {
            System.out.println("Book not found");
        }
    }

    // 3. Remove book
    public void removeBook(String isbn) {
        if (books.remove(isbn) != null) {
            System.out.println("Book removed successfully");
        } else {
            System.out.println("Book not found to remove");
        }
    }

    // 4. Print sorted by ISBN
    public void displaySorted() {
        System.out.println("\nBooks Sorted by ISBN:");

        Map<String, String> sorted = new TreeMap<>(books);

        for (Map.Entry<String, String> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // 5. Search by title (reverse lookup)
    public void searchByTitle(String title) {
        boolean found = false;

        for (Map.Entry<String, String> entry : books.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(title)) {
                System.out.println("ISBN: " + entry.getKey());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book title not found");
        }
    }

    public static void main(String[] args) {

        LibraryCatalog library = new LibraryCatalog();

        // 1. Add books
        library.addBook("978-1234567890", "Java Basics");
        library.addBook("978-1111111111", "Data Structures");
        library.addBook("978-2222222222", "Operating Systems");
        library.addBook("978-3333333333", "Database Systems");

        // 2. Search by ISBN
        library.searchByISBN("978-1111111111");
        library.searchByISBN("999-9999999999");

        // 3. Remove book
        library.removeBook("978-2222222222");

        // 4. Display sorted catalog
        library.displaySorted();

        // 5. Search by title
        library.searchByTitle("Java Basics");
        library.searchByTitle("Machine Learning");
    }
}