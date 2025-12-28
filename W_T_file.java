import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class W_T_file {
    public static void main(String[] args) {
        
    try(FileWriter obj=new FileWriter("Data.txt")){

        obj.write("i like games, food like chess, chocolate ");
        // File obj=new File("Data.txt");
        
            System.out.println("file is created");
       

    }
    catch(Exception e){
        System.out.println(e);

    }
}
}
