public class ControlStructures {
    int a = 10; // 2 contexts in java class- static and non-static
    static int b = 20
    // cant access static variables inside static class
    public static void main(String[] args) { //main is static method- bootstraps java classes
        int a = 20 //local variable or local fields cant have modifers
        // local scope, only accessable inside class
        // int b; will take precidence over global variable
        // no default values for local variables
        System.out.println(a + b);
        // control structures
        //1. selection
        //2. iteration

    }
}

// global variables are assigned default values
    // integer=0, boolean=false, objects=null
    // falsey values