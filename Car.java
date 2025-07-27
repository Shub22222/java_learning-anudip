package handson;

public class Car extends Vehicle {

	@Override
	void start() {
		System.out.println("Car is starting");
		// TODO Auto-generated method stub
		super.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car obj=new Car();
		obj.start();
	}

}
