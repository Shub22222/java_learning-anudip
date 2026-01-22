public class armstrongP {
    public static void main(String[] args) {
        int a=153;
        int num=a;

        int d1=num%10;
        System.out.println(d1);
        num=num/10;
        System.out.println(num);

        int d2=num%10;
        System.out.println(d2);
        num=num/10;
        System.out.println(num);

        int d3=num%10;
        System.out.println(d3);
        num=num/10;
        System.out.println(num);

        int l=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);

        if(l==a){
            System.out.println("its palinderome");
        }
        else{
            System.out.println("its not palinderome");
        }
        
        System.out.println();
    }
}
