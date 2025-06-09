// 2) Write a program that takes original selling price and discount percentage of a product and 
// print discounted price of product.
import java.util.Scanner;
public class morningQ2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter original selling price: ");
        double originalPrice = sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercentage = sc.nextDouble();
        double percentage = discountPercentage / 100;
        double discountedPrice = originalPrice - (originalPrice * percentage);
        System.out.println("Discounted price: " + discountedPrice);
        sc.close();
    }
}
