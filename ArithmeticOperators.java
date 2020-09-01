public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("Simple Arithmetic operations\n");
        System.out.println("a = " + a);
        System.out.println("b = a * 3 =" + b);
        System.out.println("c = b / 4 =" + c);
        System.out.println("d = c - a =" + d);
        System.out.println("e = -d =" + e);
        int x = 13;
        System.out.println("x = " + x);
        System.out.println("x mod 10 = " + x % 10);
        System.out.println("Increment operations\n");
        c=a++;
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        d=++b;
        System.out.println("b = " + b);
        System.out.println("d = " + d);

    }
}
