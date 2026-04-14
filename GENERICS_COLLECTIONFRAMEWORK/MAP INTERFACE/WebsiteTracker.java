import java.util.*;

public class WebsiteTracker {

    private Map<String, Integer> visits = new HashMap<>();

    // 1. Record page visit
    public void visit(String page) {
        visits.put(page, visits.getOrDefault(page, 0) + 1);
    }

    // 2. Print pages sorted by descending visits
    public void printSortedReport() {

        System.out.println("\nPages sorted by visit count (descending):");

        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(visits.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // 3. Print most visited page
    public void printMostVisited() {

        String topPage = null;
        int maxVisits = 0;

        for (Map.Entry<String, Integer> entry : visits.entrySet()) {
            if (entry.getValue() > maxVisits) {
                maxVisits = entry.getValue();
                topPage = entry.getKey();
            }
        }

        System.out.println("\nMost Visited Page: " + topPage + " -> " + maxVisits);
    }

    public static void main(String[] args) {

        WebsiteTracker tracker = new WebsiteTracker();

        // Simulated user visits
        String[] pages = {
                "home", "about", "products", "home",
                "products", "contact", "home"
        };

        for (String page : pages) {
            tracker.visit(page);
        }

        tracker.printSortedReport();
        tracker.printMostVisited();
    }
}