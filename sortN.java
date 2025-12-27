public class sortN {
    public static void main(String args[]){
    int arry[]={32,65,63,76,87,23};
    for (int i=0;i<arry.length-1;i++){
        for(int j=0;j<arry.length-i-1;j++){
            if(arry[j]>arry[j+1]){
                int temp=arry[j];
                arry[j]=arry[j+1];
                arry[j+1]=temp;
            }
            // System.out.print(arry[j]);
        }
    }
  
    System.out.print("sorted array: ");
    for (int i=0;i<arry.length;i++){
        System.out.print(arry[i]+" ");
    }


    }
}


