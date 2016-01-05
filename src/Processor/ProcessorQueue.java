package Processor;

import java.util.*;

public class ProcessorQueue<T> extends PriorityQueue<T> {
    public int timeUnits;
    
    public void firstToLast(){
        T firstElem = this.poll();
        if(firstElem != null)
            this.add(firstElem);
    }
           
}