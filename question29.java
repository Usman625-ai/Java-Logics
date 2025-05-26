public class question29 {
    public static void main(String[] args){
        int no = 1;
        for (int i = 1 ; i <= 3 ; i++){
            for (int j = 1 ; j <= i ; j++){
                System.out.print(no);
                no++;
            }
            System.out.println();
        }
    }
}
// Print Floyd’s triangle pattern.
// ➤ Increasing numbers in a triangle shape: 1 \n 2 3 \n 4 5 6...