package by.sterlikov.homework.lesson10;

import java.util.Arrays;

public class Lesson10MainPartTwo {
    public static void main(String[] args) {
        String mainString = "No matter how many days are in your life, what matters is how much life is in your days";
        String smallString = "            ";                            //Дана строка произвольной длины с произвольными словами.
        String bigString = " ";

        String[] arrayString = mainString.split(" ");
        System.out.println(Arrays.toString(arrayString));
        for (int i = 0; i < arrayString.length; i++) {                 // Найти самое короткое слово в строке и вывести его на экран.
            if (arrayString[i].length() < smallString.length())
                smallString = arrayString[i];
            if (arrayString[i].length() >= bigString.length())       // Найти самое длинное слово в строке и вывести его на экран.
                bigString = arrayString[i];                      // Если таких слов несколько, то вывести последнее из них.
        }
        System.out.println("Shortest word in a string: " + smallString);
        System.out.println("longest word in a string: " + bigString);
    }
}
