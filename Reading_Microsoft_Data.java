import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reading_Microsoft_Data {
    public static void main(String[] args) {
        try(BufferedReader obj=new BufferedReader(new FileReader("Microsoft.txt"))){
            String Data;
            while ((Data=obj.readLine())!=null) {
                System.out.println(Data);
                
            }

        }
        catch(IOException e){
            System.out.println("Error in reading file data");
        }
    }
    
}
