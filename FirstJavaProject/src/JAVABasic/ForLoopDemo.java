package JAVABasic;

public class ForLoopDemo {
	
	public static void main(String[] args) {
		int i,j;
		int[] nbrs= {10,20,30,40,50};
		String[] fruits = {"Orange", "apple", "kiwi","banana"};
		
		for (i=1; i<=10; i++)
		{
			System.out.println("Value os i is: "+i);
			
		}
		
		System.out.println("******************Variation 2*********************");
		
		for(j=0; j<nbrs.length; j++)
		{
			System.out.println("Value at index: "+j+" is: "+nbrs[j]);			
		}
		
		System.out.println("******************Variation 3*********************");
		for(int number: nbrs)
		{
			System.out.println("The value is: "+number);
		}
		
		System.out.println("******************Variation 4*********************");
		for(String fr: fruits)
		{
			System.out.println("The value is: "+fr);
		}
	}

}
