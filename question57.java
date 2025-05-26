public class question57 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] result = new int[arr.length];
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                result[i] = arr[end];
                end--;
            } else {
                result[i] = arr[start];
                start++;
            }
        }
        for (int k : result) {
            System.out.print(k + " ");
            
        }
    }
}
// 57.	Rearrange array in max-min form. 
//     ➤ Alternate the largest and smallest elements in the array. 
