package dao;
import model.Question;
import java.sql.*;
import java.util.*;

public class QuestionDAO {
    public List<Question> getAllQuestions() {
        List<Question> questions = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM questions")) {

            while (rs.next()) {
                Question q = new Question(
                    rs.getInt("id"),
                    rs.getString("question_text"),
                    rs.getString("option_a"),
                    rs.getString("option_b"),
                    rs.getString("option_c"),
                    rs.getString("option_d"),
                    rs.getString("correct_option").charAt(0)
                );
                questions.add(q);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return questions;
    }
}
