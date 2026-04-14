import java.util.*;

class Movie {
    String movieId;
    String title;
    String genre;

    public Movie(String movieId, String title, String genre) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return movieId + " | " + title + " | " + genre;
    }
}

public class StreamingSystem {

    // All movies available
    private List<Movie> movieList = new ArrayList<>();

    // Recently watched
    private Stack<Movie> watchHistory = new Stack<>();

    // Unique genres
    private Set<String> genreSet = new HashSet<>();

    // Up next queue
    private Queue<Movie> upNextQueue = new LinkedList<>();

    // ---------------- ADD MOVIE ----------------
    public void addMovie(Movie m) {
        movieList.add(m);
        System.out.println("Movie added: " + m);
    }

    // ---------------- ADD TO WATCH QUEUE ----------------
    public void addToUpNext(Movie m) {
        upNextQueue.add(m);
        System.out.println("Added to Up Next: " + m);
    }

    // ---------------- WATCH MOVIE ----------------
    public void watchMovie() {

        System.out.println("\n--- WATCHING MOVIES ---");

        while (!upNextQueue.isEmpty()) {

            Movie m = upNextQueue.poll();

            // move to watch history stack
            watchHistory.push(m);

            // track genre
            genreSet.add(m.genre);

            System.out.println("Watched: " + m);
        }
    }

    // ---------------- SHOW WATCH HISTORY ----------------
    public void showHistory() {

        System.out.println("\n=== WATCH HISTORY ===");

        for (Movie m : watchHistory) {
            System.out.println(m);
        }
    }

    // ---------------- RECOMMENDATIONS ----------------
    public void showRecommendations() {

        System.out.println("\n=== RECOMMENDATIONS ===");

        for (Movie m : movieList) {
            if (genreSet.contains(m.genre)) {
                System.out.println("Recommended: " + m);
            }
        }
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {

        StreamingSystem system = new StreamingSystem();

        // Add movies to system
        system.addMovie(new Movie("M101", "Avengers", "Action"));
        system.addMovie(new Movie("M102", "Interstellar", "Sci-Fi"));
        system.addMovie(new Movie("M103", "Titanic", "Romance"));
        system.addMovie(new Movie("M104", "Inception", "Sci-Fi"));
        system.addMovie(new Movie("M105", "John Wick", "Action"));

        // Add to Up Next
        system.addToUpNext(new Movie("M101", "Avengers", "Action"));
        system.addToUpNext(new Movie("M102", "Interstellar", "Sci-Fi"));
        system.addToUpNext(new Movie("M103", "Titanic", "Romance"));

        // Watch movies
        system.watchMovie();

        // Show history
        system.showHistory();

        // Show recommendations
        system.showRecommendations();
    }
}