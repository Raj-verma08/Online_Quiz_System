package model;

public class Question {
    private int id;
    private String questionText;
    private String optionA, optionB, optionC, optionD;
    private char correctOption;

    public Question(int id, String questionText, String optionA, String optionB, String optionC, String optionD, char correctOption) {
        this.id = id;
        this.questionText = questionText;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption;
    }

    // Getters
    public int getId() { return id; }
    public String getQuestionText() { return questionText; }
    public String getOptionA() { return optionA; }
    public String getOptionB() { return optionB; }
    public String getOptionC() { return optionC; }
    public String getOptionD() { return optionD; }
    public char getCorrectOption() { return correctOption; }
}
