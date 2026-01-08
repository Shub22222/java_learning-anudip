public class Inssert {
    public static void main(String[] args) {
        int arr[]={64,34,25,12};

        for(int i=1;i<arr.length;i++){
            int index=i;
            int value=arr[i];
            int j=i-1;

            while (j>=0 && arr[j]>value) {
                arr[j+1]=arr[j];
                index=j; 
                j--; 
                
            }
            arr[index]=value;

        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
