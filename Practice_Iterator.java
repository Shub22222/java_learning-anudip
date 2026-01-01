import java.util.ArrayList;
import java.util.Iterator;



public class Practice_Iterator{
    public static void main(String[] args) {
        ArrayList<String> Sea=new ArrayList<String>();
        Sea.add("Indian Ocean");
        Sea.add("Pasific Ocean");
        Sea.add("Atlantic Ocean");

        Iterator<String> it=Sea.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            
        }
    }
}
