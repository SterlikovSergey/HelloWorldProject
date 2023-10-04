package by.sterlikov.classwork.lesson17homework10stile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRegExExample {

    public static final String DEFAULT_DOCUMENT_FORMAT = "(\\d{4}-[a-z]{3}-){2}(\\d[a-z]){2}";// 4 числа - 3 буквы - повторяется 2 раза //

    public static void main(String[] args) {
        //Номер документа имеет формат xlsx-yyy-xlsx-yyy-xy xy, где x — это число, а y — это буква.

        //Pattern pattern = Pattern.compile("(\\d{4}-[a-z]{3}-){2}(\\d[a-z]){2}");
        Pattern pattern = Pattern.compile(DEFAULT_DOCUMENT_FORMAT); // command+option+C (выделенный фрагмент) создаст constant
        String testCase = "1234-abc-5678-def-9z0y";
        Matcher matcher = pattern.matcher(testCase);
        //System.out.println(pattern.matcher(testCase).matches());// true // строчка соответсвует заданному шаблону
        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
        System.out.println("First task");
        printFistLetters(testCase);
        printWithoutLetters(testCase);
        printOnlyLetters(testCase);
        printIfDocumentWithNumberThatLessThat150(testCase);
    }
    private static void printIfDocumentWithNumberThatLessThat150(String str){
        Pattern pattern = Pattern.compile("[0-1]([0-4][0-9]|50).+"); //
        System.out.println(pattern.matcher(str).matches());
    }

    private static void printOnlyLetters(String str) {
        System.out.println(str
                .replaceAll("\\d+-?", "")
                .replaceAll("-", "/"));//поменяй все цифры на пустое место
    }

    private static void printWithoutLetters(String str) {
        System.out.println(str
                .replaceAll("[a-z]{3}", "***"));//заменить на ***
    }

    private static void printFistLetters(String str) {
        Pattern pattern = Pattern.compile("(\\d{4})(-[a-z]{3}-)(\\d{4})(-[a-z]{3}-)(\\d[a-z]){2}");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(1) + matcher.group(3));
        }
    }
}
