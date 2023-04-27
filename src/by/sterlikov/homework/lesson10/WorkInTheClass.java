package by.sterlikov.homework.lesson10;

import java.util.Locale;

public class WorkInTheClass {
    public static void main(String[] args) {
        String document = "1234-Abc-5678-dEf-9g10J";
        String result = document.toUpperCase();
        String[] arr = result.split("-");
        StringBuilder builder = new StringBuilder("Letters: ");
        builder.append(arr[1])
                .append(arr[3])
                .append(arr[4].charAt(1))
                .append(arr[4].charAt(3));
        String row = arr[1] + arr[3] + arr[4].charAt(1) + arr[4].charAt(4);
        String row2 = result.substring(5, 8) + result.substring(14, 17) + result.charAt(19) + result.charAt(22);
        String num = arr[0] + arr[2] + arr[4].charAt(0) + arr[4].substring(2,4);
        String num2 = result.substring(0,4) + result.substring(9,13) + result.charAt(18) + result.substring(20,22);
        System.out.println(row2);
        System.out.println(row);
        System.out.println(num);
        System.out.println(num2);
        System.out.println(builder);
    }

}

