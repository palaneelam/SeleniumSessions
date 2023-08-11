package staticPackage;

public class StaticDemo {

	public static void main(String[] args) {
		
		StaticExample s1 = new StaticExample("KIA");
		System.out.println("Car type is: "+ s1.getMake());
		System.out.println("Instance nbr: "+StaticExample.instanceNbr);
						
		StaticExample s2 = new StaticExample("Hyundai");
		System.out.println("Car type is: "+ s2.getMake());
		System.out.println("Instance nbr: "+StaticExample.instanceNbr);
		
	}
}
