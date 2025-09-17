package ui;
import service.QuizService;
import java.util.Scanner;

public class ConsoleUI {
    public void start() {
        Scanner sc = new Scanner(System.in);
        QuizService quizService = new QuizService();

        while (true) {
            System.out.println("\n=== ONLINE QUIZ SYSTEM ===");
            System.out.println("1. Take Quiz");
            System.out.println("2. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                int score = quizService.startQuiz();
                System.out.println("Your Score: " + score);
            } else {
                System.out.println("Exiting...");
                break;
            }
        }
    }
}
