import java. io. *;
public class Arithmetic{
	public static void main(String[] args)throws IOException{
		BufferedReader arithmetic = new BufferedReader(new InputStreamReader(System.in));
		
		char operation;
		double n1, n2, result;
		String str = "";
		
		System.out.println("Simple Calculator");
		System.out.println("Enter Two Numbers: ");
		str = arithmetic.readLine();
		n1 = Double.parseDouble(str);
		str = arithmetic.readLine();
		n2 = Double.parseDouble(str);
		
		System.out.println("\nChoose Operation");
		System.out.println("A.] Add");
		System.out.println("S.] Subtract");
		System.out.println("M.] Multiply");
		System.out.println("D.] Divide");
		
		System.out.println("\nYour Choice: ");
		str = arithmetic.readLine();
		operation = str.charAt(0);
		
		switch(operation)
		{
			case 'A' :
			case 'a' : result = n1 + n2; System.out.println("\nSum = " + result);
			break;
			case 'S' :
			case 's' : result = n1 - n2; System.out.println("\nDifference = " + result);
			break;
			case 'M' :
			case 'm' : result = n1 * n2; System.out.println("\nProduct = " + result);
			break;
			case 'D' :
			case 'd' : result = n1 / n2; System.out.println("\nQuotient = " + result);
			break;
			default : System.out.println("\nUnknown Operation!");
		}
	}
}