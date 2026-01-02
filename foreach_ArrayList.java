
import java.util.ArrayList;

public class foreach_ArrayList{
    public static void main(String[] args) {
        ArrayList<String> boats=new ArrayList<String>();
        boats.add("Canoe");
        boats.add("Yacht");
        boats.add("ferry");
        boats.add("Speedboat");
        boats.add("Barge");

        for(String i : boats){
            System.out.println(i);
        }

    }}
