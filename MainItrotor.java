import java.util.ArrayList;
import java.util.Iterator;
public class MainItrotor {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Echier");
        cars.add("Ashok");
        
        Iterator<String> obj=cars.iterator();
        while (obj.hasNext()) {
            System.err.println(obj.next());
        }
    }
    
}
