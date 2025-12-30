public class bubble_sort {
    public static void main(String[] args){
        int [] myarry={43346,56,6778,42,2347,76};
        int n=myarry.length;
        for (int i=0;i<n-1;i++){
            boolean swapped =false;
            for (int j=0;j<n-i-1;j++){
                if(myarry[j]>myarry[j+1]){
                    int temp=myarry[j];
                    myarry[j]=myarry[j+1];
                    myarry[j+1]=temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
        System.out.print("Sorted array is:");
        for (int i=0;i<n;i++){
            System.out.print(myarry[i]+ " ");
        }
        System.out.println();
    }
}


