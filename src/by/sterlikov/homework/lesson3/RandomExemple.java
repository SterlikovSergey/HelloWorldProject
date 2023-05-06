package by.sterlikov.homework.lesson3;

import java.util.Random;

public class RandomExemple {
    public static void main(String[] args) {
        int theNumber = (int) (Math.random() * 200 + 1);


        Random random = new Random();
        for (int i = 0; i < 100; i += 5) {
            System.out.println(random.nextInt());

        }
    }
}
