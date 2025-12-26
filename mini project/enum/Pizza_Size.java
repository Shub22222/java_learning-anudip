import java.util.Scanner;
enum size{
SMALL,
MEDIUM,
LARGE;


}
public class Pizza_Size {
        public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("hey! dear coustomer, please tell which size of piza do you want? ");
        String userDemand=obj.nextLine();
        size obl=size.valueOf(userDemand);
        switch (obl){
            case SMALL:
                System.out.println("your small pizza will be ready!! price is 499 rupee ");
            break;
            case MEDIUM:
                System.out.println("your midium pizza will be ready!! price is 899 rupee ");
            break;
            case LARGE:
                System.out.println("your large pizza will be ready!! price is 1499 rupee ");
            break;

        }
        

    }
}
