package Rectangle;

public abstract class Shape {
// if only one abstract method is needed class still needs to be abstract
    // can still have non-abstract methods as well
    // abstract methods need to be implemented.
    // non-abstract does not
    public abstract double area();

    public String getName(){
        return "abstract shape";
    }
}
