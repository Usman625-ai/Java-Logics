public class question45 {
    public static void main(String[] args) {
        String input = "53536732";
        int[] freq = new int[input.length()]; // For digits 0-9

        // Step 1: Count frequencies of digits
        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = ch - '0';
                freq[digit]++;
            }
        }

        int count = 0;
        int[] newar = new int[input.length()]; // At most 10 unique digits

        // Step 2: Normalize frequencies and collect unique digits
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] >= 1) {
                freq[i] = 1; // Optional, just to emphasize only 1 per digit
                System.out.println(i + " " + freq[i]);
                newar[count] = i;
                count++;
            }
        }

        // Step 3: Print the total count of unique digits
        System.out.println("Total unique digits: " + count);

        // Step 4: Print all the unique digits
        System.out.print("Unique digits: ");
        for (int k = 0; k < count; k++) {
            System.out.print(newar[k]);
        }
        System.out.println(); // Move to the next line
    }
}
// 45.	Remove duplicate elements from the array. 
//     ➤ Use nested loops or a hash map to skip repeating values. 
