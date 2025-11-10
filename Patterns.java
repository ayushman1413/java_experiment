public class Patterns {
    public static void main(String[] args) {
        System.out.println("Triangle Pattern:");
        printTriangle(5);

        System.out.println("\nPyramid Pattern:");
        printPyramid(5);

        System.out.println("\nRectangle Pattern:");
        printRectangle(4, 6);
    }

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Method to print a pyramid
    public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Method to print a rectangle
    public static void printRectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
