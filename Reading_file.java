import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Reading_file {
    public static void main(String[] args) {
        File obj=new File("Data.txt");

        try(Scanner redr =new Scanner(obj)){
            while (redr.hasNextLine()) {
                String data=redr.nextLine();
                System.out.println(data);
            }

        }
        catch(FileNotFoundException e){
            System.out.println("error "+e);
        }
    }
}
