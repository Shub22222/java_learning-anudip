import java.io.File;
import java.io.IOException;

class File_Access{
    public static void main(String [] args){
        try{
            File obj=new File("Info.txt");
            
            if(obj.createNewFile()){
                System.out.println("file created: "+ obj.getName());
            }
            else{
                System.out.println("file is already  created: "+ obj.getName());
                
            }
        }
        

            catch (IOException e) {
                System.out.println("An error occurred. "+e);
                e.printStackTrace();

        
    }
}
}
