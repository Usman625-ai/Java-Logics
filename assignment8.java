import java.io.File;
import java.util.Scanner;

// QUESTION 8:
// Suppose that each splitted line contains following SIX  fields

//     ItemCode    ItemDescription    UnitPrice        Quantity         Date        SalesPersonID

// Write code that prints the amount that the buyer has to pay for the item described in the line.
public class assignment8 {
    public static void main(String[] args) {
        String path= "G:\\SEM1\\EVE01Sales.txt";
        Scanner inp;
        try{
            File f1 = new File (path);
            inp = new Scanner (f1);
            String[] fields;
            String line;
            String product;
            int uPrice ;
            if (inp.hasNextLine()) {
                inp.nextLine();
            }
            line = inp.nextLine();
            fields = line.split("\t");
            String empid;
            while (inp.hasNextLine()) {
                empid = fields[2]; 
                while (empid.compareTo(fields[2]) == 0){
                    product = fields[3];
                    uPrice = Integer.parseInt(fields[5]);
                    System.out.println(product + " price is " + uPrice);
                    line = inp.nextLine();
                    fields = line.split("\t");
                }
                
                
            }
            inp.close();

        }//try
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
