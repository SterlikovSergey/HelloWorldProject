package by.sterlikov.classwork.lesson17regex;
import static  java.util.regex.Pattern.CASE_INSENSITIVE;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;// если взять импорт и обьявить его статическим, то Pattern  в коде можно не использовать

public class RegExExample2 {
    public static void main(String[] args) {
        List<String> testStrings = Arrays.asList("ABC","abc", "F", "f",
                "", "a1a", "a11", "a.1", "a..1");
// маленькие буквы
        //Pattern pattern = Pattern.compile("[a-z]");// ищем малый шрифт один символ
        //Pattern pattern = Pattern.compile("[a-z]+"); все символы малый шрифт
        //Pattern pattern = Pattern.compile("[a-z]*");// до
        //Pattern pattern = Pattern.compile("[a-z]?"); //или ноль или одна
        //Pattern pattern = Pattern.compile("[a-z]{2,3}");
// иалые и большие буквы
        //Pattern pattern = Pattern.compile("[a-zA-Z]*"); // малые и большие вариант 1
        //Pattern pattern = Pattern.compile("[a-z]+",Pattern.CASE_INSENSITIVE);//малые и большие буквы вариант второй
        //Pattern pattern = Pattern.compile("[a-z]+",CASE_INSENSITIVE); //после  import static
        //Pattern pattern = Pattern.compile("[a-z]+\\d+[a-z]+"); //буква цифра буква
        //Pattern pattern = Pattern.compile("[a-z]+\\d+$");//$  поиск  всех буквы которыми заканчивается строчка
        //Pattern pattern = Pattern.compile("^[a-z]+\\d+"); // ^ этим регулярным выражением должна начинаться  строчка
        //Pattern pattern = Pattern.compile("[a-z]+\\.\\d+");// для поиска точки
        //Pattern pattern = Pattern.compile("[a-z]+.\\d+"); // для поиска любого символа
        Pattern pattern = Pattern.compile("([a-z]+.)(\\d+)");







        testStrings.forEach(str -> {
            Matcher matcher = pattern.matcher(str);
            //System.out.println(str + " matcher? " + matcher.matches());
            if(matcher.find()){
                System.out.println("Fist group:  " + matcher.group(1));
                System.out.println("Second group: " + matcher.group(2));
            }
        });
    }
}
