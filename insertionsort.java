public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {4,1,5,2,3};
        for (int i = 1; i < arr.length ; i++){
            int curr = arr[i];
            int prev = i - 1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// 1st iteration 
// curr = 1
// prev = 0
// arr[prev] > 1? 4>1? true then it will go in while and swap and will loop till prev becomes 0
// 2nd iteration
// curr = 5
// prev = 1
// arr[prev] > 5? 1>5? false then it will not go in while and will continue
// 3rd iteration
// curr = 2
// prev = 2
// arr[prev] > 2? 5>2? true then it will go in while and swap  and will loop till prev becomes 0
// 4th iteration
// curr = 3
// prev = 3
// arr[prev] > 3? 5>3? true then it will go in while and swap and will loop till prev becomes 0
// 5th iteration
// curr = 4
// prev = 4
// arr[prev] > 4? 5>4? true then it will go in while and swap and will loop till prev becomes 0
