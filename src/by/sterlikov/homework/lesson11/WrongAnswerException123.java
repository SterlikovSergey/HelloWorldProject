package by.sterlikov.homework.lesson11;

public class WrongAnswerException123 extends Exception{
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public WrongAnswerException123(String message, String answer){
        super(message);
        this.answer = answer;
    }
}
