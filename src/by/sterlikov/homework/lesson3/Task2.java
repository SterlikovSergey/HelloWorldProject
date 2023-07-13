package by.sterlikov.homework.lesson3;

import java.util.Scanner;

/*2. Напишите программу, где пользователь вводит любое целое
        положительное число. А программа суммирует все числа от 1 до
        введенного пользователем числа (не больше 100).
        Для ввода числа воспользуйтесь классом Scanner. Если число не
        попадает в указанный интервал (меньше или больше) — ничего не считайте,
        а просто напишите что человек неправ)*/
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter value");
        int inputValue = scanner.nextInt();
        if(inputValue > 0 && inputValue < 100){
            for (int i = 1; i <= inputValue; i++){
                count += i;
                System.out.println(count);
            }
        } else {
            System.out.println("Incorrect value");
        }




    }
}
