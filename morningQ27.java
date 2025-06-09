// 27) Write a java program that takes the number of day and print the name of week day (use 
// switch statements).

import java.util.Scanner;
public class morningQ27 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number btwn (1 to 7) : ");
        int n = sc.nextInt();
        switch(n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
        sc.close();
        System.out.println("Thank you for using the program!");
    }
}
