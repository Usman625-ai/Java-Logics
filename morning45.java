// Q5 from Q40 series from morning bscs pdf

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class morning45 {
    public static void main(String[] args){
        String path = "EVE01Sales.txt";
        String line;
        Scanner obj = null;
        try {
            File file = new File(path);
            obj = new Scanner(file);
            line = obj.nextLine();
            System.out.println("file opened \n" + line);

        } catch (FileNotFoundException e) {
            System.out.println("file not found " + e.getMessage());
        } catch (Exception e){
            System.out.println("file could not be opened ");
        }
        finally {
            if(obj != null){
                obj.close();
                System.out.println("closing file");
            }
            else{
                System.out.println("file was not opened ");
            }
        }
    }
}
