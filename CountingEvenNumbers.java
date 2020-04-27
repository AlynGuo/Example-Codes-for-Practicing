import java. io. *;
public class CountingEvenNumbers{
	public static void main(String[] args)throws IOException{
		BufferedReader term = new BufferedReader(new InputStreamReader(System.in));
		
		int start, end, L;
		String str = "";
		
		System.out.println("Counting Even Numbers");
		System.out.println("\nEnter Start Term: ");
		str = term.readLine();
		start = Integer.parseInt(str);
		System.out.println("Enter End Term: ");
		str = term.readLine();
		end = Integer.parseInt(str);
		L = str.length();
		
		evenNumbers(start, end);
		
	}
	
	static void evenNumbers(int a, int b)
	{
		int idx = 0;
		for(idx = a; idx < b; idx++)
		{
			if(idx % 2 == 0)
			{
				System.out.println("\nThe Number of Evens is " + idx);
			}				
		}
	}
}