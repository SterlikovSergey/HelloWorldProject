package by.sterlikov.classwork.lesson13List;

public class CollectionsMain {
    public static void main(String[] args) {
        KeyStorage fistKey = new KeyStorage(11);
        System.out.println(fistKey);
        KeyStorage<String> secondKey = new KeyStorage<>("ABc");
        KeyStorage<Integer> secondKeyInt = new KeyStorage<>(111);
        System.out.println(secondKey);
        System.out.println(secondKeyInt);

    }
}
