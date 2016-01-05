
package Processor;

import java.util.LinkedList;

public class Proces{
    public String name;
    public String alias;
    public int timeStart;
    public LinkedList<Phase> phases;

    public Proces(Proces p){
       this.name = p.name;
       this.alias = p.alias;
       this.timeStart = p.timeStart;
       for(int i=0;i< p.phases.size(); i++)
           this.phases.add(p.phases.get(i));
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
    
    @Override
    public String toString(){
        System.out.println("Name:" + this.name);
        System.out.println("alias:" + this.alias);
        System.out.println("timeStart:" + this.timeStart);
        System.out.println("----------------");
        for(int i=0; i< this.phases.size(); i++)
            System.out.println(this.phases.get(i));
        System.out.println("----------------");
        return "";
    }
   
}
