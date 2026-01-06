public class DAY2_Bubble_sort{
    public static void main(String[] args) {
        int [] Numbers={87,54,23};
        for(int i=0;i<Numbers.length-1;i++){
            for(int j=0;j<Numbers.length-i-1;j++){
                if(Numbers[j]>Numbers[j+1]){
                    int temp=Numbers[j+1];
                    Numbers[j+1]=Numbers[j];
                    Numbers[j]=temp;
                }
            }
        }
        for(int i:Numbers){
            System.out.println(i);
        }
    }
}
