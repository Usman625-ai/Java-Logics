// 1. Write for loop to print the series using a single variable named ‘term’. 
// 99 , 88 , 77 , 66 , 55 , 44 , 33 , 22 , 11 , 0
public class finalpaperQ1 {
    public static void main(String[] args){
        int term = 99;
        for (int i = 1 ; i <= 10 ; i++){ 
            System.out.print(term + " ");
            // print to print on the same line and " " to give space
            term -= 11;
            // term = term - 11
        }
    }
}
