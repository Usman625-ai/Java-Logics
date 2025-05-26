public class question47 {
    public static void main(String[] args) {
        int[] input = {5,3,5,3,6,7,3,2};
        int[] freq = new int[input.length];

        for (int i : input) {
            freq[i]++;
        }
        for(int j = 0 ; j < freq.length ; j++){

            if (freq[j] == 1){
                System.out.println(j + " appears " + freq[j] + " times ");
            }
        }
    }
}
// 47.	Print only the unique elements from the array. 
//    ➤ Display elements that appear exactly once. 
