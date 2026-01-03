import java.util.LinkedList;

public class remove_Linkedinst {
    public static void main(String[] args) {
        LinkedList<String> Planets = new LinkedList<String>();
        Planets.add("Earth");
        Planets.add("Sun");
        Planets.add("Pluto");
 
        Planets.removeFirst(); 
        System.out.println(Planets);
    }    
}
