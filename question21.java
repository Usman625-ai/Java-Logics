public class question21{
    public static void main(String[] args){
        int n1 = 20;
        int n2 = 18;
        String factor1 = "";
        String factor2 = "";
        for (int d = 1; d <= n1/2; d++){
            if(n1 % d == 0){
                System.out.print(" " + d);
                factor1 += String.valueOf(d);
            } 
        }
        System.out.println();
        for (int d2 = 1; d2 <= n2/2; d2++){
            if(n2 % d2 == 0){
                System.out.print(" " + d2);
                factor2 += String.valueOf(d2);
            }
        }
        System.out.println();
        int[] fac1 = new int[factor1.length()];
        int[] fac2 = new int[factor2.length()];
        for(int i = 0; i < fac1.length ; i++){
            fac1[i] = Character.getNumericValue(factor1.charAt(i));
        }
        for(int j = 0; j < fac2.length ; j++){
            fac2[j] = Character.getNumericValue(factor2.charAt(j));
        }
        for(int i1 = 0 ; i1 < fac1.length ; i1++){
            for(int j1= 0 ; j1 < fac2.length ; j1++){
                if(fac1[i1] == fac2[j1]){
                    int c = fac2[j1];
                    System.out.println("common divisors are " + c);
                }
            }
        }
        
    }
}