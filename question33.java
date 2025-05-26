public class question33 {
    public static void main(String[] args){
        int no = 4;
        for (int i= 0 ; i <= no ; i++){
            for (int j = 0 ; j <= no ; j++){
                if(i==0 || i==no || j==0 || j==no){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            
            System.out.println();
        }
    }
}
