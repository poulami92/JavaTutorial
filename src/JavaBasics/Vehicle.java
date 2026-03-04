package JavaBasics;

public class Vehicle extends Machine{
	
	int a;
	
	public Vehicle(int a)
	{
		this.a=a;
	}
	
	public void start()
	{
		System.out.println("Vehicle is starting");
	}
	
	public void stop()
	{
		System.out.println("Vehicle is stopping");
		System.out.println(a);
	}
}
