import java.util.LinkedList;

public class Practice_addFirst_linkdlinst {
    public static void main(String[] args) {
        LinkedList<String> Planets = new LinkedList<String>();
        Planets.add("Earth");
        Planets.add("Sun");
 
        Planets.addFirst("Pluto"); // here pluto will come first
        System.out.println(Planets);
    }    
}
