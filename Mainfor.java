


import java.util.ArrayList;

public class Mainfor{
    public static void main(String[] args) {
        ArrayList<String> boats=new ArrayList<String>();
        boats.add("Canoe");
        boats.add("Yacht");
        boats.add("ferry");
        boats.add("Speedboat");
        boats.add("Barge");

        for(int i=0;i<boats.size();i++){
            System.out.println(boats.get(i));
        }

    }}
