// 0, 1, 1, 2, 3, 5, 8, 13, ...
        // add
public class fibonaci {
    public static void main(String[] args) {
        
        int a=0;
        int j=1;
        System.out.println(a);
        System.out.println(j);
        for(int i=0;i<13;i++){

        int add=a+j;
        
        System.out.println(add);
            int temp=add;
            a=j;
            j=temp;
        }

    }
}
