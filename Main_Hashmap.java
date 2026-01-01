import  java.util.HashMap;

public class Main_Hashmap {
    public static void main(String[] args) {
        HashMap<String,String> Capitals=new HashMap<String,String>();
        Capitals.put("India","Delhi");
        Capitals.put("Russia","Moscow");
        Capitals.put("Norway", "Oslo");

        System.err.println("Countries and thier capital "+Capitals);
    }
}
