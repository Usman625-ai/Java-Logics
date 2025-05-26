public class question73 {
    public static void main(String[] args) {
        int limit = 2000;
        int i; //start index
        for (i = 10 ; i <= limit; i++){
            int originalNo = i;
            int temp = i;
            int digits = String.valueOf(i).length(); // Count the number of digits
            int sum = 0; // Initialize sum to 0
            while (temp > 0){
                int digit = temp % 10; // Get the last digit
                sum += Math.pow(digit, digits); // Add the digit raised to the power of number of digits
                temp /= 10; // Remove the last digit
            }
            if (sum == originalNo) {
                System.out.println(originalNo + " is an Armstrong number.");
            }    
        }   
    }
}
// 73.	Find and print all Armstrong numbers from 1 to N. 
//     ➤ Check each number: sum of each digit raised to the power of number of digits should equal the number. 
