// 13) Write a program that takes two numbers and print odd numbers between them.
import java.util.Scanner;

public class morningQ13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Odd numbers between " + a + " and " + b + " are:");
        for (int i = a + 1; i < b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
