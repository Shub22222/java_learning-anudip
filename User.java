import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter user name : ");

        String name=obj.nextLine();
        System.out.println("hi "+ name + ", nice to meet you");
    }
}
