package by.sterlikov.homework.lesson9;

import java.util.Random;

public class Voter{
    private int id;
    private String name;
    static int count;
    static {
        count = 0;
    }

    public Voter() {
        count++;
    }

    public void vote(){
        Random random = new Random();
        int votes = random.nextInt(100);
        if (votes <= 30){
            OfficialCandidate officialCandidate = new OfficialCandidate();
        } if (votes > 30 && votes <= 90){
            IllegalCandidate illegalCandidate = new IllegalCandidate();
        }  if (votes > 90 && votes <= 100){
            RandomCandidate randomCandidate = new RandomCandidate();
        }
    }


}
