import java.util.ArrayList;

public class Main1_remove{
    public static void main(String[] args) {
        ArrayList<String> boats=new ArrayList<String>();
        boats.add("Canoe");
        boats.add("Yacht");
        boats.add("ferry");
        boats.add("Speedboat");
        boats.add("Barge");
        
        boats.add(0,"Kayak");
        System.out.println("all boats list "+boats); 
        boats.set(2, "Catamaran") ;
        System.out.println(boats.get(3));  
        System.out.println(boats);  
        boats.remove("Barge");
        System.out.println(boats);  

      }
}


