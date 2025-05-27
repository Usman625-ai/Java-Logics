import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;


// QUESTION 2: How to determine if the file is not opened?
public class assignment2 {
    public static void main(String[] args) {
        Scanner obj;
        String path = "G:\\SEM1\\EVE01Sale.txt";
        try {
            File file = new File(path);
            obj = new Scanner(file);
            String line;
            while(obj.hasNextLine()){
                line = obj.nextLine();
                System.out.println(line);
            }
            obj.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
