public class question62 {
    public static void main(String[] args) {
        int[] ar = {5, 2, 9, 1, 3};
        for(int i = 1; i < ar.length ; i++){
            int curr = ar[i];
            int prev = i - 1;
            while (prev >= 0 && ar[prev] > curr){
                ar[prev + 1] = ar[prev];
                prev--;
            }
            ar[prev + 1] = curr;
        }
        for (int k : ar) {
            System.out.print(k + " ");
            
        }
    }
}
// 62.	Sort the array using Selection Sort. 
//     ➤ Repeatedly pick the smallest element and put it at the beginning. 
