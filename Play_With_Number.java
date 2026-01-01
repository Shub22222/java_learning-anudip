
import java.util.ArrayList;

public class Play_With_Number {
    public static void main(String[] args) {
        ArrayList<Integer> number= new ArrayList<Integer>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        for(int i=0;i<number.size();i++){

            System.err.println("at index "+i +" th number is "+number.get(i));
        }

    }
}
