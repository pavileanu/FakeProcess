package Processor;

import java.util.*;

public class ProcessorQueue<T> extends PriorityQueue<T> {
    public int k; // Penalty for the queue
    public int r; // Award for the queue
    public int priority;
    
    public void firstToLast(){
        T firstElem = this.poll();
        if(firstElem != null)
            this.add(firstElem);
    }
           
    public void addList(Proces processes[]){
        processes = Proces.sortByAlias(processes);
        for (Proces process : processes) {
            //T elem = process;
            //this.add(elem)
        }
    }
}