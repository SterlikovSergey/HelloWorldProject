package by.sterlikov.homework.lesson8.task1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String nameCaller) {
        System.out.println("Calling on my phone " + nameCaller);
    }

    public void receiveCall(String nameCaller, String number) {
        System.out.println("Calling " + nameCaller + " With number " + number + " Number my phone " + this.number);
    }


    public void sendMessage(String[] numbers) {
        System.out.println("Numbers to witch messages will be send from number: " + this.number);
        for (String i : numbers) {
            System.out.println(i);
        }
    }

    public void sendMessage(String message, String... numbers) {
        System.out.println("From a phone number: " + this.number + " Message :" + message + " for numbers:");
        for (String i : numbers) {
            System.out.println(i);
        }
    }
}
