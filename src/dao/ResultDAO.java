package dao;

import model.Result;
import java.sql.*;
import java.util.*;

public class ResultDAO {

    // Save result after quiz
    public void saveResult(Result result) {
        String query = "INSERT INTO results(user_id, score) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, result.getUserId());
            ps.setInt(2, result.getScore());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get all results of a user
    public List<Result> getUserResults(int userId) {
        List<Result> results = new ArrayList<>();
        String query = "SELECT * FROM results WHERE user_id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                results.add(new Result(
                        rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getInt("score"),
                        rs.getString("taken_at")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return results;
    }
}

