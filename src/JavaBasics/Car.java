package JavaBasics;

public class Car extends Vehicle{
	
	public Car(int a) {
		super(a);		
	}

	public void lock()
	{
		System.out.println("Car is locking");
		start();
	}
	
	public void start()
	{
		System.out.println("Car is starting");
	}
	
	public static void main(String args[])
	{
		Car c1 = new Car(3);
		c1.lock();
		c1.StartEngine(3);
		
		Vehicle c2 = new Car(3);
		c2.start();
		c2.stop();
	}
	
	
}
