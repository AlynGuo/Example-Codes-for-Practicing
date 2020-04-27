import java. io. *;
public class EvenOdd{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int n, r;
		String str = "";
		
		System.out.println("Even or Odd");
		System.out.println("\nEnter a Number: ");
		str = input.readLine();
		n = Integer.parseInt(str);
		
		r = n % 2;
		
		if (r == 0)
		{
			System.out.println("\nEven");
		}
		else
		{
			System.out.println("\nOdd");
		}
	}
}