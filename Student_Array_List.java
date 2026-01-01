
import java.util.ArrayList;
public class Student_Array_List {
    public static void main(String[] args) {
        ArrayList<String>Student_name=new  ArrayList<String>();
Student_name.add("Sam");
Student_name.add("Alina");
Student_name.add("Unknown");
Student_name.add("Mario");
//remove 

Student_name.remove("Unknown");
Student_name.set(2,"Ammie");
System.err.println("Final list of student "+Student_name);

    }
}
