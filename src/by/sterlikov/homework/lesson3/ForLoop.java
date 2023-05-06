package by.sterlikov.homework.lesson3;


import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        for (int i = 10; i > 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
    }
}
