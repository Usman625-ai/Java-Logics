public class question24{
    public static void main(String[] args){
        // decimal to binary
        int n = 13;
        int quotient;
        String binary = "";
        int remainder;

        while(n>0){
            remainder = n % 2;
            binary = binary + remainder;
            n /= 2;
        }
        System.out.println(binary);
    }
}