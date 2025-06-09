// 32) Write a java program to find factorial of a number by using function.
import java.util.Scanner;
public class morning32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
        int n = sc.nextInt();
        int facvalue = factorial(n);
        System.out.println("Factorial of " + n + " is: " + facvalue);
        sc.close();
        
        
    }
    public static int factorial(int n) {
        int fac = 1;
        for (int i = 1 ; i <= n ; i++){
            fac *= i ; 
        }
        return fac;
    }
}
