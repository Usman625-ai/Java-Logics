public class question51 {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        int last = ar[ar.length-1];

        for (int i = ar.length - 1; i > 0; i--) {
            ar[i] = ar[i-1];
        }
        ar[0] = last;

        System.out.print("{ ");
        for (int j : ar) {
            System.out.print(j + " ");
        }
        System.out.print("}");
    }
}
// [5, 1, 2, 3, 4] output
// 51.	Right-rotate the elements of an array. 
//     ➤ Move each element one step to the right and bring the last element to the front. 

