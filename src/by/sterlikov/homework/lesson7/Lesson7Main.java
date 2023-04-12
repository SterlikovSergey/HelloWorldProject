package by.sterlikov.homework.lesson7;

public class Lesson7Main {
    public static void main(String[] args) {

        Figure[] figures = new Figure[3];
        figures[0] = new Circle("Circle",2);
        figures[1] = new Rectangle("Rectangle",5,6);
        figures[2] = new Triangle("Triangle",10,20,5);

        for(Figure fig: figures){
            System.out.println("Name figure: - " + fig.getName() + " --- Area figure: - " + fig.getArea());
        }

    }
}
