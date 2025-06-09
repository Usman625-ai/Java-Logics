public class question25{
    public static void main(String[] args){
        String binary = "1101";
        int[] no = new int[binary.length()];
        int sum = 0;
        int base = 2;
           
        for(int i = 0 ; i < binary.length(); i++){
            char ch = binary.charAt(i);
            no[i] = Character.getNumericValue(ch);
            if(no[i] != 0){
                double sno = Math.pow(base,binary.length() - i);
                sum += sno;
            }
        }            
        System.out.println(sum);
        
    }
}