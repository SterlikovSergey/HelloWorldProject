package by.sterlikov.homework.lesson7;

public class Circle extends Figure{
    private String nameFigure;
    private static String NAME = "circle" ;
    private double  radius;
    public Circle() {
    }
    public Circle(String nameFigure) {
        this.nameFigure = nameFigure;
    }

    public Circle(String nameFigure, double radius) {
        this.nameFigure = nameFigure;
        this.radius = radius;
    }

    public String getNameFigure() {
        return nameFigure;
    }
    public void setNameFigure(String nameFigure) {
        this.nameFigure = nameFigure;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public String getName() {
        return nameFigure;
    }
}
