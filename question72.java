public class question72 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int lastdigit = arr[arr.length - 1];
        int index = arr.length - 1;
        for (int i = index ; i > 0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastdigit;
        System.out.print("Rotated array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 
// 72.	Rotate the digits of a number to the right. 
//     ➤ Shift all digits right by one place and bring the last digit to the start. 
