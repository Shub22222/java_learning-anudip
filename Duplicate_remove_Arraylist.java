//  **Check duplicates**:
//    - Add repeated values.
//    - Write code to detect and remove duplicates manually.

// ---
import java.util.ArrayList;
public class Duplicate_remove_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<Integer>();
        number.add(2);
        number.add(2);
        number.add(2);
        number.add(5);
        number.add(5);
        for(int i=0;i<number.size();i++){
            for(int j=i+1;j<number.size();j++){
                if(number.get(i).equals(number.get(j))){
                    number.remove(j);
                    System.out.println(i+" and "+j);
                    j--;
                }
            }
        }
        System.out.println("After removing duplicates: " + number);
    }
}
