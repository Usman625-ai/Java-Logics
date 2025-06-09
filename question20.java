public class question20{
    public static void main(String[] args){
        int n = 6;
        
        for (int j = 1 ; j <= n ; j++){
            int count = 0;
            for (int i = 1; i <= j ; i++){
                if(j % i == 0){
                    count += 1;
                }
            }
            if(count == 2){
                System.out.println("no is prime");
            }
            else{
                System.out.println("no is not prime");
            }
            
        }
    }
}