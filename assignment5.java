// How to close the file if it was opened other wise print the message "File was not opened".
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class assignment5 {
    public static void main(String[] args) {
        String path = "G:\\SEM1\\EVE01Sales.txt";
        Scanner obj = null;
        try {
            File file = new File(path);
            obj = new Scanner(file);
            String line;
            line = obj.nextLine();
            System.out.println("File opened sucessfully \n" + line);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("file could not be opened: " + e.getMessage());
        }
        finally {
            if (obj != null) {
                obj.close();
                System.out.println("File closed successfully");
            } else {
                System.out.println("File was not opened");
            }
        }
    }
}
