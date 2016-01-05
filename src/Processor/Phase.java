package Processor;

public class Phase {
    int number;
    int CPU_TIMES_COUNT;
    int IO_TIMES_COUNT;
    int REPEAT_COUNT;
    
    public Phase(Phase f){
       this.number = f.number;
       this.CPU_TIMES_COUNT = f.CPU_TIMES_COUNT;
       this.IO_TIMES_COUNT = f.IO_TIMES_COUNT;
       this.REPEAT_COUNT = f.REPEAT_COUNT;
    }
    
    public Phase(){}
    
    @Override
    public String toString(){
        System.out.println("Number:" + this.number);
        System.out.println("Times CPU:" + this.CPU_TIMES_COUNT);
        System.out.println("Times IO:" + this.IO_TIMES_COUNT);
        System.out.println("Repeat:" + this.REPEAT_COUNT);
        return "";
    }
}
