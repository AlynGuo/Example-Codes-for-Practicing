import java. io. *;
public class HighestNumberFinder{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, num2, num3, hn;
		String str = "";
		
		System.out.println("Highest Number Finder");
		System.out.println("\nEnter First Number: ");
		str = input.readLine();
		num1 = Integer.parseInt(str);
		System.out.println("Enter Second Number: ");
		str = input.readLine();
		num2 = Integer.parseInt(str);
		System.out.println("Enter Third Number: ");
		str = input.readLine();
		num3 = Integer.parseInt(str);
		
		if (num1>num2 && num1>num3)
		{
			System.out.println("\nHighest Number: " + num1);
		}
		else if (num2>num1 && num2>num3)
		{
			System.out.println("\nHighest Number: " + num2);
		}
		else if (num3>num1 && num3>num2)
		{
			System.out.println("\nHighest Number: " + num3);
		}
	}
}