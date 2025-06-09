// Q7 of Q40 series from morning bscs pdf
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class morning47 {
    public static void main(String[] args){
        String path = "EVE01Sales.txt";
        String line;
        Scanner obj = null;
        try {
            File file = new File(path);
            obj = new Scanner(file);
            if (obj.hasNextLine()){
                line = obj.nextLine();
            }
            line = obj.nextLine();
            while (obj.hasNextLine()){
                System.out.println(line);
                line = obj.nextLine();
            }
            obj.close();
        } catch (FileNotFoundException e){
            System.out.println("file not found" + e.getMessage());
        } catch (Exception e){
            System.out.println("Error reading file" + e.getMessage());
        }
    }
}
