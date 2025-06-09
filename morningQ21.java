import java.util.Scanner;

public class morningQ21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a no in (int):");
        int inputStr = scanner.nextInt();
        String input = String.valueOf(inputStr);
        int sum = 0;
        System.out.println("Sum of digits in " + input + " is:");
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int no = Integer.parseInt(String.valueOf(ch));
            sum += no;
        }
        System.out.println(sum);
        scanner.close();
    }
}
