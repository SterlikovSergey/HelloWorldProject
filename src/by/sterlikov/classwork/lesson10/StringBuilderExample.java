package by.sterlikov.classwork.lesson10;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Example: ");
        String result = builder.toString();

        System.out.println(result);

        builder.append("first");

        builder.append("Example").
                append("  ").
                append("first").
                append(" ").
                append("Example");

        builder.setCharAt(0, 'X');
        builder.insert(9, "First ");
        builder.delete(16, 20);
        System.out.println(builder.indexOf("first"));
        System.out.println(result + "replace " + builder.replace(0, 3, "abc"));
        builder.reverse();   // сторока задом на перед;

        System.out.println(builder);
        String testCase = "This abba not";

        System.out.println(isPalindrome(1, testCase));
        System.out.println(isPalindrome(2, testCase));
        System.out.println(isPalindrome(3, testCase));
        System.out.println(isPalindrome(10, testCase));
        System.out.println(isPalindrome(-1,testCase));

        System.out.println(isNewPalindrome(testCase));
    }

    private static boolean isPalindrome(String str) {
        StringBuilder builder = new StringBuilder(str);
        return str.equals(builder.reverse().toString());
    }

    private static boolean isPalindrome(int number, String str) {
        String[] arr = str.split(" ");
        if (number > arr.length) {
            System.out.println("Number is too long");
            return false;
        }
        return isNewPalindrome(arr[number - 1]);
    }

    private static boolean isNewPalindrome(String str) {
        char[] arr = str.toCharArray();
        int size = arr.length / 2;
        for (int i = 0; i < size; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return false;
    }
}
