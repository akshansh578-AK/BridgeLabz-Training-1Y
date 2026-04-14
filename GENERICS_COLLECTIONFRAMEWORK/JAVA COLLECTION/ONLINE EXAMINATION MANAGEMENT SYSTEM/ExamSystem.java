import java.util.*;

public class ExamSystem {

    // Questions
    private List<Question> questionList = new ArrayList<>();
    private Stack<Question> questionStack = new Stack<>();

    // Students
    private Set<String> studentIds = new HashSet<>();
    private Queue<Student> studentQueue = new LinkedList<>();

    // ---------------- STUDENT MANAGEMENT ----------------

    public boolean enrollStudent(Student s) {
        if (studentIds.contains(s.getStudentId())) {
            System.out.println("Duplicate student not allowed: " + s);
            return false;
        }

        studentIds.add(s.getStudentId());
        studentQueue.add(s);
        return true;
    }

    public void showStudentQueue() {
        System.out.println("\nStudent Queue:");
        for (Student s : studentQueue) {
            System.out.println(s);
        }
    }

    // ---------------- QUESTION MANAGEMENT ----------------

    public void addQuestion(Question q) {
        questionList.add(q);
    }

    public void shuffleQuestions() {
        Collections.shuffle(questionList);
        System.out.println("\nQuestions Shuffled.");
    }

    public void loadQuestionsToStack() {
        questionStack.clear();

        // push questions into stack (for navigation)
        for (Question q : questionList) {
            questionStack.push(q);
        }
    }

    // ---------------- EXAM PROCESS ----------------

    public void startExam() {

        System.out.println("\n=== EXAM STARTED ===");

        while (!studentQueue.isEmpty()) {

            Student student = studentQueue.poll();
            System.out.println("\nStudent taking exam: " + student);

            // reset question stack for each student
            loadQuestionsToStack();

            Stack<Question> tempBackStack = new Stack<>();

            Scanner sc = new Scanner(System.in);
            boolean running = true;

            while (running && !questionStack.isEmpty()) {

                Question q = questionStack.pop();
                tempBackStack.push(q);

                System.out.println("\n" + q);

                System.out.println("Options: [1] Next Question  [2] Back  [3] Exit");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        // continue (next question automatically)
                        break;

                    case 2:
                        if (tempBackStack.size() > 1) {
                            Question backQ = tempBackStack.pop();
                            questionStack.push(backQ);
                            questionStack.push(tempBackStack.peek());
                        } else {
                            System.out.println("No previous question!");
                        }
                        break;

                    case 3:
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            }

            System.out.println("Exam finished for: " + student.getName());
        }

        System.out.println("\nAll students completed exam.");
    }
}