// How to keep on reading one line from the opened file and print each line. When all line are read, prints the message "END OF THE FILE HAS REACHED"

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        Scanner obj;
        String path = "G:\\SEM1\\EVE01Sales.txt";
        try {
            File file = new File(path);
            obj = new Scanner(file);
            String line;
            while(obj.hasNextLine()){
                line = obj.nextLine();
                System.out.println(line);
                if(!obj.hasNextLine()) {
                    System.out.println("END OF THE FILE HAS REACHED");
                }
            }
            obj.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
