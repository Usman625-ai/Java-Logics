public class question22{
    public static void main(String[] args){
        int a = 500;
        for (int i = 2 ; i < a ; i++ ){
            int sum = 0;
            for(int j = 1 ; j <= i/2 ; j++){
                if(i % j == 0){
                    sum += j;
                    if (sum == i){
                        System.out.println(i + " is perfect number");
                    }
                }
            }
        }
    }
}