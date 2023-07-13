package by.sterlikov.homework.lesson6.AdditionalTask2;

public class mainATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.addMoney(20);
        atm.addMoney(50);
        atm.addMoney(100);
        atm.addMoney(100);
        atm.addMoney(100);
        System.out.println(atm.toString());

    }
}
