import java.io.File;         
import java.io.IOException;

public class P_C_file {
    public static void main(String[] args) {
        
    try{
        File obj=new File("Data.txt");
        if(obj.createNewFile()){
            System.out.println("file is created");
        }
        else{
            System.out.println("file is already created");

        }

    }
    catch(Exception e){
        System.out.println(e);

    }
}
}
