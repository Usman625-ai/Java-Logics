import java.util.Scanner;

public class morningQ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number to check its divisor : ");
        int no = sc.nextInt();
        System.out.println("Enter second number to check its divisor : ");
        int no2 = sc.nextInt();
        int limit = no / 2;
        int limit2 = no2 / 2;
        int[] divisors = new int[limit];
        int i = 0;
        int[] divisors2 = new int[limit2];
        int j = 0;
        for (int k = 1; k <= limit; k++) {
            if (no % k == 0) {
                divisors[i] = k;
                i++;
            }
        }
        for (int k = 1; k <= limit2; k++) {
            if (no2 % k == 0) {
                divisors2[j] = k;
                j++;
            }
        }
        for(int m = 0; m < i; m++) {
            for(int n = 0; n < j; n++) {
                if(divisors[m] == divisors2[n]) {
                    System.out.println("Common divisor is : " + divisors[m]);
                }
            }
        }
        sc.close();
    }
}
