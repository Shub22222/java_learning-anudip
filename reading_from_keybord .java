import java.util.Scanner;

public class reading_from_keybord {
    public static void main(String[]args){
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter String :");
        String a=sc.nextLine();
        
        System.out.println("Enter Number :");
        int b=sc.nextInt();
        System.out.println("Enter flaot :");
        float c=sc.nextFloat();

        System.out.println("the string is "+a);
        System.out.println("the number is "+b);
        System.out.println("the foalt is "+ c);
    }
}
