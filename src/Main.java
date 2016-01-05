import Processor.*;
import static Processor.WorkPlace.readInputFile;
import java.io.File;

public class Main {
    
    public static void afisare(){
        System.out.println("q1:" + WorkPlace.que1.timeUnits);
        System.out.println("q2:" + WorkPlace.que2.timeUnits);
        System.out.println("q3:" + WorkPlace.que3.timeUnits);
            
        System.out.println("k:" + WorkPlace.k);
        System.out.println("r:" + WorkPlace.r);
        for(int i=0; i< WorkPlace.procs.length; i++)
            System.out.println(WorkPlace.procs[i]);
            
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
