import java.util.Scanner;  // Import the Scanner class

public class question2 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object

    System.out.println("Enter NO1");
    int no1 = myObj.nextInt();  // Read user input
    System.out.println("no1 is: " + no1);  // Output user input

    System.out.println("enter no2");
    int no2 = myObj.nextInt();  // Read user input
    System.out.println("no2 is: " + no2);  // Output user input
    
    System.out.println("enter no 3");
    int no3 = myObj.nextInt();  // Read user input
    System.out.println("no3 is: " + no3);  // Output user input
    int sum = no1 + no2 + no3;
    System.out.println("the sumof all the nos is" + sum);
    myObj.close();



  }
}
