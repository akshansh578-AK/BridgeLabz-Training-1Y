import java.util.*;

class Student {
    String id;
    String name;
    int marks;

    public Student(String id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | Marks: " + marks;
    }

    // uniqueness based on student id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student s = (Student) o;
        return id.equals(s.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}

public class AdmissionSystem {

    // All applicants
    private List<Student> applications = new ArrayList<>();

    // Shortlisted students (unique)
    private Set<Student> shortlisted = new HashSet<>();

    // Interview queue
    private Queue<Student> interviewQueue = new LinkedList<>();

    // Final merit list (sorted by marks DESC)
    private TreeSet<Student> meritList =
            new TreeSet<>((a, b) -> {
                if (b.marks == a.marks) return a.id.compareTo(b.id);
                return b.marks - a.marks;
            });

    // ---------------- APPLY ----------------
    public void apply(Student s) {
        applications.add(s);
        System.out.println("Application received: " + s);
    }

    // ---------------- SHORTLIST ----------------
    public void shortlist(int cutoff) {
        for (Student s : applications) {
            if (s.marks >= cutoff) {
                if (shortlisted.add(s)) {
                    interviewQueue.add(s);
                    System.out.println("Shortlisted: " + s);
                }
            }
        }
    }

    // ---------------- INTERVIEW PROCESS ----------------
    public void conductInterviews() {

        System.out.println("\n--- INTERVIEW PROCESS ---");

        while (!interviewQueue.isEmpty()) {
            Student s = interviewQueue.poll();

            // simulate selection logic (marks >= cutoff already)
            System.out.println("Interviewed: " + s);

            meritList.add(s);
        }
    }

    // ---------------- MERIT LIST ----------------
    public void showMeritList() {
        System.out.println("\n--- FINAL MERIT LIST ---");
        for (Student s : meritList) {
            System.out.println(s);
        }
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        AdmissionSystem system = new AdmissionSystem();

        // Applications
        system.apply(new Student("S1", "Amit", 85));
        system.apply(new Student("S2", "Ravi", 72));
        system.apply(new Student("S3", "Neha", 91));
        system.apply(new Student("S4", "John", 60));
        system.apply(new Student("S1", "Duplicate Amit", 85)); // duplicate id allowed in list but handled later

        // Shortlist
        system.shortlist(70);

        // Interview process
        system.conductInterviews();

        // Final merit list
        system.showMeritList();
    }
}