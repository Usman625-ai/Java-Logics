// Q3 from Q40 series from morning bscs pdf

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class morning43 {
    public static void main(String[] args) {
        String path = "EVE01Sales.txt";
        String line;
        try {
            File file = new File(path);
            Scanner obj = new Scanner(file);
            line = obj.nextLine();
            int i = 0;
            while (i < 1 ){
                i++;
                line = obj.nextLine();
                System.out.println(line);
            }
            obj.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error openning file " + e.getMessage());
        } 
    }
}
