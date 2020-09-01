public class BooleanLogicalOps {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b;
        boolean d = a & b;
        boolean e = a ^ b;
        boolean f = (!a & b) | (a & !b);
        boolean g = !a;
        System.out.println("Basic Boolean Logical operations\n");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = a | b = " + c);
        System.out.println("d = a & b = " + d);
        System.out.println("e = a ^ b = " + e);
        System.out.println("f = (!a & b) | (a & !b) = " + f);
        System.out.println("g = !a = "+g);
        //Example of short circuit operator
        System.out.println("\nBoolean Logical operators - Conditional operators");
        int x=2;
        System.out.println("Print x only if x is not zero");
        if (x!=0 && x<10) //if x=0, then the second part is not even checked,
            //preventing run-time exception when x=0
        {
            System.out.println("x = "+x);
        }
        x=0;
        if (x!=0 && x<10) //loop to show functioning of operator
            //x!=0 is false, therefore x<10 not checked and loop not run
        {
            System.out.println("x = "+x);
            x+=2;
        }
        System.out.println("\nBoolean Logical operators - Ternary Operators");
        int y, z;
        x = 10;
        y = 20;
        z = x > y ? x : y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("The larger number of x and y is: " + z);
    }
}
