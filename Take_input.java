import java.util.Scanner;
public class Take_input {
    public static void main (String [] args){
       Scanner sc=new Scanner(System.in);

       System.out.println("enter number");
       int n=sc.nextInt();
       if(n%2==0){
           System.out.println("number is even "+ n);
           
        }
        else{
           System.out.println("number is odd "+ n);

       }

}

}