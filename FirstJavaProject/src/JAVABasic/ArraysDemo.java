package JAVABasic;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] myIntArray = {100, 20,200,40,50,800};
		
		String[] myStrArray = {"Today", "Tomorrow","Yesterday","DayBeforeYesterday"};
		System.out.println("First Value (0 index): "+myIntArray[0]);
		System.out.println("Second Value: "+myIntArray[1]);
		System.out.println("Third Value: "+myIntArray[2]);
		System.out.println("Fourth Value(3rd index): "+myIntArray[3]);
		
		System.out.println("First Value (0 index): "+myStrArray[0]);
		System.out.println("Second Value: "+myStrArray[1]);
		System.out.println("Third Value: "+myStrArray[2]);
		System.out.println("Fourth Value(3rd index): "+myStrArray[3]);
		
		int len = myIntArray.length;
		System.out.println("Length of my 1 array: "+len);
		
		int len1 = myStrArray.length;
		System.out.println("Length of my 2 array: "+len1);
		
		Arrays.sort(myIntArray);
		
		System.out.println("After Sorting: ");
		for(int i=0; i<len; i++)
		{
			System.out.print(myIntArray[i]+",");
		}
		
		
		
		}
		
	}
