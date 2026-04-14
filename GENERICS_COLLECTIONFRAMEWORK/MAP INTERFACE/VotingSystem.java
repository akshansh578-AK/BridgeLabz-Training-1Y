import java.util.*;

public class VotingSystem {

    private Map<String, Integer> votes = new HashMap<>();

    // Cast a vote
    public void castVote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
    }

    // Display all vote counts
    public void displayResults() {
        System.out.println("\nVote Count:");
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    // Find winner
    public void declareWinner() {
        String winner = null;
        int maxVotes = 0;

        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        System.out.println("\nWinner: " + winner + " with " + maxVotes + " votes");
    }

    public static void main(String[] args) {

        VotingSystem election = new VotingSystem();

        // Simulating 10 votes (3 candidates)
        String[] voteStream = {
                "Alice", "Bob", "Alice", "Carol", "Bob",
                "Alice", "Bob", "Carol", "Alice", "Bob"
        };

        for (String vote : voteStream) {
            election.castVote(vote);
        }

        election.displayResults();
        election.declareWinner();
    }
}