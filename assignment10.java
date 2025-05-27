//  Write code that asks the user for an itemCode and prints the total of the quantity of that item purchased by any of the customer.

import java.io.File;
import java.util.Scanner;

public class assignment10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String itemCode;
        String path = "EVE01Sales.txt";
        Scanner inp = null;
        try {
            File myfile = new File(path);
            inp = new Scanner(myfile);
            System.out.println("Enter item code: ");
            itemCode = sc.nextLine().trim();
            System.out.println("Item code is: " + itemCode);
            int total = 0;
            int qty;
            String line;
            String[] fields;
            if(inp.hasNextLine()) {
                line = inp.nextLine();
            }
            line = inp.nextLine();
            fields = line.split("\t");

            while(!fields[2].equals(itemCode)){
                line = inp.nextLine();
                fields = line.split("\t");
            }
            while(itemCode.compareTo(fields[2]) == 0){
                qty = Integer.parseInt(fields[4]);
                total += qty;
                System.out.println("Quantity is: " + qty);
                line = inp.nextLine();
                fields = line.split("\t");
                if(!inp.hasNextLine()){
                    System.out.println("Total quantity of item " + itemCode + " is: " + total);
                    System.out.println("File end");
                    break;
                }
            }
            

            inp.close();
        } catch (Exception e) {
            System.out.println("File end");
        }
    }
}
