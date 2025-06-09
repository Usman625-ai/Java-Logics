// Q10 of Q40 series from morning bscs pdf
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class morning50 {
    public static void main(String[] args){
        String path = "EVE01Sales.txt";
        String line;
        Scanner obj = null;
        Scanner user = new Scanner(System.in);
        try {
            File file = new File(path);
            obj = new Scanner(file);
            line = obj.nextLine();
            String[] fields;
            if (obj.hasNextLine()){
                line = obj.nextLine();
            }
            System.out.println("Enter empid : ");
            String empid = user.nextLine();
            fields = line.split("\t");
            int qty;
            int total = 0;
            while (!fields[2].equals(empid)){
                line = obj.nextLine();
                fields = line.split("\t");
            }
            while(empid.compareTo(fields[2]) == 0){
                    qty = Integer.parseInt(fields[4]);
                    total += qty;
                    System.out.println("The quantity of " + empid + " is " + qty);
                    line = obj.nextLine();
                    fields = line.split("\t");
            }
            System.out.println("The total qty of " + empid + " is " + total);
            user.close();
            obj.close();

        } catch(FileNotFoundException e){
            System.out.println("file not found " + e.getMessage());
        } catch(Exception e){
            System.out.println("Error reading file" + e.getMessage());
        }
    }
}

