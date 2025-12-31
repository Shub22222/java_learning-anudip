import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferRedr {
    public static void main(String[] args) {
        try(BufferedReader obj=new BufferedReader(new FileReader("Data.txt"))){
            String line;
            while ( (line =obj.readLine())!= null){
                System.out.println(line);
            }
        }
            catch(IOException e) {
                System.out.println(("Errro rading file."));

                
            }
        }}
    
    

