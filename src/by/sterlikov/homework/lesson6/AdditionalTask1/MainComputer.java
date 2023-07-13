package by.sterlikov.homework.lesson6.AdditionalTask1;


import java.util.ArrayList;
import java.util.List;

public class MainComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setHdd(new HDD("hdd", 250, true));
        computer.setRam(new RAM("ram", 250));
        computer.setModel("Intel");
        computer.setPrice(1500);

        Computer computer1 = new Computer(1500, "Apple", new HDD("hdd", 2500, true),
                new RAM("ram", 235));

        List<Computer> computers = new ArrayList<>();
        computers.add(computer1);
        computers.add(computer);
        computers.add(1, new Computer(2500, "macBook", new HDD("macHdd", 50000, true),
                new RAM("macRam", 40000)));

        System.out.println(computers.stream()
                .toList());

        System.out.println(computers.stream()
                .filter(computer2 -> computer2.getRam().getName().equalsIgnoreCase("macram"))
                .toList());









    }
}
