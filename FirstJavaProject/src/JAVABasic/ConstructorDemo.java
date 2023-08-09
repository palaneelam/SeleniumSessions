package JAVABasic;

public class ConstructorDemo {
	
	String make;
	int speed;
	int gear;
	
	public ConstructorDemo()
	{
		this(10,3);		
		this.speed=0;
		this.gear=1;
		System.out.println("Constructor 1st example");		
	}
	
	public ConstructorDemo(int speed, int gear)
	{
		this(40,6,"Hyundai");
		this.speed=speed;
		this.gear=gear;
		System.out.println("Constructor 2nd example");		
	}
	
	public ConstructorDemo(int speed, int gear, String make)
	{
		this.speed=speed;
		this.gear=gear;
		this.make=make;
		System.out.println("Constructor 3rd example");		
	}
	
	public void setMake(String make)
	{
		this.make = make;
	}
	
	public String getMake()
	{
		return make;
	}

}
