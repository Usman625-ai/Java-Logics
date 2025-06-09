public class question10{
    public static void main(String[] args){
        int a = 213;
        int sum = 0;
        while (a > 0){
            int l = a % 10;
            sum += l;
            a /= 10;
        }
        System.out.println("sum is " + sum);
    }
}