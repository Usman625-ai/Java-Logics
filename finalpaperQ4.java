// 4. Write for loop into while and do – while loop. 
// for (int i=1 , j=0 ; i <= 100 ; j += i , i++)
// {
//  System.out.println("i = " + i + " and j = " + j);
// }
public class finalpaperQ4 {
    public static void main(String[] args){
        // first : for into while
        int i = 1;
        int j = 0;
        while (i <= 100){
            System.out.println("i = " + i + " and j = " + j);
            j += i;
            i++;
        }

        // Now : for into do-while
        // int i = 1;
        // int j = 0;
        // if (i <= 100){
        //     do {
        //         System.out.println("i = " + i + " and j = " + j);
        //         j += i;
        //         i++;
        //     } while (i <= 100);
        // }
    }
}
