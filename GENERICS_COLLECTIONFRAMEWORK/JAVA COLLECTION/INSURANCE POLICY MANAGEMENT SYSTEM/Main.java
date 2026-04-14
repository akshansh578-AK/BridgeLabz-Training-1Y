import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        PolicyManager manager = new PolicyManager();

        List<Policy> sampleList = new ArrayList<>();

        sampleList.add(new Policy("P101", "Amit",
                LocalDate.now().plusDays(10), "Health", 5000));

        sampleList.add(new Policy("P102", "Ravi",
                LocalDate.now().plusDays(40), "Auto", 7000));

        sampleList.add(new Policy("P103", "Neha",
                LocalDate.now().plusDays(20), "Home", 9000));

        sampleList.add(new Policy("P101", "Amit Duplicate",
                LocalDate.now().plusDays(10), "Health", 5000));

        // Add policies
        for (Policy p : sampleList) {
            manager.addPolicy(p);
        }

        // Display
        manager.displayAll();

        // Expiring soon
        manager.showExpiringSoon();

        // Filter
        manager.filterByCoverage("Health");

        // Duplicates
        manager.findDuplicates(sampleList);

        // Performance
        manager.performanceTest(sampleList);
    }
}