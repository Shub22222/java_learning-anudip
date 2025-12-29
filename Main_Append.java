import java.io.FileOutputStream;
import java.io.IOException;


public class Main_Append {
    public static void main(String[] args) {
        String text ="\n how are you, i hope one day you will see magic!";

        try(FileOutputStream obj=new FileOutputStream("Data.txt",true)){
            obj.write(text.getBytes());
            System.out.println("Susccesfully wrote  to file");


        }
        catch(IOException e){
            System.out.println("error writeing file" +e);
        }
    }
    
}
