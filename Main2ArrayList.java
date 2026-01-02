import java.util.ArrayList;

public class Main2ArrayList{
    public static void main(String[] args) {
        ArrayList<String> boats=new ArrayList<String>();
        boats.add("Canoe");
        boats.add("Yacht");
        boats.add("farry");
        boats.add("Speedboat");
        boats.add("Barge");
        
        boats.add(0,"Kayak");
        System.out.println("all boats list "+boats);  
      }
}


