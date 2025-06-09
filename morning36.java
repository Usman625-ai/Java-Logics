public class morning36 {
    public static void main(String[] args) {
        int foundElement = 5;
        int[] arr = {9, 4, 2, 8, 1, 7, 3, 6, 5};
        bubbleSort(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int position = linearSearch(arr , foundElement);
        if (position != -1){
            System.out.println("Element found at position : " + position);
        }
        else{
            System.out.println("Elementnot found");
        }
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static int linearSearch(int[] arr , int foundElement){
        int n = arr.length;
        for (int k = 0 ; k < n ; k++){
            if (arr[k] == foundElement){
                return k;
            }
        }
        return -1;
    }
}
