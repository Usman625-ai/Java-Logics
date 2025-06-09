// 22) Write a java code to find the sum of integer array named “X” whose elements are initialized 
// while declaring the array, 
// For example: int[] X = {90, 45, 12, 5, -1, 747, 2, 77}; 
// Numbers of elements may vary so your program must accommodate any number of elements.

public class morningQ22 {
    public static void main(String[] args) {
        int[] X = {90, 45, 12, 5, -1, 747, 2, 77};
        int sum = 0;
        for (int e : X) {
            sum += e;
        }
        System.out.println("Sum of elements in X: " + sum);
    }
}
