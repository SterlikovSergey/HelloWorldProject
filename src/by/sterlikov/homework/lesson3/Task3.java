package by.sterlikov.homework.lesson3;


/*3. Необходимо, чтоб программа выводила на экран вот такую последовательность:
        7 14 21 28 35 42 49 56 63 70 77 84 91 98.
        В решении используйте цикл while.*/
public class Task3 {
    public static void main(String[] args) {
        int value = 7;
        int count = 0;
        do {
            count += value;
            System.out.println(count);
        }while (count < 98);
    }
}
