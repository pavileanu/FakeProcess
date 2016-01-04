import Processor.*;

public class Main {
    
    public static void main(String args[]){
        Proces[] p = new Proces[3];
        p[0] = new Proces(); p[1] = new Proces(); p[2] = new Proces();
        p[0].alias = "B";
        p[1].alias = "C";
        p[2].alias = "A";
        p = Proces.sortByAlias(p);
        System.out.println(p[0].alias + p[1].alias + p[2].alias);
    }
}
