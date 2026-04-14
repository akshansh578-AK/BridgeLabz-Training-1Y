public class Main1 {
    public static void main(String[] args) {

        ExamSystem system = new ExamSystem();

        // ---------------- ADD STUDENTS ----------------
        system.enrollStudent(new Student("S101", "Amit"));
        system.enrollStudent(new Student("S102", "Ravi"));
        system.enrollStudent(new Student("S103", "Neha"));
        system.enrollStudent(new Student("S101", "Duplicate Amit")); // duplicate

        system.showStudentQueue();

        // ---------------- ADD QUESTIONS ----------------
        system.addQuestion(new Question(1, "What is Java?", "Programming Language"));
        system.addQuestion(new Question(2, "What is OOP?", "Object Oriented Programming"));
        system.addQuestion(new Question(3, "What is Queue?", "FIFO structure"));
        system.addQuestion(new Question(4, "What is Stack?", "LIFO structure"));

        // ---------------- SHUFFLE QUESTIONS ----------------
        system.shuffleQuestions();

        // ---------------- START EXAM ----------------
        system.startExam();
    }
}