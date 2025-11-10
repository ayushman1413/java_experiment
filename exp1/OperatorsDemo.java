package exp1;
public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;

        System.out.println("Arithmetic Operators:");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println("Unary Operators:");
        System.out.println(+a);
        System.out.println(-a);
        System.out.println(++a);
        System.out.println(--a);

        System.out.println("Assignment Operators:");
        int d = a;
        System.out.println(d);
        d += b;
        System.out.println(d);
        d -= b;
        System.out.println(d);
        d *= b;
        System.out.println(d);
        d /= b;
        System.out.println(d);
        d %= b;
        System.out.println(d);

        System.out.println("Relational Operators:");
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        System.out.println("Logical Operators:");
        boolean x = true;
        boolean y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);

        System.out.println("Bitwise Operators:");
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(~a);

        System.out.println("Shift Operators:");
        System.out.println(a << 1);
        System.out.println(a >> 1);
        System.out.println(a >>> 1);

        System.out.println("Ternary Operator:");
        System.out.println(a > b ? a : b);

        System.out.println("Instanceof Operator:");
        String s = "Hello";
        System.out.println(s instanceof String);

        System.out.println("Operator Precedence and Associativity:");
        System.out.println(a + b * c);
        System.out.println((a + b) * c);
        System.out.println(a / b + c);
        System.out.println(a + b - c);
        System.out.println(a == b && b < c);
        System.out.println(a > b || b == c);
    }
}
