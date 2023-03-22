import java.util.Scanner;
//  public -  видят все
//  static -
//  void - не чего не возвращает
//  main - start apply



public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name please ");
        String str = scanner.nextLine();
        System.out.println(str + " Hello World");
    }
}
