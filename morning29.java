// 29) Write a java program to add two matrices named ‘A’ and ‘B’, then store the values in a new 
// matrix ‘C’ and print it. (Take elements of matrices from the user)

import java.util.Scanner;

public class morning29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int noofrow = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int noofcol = sc.nextInt();
        int[][] A = new int[noofrow][noofcol];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < noofrow; i++) {
            for (int j = 0; j < noofcol; j++) {
                System.out.println("Enter Element at position [" + i + ", " + j + "]: ");
                A[i][j] = sc.nextInt();
            }
        }
        int[][] B = new int[noofrow][noofcol];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < noofrow; i++) {
            for (int j = 0; j < noofcol; j++) {
                System.out.println("Enter Element at position [" + i + ", " + j + "]: ");
                B[i][j] = sc.nextInt();
            }
        }
        // adding two arrays A and B and forming a new array named C
        int[][] C = new int[noofrow][noofcol];
        for (int i = 0; i < noofrow; i++) {
            for (int j = 0; j < noofcol; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        } 
        System.out.println("The sum of the two arrays is:");
        for (int i = 0; i < noofrow; i++) {
            for (int j = 0; j < noofcol; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
