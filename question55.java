public class question55 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3};
       
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n ; i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while(count < n){
            arr[count++] = 0;
        }
        for (int i = 0 ; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
// 55.	Move all zero elements to the end. 
//     ➤ Keep the order of other elements the same, just move 0s to the right. 
//     e.g., [1, 0, 2, 0, 3] becomes [1, 2, 3, 0, 0].