package by.sterlikov.homework.lesson11;

public class Lesson11Main {
    public static void main(String[] args) throws Exception{

        String numberOfDocument = "1234-Abc-5678-dEf-9g10J";

        try {revealSubsequenceABC(numberOfDocument, "clw");
            //revealSubsequence(numberOfDocument,"clw","321","9g10J");
        }catch (WrongAnswerExceptionABC e){
            System.out.println(e.getAnswer() + " intercepted " + e.getMessage() + numberOfDocument);
        }

        try{
            revealSubsequenceIntro123(numberOfDocument,"321");
        }catch (WrongAnswerException123 e){
            System.out.println(e.getAnswer() + " intercepted " + e.getMessage() + numberOfDocument);
        }

        try{
            revealSubsequenceEnd9g10J(numberOfDocument,"9g10J");
        }catch (WrongAnswerException9G10J e){
            System.out.println(e.getAnswer() + " intercepted " + e.getMessage() + numberOfDocument);
        }
    }
/*    static public void revealSubsequence(String message, String subString1, String subString2, String subString3) throws Exception{
        if (message.toLowerCase().contains(subString1))
            throw new WrongAnswerExceptionABC("Not contains the sequence", subString1);
        if (message.startsWith(subString2))
            throw new WrongAnswerException123("Not contains the sequence", subString2);
        if (message.endsWith(subString3))
            throw new WrongAnswerException9G10J("Not contains the sequence", subString3);
        throw new  Exception(" All ");
    }*/
        static public void revealSubsequenceABC(String message, String subString) throws Exception {
             if(message.toLowerCase().contains(subString)) {
                 System.out.println("String  " + message + ", contains the sequence " + subString);
             } else {
                 throw new WrongAnswerExceptionABC("Not contains the sequence ", subString);
             }
        }
        static public void revealSubsequenceIntro123(String message, String subString) throws Exception{  //Проверить начинается ли номер документа с последовательности 123.
            if(message.startsWith(subString)) {
                System.out.println("String  " + message + ", contains the sequence 123");
            } else {
                throw new WrongAnswerException123("Not contains the sequence", subString);
            }
        }
        static public void revealSubsequenceEnd9g10J(String message, String subString) throws Exception{  //Проверить заканчивается ли номер документа на последовательность 9g10J.
            if(message.endsWith(subString)) {
                System.out.println("String  " + message + ", contains the sequence 9g10J");
            } else {
                throw new WrongAnswerException9G10J("Not contains the sequence", subString);
            }
        }

}
