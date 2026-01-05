import java.util.ArrayList;
import java.util.Collections;

public class Now_Reverse_sort {
    public static void main(String[] args) {
        ArrayList<Integer> Number = new ArrayList<Integer>();
        Number.add(53);
        Number.add(65);
        Number.add(5665);
        Number.add(68232);
        Number.add(66589);

        Collections.sort(Number,Collections.reverseOrder());
        for (int i : Number) {
            System.out.println(i);
        }
    }
}
