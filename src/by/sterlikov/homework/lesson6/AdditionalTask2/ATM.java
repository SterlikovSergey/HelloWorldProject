package by.sterlikov.homework.lesson6.AdditionalTask2;

public class ATM {

    private int countOfBanknotes20 = 0;
    private int countOfBanknotes50 = 0;
    private int countOfBanknotes100 = 0;
    private int moneyOnBalance;

    public ATM() {
    }

    public ATM(int countOfBanknotes20) {
        this.countOfBanknotes20 = countOfBanknotes20;
    }

    public ATM(int countOfBanknotes20, int countOfBanknotes50) {
        this.countOfBanknotes20 = countOfBanknotes20;
        this.countOfBanknotes50 = countOfBanknotes50;
    }

    public ATM(int countOfBanknotes20, int countOfBanknotes50, int countOfBanknotes100) {
        this.countOfBanknotes20 = countOfBanknotes20;
        this.countOfBanknotes50 = countOfBanknotes50;
        this.countOfBanknotes100 = countOfBanknotes100;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "countOfBanknotes20=" + countOfBanknotes20 +
                ", countOfBanknotes50=" + countOfBanknotes50 +
                ", countOfBanknotes100=" + countOfBanknotes100 +
                ", moneyOnBalance=" + moneyOnBalance +
                '}';
    }

    public void addMoney(int money) {
        if (money == 20) {
            countOfBanknotes20 += 1;
            moneyOnBalance += money;
            System.out.println("Credit to your balance - " + money + " rub.");
        }
        if (money == 50) {
            countOfBanknotes50 += 1;
            moneyOnBalance += money;
            System.out.println("Credit to your balance - " + money + " rub.");
        }
        if (money == 100) {
            countOfBanknotes100 += 1;
            moneyOnBalance += money;
            System.out.println("Credit to your balance - " + money + " rub.");
        } else {
            System.out.println("Banknotes accepted only in denominations of 20, 50, 100");
        }

    }

    public boolean removedMoney(int money) {
        if (moneyOnBalance > 0) {
            moneyOnBalance -= money;
        } else {
            System.out.println("No money");
        }
        return true;
    }
}
