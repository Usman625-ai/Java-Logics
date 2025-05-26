import java.util.Scanner;
public class question36 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int n = scanner.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + "elements :");
        for (int i = 0; i < n; i++) {
            System.out.println("element "+ (i+1) + ":");
            ar[i] = scanner.nextInt();
        }
        System.out.println("nos you entered are : ");
        for (int a : ar) {
            System.out.print(a + " ");
            
        }
        scanner.close();

    
        
        
        

    }
}
// 36.	Take N numbers as input and store them in an array. 
//     ➤ Ask user for N, then input each number and store it in an array. 
