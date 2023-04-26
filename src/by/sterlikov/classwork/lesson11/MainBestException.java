package by.sterlikov.classwork.lesson11;

import java.util.Scanner;

public class MainBestException {
    public static void main(String[] args) {
        //  мы попросим угадать возраст
        // если +-  5 лет, не угадал
        // если угодал,  говорим угадал
        // если разбежка в большую сторону и  больше 5 лет - ошибка (охренел )
        // если в меньшую сторону и больше 5 лет - ошибка (льстец )

        int currentAge = 30;
        System.out.println("Please, enter guessed age");
        Scanner scanner = new Scanner(System.in);
        int guessedAge = scanner.nextInt();

        try {
            boolean isGameContinue = checkAge(currentAge, guessedAge);
            while (isGameContinue) {
                System.out.println("Please, enter guessed age");
                guessedAge = scanner.nextInt();

                isGameContinue = checkAge(currentAge, guessedAge);
            }
        } catch (MyBestException e) {
            System.out.println("My age is " + e.getAge() + ". " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("This is the end");
    }
    private static  boolean checkAge(int currentAge, int guessedAge) throws MyBestException {

        int result = currentAge - guessedAge;

        if(result == 0){
            System.out.println("You are right");
            return false;                           // если есть return, else не нужен
        }

        if (result >-5 && result < 5){
            System.out.println("Try again");
            return true;
        }
        throw new MyBestException("Your are not expert!", currentAge);

    }
}
