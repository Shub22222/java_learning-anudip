public class Selection_sort {

    public static void main(String[] args) {
        int []Numbers={98,78,57,45};
        for(int i=0;i<=Numbers.length-1;i++){

            int minValue=i;

            //find Minimum value

            for(int j=i+1;j<Numbers.length;j++){
                if(Numbers[j]<Numbers[minValue]){
                    minValue=j;
                }
            }
            //time to swap it
            int temp=Numbers[minValue];
            Numbers[minValue]=Numbers[i];
            Numbers[i]=temp;
          
        }
        for(int i:Numbers){
            System.out.println(i);
        }
    }
    
}
