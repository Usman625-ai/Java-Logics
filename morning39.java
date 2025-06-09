// 39) Write a program that prints average of negative number, count of positive numbers and 
// ends when a ZERO is entered
import java.util.Scanner;

public class morning39 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any digit to start or 0 for exit : ");
        int no = sc.nextInt();
        int poscount = 0;
        int negcount = 0;
        int sum = 0;
        while (no != 0 ){
            no = sc.nextInt();
            if (no > 0){
                System.out.println("positive no " + no);
                poscount++;
            }
            else if (no < 0){
                System.out.println("negative no " + no);
                sum += no;
                negcount++;
            }
            else{
                System.out.println("exiting...");
            }

        }
        System.out.println("the avg of negative nos is " + (sum/negcount));
        System.out.println("the positive count is " + poscount);
        sc.close();
    }
}
