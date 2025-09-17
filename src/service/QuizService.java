package service;
import dao.QuestionDAO;
import model.Question;
import java.util.*;

public class QuizService {
    private QuestionDAO questionDAO = new QuestionDAO();

    public int startQuiz() {
        List<Question> questions = questionDAO.getAllQuestions();
        Scanner sc = new Scanner(System.in);
        int score = 0;

        for (Question q : questions) {
            System.out.println("\n" + q.getQuestionText());
            System.out.println("A) " + q.getOptionA());
            System.out.println("B) " + q.getOptionB());
            System.out.println("C) " + q.getOptionC());
            System.out.println("D) " + q.getOptionD());
            System.out.print("Your Answer: ");
            char ans = sc.next().toUpperCase().charAt(0);

            if (ans == q.getCorrectOption()) {
                score++;
            }
        }
        return score;
    }
}
