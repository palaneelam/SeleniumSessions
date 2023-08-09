package JAVABasic;

public class StringMethods {
		
	public static void main(String[] args) {
		
		String str = "This is my 2nd day for JAVA session.";
		String str1 = "I am learning here.";
		
		String str3 = "Welcome";
		String str4 = "Welcome";
		
		String str5 = "";
		
		String str6 = "       There is a big space in front            ";
		
		System.out.println("Length of str is: "+str.length());
		System.out.println("Character at index 3 is: "+str.charAt(33));
		System.out.println("appended string: "+str1.concat(str));
		System.out.println(str+"."+str1);
		System.out.println("Contains example: "+str.contains("JAVA"));
		System.out.println("Starts with: "+str.startsWith("I"));
		System.out.println("Ends with: "+str.endsWith("sion."));
		System.out.println("Equals Check: "+ str3.equals(str1));
		System.out.println("Index Of : "+str.indexOf("is"));
		System.out.println("Index Of : "+str1.indexOf("m"));
		System.out.println("Index Of : "+str.indexOf("s", 10));
		System.out.println("String Empty: "+str5.isEmpty());
		System.out.println("Str6: "+str6);
		System.out.println("Trim function: "+str6.trim());
		System.out.println("replace function: "+str.replace("2nd","second"));
		System.out.println("Substring method: "+str.substring(4));
		System.out.println("Substring method: "+str.substring(4, 28));
		
		System.out.println("Lower case: "+str.toLowerCase());
		System.out.println("Upper case: "+str.toUpperCase());
		
		
	}

}
