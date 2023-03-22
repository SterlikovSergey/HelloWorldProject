import java.util.Scanner;

public class HelloWorld {
    static int c;
    public static void main(String[] args) {
        System.out.println(c);
        byte a = 3;
        short myShort = a;  // byte -> short -> int -> long = true
        int myInt = myShort;
        long myLong = myInt;
        String newString = String.valueOf(a);
        char letter  = 2;
        float myFloat = 3.434f;
        double myDouble =  4.5555;
        boolean  isTrue = true;
        boolean isFalse = false;
        System.out.println(newString + " side");

        if(a + letter == 5){
            System.out.println(isTrue);
        } else {
            System.out.println(isFalse);
        }

        System.out.println(isTrue);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name please "); // command / - закоментировать выделенный  код
//        String str = scanner.nextLine();
//        System.out.println(str + " Hello World");


        System.out.println((double) 4/3); // isTrue
        System.out.println((double) (4/3)); // isFalse



    }
}
