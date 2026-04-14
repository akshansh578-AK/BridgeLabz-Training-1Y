import java.util.*;

public class CourseRegistration {

    private Map<String, Integer> courses = new HashMap<>();

    // 1. Add course
    public void addCourse(String code, int students) {
        courses.put(code, students);
    }

    // 2. Add student
    public void addStudent(String code) {
        if (courses.containsKey(code)) {
            courses.put(code, courses.get(code) + 1);
        } else {
            System.out.println(code + " course not found");
        }
    }

    // 3. Drop student (no negative count)
    public void dropStudent(String code) {
        if (courses.containsKey(code)) {
            int count = courses.get(code);
            if (count > 0) {
                courses.put(code, count - 1);
            }
        } else {
            System.out.println(code + " course not found");
        }
    }

    // 4. Print categorized courses
    public void showStatus() {

        System.out.println("\nNear Full Courses (>=50):");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() >= 50) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

        System.out.println("\nUnder-subscribed Courses (<5):");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() < 5) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    // Display all courses
    public void displayAll() {
        System.out.println("\nAll Courses:");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {

        CourseRegistration system = new CourseRegistration();

        // 1. Add 5 courses
        system.addCourse("CS101", 48);
        system.addCourse("CS102", 3);
        system.addCourse("CS103", 55);
        system.addCourse("CS104", 10);
        system.addCourse("CS105", 1);

        system.displayAll();

        // 2. Add students
        system.addStudent("CS101");
        system.addStudent("CS101");
        system.addStudent("CS102");

        // 3. Drop students
        system.dropStudent("CS104");
        system.dropStudent("CS105");
        system.dropStudent("CS105"); // should not go negative

        system.displayAll();

        // 4. Show categorized output
        system.showStatus();
    }
}