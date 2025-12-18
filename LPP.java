 class person {
    public String name ="John";
    private int age=30;
}


public class LPP{
    public static void main(String[] args) {
        try{
            
        
        person  p =new person();
        System.out.println(p.name);
        System.out.println(p.age);
    }
    catch(Exception e){
        System.out.println("wow");
    }
}
}
