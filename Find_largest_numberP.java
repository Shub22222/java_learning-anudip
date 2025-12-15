public class Find_largest_numberP {
        public static void main (String[] args){

        int []a={12,98,50};
        int max=a[0];

        for(int i=0;i<a.length;i++){
            if(max<a[i]){

                max=a[i];
            }
        }
        System.out.println("largest number is : "+max);

}
}

