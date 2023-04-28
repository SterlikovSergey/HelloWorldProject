package by.sterlikov.homework.lesson11;

public class WrongAnswerException9G10J extends Exception{
    private String answer;

    public String getAnswer() {
        return answer;
    }
    public WrongAnswerException9G10J(String message, String answer){
        super(message);
        this.answer = answer;
    }
}
