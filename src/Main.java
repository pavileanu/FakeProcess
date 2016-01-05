import Processor.*;
import static Processor.InputReader.readInputFile;
import java.io.File;

public class Main {
    
    public static void afisare(){
        System.out.println(InputReader.que1.timeUnits);
        System.out.println(InputReader.que2.timeUnits);
        System.out.println(InputReader.que3.timeUnits);
            
        System.out.println(InputReader.k);
        System.out.println(InputReader.r);
        for(int i=0; i< InputReader.procs.length; i++)
            System.out.println(InputReader.procs[i]);
            
    }
    
    public static void main(String args[]){
        try{
            File inputFile = new File("input.txt");
            readInputFile(inputFile);
            afisare();           
            
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
