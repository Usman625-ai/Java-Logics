public class question39 {
    public static void main(String[] args) {
        int[] ar = {22,54,6,3,8,9};
        int max = ar[0];
        int min = ar[0]; 
        for (int i = 1; i < ar.length ; i++){
            if(max < ar[i]){
                max = ar[i];
            }
        }
        for (int j = 1; j < ar.length ; j++){
            if(min > ar[j]){
                min = ar[j];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
// 39.	Find the maximum and minimum values in the array. 
//     ➤ Compare each element to track max and min values. 
