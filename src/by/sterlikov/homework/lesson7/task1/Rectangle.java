package by.sterlikov.homework.lesson7.task1;

import by.sterlikov.homework.lesson7.task1.Figure;

public class Rectangle extends Figure {
    private String nameFigure;
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    public Rectangle(String nameFigure, double length) {
        this.nameFigure = nameFigure;
        this.length = length;
    }

    public Rectangle(String nameFigure, double length, double width) {
        this.nameFigure = nameFigure;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        double area = length * width;
        return area;
    }

    @Override
    public double getPerimeter() {
        Double perimeter = (2 * length) + (2 * width);
        return perimeter;
    }

    @Override
    public String getName() {
        return nameFigure;
    }
}
