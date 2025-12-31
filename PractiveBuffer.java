import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class PractiveBuffer {
    public static void main(String[] args) {
        try(BufferedReader obj=new BufferedReader(new FileReader("User.txt"))){
            String info;
            while ((info=obj.readLine())!=null) {
                System.out.println(info);
            }
        }
        catch(IOException e){
            System.out.println("error in reading file");

        }
    }
    
}
