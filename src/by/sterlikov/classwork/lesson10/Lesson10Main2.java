package by.sterlikov.classwork.lesson10;

import java.util.Arrays;

public class Lesson10Main2 {
    public static void main(String[] args) {

        String str = "This is my string";
        String str2 = "THIS IS MY STRING";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.equalsIgnoreCase(str2));

        System.out.println(str.replace('i', 'a'));
        System.out.println(str.replace("is", "as"));

        System.out.println(str.concat("is"));
        System.out.println(str.indexOf("is")); // вернет номер индекса  с начала строки
        System.out.println(str.lastIndexOf("is"));
        System.out.println(str.indexOf("is", 15)); //если вернул  отрицательное значение, значит не нашёл!

        System.out.println(str.replaceFirst("", "a"));  // замена regex  на другое в replacement
        System.out.println(str.replaceAll("", "a"));    // замена regex  на другое в replacement

        String str4 = "abra";
        System.out.println(str4.repeat(5));    // склеить строку n раз
        System.out.println(str4.startsWith("ab"));
        System.out.println(str4.endsWith("ab"));

        String[] myArrayString = str.split(" "); // разбить строку на массив слов, разделённых regex
        System.out.println(Arrays.toString(myArrayString)); // между словами не более одного пробела

        String str5 = " ";
        System.out.println(str5.isEmpty()); // пустая строчка ?
        System.out.println(str5.isBlank()); // чистая строка ?

        int myValue = 125;
        String result = String.valueOf(myValue); // точно  одна строка !!!
        String result2 = 125 + ""; // неизвестно сколько сторок  в значении result2 !!!
        System.out.println(result + " " + result2);

    }
}
