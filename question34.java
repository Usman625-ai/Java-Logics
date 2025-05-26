public class question34 {
    public static void main(String[] args){
        int no = 4;
         
        for(int i = 0 ; i <= no ; i++){
            for (int j = 0 ; j <= no ; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
