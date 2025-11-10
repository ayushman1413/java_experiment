// import java.util.Scanner;

// public class SumOfDigits {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
//         if (number < 0) {
//             System.out.println("Sum of digits is not defined for negative numbers.");
//             return;
//         }
//         int sum = 0;
//         while (number != 0) {
//             sum += number % 10;
//             number /= 10;
//         }
//         System.out.println("Sum of digits: " + sum);
//     }
// }


import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
        sc.close();
    }
}

