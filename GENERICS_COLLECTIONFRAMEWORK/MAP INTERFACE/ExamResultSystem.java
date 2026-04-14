import java.util.*;

public class ExamResultSystem {

    // subject -> (student -> marks)
    private Map<String, Map<String, Integer>> examData = new HashMap<>();

    // 1. Add marks
    public void addMarks(String subject, String student, int marks) {

        examData.putIfAbsent(subject, new HashMap<>());

        examData.get(subject).put(student, marks);
    }

    // 2. Top scorer per subject
    public void printTopScorers() {

        System.out.println("\nTop Scorers per Subject:");

        for (String subject : examData.keySet()) {

            Map<String, Integer> students = examData.get(subject);

            String topStudent = null;
            int maxMarks = -1;

            for (Map.Entry<String, Integer> entry : students.entrySet()) {
                if (entry.getValue() > maxMarks) {
                    maxMarks = entry.getValue();
                    topStudent = entry.getKey();
                }
            }

            System.out.println(subject + " -> " + topStudent + " (" + maxMarks + ")");
        }
    }

    // 3. Average per subject
    public void printAverageMarks() {

        System.out.println("\nAverage Marks per Subject:");

        for (String subject : examData.keySet()) {

            Map<String, Integer> students = examData.get(subject);

            int sum = 0;
            int count = 0;

            for (int marks : students.values()) {
                sum += marks;
                count++;
            }

            double avg = (double) sum / count;

            System.out.println(subject + " -> " + avg);
        }
    }

    // 4. Subjects with any student scoring > 90
    public void printHighScoringSubjects() {

        System.out.println("\nSubjects with at least one score > 90:");

        for (String subject : examData.keySet()) {

            for (int marks : examData.get(subject).values()) {
                if (marks > 90) {
                    System.out.println(subject);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        ExamResultSystem system = new ExamResultSystem();

        // 1. Add data
        system.addMarks("Math", "Alice", 85);
        system.addMarks("Math", "Bob", 92);
        system.addMarks("Math", "Carol", 78);

        system.addMarks("Science", "Alice", 88);
        system.addMarks("Science", "Bob", 75);
        system.addMarks("Science", "Carol", 95);

        system.addMarks("English", "Alice", 90);
        system.addMarks("English", "Bob", 82);
        system.addMarks("English", "Carol", 88);

        // 2. Top scorers
        system.printTopScorers();

        // 3. Average marks
        system.printAverageMarks();

        // 4. High scoring subjects
        system.printHighScoringSubjects();
    }
}