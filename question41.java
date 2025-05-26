public class question41 {
    public static void main(String[] args) {
        int[] ar = {4,2,6,8,3};
        int search = 3;
        int index = -1;
        for (int i = 0 ; i < ar.length ; i++){
            if(ar[i] == search){
                index = i;
            }
        }
        if(index != -1){
            System.out.println("element found at index " + index);

        }
        else{
            System.out.println("element not found");
        }
        
    }
}
// 41.	Search for a specific element in the array. 
//     ➤ Use a linear search to find if the element exists and its index. 
