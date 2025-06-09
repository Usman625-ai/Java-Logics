// 28) Write a java program that takes elements in a 2d array and then print 2d array in a matrix 
// form.
import java.util.Scanner;

public class morning28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int noofrow = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int noofcol = sc.nextInt();
        int[][] arr = new int[noofrow][noofcol];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < noofrow; i++) {
            for (int j = 0; j < noofcol; j++) {
                System.out.println("Enter Element at position [" + i + ", " + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < noofrow; i++) {
            for (int j = 0; j < noofcol; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
