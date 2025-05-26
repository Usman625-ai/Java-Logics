public class question54 {
    public static void main(String[] args) {
        int[] arr = {6, 2, 3, 2, 6};
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("" + arr[i] + " " + temp[i]);
               
        }
        boolean isPalindrome = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp[i]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }
    }
}
// 54.	Check whether an array is a palindrome. 
//     ➤ Same forward and backward (e.g., [1, 2, 3, 2, 1]). 
