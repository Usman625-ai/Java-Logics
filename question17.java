public class question17 {
    public static void main(String[] args){
        int a = 153;
        int newno = 0;
        int original = a;
        String n = String.valueOf(a);
        while(a > 0){
            int l = a % 10;
            double aquare = Math.pow(l , n.length());
            newno += aquare;
            a /= 10;
        }
        if (original == newno){
            System.out.println(newno + "is armstrong no");
        }
        else{
            System.out.println(newno + "is not armstrong no");
        }
    }
}
