import java.io.*;
// import java.lang.*;
public class EmpyeB {
    String name;
    int eid;
    int salry;

    // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    InputStreamReader obj=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(obj);

    void get(){
        try{
            System.out.println("enter the name ");
            name=br.readLine();

            System.out.println("enter the id ");
            eid=Integer.parseInt(br.readLine());

            System.out.println("enter the salry");
            salry=Integer.parseInt(br.readLine());

        }
        catch(Exception x){

            System.out.println(x);
        }

    }

        void display(){
            System.out.println("name "+ name);
            System.out.println("ID "+ eid);
            System.out.println("salary "+ salry);
}
        public static void main(String[] args) {
            EmpyeB ob=new EmpyeB();
            ob.get();
            ob.display();
        }
}
