public class error_handle {
   
  public static void main(String[ ] args) {
    try{

        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]); // error!
    }
    catch (Exception e){
        System.out.println("WOW is worng"+e);
    }
  }
}




