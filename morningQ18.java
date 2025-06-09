// 18) Write a java program that takes single digit as string and print it’s twice. For example if the
// user enters “4” whose ASCII value is 52 then your program should print “8”.

import java.util.Scanner;

public class morningQ18 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a no btwn 1 to 9 (as a string) : ");
        String input = obj.nextLine();

        if(input.length() == 1 && input.charAt(0) >= '1' && input.charAt(0) <= '9') {
            int number = Integer.parseInt(input);
            System.out.println("The number is: " + number);
            System.out.println("The twice of the number is: " + (number * 2));
        } else {
            System.out.println("Invalid input. Please enter a single digit number between 1 and 9.");
        }
    }
}
