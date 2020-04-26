package convert;

public class ConvertCharToString {

	public static void main(String[] args) {
	
         //Method 1 - using toString() method 
		 char ch = 'a';
		 String str = Character.toString(ch);
		 System.out.println("String is: " + str);
		 
		 //Method 2 - using a valueOf() method
		 String str2 = String.valueOf(ch);
		 System.out.println("String is: " + str2);
	}

}
