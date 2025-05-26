public class question61 {
    public static void main(String[] args) {
        int[] ar = {5, 2, 9, 1, 3};
        for (int i = 0; i < ar.length - 1 ; i++){
            for (int j = 0 ; j < ar.length - 1 - i ; j++){
                if(ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
        for (int x : ar) {
            System.out.print(x + " ");
        }
    }
}
// 61.	Sort the array using Bubble Sort. 
//     ➤ Repeatedly swap adjacent elements if they’re in the wrong order. 
