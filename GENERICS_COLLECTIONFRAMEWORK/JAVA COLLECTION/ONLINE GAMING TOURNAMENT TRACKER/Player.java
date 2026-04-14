 public class Player {
    private String playerId;
    private String name;

    public Player(String playerId, String name) {
        this.playerId = playerId;
        this.name = name;
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return playerId + " - " + name;
    }

    // Ensure uniqueness based on playerId
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player p = (Player) o;
        return playerId.equals(p.playerId);
    }

    @Override
    public int hashCode() {
        return playerId.hashCode();
    }
}