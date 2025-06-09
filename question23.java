public class question23{
    public static void main(String[] args){
        int base = 4;
        int exponent = 3;
        int product = 1;
        for(int i = 1; i<= exponent ; i++){
            product *= base;
        }
        System.out.println(product);
    }
}