package by.sterlikov.homework.lesson11;

public class Lesson11Main {
    public static void main(String[] args) throws Exception {

        String numberOfDocument = "1234-Abc-5678-dEf-9g10J";

        try {
            revealSubsequence(numberOfDocument, "rdc");
        } catch (WrongAnswerException e) {
            System.out.println(e.getAnswer() + " intercepted " + e.getMessage() + numberOfDocument);
        }

        try {
            revealSubsequenceIntro(numberOfDocument, "321");
        } catch (WrongAnswerExceptionIntro e) {
            System.out.println(e.getAnswer() + " intercepted " + e.getMessage() + numberOfDocument);
        }

        try {
            revealSubsequenceEnd(numberOfDocument, "9g10J");
        } catch (WrongAnswerExceptionEnd e) {
            System.out.println(e.getAnswer() + " intercepted " + e.getMessage() + numberOfDocument);
        }
    }

    static public void revealSubsequence(String message, String subString) throws Exception {
        if (message.toLowerCase().contains(subString)) {
            System.out.println("String  " + message + ", contains the sequence " + subString);
        } else {
            throw new WrongAnswerException("Not contains the sequence ", subString);
        }
    }

    static public void revealSubsequenceIntro(String message, String subString) throws Exception {
        if (message.startsWith(subString)) {
            System.out.println("String  " + message + ", contains the sequence " + subString);
        } else {
            throw new WrongAnswerExceptionIntro("Not contains the sequence", subString);
        }
    }

    static public void revealSubsequenceEnd(String message, String subString) throws Exception {
        if (message.endsWith(subString)) {
            System.out.println("String  " + message + ", contains the sequence " + subString);
        } else {
            throw new WrongAnswerExceptionEnd("Not contains the sequence", subString);
        }
    }
}
