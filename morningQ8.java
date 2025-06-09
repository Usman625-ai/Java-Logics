// 8) Write a program that takes two integers and print greatest common divisor (GCD) of them by 
// using logic of common divisors.
import java.util.Scanner;
public class morningQ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        int gcd = 1; // Initialize GCD to 1
        // Loop to find GCD
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i; // Update GCD if i is a common divisor
            }
        }
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd);
        sc.close();
    }
}
