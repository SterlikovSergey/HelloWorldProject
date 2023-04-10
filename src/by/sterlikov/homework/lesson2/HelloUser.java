package by.sterlikov.homework.lesson2;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println(" Please enter your name");
            String user = scanner.nextLine();
            System.out.println(" Ok! " + user + ", Welcome to Java ");

        }

    }
}

