// 5) Write a java program that takes populations and print their average and population that are 
// greater than average
import java.util.Scanner;

public class morningQ5 {
    public static void main(String[] args) {
        int sum = 0;
        int noofloops = 0;
        int[] populations = new int[100]; // Array to store populations
        int population;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the population or if you want to exit press 0: ");
        population = scanner.nextInt();
        while (population != 0){
            populations[noofloops] = population; // Store the population in the array
            noofloops++;
            sum += population;
            System.out.println("The current total population is: " + sum);
            System.out.print("Enter the population or if you want to exit press 0: ");
            population = scanner.nextInt();
        }
        if (population == 0){
                double average = (double) sum / noofloops;
                System.out.println("The average population is: " + average);
                for (int i = 0; i < noofloops; i++) {
                    if (populations[i] > average) {
                        System.out.println("Population " + populations[i] + " is above average.");
                    }
                }
            }
        
        scanner.close();
    }
}
