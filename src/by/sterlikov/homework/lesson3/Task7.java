package by.sterlikov.homework.lesson3;

import java.util.Scanner;

/*7. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
        Напишите программу, в которую пользователь вводит сумму вклада и
        количество месяцев. А банк вычисляет конечную сумму вклада с учетом
        начисления процентов за каждый месяц.
        Для вычисления суммы с учетом процентов используйте цикл for. Пусть
        сумма вклада будет представлять тип float.*/
public class Task7 {
    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int percent = 7;
        System.out.println("Enter deposit amount ");
        float depositAmount = scanner.nextInt();
        System.out.println("Enter counts of month ");
        int month = scanner.nextInt();
        float count = 0;
        for (int i = 0; i <= month; i++){
            count += depositAmount * 100 / percent;
        }
        System.out.println(count);
    }
}
