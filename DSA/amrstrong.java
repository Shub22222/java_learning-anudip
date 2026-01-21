public class amrstrong {
    public static void main(String[] args) {
        int num=153;
        
        int a=num;

        int d1=a%10;
        a=a/10;

        int d2=a%10;
        a=a/10;

        int d3=a%10;
        a=a/10;

        int all_Sum=(d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);

            
            if(all_Sum==num){
                System.out.println("this is armstrong");
            }
            else{
                System.out.println("not armstrong");
            }
            
            
        }

    }

