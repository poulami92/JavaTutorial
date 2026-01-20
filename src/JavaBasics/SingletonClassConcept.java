package JavaBasics;

public class SingletonClassConcept {
	
	private static SingletonClassConcept sn = null;
	
	public String str;
	
	private SingletonClassConcept()
	{
		str ="Hey I am Singleton";
	}
	
	public static SingletonClassConcept getInstance()
	{
		if(sn==null)
		{
			sn= new SingletonClassConcept();
		}
		return sn;
	}
	

	public static void main(String[] args) {
		
		SingletonClassConcept x = SingletonClassConcept.getInstance();
		SingletonClassConcept y = SingletonClassConcept.getInstance();
		SingletonClassConcept z = SingletonClassConcept.getInstance();
		
		x.str = (x.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str = (z.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		
		

	}

}
