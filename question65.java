public class question65 {
    public static void main(String[] args) {
        int[] arr = {2,6,3,5,4,7};
        int[] temp = new int[arr.length];
        int evencount = 0;
        int oddcount = arr.length - 1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % 2 == 0){
                temp[evencount++] = arr[i];
                // all even nos at start
            }
            else if(arr[i] % 2 != 0){
                temp[oddcount--] = arr[i];
            }
        }
        for (int x : temp) {
            System.out.print(x + " ");
        }
    }
}
// 65.	Sort even numbers first, then odd numbers. 
//     ➤ Separate evens and odds, then sort each and combine. 
