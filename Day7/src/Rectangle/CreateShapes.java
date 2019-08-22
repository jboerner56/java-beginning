package Rectangle;

public class CreateShapes {
    public static void main(String[] args) {
        Shape s;
        s = new Rectangle(10, 10);
        System.out.println(s.getName());

        s = new Circle(10);
        System.out.println(s.getName());
        System.out.println(s.area());
        }
    }
