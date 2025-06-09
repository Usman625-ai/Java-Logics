// 19) Write a program that takes one alphabet and prints the same character but in lower case.
// For example if user enters “F” then your program should print “f”.
import java.util.Scanner;
public class morningQ19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet :");
        String input = sc.nextLine();
        char ch = input.charAt(0);
        System.out.println("uppercase: " + Character.toUpperCase(ch));
        sc.close();

    }
}
