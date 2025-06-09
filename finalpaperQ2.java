// 2. Write for loop to print the series using a single variable named ‘term’. 
// 1 , 2 , 4 , 7 , 11 , 16
public class finalpaperQ2 {
    public static void main(String[] args){
        int term = 1;
        for (int i = 1 ; i <= 6 ; i++){
            System.out.print(term + " ");
            term += i;
        }
    }
}
