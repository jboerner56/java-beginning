package Rectangle;

import java.awt.Shape;

public class Circle extends Rectangle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double length) {
        this.radius = radius;
    }

    public double area() {
        return 2 * 2 * (this.radius * this.radius);
    }
//    @Override

}
