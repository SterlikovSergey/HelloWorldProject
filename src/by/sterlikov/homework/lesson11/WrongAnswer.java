package by.sterlikov.homework.lesson11;

public class WrongAnswer extends Exception {
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public WrongAnswer(String message, String answer) {
        super(message);
        this.answer = answer;
    }
}
