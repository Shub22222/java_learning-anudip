import java.io.FileInputStream;
import java.io.IOException;


public class Main_reading {
    public static void main(String[] args) {
        try(FileInputStream obj=new FileInputStream("Data.txt")){
            int i;

            while ((i=obj.read())!=-1) {
                System.out.print((char)i);
            }

        }
        catch(IOException e ){
            System.out.println("Error reading file. ");
        }
    }
    
}
