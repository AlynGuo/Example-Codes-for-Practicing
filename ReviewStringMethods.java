public class ReviewStringMethods{
	public static void main(String[] args){
		
		String baseStr = "GEOGRAPHICAL";
		String searchStr = "GRAPH";
		
		if(baseStr.contains(searchStr))
		{
			System.out.println("It is a Substring.");
		}
		
		else
		{
			System.out.println("It is not a Substring.");
		}
		
		String tmpStr;
		
		tmpStr = baseStr.substring(6);
		System.out.println(tmpStr);
		
		tmpStr = baseStr.substring(6, 10);
		System.out.println(tmpStr);
		
		String expStr = "T&&T";
		
		if((expStr.charAt(0) == 'T') && (expStr.contains("&&")) && (expStr.charAt(3) == 'T'))
		{
			System.out.println("True");
		}
	}
}