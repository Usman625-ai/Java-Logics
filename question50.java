public class question50 {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5};
        int first = ar[0];

        for (int i = 0; i < ar.length - 1; i++) {
            ar[i] = ar[i+1];
        }
        ar[ar.length-1] = first;
        System.out.print("{ ");
        for (int i : ar) {
            System.out.print(i + " ");
        }
        System.out.print("}");
    }
}
// 50.	Left-rotate the elements of an array. 
//     ➤ Move each element one step to the left and send the first element to the end. 
