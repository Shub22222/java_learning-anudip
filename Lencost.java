public class Lencost{
    int year;
    String name;

    public Lencost(int lyear,String lname){ //construtor 
        this.year=lyear;
        this.name=lname;
    }

    public static void main(String[] args) {
        Lencost obj=new Lencost(213,"dsf");
        System.out.println(obj.year +obj.name);
    }


}
