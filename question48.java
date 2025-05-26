public class question48 {
    public static void main(String[] args) {
        int[] input = {5,3,5,3,6};
        int result = 0;
        for (int i : input) {
            result ^= i; 
        }
        System.out.println("the element that appears once is " + result);
        
    }
}

// 48.	Find the element that appears once while all others appear twice. 
//     ➤ Use XOR trick or count each element’s frequency. 
