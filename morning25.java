// 25) Write a java code that takes an integer representing number of lines of the following 
// pattern and then print it. 
// For example: if n = 4: 
// * * * *
//  * * * 
//  * * 
//  *

public class morning25 {
    public static void main(String[] args) {
        int n = 4; // Number of lines
        for (int i = 0 ; i < n ; i++){
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
