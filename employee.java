import java.util.Scanner;
public class employee {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        
        
        String[] name=new String[5];
        int[] phone_no=new int[5];
        for(int i=0;i<5;i++){



        System.out.println("  enter name ");
        name[i]=obj.nextLine();
        System.out.println("  enter no ");
        phone_no[i]=obj.nextInt();
        obj.nextLine();

        // System.out.println(name[i] +" welcome to comapny xyz");
        // System.out.println(phone_no[i] +" thnaks for sharing no");
        
    
    }
    for(int i=0;i<5;i++)
    {
        System.out.println("name "+name[i]);
        System.out.println("Phone "+phone_no[i]);
    }
    }
}
