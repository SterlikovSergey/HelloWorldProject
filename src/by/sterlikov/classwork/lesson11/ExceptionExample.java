package by.sterlikov.classwork.lesson11;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        // возможны конструкции без catch и без finally
        try{
            result = 2/1;
            try {                           // по примеру if возможно  несколько try
                result = 2/0;
            }catch (Exception e){

            }
        } catch (ArithmeticException | IndexOutOfBoundsException e){  // обработать ошибку возможно и две
            System.out.println("OOPS");
            result = 0;
        } catch (Exception e){
            System.out.println("OOps");
            result = -1;
        } finally {                                 // выполняется в первую очередь
            System.out.println("This is the end of try block!");
            scanner.close();                                        // закрываем в этом блоке
        }
        System.out.println(result);
    }
}
