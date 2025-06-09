public class question15{
    public static void main(String[] args){
        int no = 2345;
        int reversed = 0;
        while (no > 0){
            int l = no % 10;
            reversed = reversed * 10 + l;
            no /= 10;
        }
        System.out.println(reversed);
    }
}