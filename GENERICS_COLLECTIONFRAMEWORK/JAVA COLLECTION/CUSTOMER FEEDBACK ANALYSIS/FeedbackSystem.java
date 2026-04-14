import java.util.*;

public class FeedbackSystem {

    // All feedbacks
    private List<String> feedbackList = new ArrayList<>();

    // Unique feedbacks
    private Set<String> feedbackSet = new HashSet<>();

    // Processing queue
    private Queue<String> feedbackQueue = new LinkedList<>();

    // Recent feedback stack
    private Stack<String> recentStack = new Stack<>();

    // ---------------- ADD FEEDBACK ----------------
    public void addFeedback(String feedback) {
        feedbackList.add(feedback);
        System.out.println("Added: " + feedback);
    }

    // ---------------- REMOVE DUPLICATES ----------------
    public void removeDuplicates() {

        System.out.println("\n--- Removing Duplicates ---");

        for (String f : feedbackList) {
            if (feedbackSet.add(f)) {
                feedbackQueue.add(f);
                recentStack.push(f);
            } else {
                System.out.println("Duplicate removed: " + f);
            }
        }
    }

    // ---------------- PROCESS FEEDBACK ----------------
    public void processFeedback() {

        System.out.println("\n--- Processing Feedback ---");

        while (!feedbackQueue.isEmpty()) {
            String f = feedbackQueue.poll();
            System.out.println("Processed: " + f);
        }
    }

    // ---------------- SHOW RECENT FEEDBACK ----------------
    public void showRecent(int count) {

        System.out.println("\n--- Recent Feedback ---");

        int i = 0;
        Stack<String> temp = new Stack<>();

        while (!recentStack.isEmpty() && i < count) {
            String f = recentStack.pop();
            System.out.println(f);
            temp.push(f);
            i++;
        }

        // restore stack
        while (!temp.isEmpty()) {
            recentStack.push(temp.pop());
        }
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        FeedbackSystem system = new FeedbackSystem();

        // Add feedbacks
        system.addFeedback("Great service!");
        system.addFeedback("Good experience");
        system.addFeedback("Great service!"); // duplicate
        system.addFeedback("Fast delivery");
        system.addFeedback("Good experience"); // duplicate

        // Remove duplicates & prepare processing
        system.removeDuplicates();

        // Process feedback
        system.processFeedback();

        // Show recent feedback
        system.showRecent(3);
    }
}