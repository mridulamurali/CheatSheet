public class BitwiseLogicalOperators {
    public static void main(String args[]){
        String binary[] = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111",
        };
        int a = 3; //0011
        int b = 6; //0110
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);

        System.out.println("Basic Boolean Logical operations\n");
        System.out.println("a = " + binary[a]);
        System.out.println("b = " + binary[b]);
        System.out.println("c = a | b = " + binary[c]);
        System.out.println("d = a & b = " + binary[d]);
        System.out.println("e = a ^ b = " + binary[e]);
        System.out.println("f = (~a & b) | (a & ~b) = " +binary[f]);
    }
}
