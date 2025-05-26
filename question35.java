public class question35 {
    public static void main(String[] args){
        int no = 5;
        int s = 1;
        for (int i = 0 ; i <= no ; i++){
            for (int j = 0; j <= i ; j++){
                System.out.print(s + " ");
                s++;
            }
            System.out.println();
        }
    }
}
// 35.	Print a triangle pattern using prime numbers only. 
//     ➤ Print primes in triangle format row by row. 
