// QUESTION 1 : Write steps that are required to open a text file to read data from the file

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class assignment1 {
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
