package JAVABasic;

public class ConstructorDemoCall {
	
	public static void main(String[] args) {
		
		
		  ConstructorDemo c1 = new ConstructorDemo();
		  
		  
		  c1.setMake("KIA"); System.out.println(c1.getMake());
		  
		  System.out.println(c1.speed); System.out.println(c1.gear);
		 
		  
			
			  ConstructorDemo c2 = new ConstructorDemo(10, 2);
			  System.out.println(c2.speed); 
			  System.out.println(c2.gear);
			 
		
	}

}
