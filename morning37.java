public class morning37 {
    public static void main(String[] args){
        int[] arr = {64, 25, 12, 22, 11};
        int foundelement = 64;
        selectionsort(arr);
        System.out.println("Sorted array : ");
        for (int e : arr){
            System.out.print(e + " ");
        }
        System.out.println(); 
        int position = linearsearch(arr , foundelement);
        if (position != -1){
            System.out.println("Element " + foundelement + " found at index : " + position);
        }
        else{
            System.out.println("Element does not exist in existing array");
        }
    }
    public static int linearsearch(int[] arr , int foundelement){
        int n = arr.length;
        for (int j = 0; j < n ; j++){
            if (arr[j] == foundelement){
                return j;
            }
        }
        return -1;
    }
    public static void selectionsort(int[] arr){
        int n = arr.length;
        for (int i = 0 ; i < n - 1 ; i++){
            int minindex = i;
            for (int j = i + 1 ; j < n ; j++){
                if (arr[j] < arr[minindex] ){
                    minindex = j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i] = temp;
            
        }
    }
}
