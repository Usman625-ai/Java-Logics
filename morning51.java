// Q11 of Q40 series from morning bscs pdf
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class morning51 {
    public static void main(String[] args){
        String path = "EVE01Sales.txt";
        String line;
        Scanner obj = null;
        String targetmonth = "Jun";
        try {
            File file = new File(path);
            obj = new Scanner(file);
            String[] fields;
            line = obj.nextLine();
            fields = line.split("\t");
            int qty;
            int total = 0;
            while (obj.hasNextLine()){
                line = obj.nextLine();
                fields = line.split("\t");
                String[] date = fields[0].split("-");
                String month = date[1];
                if (targetmonth.equalsIgnoreCase(month)){
                    qty = Integer.parseInt(fields[4]);
                    total += qty;
                    System.out.println("At "+ fields[0] + " qty is " + qty);
                }
            }
           
            System.out.println("The total qty of " + targetmonth + " is " + total);
            obj.close();

        } catch(FileNotFoundException e){
            System.out.println("file not found " + e.getMessage());
        } catch(Exception e){
            System.out.println("Error reading file" + e.getMessage());
        }
    }
}
