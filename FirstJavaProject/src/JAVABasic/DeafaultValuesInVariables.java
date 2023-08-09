package JAVABasic;

public class DeafaultValuesInVariables {
	//write a main and then press ctrl+spacebar
	static byte byteVar;
	static short shortVar;
	static int intVar;
	static long longVar;
	static float floatVar;
	static double doubleVar;
	static boolean bool;
	static char charVar;
	String intVar1;
	
	public static void main(String[] args) {	
		
		int intVar1;
		System.out.println("Byte Value="+byteVar);			
		System.out.println("Short Value="+shortVar);		
		System.out.println("Int Value="+intVar);		
		System.out.println("Long Value="+longVar);	
		System.out.println("Float Value="+floatVar);			
		System.out.println("Double Value="+doubleVar);				
		System.out.println("Boolean Value="+bool);			
		System.out.println("Char Value="+charVar);
		
	}
	
	void anotherMethod()
	{	
		System.out.println("Int Value="+intVar1);
	}

}
