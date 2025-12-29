import java.io.FileOutputStream;
import java.io.IOException;


public class Main_write {
    public static void main(String[] args) {
        String text ="hello world";

        try(FileOutputStream obj=new FileOutputStream("Data.txt")){
            obj.write(text.getBytes());
            System.out.println("Susccesfully wrote  to file");


        }
        catch(IOException e){
            System.out.println("error writeing file" +e);
        }
    }
    
}
