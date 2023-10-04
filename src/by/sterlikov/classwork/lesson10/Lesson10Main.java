package by.sterlikov.classwork.lesson10;

public class Lesson10Main {
    public static void main(String[] args) {
        String str = "This is my string";
        String str2 = "This is my string";
        String str3 = new String("This is my string");
        System.out.println(str2 == str);                                    // так сравнивать строки нельзя!!!
        System.out.println(str == str3);

        System.out.println(str.equals(str2));                               //  для сравнения занчения в строке

        String addString = str + str2;
        System.out.println(addString);
        System.out.println(str.concat(str2));
        String[] arr = new String[]{str2, str, str3};
        System.out.println(String.join(". ", str2, str, str3));     // использовать для обьеденения строк
        System.out.println(String.join(". ", arr));

        String myBestString = "      This is my best string (space)    ";
        System.out.println(myBestString = myBestString.trim());            // убирает пробелы в начале и в конце строки
        myBestString = myBestString.trim();

        System.out.println(myBestString.length());

        System.out.println(myBestString.charAt(5));                             // взять символ в строке.

        for (int i = 0; i < myBestString.length(); i++) {
            System.out.print(myBestString.charAt(i));
        }
        char[] charArray = myBestString.toCharArray();
        int count = 0;
        for (char ch : charArray) {
            if (ch == 'i') {
                count++;
            }
        }
        System.out.println("Count " + count);

        System.out.println(myBestString.substring(4));       // возвращает строку с указанной точки отсчёта
        System.out.println(myBestString.substring(4, 10));              //  в выбранном диапазоне

    }
}
