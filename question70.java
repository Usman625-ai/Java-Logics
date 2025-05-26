public class question70 {
    public static void main(String[] args) {
        int[] ar = {0,1,2,3,4,5,6,7,8,9};
        int max = 10; // since we are checking for pandigital which includes all digits from 0 to 9
        boolean isPandigital = true;

        for (int i =0 ; i < max ; i++){ 
            boolean ispresent = false;
            for ( int j= 0 ; j < ar.length ; j++){
                if (ar [j] == i ){
                    ispresent = true;
                    break;
                }
            }
            if(!ispresent) {
                    isPandigital = false;
                    break;
                }
        }
        if (isPandigital) {
            System.out.println("The number is pandigital.");
        } else {
            System.out.println("The number is not pandigital.");
        }
    }
}
// pandigital means its includes all the nos from 0 to 9
// 70.	Check whether a number is pandigital (contains all digits from 0 to 9). 
//     ➤ Convert number to string and check if it contains every digit at least once. 
