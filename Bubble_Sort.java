//leter i got this one is ralted to selection sort 
package DSA;

public class Bubble_Sort {
    public static void main(String[] args) {
        
        int [] Container={87,20,56};
        // System.out.println(Container.length);
        // System.out.println(Container[2]);
        // now it's time toswap

        for(int i=0;i<Container.length;i++){
            for(int j=i+1;j<Container.length;j++){
                if(Container[i]>Container[j]){
                    // int temp;
                    int temp=Container[i];
                    Container[i]=Container[j];
                    Container[j]=temp;
                }
            }
        }
        for(int i=0;i<Container.length;i++){
            System.out.println(Container[i]);
        }


    }
    
}
