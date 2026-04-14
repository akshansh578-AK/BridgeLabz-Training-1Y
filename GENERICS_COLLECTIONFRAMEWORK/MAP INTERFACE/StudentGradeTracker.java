import java.util.*;

public class StudentGradeTracker {

    public static void main(String[] args) {

        // Step 1: Create Map
        Map<String, Double> grades = new HashMap<>();

        // 1. Add students
        grades.put("Alice", 85.5);
        grades.put("Bob", 78.0);
        grades.put("Carol", 92.3);
        grades.put("David", 88.8);

        System.out.println("After adding students:");
        System.out.println(grades);

        // 2. Update grade (Bob retakes test)
        grades.put("Bob", 82.5);

        System.out.println("\nAfter updating Bob's grade:");
        System.out.println(grades);

        // 3. Remove a student (David drops out)
        grades.remove("David");

        System.out.println("\nAfter removing David:");
        System.out.println(grades);

        // 4. Print sorted by student names (alphabetical)
        System.out.println("\nStudents sorted by name:");

        Map<String, Double> sortedMap = new TreeMap<>(grades);

        for (Map.Entry<String, Double> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}