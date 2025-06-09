// Q6 of Q46 series from morning bscs pdf

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class morning46 {
    public static void main(String[] args){
        String path = "EVE01Sales.txt";
        String line;
        Scanner obj = null;
        try{
            File file = new File(path);
            obj = new Scanner(file);
            line = obj.nextLine();
            String[] fields = line.split("\t");
            for (int i = 0 ; i < fields.length ; i++){
                System.out.println(" field "+ (i+1) + " " + fields[i]);
            }
            obj.close();
        } catch (FileNotFoundException e){
            System.out.println("file not found " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error reading file " + e.getMessage());
        } 
    }
}
