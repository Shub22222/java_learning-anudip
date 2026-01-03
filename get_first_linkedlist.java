

import java.util.LinkedList;

public class get_first_linkedlist {
    public static void main(String[] args) {
        LinkedList<String> Planets = new LinkedList<String>();
        Planets.add("Earth");
        Planets.add("Sun");
        Planets.add("Pluto");
 
        // Planets.removeLast(); 
        System.out.println(Planets.getFirst());
    }    
}
