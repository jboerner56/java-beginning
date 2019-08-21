// classes have static and non-static members
// excuted at different times
public class StaticDemo {
    // global variable
    // static can only reference static
    static int a = 10;
    int b;

    // anonymous block
    // can be static or non-static
    {
        // non-static anonymous block
        System.out.println("when executed");
    }
    static {
        System.out.println("executed" + a);
    }
    public static void main(String[] args) {
        System.out.println(a);
        
    }
    public static void print(){
        int b = 20;
        System.out.println(b);

    }
    public void print2(){
        System.out.println(a); // non-static can reference static
        System.out.println(b);
    }

}
