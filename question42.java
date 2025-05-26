public class question42 {
    public static void main(String[] args) {
        int[] ar = {4,6,9,2,1,7};
        int[] reversear = new int[ar.length];
        int k = 0;
        for (int i = ar.length - 1 ; i >= 0; i--){
            reversear[i] =  ar[k];
            k++;
        }
        for(int l = 0; l < reversear.length ; l++){
            System.out.print(reversear[l] + " ");
        }
    }
}
// 42.	Reverse the elements of the array. 
//     ➤ Swap first with last, second with second-last, and so on. 
