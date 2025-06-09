// 12) Write a program that takes a positive number and prints its factorial.
import java.util.Scanner;
public class morningQ12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int n = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + n + " is: " + factorial);
        sc.close();
    }
}
