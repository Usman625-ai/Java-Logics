public class question71 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length; 
        // Rotate the digits to the left
        int firstDigit = arr[0];
        for (int i = 0 ; i < n - 1 ; i++){
            arr[i] = arr[i + 1]; // Shift each digit left
        }
        arr[arr.length - 1] = firstDigit; // Move the first digit to the end
        for (int digit : arr) {
            System.out.print(digit + " ");
        }
    }
}
// 71.	Rotate the digits of a number to the left. 
//     ➤ Shift all digits left by one place and move the first digit to the end. 
