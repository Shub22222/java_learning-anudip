
import java.util.ArrayList;
import java.util.Collections;

public class MainSort_int {
    public static void main(String[] args) {
        ArrayList<Integer> Number=new  ArrayList<Integer>();
        Number.add(21);
        Number.add(2684);
        Number.add(645);
        Number.add(87);
        Collections.sort(Number);

        for(int i :Number){
            System.out.println(i);
        }
    }
    
}
