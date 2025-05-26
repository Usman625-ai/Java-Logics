public class question40 {
    public static void main(String[] args) {
        int[] ar = {3,6,7,1,9,8,4};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < ar.length ; i++) {
            if (ar[i] % 2 == 0){
                even += 1;
            }
            else{
                odd += 1;
            }
        }
        System.out.println("even nos are total " + even);
        System.out.println("odd nos are total " + odd);
    }
}
// 40.	Count how many elements are even and how many are odd. 
//     ➤ Use modulus operator to check and count evens/odds. 
