// 15) Write a java program that prints the given series:
// 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, …………
public class morningQ15 {
    public static void main(String[] args) {
        int a = 1;
        int n = 10;
        int j = 3;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            a += j;
            j += 2;
        }
    }
}
