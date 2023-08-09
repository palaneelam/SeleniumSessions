package JAVABasic;

public class callGettersAndSetters {
	
	public static void main(String[] args) {
		gettersAndSetters car = new gettersAndSetters();
		
		car.getMake();
		car.setMake("KIA");
		System.out.println("New value of car is: "+car.getMake());
		
	}

}
