public class bubblesort{
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22};
        int n = arr.length;
        for(int i = 0 ; i < n-1; i++) {
            for(int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted array");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
        // when i = 0 then j will run 4 times in each iteration we will compare previous element with next element
        // when i = 1 then j will run 3 times in each iteration we will compare previous element with next element
        // when i = 2 then j will run 2 times in each iteration we will compare previous element with next element
        // when i = 3 then j will run 1 time in each iteration we will compare previous element with next element
        // Total number of iterations = 4 + 3 + 2 + 1 = 10
        // Time complexity is O(n^2)