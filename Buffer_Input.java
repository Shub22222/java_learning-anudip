import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffer_Input {
    public static void main(String[] args) {
        try(BufferedWriter obj=new BufferedWriter(new FileWriter(("Write.txt")))){
            obj.write("hi, how are you?");
            System.out.println("Wrote succesfully");
        }
        catch(IOException e){
            System.out.println("Error in writeing");
        }
    }
}
