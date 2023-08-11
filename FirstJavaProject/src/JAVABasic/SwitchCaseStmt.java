package JAVABasic;

public class SwitchCaseStmt {
	
	static int numOfDays, numberOfDays;
	static int year = 2023, month = 10;
	
	public static void main(String[] args) {
				
		numberOfDays = numberOfDays(year, month);
		System.out.println("Number of days in given year & month: "+numberOfDays);
	}
	
	static int numberOfDays(int year, int month)
	{
		
		switch (month)
		{
			case 1:
				numOfDays = 31;
				break;
				
			case 2:
				if ((year % 400 == 0) || (year % 100 == 0) || (year % 4 == 0))
				{
					numOfDays = 29;
				}
				else
				{
					numOfDays = 28;
				}
				
			case 3:
				numOfDays = 31;
				break;
				
			case 4:
				numOfDays = 30;
				break;
				
			case 5:
				numOfDays = 31;
				break;
				
			case 6:
				numOfDays = 30;
				break;
				
			case 7:
				numOfDays = 31;
				break;
			
			case 8:
				numOfDays = 31;
				break;
				
			case 9:
				numOfDays = 30;
				break;
				
			case 10:
				numOfDays = 31;
				break;
				
			case 11:
				numOfDays = 30;
				break;
				
			case 12:
				numOfDays = 31;
				break;
				
			default:
				System.out.println("Corrrect Month number is not entered");
				break;
		}	
		return numOfDays;
	}

}
