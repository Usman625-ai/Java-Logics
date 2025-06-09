// 33) Write a java function to print Fibonacci series.
public class morning33 {
    public static void main(String[] args){
        int n = 10;
        fib(n);
    }
    public static void fib(int n){
            int a = 0;
            int b = 1;
            System.out.print(a + " " + b + " ");
            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
    }
}
