public class question31 {
    public static void main(String[] args){
        int no = 3;
        for (int i = 0 ; i <= no ; i++){
            for(int s = 1; s<= no - i ; s++){
                System.out.print("  ");
            }
            int number = 1;
            for (int j = 0; j <= i ; j++){
                System.out.print(number + "   ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
// Print Pascal’s triangle.
// ➤ A triangle of binomial coefficients.