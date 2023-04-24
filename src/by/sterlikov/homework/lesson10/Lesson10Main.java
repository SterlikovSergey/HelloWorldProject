package by.sterlikov.homework.lesson10;

public class Lesson10Main {
    public static void main(String[] args) {

        String numberOfDocument = "1234-Abc-5678-dEf-9g10J";

        inOneLineTheFirstTwoBlocks(numberOfDocument);
        blocksOfThreeLettersReplace(numberOfDocument);
        onlyOneLetterLowerCase(numberOfDocument);
        onlyOneLetterLowerCaseStringBuilder(numberOfDocument);
        subsequenceABC(numberOfDocument);
        subsequenceIntro123(numberOfDocument);
        subsequenceEnd9g10J(numberOfDocument);
    }
    static public void inOneLineTheFirstTwoBlocks(String string){               //Вывести на экран в одну строку два первых блока по 4 цифры.
        System.out.println("Main: " + string.substring(0,4) + string.substring(9,13));
        String[] array = string.split("-");
        System.out.println("Fist alternative: " + array[0] + array[2]);
        String newString = string.replaceAll("[a-zA-Z]","");
        System.out.println("Second alternative: " + newString.replaceAll("-",""));
    }
    static public void blocksOfThreeLettersReplace(String string){              //Вывести на экран номер документа, но блоки из трех букв
        String newString = string.replace("def","***");         //заменить на *** (каждая буква заменятся на *).
        System.out.println("Main: " + newString.replace("abc","***"));
        System.out.println("Alternative: " + string.replaceAll("[a-zA-Z]","*"));
    }
    static public void onlyOneLetterLowerCase(String string){       //// Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
        String newString = string.toLowerCase().replaceAll("[ \\d]", "");
        System.out.println("Main: " + newString.replace('-','/'));
    }
    static public void onlyOneLetterLowerCaseStringBuilder(String string){ //Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y"
        String stringLow = string.toLowerCase();                            // в верхнем регистре(реализовать с помощью класса StringBuilder)
        String newString = stringLow.replaceAll("[ \\d]", "");
        String result = newString.replace('-','/');
        StringBuilder builder = new StringBuilder("Letters: ");
        System.out.println(builder.append(result));
    }
    static public void subsequenceABC(String string){   //Проверить содержит ли номер документа последовательность abc
        String subString = "ABC".toLowerCase();         //и вывети сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
        if(string.toLowerCase().contains(subString))
        System.out.println("String  " + string + ", contains the sequence  " + subString);
    }
    static public void subsequenceIntro123(String string){  //Проверить начинается ли номер документа с последовательности 123.
        if(string.startsWith("123"))
            System.out.println("String  " + string + ", contains the sequence 123");
    }
    static public void subsequenceEnd9g10J(String string){  //Проверить заканчивается ли номер документа на последовательность 9g10J.
        if(string.endsWith("9g10J"))
            System.out.println("String  " + string + ", contains the sequence 9g10J");
    }

}
