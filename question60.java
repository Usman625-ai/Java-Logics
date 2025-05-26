public class question60 {
    public static void main(String[] args) {
        int[] ar = {121,134,151,252,353};
        int temp;
        int reverse;
        int count = 0;
        for (int i = 0; i < ar.length ; i++){
            temp = ar[i];
            int ar2 = temp;
            reverse = 0;
            while(temp > 0){
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp /= 10;
            }
            if(ar2 == reverse){
                System.out.println(ar2 + " is palindrome");
                count++;
            }
            else{
                System.out.println(ar2 + " is not palindrome");
            }

        }
    }
}
// 60.	Count how many array elements are palindromes. 
//     ➤ Reverse each number and compare with original to check. 
