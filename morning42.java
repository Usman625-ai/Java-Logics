// 2 from Q40 series from morning bscs pdf

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class morning42{
    public static void main(String[] args){
        String path = "EVE01Sales.txt";
        String line;
        try{
            File file = new File(path);
            Scanner obj = new Scanner(file);
            if(obj.hasNextLine()){
                System.out.println("file Openning...");
            }
            while(obj.hasNextLine()){
                line = obj.nextLine();
                System.out.println(line);
            }
            if (!obj.hasNextLine()){
                System.out.println("file closing...");
                obj.close();
            }
        } catch ( FileNotFoundException e){
            System.out.println("file not found" + e.getMessage());
        }
    }
}