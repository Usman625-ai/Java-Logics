// 10) Write a program that takes two numbers and print least common multiple (LCM)
import java.util.Scanner;
public class morningQ10 {
    // lcm = a * b / gcd(a, b)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int gcd = 1;

        for (int i = 1 ; i < Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                // Calculate GCD
                gcd = i;
                
            }
        }
        int lcm = (a * b) / gcd;
        System.out.println("The LCM of " + a + " and " + b + " is: " + lcm);
        sc.close();
    }
}
