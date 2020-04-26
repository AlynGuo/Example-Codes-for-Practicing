import java. io. *;
public class PrimeNumberTester{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int num1, x;
		String str = "";
		
		System.out.println("Prime Number Tester");
		System.out.println("\nEnter a Number: ");
		str = input.readLine();
		num1 = Integer.parseInt(str);
		
		for (x = 2; x < num1; x++)
		{
			if(num1 % x == 0)
			{
				System.out.println("\nIt's Composite.");
				break;
			}
		}
		
		if (x == num1)
		{
			System.out.println("\nThe Number is Prime.");
		}
	}
}