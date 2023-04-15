package by.sterlikov.homework.lesson8.task1;

public class Lesson8Task1Main {
    public static void main(String[] args) {
        Phone iphone = new Phone("+375257406888","iphone",100.5);
        Phone samsung = new Phone("+375447888155","samsung",120.6);
        Phone nokia = new Phone("+375297888321","nokia",158.9);

        iphone.toString();
        samsung.toString();
        nokia.toString();

        iphone.receiveCall("Mama");
        samsung.receiveCall("Dad");
        nokia.receiveCall("Brother");

        iphone.receiveCall("Mama", "+375291748525");
        samsung.receiveCall("Dad", "+375291748524");
        nokia.receiveCall("Brother", "+375291748578");

        String[] numbers = {iphone.getNumber(), samsung.getNumber(), nokia.getNumber()};

        iphone.sendMessage(numbers);
        samsung.sendMessage(numbers);
        nokia.sendMessage(numbers);

        iphone.sendMessage("Message to send from iphone ", "+375251595432","+375296541287","+375444566598","+375299874521");
        samsung.sendMessage("Message to send from samsung ", "+375251595432","+375296541287","+375444566598","+375299874521");
        nokia.sendMessage("Message to send from nokia ", "+375251595432","+375296541287","+375444566598","+375299874521");



    }
}
