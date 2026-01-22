public class factorial_dowhile {
    public static void main(String[] args) {
        int a=5;
        int fact=1;

        do{
            fact=fact*a;
            a--;

        }while(a>0);

        System.out.println(fact);
    }
}
