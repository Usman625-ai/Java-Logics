public class question64 {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int n = arr.length;

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] < arr[j]) {
                    minIndex = j;
                }
            }


            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
// 64.	Sort the array in descending order. 
//     ➤ Modify any sort algorithm to sort from largest to smallest. 
