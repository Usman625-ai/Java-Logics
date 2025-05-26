public class question32 {
    public static void main(String[] args){
        for (int i = 1; i <=3 ; i++){
            char ch = 'A';
            for(int j = 1 ; j<=i ; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
// Print an alphabet triangle pattern (A, AB, ABC...).
// ➤ Each row prints increasing sequence of characters starting from A.