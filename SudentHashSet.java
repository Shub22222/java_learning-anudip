
import java.util.HashSet;


public class SudentHashSet {
    public static void main(String[] args) {
        HashSet<String> Students=new HashSet<String>();
        Students.add("sam");
        Students.add("sam");// duplicate ignored
        Students.add("martin");
        System.err.println("unique students list : "+Students);
    }
}
