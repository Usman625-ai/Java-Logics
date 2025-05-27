// Write java code to display monthwise sales
import java.io.File;
import java.util.Scanner;


public class assignment11 {
    public static void main(String[] args) {
        String month = "Jun";  // Target month abbreviation
        String path = "EVE01Sales.txt";
        Scanner inp = null;
        try{
            File data = new File(path);
            inp = new Scanner(data);
            String line;
            String[] fields;
            int qty = 0;
            int total = 0;

            line = inp.nextLine();
            fields = line.split("\t");
            // Skip header line if present
            if (inp.hasNextLine()) {
                System.out.println(fields[0] + "\t" + fields[4]);
                inp.nextLine();
            }
            while(inp.hasNextLine()){
                line = inp.nextLine();
                fields = line.split("\t");

                String[] date = fields[0].split("-");
                if(date.length < 2){
                    continue;  // Skip malformed lines
                }
                String targetmonth = date[1];
                if(targetmonth.equalsIgnoreCase(month)){
                    try {
                        qty = Integer.parseInt(fields[4]);
                        total += qty;
                        System.out.println("At " + fields[0] + " Quantity is: " + qty);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid quantity in line: " + line);
                    }
                }
            }
            System.out.println("Total quantity of items in " + month + " is: " + total);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        } 
    }
}