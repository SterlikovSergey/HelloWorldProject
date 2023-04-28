package by.sterlikov.homework.lesson11;

public class WrongAnswerExceptionABC extends Exception{
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public WrongAnswerExceptionABC(String message, String answer){
        super(message);
        this.answer = answer;
    }


}
