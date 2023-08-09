package JAVABasic;

public class ClassDemo {
	
	public static void main(String[] args) {
		
		ClassIntroduction c1 = new ClassIntroduction();
		
		c1.speed();
		System.out.println("Color of the car from external method: "+ c1.color);
		c1.colorOfCar();
		
	}

}
