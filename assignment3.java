import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


// QUESTION 3: How to read one line from the opened file?
public class assignment3 {
    public static void main(String[] args) {
        Scanner obj;
        String path = "G:\\SEM1\\EVE01Sales.txt";
        try {
            File file = new File(path);
            obj = new Scanner(file);
            String line;
            int i = 0;
            while(i < 2 && obj.hasNextLine()){
                i++;
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
