package by.sterlikov.homework.lesson13list;

import java.util.*;

public class Task1Main {
    public static void main(String[] args) {
        String taskString = "no matter how many days are in your life, what matters is how much life is in your days";
        String[] stringArrays = taskString.split(" ");
        List<String> taskList = new LinkedList<>(Arrays.asList(stringArrays));
        Collections.sort(taskList);
        System.out.println(taskList);
    }
}
