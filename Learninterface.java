

 class pig implements Animal1 {

    public void animal_sound(){
        System.out.println("pig sound is wee, wee");
    }
    
 public void sleep(){
    System.out.println("is sleeping Zzz ");
 }
    
}
public class Learninterface  {
    public static void main(String[] args) {
        pig obj=new pig();
        obj.animal_sound();
        obj.sleep();
    }
    
}
