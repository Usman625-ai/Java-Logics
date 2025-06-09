// 14) Write a java program that prints the given series: 
// 1, 1, 2, 4, 7, 11, 16, 22, 29, 37, 46, 56, 67, ……

public class morningQ14 {
    public static void main(String[] args) {
       int a = 1;
       int n = 13;
       for (int i = 0; i < n ; i++){
        System.out.print(a + ", ");
        a += i;
       } 
    }
}
