import java.util.ArrayList;
import java.util.Collections;

public class Main_sort {
    public static void main(String[] args) {
        ArrayList<String> cars= new  ArrayList<String>();
        cars.add("Volvo");
        cars.add("Suzuki");
        cars.add("Honda");

        Collections.sort(cars);
        
        for(String i: cars){
            System.out.println(i);
        }

    }
}
