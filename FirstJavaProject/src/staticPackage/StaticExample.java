package staticPackage;

public class StaticExample {
	
	String make;
	static int instanceNbr=0;
	
	public StaticExample(String make)
	{
		this.make = make;
		instanceNbr++;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public static int getInstanceNum()
	{
		return instanceNbr;
	}

}
