public class question52 {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8};
        int[] arr2 = {1,3,5,7,9};
        int[] mergearr = new int[arr1.length + arr2.length];
        for (int i = 0 ; i < arr1.length ; i++){
            mergearr[i] = arr1[i];
        }
        for(int j = arr1.length ; j < (arr1.length + arr2.length) ; j++ ){
            mergearr[j] = arr2[(j-arr1.length)];
        }
        System.out.print("{ ");
        for (int k = 0 ; k < mergearr.length ; k++) {
            System.out.print(mergearr[k] + " ");
        }
        System.out.print("}");
    }
}
