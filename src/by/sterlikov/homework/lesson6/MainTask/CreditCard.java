package by.sterlikov.homework.lesson6.MainTask;

public class CreditCard {
    private int accountNumber;
    private int currentAccountBalance;

    public CreditCard(){

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCurrentAccountBalance() {
        return currentAccountBalance;
    }

    public void setCurrentAccountBalance(int currentAccountBalance) {
        this.currentAccountBalance = currentAccountBalance;
    }

    public CreditCard(int accountNumber, int currentAccountBalance) {
        this.accountNumber = accountNumber;
        this.currentAccountBalance = currentAccountBalance;
    }

    public void checkBalance (){
        System.out.println("Balance your card number " + accountNumber + " -: " + currentAccountBalance + " rub.");
    }

    public void addMoneyToCard (int money){
        currentAccountBalance += money;
        System.out.println("Added to your bank card number " + accountNumber + " -; " + money + " rub.");
    }

    public void removedMoneyFromCard(int money){
        if (currentAccountBalance - money >= 0){
            currentAccountBalance -= money;
            System.out.println("Removed from the card number " + accountNumber + " -; " + money + " rub.");
            checkBalance();
        } else {
            System.out.println("insufficient funds on the card number " + accountNumber);
            checkBalance();
        }
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "accountNumber=" + accountNumber +
                ", currentAccountBalance=" + currentAccountBalance +
                '}';
    }
}
