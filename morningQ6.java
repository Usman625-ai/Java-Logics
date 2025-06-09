// 6) Write a program that takes input a number and print all of its divisors and check whether the 
// given number is prime or not.
import java.util.Scanner;
public class morningQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check its divisor and if it is even or odd: ");
        int no = sc.nextInt();
        int limit = no / 2;
        int odd = 0;
        while (limit > 1 ){
            if (no % limit == 0){
                System.out.println("The divisor of " + no + " are: " + limit);
                odd++;
                limit--;
            } else {
                limit--;
            }
        }
        if (odd == 0) {
            System.out.println("The number " + no + " is a prime number.");
        } else {
            System.out.println("The number " + no + " is even number.");
        }
        sc.close();

        
    }
}
