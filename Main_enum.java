enum level{
    LOW,
    MIDIUM,
    HIGH
}
public class Main_enum {
    public static void main(String[] args) {
        level obj=level.MIDIUM;

        switch(obj){
            case LOW:
                System.out.println("low level");
                break;
            case MIDIUM:
                System.out.println("medium level");
                break;
            case HIGH:
                System.out.println("high level");
                break;

            
        }
    }
    
}
