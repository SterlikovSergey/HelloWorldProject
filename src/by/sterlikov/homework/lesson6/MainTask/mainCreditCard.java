package by.sterlikov.homework.lesson6.MainTask;

import java.util.Scanner;

public class mainCreditCard {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        CreditCard creditCard1 = new CreditCard(1111,0);
        CreditCard creditCard2 = new CreditCard(2222,0);
        CreditCard creditCard3 = new CreditCard(3333,0);

        creditCard.setAccountNumber(1010);
        creditCard.setCurrentAccountBalance(0);
        creditCard.addMoneyToCard(15);
        creditCard.checkBalance();
        creditCard.addMoneyToCard(130);
        creditCard.removedMoneyFromCard(150);

        creditCard1.addMoneyToCard(1000);
        creditCard1.checkBalance();
        creditCard1.removedMoneyFromCard(999);

        creditCard2.checkBalance();
        creditCard2.removedMoneyFromCard(3);

        creditCard3.addMoneyToCard(10);
        creditCard3.checkBalance();
        creditCard3.removedMoneyFromCard(10);
        creditCard3.addMoneyToCard(100);
        creditCard3.checkBalance();
        creditCard3.removedMoneyFromCard(50);
        creditCard3.removedMoneyFromCard(51);

        System.out.println(creditCard3.toString() + creditCard.toString() + creditCard2.toString() + creditCard1.toString());

    }
}
