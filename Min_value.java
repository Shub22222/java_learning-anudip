public class Min_value{
    public static void main(String[] args )
{

    int[] myarry={21,48,54,32};
    int Min_value=myarry[0];

    for (int i:myarry){
        if (i<Min_value)
        Min_value=i;

    }
    System.out.println("Lowest value: " + Min_value);
    
}}
