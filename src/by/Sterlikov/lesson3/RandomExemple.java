package by.Sterlikov.lesson3;

import java.util.Random;

public class RandomExemple {
    public static void main(String[] args) {
        Random random = new Random();

        for(int i = 0; i < 10; i++){
            System.out.println(random.nextInt());
        }
    }
}
