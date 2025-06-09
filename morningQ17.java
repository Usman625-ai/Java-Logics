// 17) Write a program that takes input a sentence from the user and prints each word separately 
// on a new line.
import java.util.Scanner;
public class morningQ17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        
        // Split the input string into words using space as a delimiter
        String[] words = input.split(" ");
        
        // Print each word on a new line
        for (String word : words) {
            System.out.println(word);
        }
        
        // Close the scanner
        scanner.close();
    }
}
