import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args) {
        try(FileWriter obj=new FileWriter("Info.txt",true)){
            obj.write("i love nature ");
            System.out.println("file is done ");
        }
        catch (IOException e){
            System.out.println("errors");

        }
    }
    
}
