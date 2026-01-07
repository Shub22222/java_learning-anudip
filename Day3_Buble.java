public class Day3_Buble {

     public static void main(String[] args) {
        //array crea,ed
        int [] arr={80,20,10,5}; 
        // this outer loop runs throgh all elements
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
     }
}
