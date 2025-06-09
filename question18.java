public class question18 {
    public static void main(String[] args){
        int n = 20;
        int f = 0;
        int c = 1;
        System.out.println(f);
        System.out.println(c);
        for (int i = 0 ; i < n ; i++){
            int l = f + c;
            f = c;
            c = l;            
            System.out.println(l);
        }
        
    }
}