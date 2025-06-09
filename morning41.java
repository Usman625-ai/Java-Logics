// 1 from Q40 series in morning bscs pdf
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class morning41 {
    public static void main(String[] args){
        String path = "EVE01Sales.txt";
        String line;
        try{
            File obj = new File(path);
            Scanner reader = new Scanner(obj);
            while(reader.hasNextLine()){
                line = reader.nextLine();
                System.out.println(line);
            }
           
        } catch (FileNotFoundException e){
            System.out.println("File not found " + e.getMessage());   
        } catch (Exception e){
            System.out.println("Error reading the file " + e.getMessage());
        }
    }
}
