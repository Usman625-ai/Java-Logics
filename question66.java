public class question66 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, 1, 4};
        for (int i = 0 ; i < arr.length -1 ; i++){
            int bindex = i;
            for (int j = i + 1 ; j < arr.length ; j++){
                if (arr[j] > arr[bindex]){
                    bindex = j;
                }
            }
            int temp = arr[bindex];
            arr[bindex] = arr[i];
            arr[i] = temp;
        }
        String ele = "";
        for (int a : arr) {
            ele += a;
        }
        int longestno = Integer.parseInt(ele);
        System.out.println(longestno);
    }
}
// 66.	Sort digits of an array and form the largest possible number. 
//     ➤ Combine digits, sort in descending order, and print the final number. 
