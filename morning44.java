// Q4 from Q40 series from morning bscs pdf

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class morning44 {
    public static void main(String[] args){
        String path = "EVE01Sales.txt";
        String line;
        try {
            File file = new File(path);
            Scanner obj = new Scanner(file);
            while (obj.hasNextLine()){
                line = obj.nextLine();
                System.out.println(line);
            }
            if(!obj.hasNextLine()){
                System.out.println("Reached End of the file");
                obj.close();
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error while reading file " + e.getMessage());
        }
    }
}
