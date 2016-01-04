
package Processor;

public class Proces{
    public String name;
    public String alias;
    public int timeStart;
    public int PHASES_COUNT;

    public Proces(Proces p){
       this.name = p.name;
       this.alias = p.alias;
       this.timeStart = p.timeStart;
       this.PHASES_COUNT = p.PHASES_COUNT;
    }

    public Proces() {
        
    }
    
    public static Proces[] sortByAlias(Proces processes[]){
        for(int i=0; i<processes.length-1; i++)
        for(int j=i+1; j<processes.length; j++)
            if(processes[i].alias.compareTo(processes[j].alias) == 1)
            {
                Proces aux;
                aux = processes[j];
                processes[j] = processes[i];
                processes[i] = aux;
            }   
        
        return processes;
    }
   
}
