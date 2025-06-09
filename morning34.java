// 34) Write a java program to find a number in a given array by using linear search and prints the 
// position if element found otherwise prints “Your required number is not found in the array”.
public class morning34 {
    public static void main(String[] args) {
        int foundelement = 5;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int position = linearSearch(arr, foundelement);
        if (position != -1) {
            System.out.println("Element found at position: " + position);
        } else {
            System.out.println("Your required number is not found in the array.");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
