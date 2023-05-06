package by.sterlikov.homework.lesson6.AdditionalTask1;

public class MainComputer {
    public static void main(String[] args) {

        Computer computer1 = new Computer(200, "Intel");

        Computer computer2 = new Computer(250, "Mac", new RAM("DDR", 2014), new HDD("SATA", 20000, true));

        Computer computer = new Computer(500, "MacBook pro", new RAM("DDR2", 32568), new HDD("SATA 2", 1526000, false));

        System.out.println(computer1.toString());
        System.out.println(computer2.toString());
        System.out.println(computer.toString());
    }
}
