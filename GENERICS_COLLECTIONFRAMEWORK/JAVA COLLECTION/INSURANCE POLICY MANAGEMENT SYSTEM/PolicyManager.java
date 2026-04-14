import java.time.LocalDate;
import java.util.*;

public class PolicyManager {

    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>(new PolicyExpiryComparator());

    // ---------- ADD POLICY ----------
    public boolean addPolicy(Policy p) {
        boolean added = hashSet.add(p);
        linkedHashSet.add(p);
        treeSet.add(p);
        return added;
    }

    // ---------- REMOVE POLICY ----------
    public void removePolicy(String policyNumber) {
        Policy temp = new Policy(policyNumber, "", LocalDate.now(), "", 0);
        hashSet.remove(temp);
        linkedHashSet.remove(temp);
        treeSet.remove(temp);
    }

    // ---------- DISPLAY ALL ----------
    public void displayAll() {
        System.out.println("\n--- HASHSET ---");
        hashSet.forEach(System.out::println);

        System.out.println("\n--- LINKEDHASHSET ---");
        linkedHashSet.forEach(System.out::println);

        System.out.println("\n--- TREESET (Sorted by Expiry) ---");
        treeSet.forEach(System.out::println);
    }

    // ---------- EXPIRING SOON (30 days) ----------
    public void showExpiringSoon() {
        LocalDate now = LocalDate.now();
        LocalDate limit = now.plusDays(30);

        System.out.println("\nPolicies Expiring in 30 days:");
        for (Policy p : hashSet) {
            if (!p.getExpiryDate().isAfter(limit)) {
                System.out.println(p);
            }
        }
    }

    // ---------- FILTER BY COVERAGE ----------
    public void filterByCoverage(String type) {
        System.out.println("\nPolicies with coverage: " + type);
        for (Policy p : hashSet) {
            if (p.getCoverageType().equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    // ---------- DUPLICATE DETECTION ----------
    public void findDuplicates(List<Policy> list) {
        System.out.println("\nDuplicate Policies:");
        Set<String> seen = new HashSet<>();

        for (Policy p : list) {
            if (!seen.add(p.getPolicyNumber())) {
                System.out.println("Duplicate: " + p);
            }
        }
    }

    // ---------- PERFORMANCE TEST ----------
    public void performanceTest(List<Policy> policies) {

        System.out.println("\n--- PERFORMANCE COMPARISON ---");

        long start, end;

        // HashSet
        start = System.nanoTime();
        Set<Policy> h = new HashSet<>();
        for (Policy p : policies) h.add(p);
        end = System.nanoTime();
        System.out.println("HashSet Add Time: " + (end - start));

        // LinkedHashSet
        start = System.nanoTime();
        Set<Policy> l = new LinkedHashSet<>();
        for (Policy p : policies) l.add(p);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add Time: " + (end - start));

        // TreeSet
        start = System.nanoTime();
        Set<Policy> t = new TreeSet<>(new PolicyExpiryComparator());
        for (Policy p : policies) t.add(p);
        end = System.nanoTime();
        System.out.println("TreeSet Add Time: " + (end - start));

        // Search test
        Policy search = policies.get(policies.size() / 2);

        start = System.nanoTime();
        h.contains(search);
        end = System.nanoTime();
        System.out.println("HashSet Search: " + (end - start));

        start = System.nanoTime();
        l.contains(search);
        end = System.nanoTime();
        end = System.nanoTime();
        System.out.println("LinkedHashSet Search: " + (end - start));

        start = System.nanoTime();
        t.contains(search);
        end = System.nanoTime();
        System.out.println("TreeSet Search: " + (end - start));
    }
}