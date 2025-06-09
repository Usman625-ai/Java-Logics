// 1) Write a program that takes obtained marks and total marks from the user and print 
// percentage.
import java.util.Scanner;
public class morningQ1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter obtained marks: ");
        double obtainedMarks = sc.nextDouble();
        System.out.print("Enter total marks: ");
        double totalMarks = sc.nextDouble();
        if (obtainedMarks <= totalMarks){
            double percentage = (obtainedMarks / totalMarks) * 100;
            System.out.println("Percentage: " + percentage + "%");
        }
        else {
            System.out.println("Obtained marks cannot be greater than total marks.");
        }
        sc.close();
    }
}
