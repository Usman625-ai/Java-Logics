public class question16{
    public static void main(String[] args){
        int n = 131;
        int reversed = 0;
        int original = n;
        while (n > 0){
            int l = n % 10;
            reversed = reversed * 10 + l;
            n /= 10;
        } 
        if(reversed == original){
            System.out.println("no is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}