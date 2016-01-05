package Processor;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class WorkPlace {
    
    public static Proces[] procs;
    public static ProcessorQueue<Proces> que1;
    public static ProcessorQueue<Proces> que2;
    public static ProcessorQueue<Proces> que3;
    public static int k;
    public static int r;
       
    
    public static void readInputFile(File f) throws FileNotFoundException{
        Scanner sc = new Scanner(f);
              
        que1 = new ProcessorQueue<Proces>(); 
        que2 = new ProcessorQueue<Proces>();
        que3 = new ProcessorQueue<Proces>();
        
        char[] alias = "ABCDEFGHIJKLMNOPQRSTUVZ".toCharArray();
        int i=-1;
        
        if(sc.hasNextLine()){
            String[] line= sc.nextLine().split(" ");
            for(int j=0; j<line.length; j++){    
                if(line[j].indexOf("q1=") >= 0) que1.timeUnits = Integer.parseInt(line[j].substring(line[j].indexOf("=")+1));
                else if(line[j].indexOf("q2=") >= 0)  que2.timeUnits = Integer.parseInt(line[j].substring(line[j].indexOf("=")+1));
                else if(line[j].indexOf("q3=") >= 0) que3.timeUnits = Integer.parseInt(line[j].substring(line[j].indexOf("=")+1));
                else if(line[j].indexOf("k=") >= 0) k = Integer.parseInt(line[j].substring(line[j].indexOf("=")+1));
                else if(line[j].indexOf("r=") >= 0) r = Integer.parseInt(line[j].substring(line[j].indexOf("=")+1));
                else if(line[j].indexOf("nr_procese=") >= 0){
                    int nr_procese = Integer.parseInt(line[j].substring(line[j].indexOf("=")+1));
                    procs = new Proces[nr_procese];
                }
            }
        }
        
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(" ");
            Phase ph = new Phase();
            if(line[0].indexOf("Process") >= 0){
                i++;
                procs[i] = new Proces();
                procs[i].alias = Character.toString(alias[i]);
                procs[i].phases = new LinkedList<Phase>();
            }
            else if(line[0].indexOf("Phase") >= 0){
                ph = new Phase();
                ph.number = Integer.parseInt(line[1]);
                procs[i].phases.add(ph);
            }
            else continue;
            for(int j=2; j<line.length; j++){    
                if(line[j].indexOf("name=") >= 0)    procs[i].name = line[j].substring(line[j].indexOf("=")+1);
                else if(line[j].indexOf("start_time=") >= 0) procs[i].timeStart = Integer.parseInt(line[j].substring(line[j].indexOf("=")+1));
                else if(line[j].indexOf("CPU=") >= 0) ph.CPU_TIMES_COUNT = Integer.parseInt(line[j].substring(line[j].indexOf("=")+1));        
                else if(line[j].indexOf("I/O=") >= 0) ph.IO_TIMES_COUNT = Integer.parseInt(line[j].substring(line[j].indexOf("=")+1));
                else if(line[j].indexOf("REPEAT=") >= 0) ph.REPEAT_COUNT = Integer.parseInt(line[j].substring(line[j].indexOf("=")+1));
            }
        }
       
    }
    
    
    public static void execute(){
        // ADAUGAM TOATE PROCESELE IN PRIMA COADA IN ORDINE ALIAS-ULUI.        
        for(int i=0; i<procs.length; i++){
            que1.add(procs[i]);
        }
        
        
    }
}
