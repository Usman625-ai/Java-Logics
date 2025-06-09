// 31) Write a java program that takes date and month from the user and prints the day on that 
// date of the month. (for 2025)

import java.util.Scanner;
import java.time.LocalDate;
import java.time.DayOfWeek;
public class morning31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date from (1-31) : ");
        int dateofmonth = sc.nextInt();
        System.out.println("Enter the month from (1-12) : ");
        int month = sc.nextInt();
        try{
            LocalDate date = LocalDate.of(2025, month, dateofmonth);
            DayOfWeek day = date.getDayOfWeek();
            System.out.println("The day on date : " + date + " is " + day);
        } catch (Exception e) {
            System.out.println("Invalid date or month entered. Please try again.");
        }
        sc.close();
    }
}
