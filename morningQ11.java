// 11) Relation between product of two positive integer numbers, their LCM and HCF is 
// n1 * n2 = LCM (n1, n2) * HCF (n1, n2)
// Here n1 is the first number and n2 is the second number. 
// Write a java program that takes two positive integers and calculate GCD (HCF) using any of the 
// valid methods, then your program should also calculate and print the LCM of the same two 
// numbers using the relation defined above.

import java.util.Scanner;
public class morningQ11 {
    public static void main(String[] args) {
        // lcm = a * b / gcd(a, b)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int gcd = 1;

        for (int i = 1 ; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                // Calculate GCD
                gcd = i;
                
            }
        }
        System.out.println("The GCD (HCF) of " + a + " and " + b + " is: " + gcd);
        int lcm = (a * b) / gcd;
        System.out.println("The LCM of " + a + " and " + b + " is: " + lcm);
        sc.close();
    }
}
