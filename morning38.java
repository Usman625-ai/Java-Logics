// 38) Write a program that keeps on taking input integer numbers until a 0 is entered. When 
// the input ends it should print total of positive numbers and count of negative numbers.
import java.util.Scanner;

public class morning38 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any digit to start or 0 for exit : ");
        int no = sc.nextInt();
        int negcount = 0;
        int sum = 0;
        while (no != 0 ){
            no = sc.nextInt();
            if (no > 0){
                System.out.println( "positive no " + no);
                sum += no;
            }
            else if (no < 0){
                System.out.println("negative no " + no);
                negcount += 1;
            }
            else{
                System.out.println("exiting...");
            }

        }
        System.out.println("the sum of all positive nos are : " + sum);
        System.out.println("the negative count is " + negcount);
        sc.close();

    }
}
