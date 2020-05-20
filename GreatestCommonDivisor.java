import java. io. *;
import java. util. *;
public class GreatestCommonDivisor{
	public static void main(String[] args)throws IOException{
		
		int d, n;
		String snum1, snum2;
		String str = "";
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Proper Fraction: ");
		str = input.readLine();
		StringTokenizer st = new StringTokenizer(str, "/");
		
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}