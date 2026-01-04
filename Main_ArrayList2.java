import java.util.ArrayList;


public class Main_ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> cars= new  ArrayList<String>();
        cars.add("Volvo");
        cars.add("Suzuki");
        cars.add("Honda");

        for(String i: cars){
            System.out.println(i);
        }

    }
}
