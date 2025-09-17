package model;

public class Result {
    private int id;
    private int userId;
    private int score;
    private String takenAt;

    public Result(int id, int userId, int score, String takenAt) {
        this.id = id;
        this.userId = userId;
        this.score = score;
        this.takenAt = takenAt;
    }

    public Result(int userId, int score) {
        this.userId = userId;
        this.score = score;
    }

    // Getters
    public int getId() { return id; }
    public int getUserId() { return userId; }
    public int getScore() { return score; }
    public String getTakenAt() { return takenAt; }
}
