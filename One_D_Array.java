import java.util.Scanner;
public class One_D_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("enter the number oftime you want "+ a);
        
        for(int k=0;k<a;k++){
            arr[k]=sc.nextInt();
            
        }
        for(int k=0;k<a;k++){

            System.out.println(arr[k]);
        }
    }
}
