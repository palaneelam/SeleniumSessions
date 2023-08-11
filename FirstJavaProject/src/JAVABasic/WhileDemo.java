package JAVABasic;

public class WhileDemo {
	
	public static void main(String[] args) {
		int i = 1, j=1;
		
		
		
		  while (i<10) { i++; System.out.println("Value of i: "+i); }
		  
		  System.out.println("End of the while loop");
		 
		
		System.out.println("**************************************");
		
		do
		{
			System.out.println("this is a do while loop.... ");
			System.out.println("Value of i is: "+j);
			j++;
		}
		while (j<10);
		
	}

}
