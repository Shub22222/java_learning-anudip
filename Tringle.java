import java.util.Scanner;
public class Tringle {
	static void Circle(){
		System.out.println("enter radius for Circle");
		Scanner sc= new Scanner(System.in);
		double r=sc.nextDouble();
		System.out.println("area of Circle is "+ 3.14*r*r);
		System.out.println("parameter  of Circle is "+ 2*3.14*r);
		sc.close();
		
	}
	public static void main(String[] args) {
		Circle();
	}
}
