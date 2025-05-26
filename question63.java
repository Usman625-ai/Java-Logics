public class question63 {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        for(int i= 0 ; i < arr.length - 1 ; i++){
            int mini = i;
            for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;

        }
        for (int k : arr) {
            System.out.print(k + " ");
            
        }
    }
}
