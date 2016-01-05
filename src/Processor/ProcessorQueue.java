package Processor;

import java.util.*;

public class ProcessorQueue<T> extends PriorityQueue<T> {
    public int k; // Penalty for the queue
    public int r; // Award for the queue
    public int timeUnits;
    
    public void firstToLast(){
        T firstElem = this.poll();
        if(firstElem != null)
            this.add(firstElem);
    }
           
}