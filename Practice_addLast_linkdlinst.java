import java.util.LinkedList;

public class Practice_addLast_linkdlinst {
    public static void main(String[] args) {
        LinkedList<String> Planets = new LinkedList<String>();
        Planets.add("Earth");
        Planets.add("Sun");
        Planets.add("Pluto");
 
        Planets.addLast("Neptune"); 
        System.out.println(Planets);
    }    
}
