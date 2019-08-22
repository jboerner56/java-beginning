package Rectangle;

import java.awt.*;

public class Rectangle extends Shape {
    private double length;
    public  double width;

    public Rectangle(double length) {
        this.length = length;
    }

    public Rectangle(double i, double i1) {

    }

    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle() {
    }

    public double area() {
        return this.length * this.width;
    }
    @Override
    public  String getName(){
        return "I am a rectangle";
    }
}
