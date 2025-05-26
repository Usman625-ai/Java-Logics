public class question69 {
    public static void main(String[] args) {
        int[] ar = {2,5,7,2,3,9,5};
        
        int index = 0;
        int[] newar = new int[ar.length];
        for (int i = 0; i < ar.length ; i++) {
            boolean isduplicate = false;
            for (int j = 0; j < index ; j++) {
                if (ar[i] == ar[j]){
                    isduplicate = true;
                    break;
                }
            }
            if(!isduplicate){
                newar[index++] = ar[i];
            }
        }
        for(int k = 0; k < index ; k++){
            System.out.println(newar[k]);
        }
        
    }
}
// 69.	Remove duplicate elements from a sorted array. 
//     ➤ Skip over repeating elements while traversing the array. 
