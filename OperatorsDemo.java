public class OperatorsDemo {
    public static void main(String[] args) {
        System.out.println("=== Arithmetic Operators ===");
        int a = 10, b = 3;
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        System.out.println("\n=== Relational Operators ===");
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b));   // Greater than
        System.out.println("a < b: " + (a < b));   // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to

        System.out.println("\n=== Logical Operators ===");
        boolean x = true, y = false;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x));         // Logical NOT

        System.out.println("\n=== Assignment Operators ===");
        int c = 5;
        System.out.println("Initial c = " + c);
        c += 2; // c = c + 2
        System.out.println("c += 2: " + c);
        c -= 1; // c = c - 1
        System.out.println("c -= 1: " + c);
        c *= 3; // c = c * 3
        System.out.println("c *= 3: " + c);
        c /= 2; // c = c / 2
        System.out.println("c /= 2: " + c);
        c %= 4; // c = c % 4
        System.out.println("c %= 4: " + c);

        System.out.println("\n=== Operator Precedence and Associativity ===");
        // Precedence: * has higher precedence than +
        int result1 = 2 + 3 * 4; // 2 + (3*4) = 14
        System.out.println("2 + 3 * 4 = " + result1);

        // Associativity: Left to right for +
        int result2 = 5 - 3 - 2; // (5 - 3) - 2 = 0
        System.out.println("5 - 3 - 2 = " + result2);

        // Logical operators associativity
        boolean result3 = true || false && false; // true || (false && false) = true
        System.out.println("true || false && false = " + result3);

        // Assignment associativity: Right to left
        int d, e, f;
        d = e = f = 10; // f=10, e=f, d=e
        System.out.println("d = e = f = 10; d=" + d + ", e=" + e + ", f=" + f);

        System.out.println("\n=== Edge Cases ===");
        // Division by zero (ArithmeticException)
        try {
            int divZero = 10 / 0;
        } catch (ArithmeticException ex) {
            System.out.println("Division by zero: " + ex.getMessage());
        }

        // Integer overflow
        int maxInt = Integer.MAX_VALUE;
        System.out.println("Max int: " + maxInt);
        int overflow = maxInt + 1; // Wraps around to negative
        System.out.println("Max int + 1 (overflow): " + overflow);

        // Logical short-circuit: && stops if first is false
        boolean shortCircuit = false && (1 / 0 == 0); // No exception because first is false
        System.out.println("Short-circuit &&: " + shortCircuit);
    }
}
