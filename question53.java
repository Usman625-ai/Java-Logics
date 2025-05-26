public class question53 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8};
        int[] arr2 = {1,2,5,6,9};
        int[] common = new int[arr1.length + arr2.length];
        int k = 0;
        for(int i = 0; i < arr1.length ; i++){
            for (int j = 0 ; j < arr2.length ; j++){
                if(arr1[i] == arr2[j]){
                    common[k] = arr1[i];
                    k++;
                }
            }
        }
        for(int i = 0; i < k; i++){
            System.out.print(common[i] + " ");
        }

    }
}
// 53.	Find common elements between two arrays. 
//     ➤ Print elements that exist in both arrays. 
