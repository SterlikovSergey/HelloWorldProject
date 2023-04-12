package by.sterlikov.homework.lesson7;

public class Triangle extends Figure{
    private String nameFigure;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    public Triangle(String nameFigure, double sideA) {
        this.nameFigure = nameFigure;
        this.sideA = sideA;
    }


    public Triangle(double sideA, double sideB, String nameFigure) {
        this.nameFigure = nameFigure;
        this.sideA = sideA;
        this.sideB = sideB;

    }

    public Triangle(String nameFigure, double sideA, double sideB, double sideC) {
        this.nameFigure = nameFigure;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return area;

    }

    @Override
    public String getName() {
        return nameFigure;
    }
}
