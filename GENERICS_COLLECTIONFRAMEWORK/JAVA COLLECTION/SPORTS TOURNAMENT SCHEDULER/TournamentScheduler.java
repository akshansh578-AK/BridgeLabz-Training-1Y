import java.util.*;

class Team {
    String teamId;
    String name;
    int points;

    public Team(String teamId, String name, int points) {
        this.teamId = teamId;
        this.name = name;
        this.points = points;
    }

    @Override
    public String toString() {
        return teamId + " | " + name + " | Points: " + points;
    }

    // uniqueness based on teamId
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        Team t = (Team) o;
        return teamId.equals(t.teamId);
    }

    @Override
    public int hashCode() {
        return teamId.hashCode();
    }
}

class Match {
    String matchId;
    Team team1;
    Team team2;

    public Match(String matchId, Team team1, Team team2) {
        this.matchId = matchId;
        this.team1 = team1;
        this.team2 = team2;
    }

    @Override
    public String toString() {
        return matchId + " | " + team1.name + " vs " + team2.name;
    }
}

class Result {
    String matchId;
    String winner;

    public Result(String matchId, String winner) {
        this.matchId = matchId;
        this.winner = winner;
    }

    @Override
    public String toString() {
        return matchId + " | Winner: " + winner;
    }
}

public class TournamentScheduler {

    // Unique teams
    private Set<Team> teams = new HashSet<>();

    // Match scheduling
    private Queue<Match> matchQueue = new LinkedList<>();

    // Results
    private List<Result> results = new ArrayList<>();

    // Leaderboard (sorted by points DESC)
    private TreeSet<Team> leaderboard =
            new TreeSet<>((a, b) -> {
                if (b.points == a.points)
                    return a.teamId.compareTo(b.teamId);
                return b.points - a.points;
            });

    // ---------------- REGISTER TEAM ----------------
    public void registerTeam(Team t) {
        if (teams.add(t)) {
            System.out.println("Team registered: " + t);
        } else {
            System.out.println("Duplicate team ignored: " + t);
        }
    }

    // ---------------- SCHEDULE MATCH ----------------
    public void scheduleMatch(Match m) {
        matchQueue.add(m);
        System.out.println("Match scheduled: " + m);
    }

    // ---------------- PROCESS MATCHES ----------------
    public void processMatches() {

        System.out.println("\n--- MATCH PROCESSING ---");

        Random random = new Random();

        while (!matchQueue.isEmpty()) {

            Match m = matchQueue.poll();

            Team winner = random.nextBoolean() ? m.team1 : m.team2;

            // update points
            winner.points += 3;

            Result r = new Result(m.matchId, winner.name);
            results.add(r);

            System.out.println("Result: " + r);
        }
    }

    // ---------------- UPDATE LEADERBOARD ----------------
    public void updateLeaderboard() {
        leaderboard.clear();
        leaderboard.addAll(teams);
    }

    // ---------------- DISPLAY LEADERBOARD ----------------
    public void showLeaderboard() {

        System.out.println("\n=== LEADERBOARD ===");

        for (Team t : leaderboard) {
            System.out.println(t);
        }
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        TournamentScheduler system = new TournamentScheduler();

        // Register teams
        system.registerTeam(new Team("T1", "Warriors", 0));
        system.registerTeam(new Team("T2", "Titans", 0));
        system.registerTeam(new Team("T3", "Strikers", 0));
        system.registerTeam(new Team("T1", "Duplicate Warriors", 0)); // duplicate

        // Schedule matches
        Team t1 = new Team("T1", "Warriors", 0);
        Team t2 = new Team("T2", "Titans", 0);
        Team t3 = new Team("T3", "Strikers", 0);

        system.scheduleMatch(new Match("M1", t1, t2));
        system.scheduleMatch(new Match("M2", t2, t3));
        system.scheduleMatch(new Match("M3", t1, t3));

        // Process matches
        system.processMatches();

        // Update & show leaderboard
        system.updateLeaderboard();
        system.showLeaderboard();
    }
}