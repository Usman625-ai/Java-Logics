import java.io.File;
import java.util.Scanner;

// This program reads a file named "EVE01Sales.txt" and calculates the total sales
// based on the quantity and price of items sold. It prints the quantity, price, and total


public class assignment9 {
    public static void main(String[] args) {
        String path = "EVE01Sales.txt";
        Scanner inp;
        try{
            File myfile = new File(path);
            inp = new Scanner(myfile);
            int total = 0;
            int qty;
            int price;
            String line;
            String[] fields;
            int sales = 0;
            if(inp.hasNextLine()) {
                line = inp.nextLine();
            }
            line = inp.nextLine();
            fields = line.split("\t");

            while(inp.hasNextLine()){
                qty = Integer.parseInt(fields[4]);
                price = Integer.parseInt(fields[5]);
                total = qty * price;
                sales += total;
                System.out.println("Quantity: " + qty);
                System.out.println("Price: " + price);
                System.out.println("Total: " + total);
                line = inp.nextLine();
                fields = line.split("\t");
            }
            System.out.println("Total sales: " + sales);
            inp.close();

        }
        catch (Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
