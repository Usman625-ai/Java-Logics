public class question44 {
    public static void main(String[] args) {
        int[] arr = {4,55,23,22,6};
        int high = arr[0];
        int sechigh = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(high < arr[i]){
                high = arr[i];
            }
        }
        int exclude = high;

        // Count how many elements are NOT equal to exclude
        int count = 0;
        for (int num : arr) {
            if (num != exclude) {
                count++;
            }
        }

        // Create new array with reduced size
        int[] result = new int[count];
        int index = 0;
        for (int num : arr) {
            if (num != exclude) {
                result[index++] = num;
            }
        }

        int[] temparr = result.clone();
        for (int i = 0; i < temparr.length; i++) {
            if(sechigh < temparr[i]){
                sechigh = temparr[i];
            }
            
        }
        System.out.println("second highest no is " + sechigh);
    }
}
// 44.	Find the second largest element in the array. 
//     ➤ Track two largest values while looping through the array. 
