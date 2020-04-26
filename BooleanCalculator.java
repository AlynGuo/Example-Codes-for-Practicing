import java. io. *;
public class BooleanCalculator{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		String bcStr = "";
		
		System.out.println("Boolean Calculator");
		System.out.println("Programmed by: Estabillo, Evan Jan U.");
		System.out.println("\nEnter the Boolean Expression: ");
		bcStr = input.readLine();
		
		System.out.println("\nResult: ");
		
	    if((bcStr.contains("F")) && (bcStr.contains("&&")))
		{
			System.out.println("False");
		}
	    else if((bcStr.contains("F")) && (bcStr.contains("||")))
		{
			System.out.println("True");
		}
	    else
	    {
	        System.out.println("True");
	    }
	    
	}
}