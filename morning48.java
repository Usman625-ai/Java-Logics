// Q8 of Q40 series from morning bscs pdf

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class morning48 {
    public static void main(String[] args){
        String line;
        String path = "EVE01Sales.txt";
        Scanner obj;
        try {
            File file = new File(path);
            obj = new Scanner(file);
            line = obj.nextLine();
            String[] fields;
            if(obj.hasNextLine()){
                line = obj.nextLine();
            }
            String repid;
            fields = line.split("\t");
            String product;
            int price;
            while (obj.hasNextLine()){
                repid = fields[3];
                if (repid.compareToIgnoreCase(fields[2]) == 0){
                    product = fields[4];
                    price = Integer.parseInt(fields[5]);
                    System.out.println("the price of " + product + " is " + price);
                    line = obj.nextLine();
                    fields = line.split("\t");
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error reading file " + e.getMessage());
        }
    }
}
