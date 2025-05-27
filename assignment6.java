
import java.io.File;
import java.util.Scanner;
import java.io.IOException;


public class assignment6 {
    public static void main(String[] args) {
        Scanner reader;
        String path = "G:\\SEM1\\EVE01Sales.txt";
        try {
            // Open the file
            File fileReader = new File(path);
            reader = new Scanner(fileReader);

            // Read the first line from the file
            String line = reader.nextLine();

            // Check if line is not null (file is not empty)
            if (line != null) {
                // Split the line into fields using TAB character ("\t")
                String[] fields = line.split("\t");

                // Loop through each field and print it
                for (int i = 0; i < fields.length; i++) {
                    System.out.println("Field " + (i + 1) + ": " + fields[i]);
                }
            } else {
                System.out.println("File is empty.");
            }

            // Close the file
            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading the file.");
        }
    }
}
