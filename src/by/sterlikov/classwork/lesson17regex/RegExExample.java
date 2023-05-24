package by.sterlikov.classwork.lesson17regex;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExExample {
    public static void main(String[] args) {
        String testString = "This is my 1 first test string, - 12345";
        String testString2 = "12345";
        Pattern number = Pattern.compile("\\d+"); // задание  шаблона для  поиска всех цифр
        Matcher numbersMatcher = number.matcher(testString);
        System.out.println(numbersMatcher.matches());// проверяет соответствует строчка выражению // не является числом false
        Matcher numberMatcher2 = number.matcher(testString2);
        System.out.println(numberMatcher2.matches()); //true  // есть числа


/*        if(numbersMatcher.find()){ //даем команду найти что то похожее под шаблон //искали первое совпадение шаблону
            System.out.println(numbersMatcher.start() + " " + numbersMatcher.end());  // дает нам точное начало и конец подходящего
            System.out.println(numbersMatcher.group());//возвращает этот кусок
        }*/
        while (numbersMatcher.find()){ //даем команду найти что то похожее под шаблон   //while найди все куски кода  соответсвующие шаблону
            System.out.println(numbersMatcher.start() + " " + numbersMatcher.end());  // дает нам точное начало и
            System.out.println(numbersMatcher.group());//возвращает этот кусок
        }

        //numbersMatcher.reset();
        //numbersMatcher.usePattern(Pattern.compile("test"));
        while (numbersMatcher.find()) { //даем команду найти что то похожее под шаблон   //while найди все куски кода  соответсвующие шаблону
            System.out.println(numbersMatcher.start() + " " + numbersMatcher.end());  // дает нам точное начало и
            System.out.println(numbersMatcher.group());//возвращает этот кусок        while (numbersMatcher.find()){ //даем команду найти что то похожее под шаблон   //while найди все куски кода  соответсвующие шаблону
        }
        numbersMatcher.reset();
        numbersMatcher.results()
                .map(MatchResult::group)
                .map(String::length)
                .forEach(lenght -> System.out.println(lenght));
    }
}
