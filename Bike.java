package handson;

public class Bike extends Vehicle {

	
	@Override
	void start() {
		System.out.println("Bike is starting ");
		// TODO Auto-generated method stub
		super.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike obj=new Bike();
		obj.start();
	}

}
