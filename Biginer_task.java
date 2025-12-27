import java.util.Scanner;;
public class Biginer_task {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        System.out.print("enter the name : ");
        String name =obj.nextLine();

        System.out.print("enter the city : ");
        String city  =obj.nextLine();

        System.out.print("enter the age : ");
        int age  =obj.nextInt();

        System.out.println("hi"+name+", your age is "+age+" and you live in "+city);

        
    }
}
