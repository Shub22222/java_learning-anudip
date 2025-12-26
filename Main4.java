
public class Main4 extends Animal4{
    public static void main(String[] args) {
        Animal4 obj=new Animal4(){
            public void makeSound(){
                System.out.println("woof woof");
            }
        };
        obj.makeSound();
        

    }
}
