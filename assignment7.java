// Write a loop that prints all the fields extracted from the line.
import java.io.File;
import java.util.Scanner;  
import java.io.IOException; 
public class assignment7 {
    public static void main(String[] args) {
        Scanner reader;
        String path = "G:\\SEM1\\EVE01Sales.txt";
        try{
            File fileReader = new File(path);
            reader = new Scanner(fileReader);
            while(reader.hasNextLine()){
                    String line = reader.nextLine();
                    System.out.println(line);
                    
            }
        }
        catch (IOException e){
            System.out.println("Error reading the file.");
        }
    }
}
