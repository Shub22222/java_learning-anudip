
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_input_append {
    public static void main(String[] args) {
        try(BufferedWriter obj=new BufferedWriter(new FileWriter("Write.txt",true))){
            obj.write("how is  whether?");
            obj.newLine();
            obj.write("i hope spring will come soon! ");
            System.out.println("Wrote succesfully");
        }
        catch(IOException e){
            System.out.println("Error in writeing");
        }
    }
}
