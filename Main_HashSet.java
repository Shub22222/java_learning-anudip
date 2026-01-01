import java.util.HashSet;


public class Main_HashSet {
    public static void main(String[] args) {
        HashSet<String> cars=new HashSet<String>();
        cars.add("volvo");
        cars.add("volvo");// duplicate ignored
        cars.add("Peterbelt");
        System.err.println("Unique cars list : "+cars);
    }
}
