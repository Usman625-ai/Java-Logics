public class question68 {
    public static void main(String[] args){
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8, 10};
        int[] result = new int[A.length + B.length];

        int i = 0,j = 0,k = 0;

        while( i < A.length && j < B.length){
            if(A[i] < B[j]){
                result[k++] = A[i++];
            }
            else{
                 result[k++] = B[j++];
            }
        }
        while(i < A.length){
            result[k++] = A[i++];
        }
        while(j < B.length){
            result[k++] = B[j++];
        }

        for (int f = 0; f < result.length ; f++) {
            System.out.print(result[f] + " ");
        }
    }
}
// 68.	Merge two sorted arrays into one sorted array. 
//     ➤ Use two pointers and compare elements to merge correctly. 
