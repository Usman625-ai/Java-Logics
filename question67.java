public class question67 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13,18,24};
        int low = 0;
        int high = arr.length - 1;
        int target = 24;
        boolean found = true;
        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] == target){
                System.out.println("Target = " + target +  " found at index " + mid);
                found = true;
                break;
            }
            else if (mid < target){
                low = mid + 1;
            }
            else if(mid > target){
                high = mid - 1; 
            }
        }
        if(!found){
            System.out.println("Target = " + target + " not found");
        }
    }
}
