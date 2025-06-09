// Q9 of Q40 series from morning bscs pdf
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class morning49 {
    public static void main(String[] args){
        String path = "EVE01Sales.txt";
        String line;
        Scanner obj = null;
        try {
            File file = new File(path);
            obj = new Scanner(file);
            line = obj.nextLine();
            String[] fields;
            if (obj.hasNextLine()){
                line = obj.nextLine();
            }
            fields = line.split("\t");
            int qty;
            int price;
            int sales = 0;
            String product;
            while(obj.hasNextLine()){
                product = fields[3];
                int total = 1;
                if (product.compareToIgnoreCase(fields[3]) == 0){
                    qty = Integer.parseInt(fields[4]);
                    price = Integer.parseInt(fields[5]);
                    total = qty * price;
                    System.out.println("the sales of " + product + " are " + total);
                    sales += total;
                    line = obj.nextLine();
                    fields = line.split("\t");
                }
            }
            System.out.println("the total sales are " + sales);

        } catch(FileNotFoundException e){
            System.out.println("file not found " + e.getMessage());
        } catch(Exception e){
            System.out.println("Error reading file" + e.getMessage());
        }
    }
}
