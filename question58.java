public class question58 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int primeCount = 0;

        for (int i = 0 ; i < arr.length; i++) {
            int num = arr[i];
            boolean isPrime = true;
            if( num < 2){
                isPrime = false;    
            }
            else{
                for (int j = 2 ; j <= Math.sqrt(num); j++){
                    if(num % j == 0){
                        isPrime = false;
                        break;
                    }
                    else {
                        isPrime = true;
                    }
                }
            }
            if(isPrime) {
                primeCount++;
            }
            System.out.println("Number: " + num + " is prime: " + isPrime);
            
        }
        System.out.println("Total prime numbers in the array: " + primeCount);
    }
}
// 58.	Count how many elements in the array are prime. 
//     ➤ Use prime-check logic for each element in the array. 
