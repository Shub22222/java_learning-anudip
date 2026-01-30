import java.io.*;
public class PRactw {
    public static void main(String[] args) {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter Your name " );
            String name=obj.readLine();
            System.out.println("Hey nice to meet you !! ");
        }
        catch(Exception x){
            System.out.println(x);
        }



    }
}
