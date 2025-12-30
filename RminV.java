public class RminV {

    public static void main (String [] args){

        int []num={60,20,80,90};
        int minV=num[0];

        for(int i:num){
            if (i<minV){
                minV=i;
            }

        }
        System.out.println("lowest value is :"+minV);



    }
    
}
