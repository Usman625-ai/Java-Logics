// 3) Write a java program that takes amount of gift voucher until it is fully used.
import java.util.Scanner;
public class morningQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total amount of gift voucher: ");
        double totalVoucher = sc.nextDouble();
        double usedAmount = 0;

        while (usedAmount < totalVoucher) {
            System.out.print("Enter amount to use from the voucher: ");
            double amountToUse = sc.nextDouble();

            if (amountToUse <= 0) {
                System.out.println("Amount must be greater than zero.");
            } else if (usedAmount + amountToUse > totalVoucher) {
                System.out.println("Cannot use more than the remaining voucher amount.");
            } else {
                usedAmount += amountToUse;
                System.out.println("Used amount: " + usedAmount);
            }
        }

        System.out.println("Gift voucher fully used.");
        sc.close();
    }
}
