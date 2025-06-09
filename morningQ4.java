import java.util.Scanner;
public class morningQ4 {
    public static void main(String[] args) {
        int sum = 0;
        int population;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the population or if you want to exit press 0: ");
        population = scanner.nextInt();
        while (population != 0){
            sum += population;
            System.out.println("The current total population is: " + sum);
            System.out.print("Enter the population or if you want to exit press 0: ");
            population = scanner.nextInt();
        }
        System.out.println("The total population is: " + sum);
        scanner.close();
    }
}
