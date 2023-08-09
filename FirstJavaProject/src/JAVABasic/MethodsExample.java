package JAVABasic;

public class MethodsExample {
	//static int marks;
	static String grade, studentName, FinalGrade;
	static int marks;
	
	public static void main(String[] args) {
		String a = "Hello, Welcome to day 3";
		System.out.println(a);
		
		//System.out.println(findGrades("Neelam", 80));	
		
		//System.out.println("Grades of student: "+findGrades("Ravi", 90));
		
		studentName = "Neelam";
		marks = 70;
		FinalGrade = findGrades(studentName, marks);
		displayName(studentName,FinalGrade);			
	}
	
	public static String findGrades(String studentName, int marks)
	{
		
		if(marks >=90 && marks<=100)
		{
			grade="A";
		} else if(marks >=80 && marks<=90)
		{
			grade="B";
		} else if(marks >=70 && marks<=60)
		{
			grade="C";
		}
		else
		{
			grade="D";
		}
		
		System.out.println("Student Name inside method: " + studentName+" and grade is: "+grade);
		return grade;
	}
	
	public static void displayName(String studentName, String grade)
	{
		System.out.println("Grade of "+studentName+ " is: "+grade);
	}
	
}
