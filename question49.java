public class question49 {
    public static void main(String[] args) {
        int[] arr = {5,3,1,6,7,2};
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        int averge = sum/arr.length ;
        System.out.println("the nos which are greater than average are : ");
        for (int j = 0; j < arr.length ; j++) {
            if(averge < arr[j]){
                System.out.print(arr[j] + " ");
            }
        }
    }
}
// 49.	Count how many elements are greater than the average. 
//     ➤ First find average of all elements, then count how many are greater than it. 
