import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_file {
    public static void main(String[] args) {
        try(FileInputStream objIn=new FileInputStream("icons8-docker-480.png");
            FileOutputStream objOt=new FileOutputStream("Copied.png")){
                int i;
                while ((i=objIn.read())!=-1) {
                    objOt.write(i);
                }
                System.out.println("copied succesfully");

        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    
}
