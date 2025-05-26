public class question46 {
    public static void main(String[] args){
        int[] input = {5,3,5,3,6,7,3,2};
        int[] freq = new int[input.length]; // For digits 0-9

        // Step 1: Count frequencies of digits
        for (int i : input) {
            // int digit = i - 0;
            freq[i]++;  
        }
        for(int j = 0 ; j < freq.length ; j++ ){
            if(freq[j] >= 1){
                System.out.println(j + " appears " + freq[j] + " times");
            }
        }


    }
}
// 46.	Count the frequency of each element. 
//     ➤ Count how many times each element occurs in the array. 
