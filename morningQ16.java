// 16) Write a java program that prints the given series:
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, …….
public class morningQ16 {
    public static void main(String[] args) {
        int totaln = 11;
        int a = 0, b = 1, c;
        System.out.print(a + " " + b); // Print the first two numbers
        for (int i = 2; i < totaln; i++) {            
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

    }
}
