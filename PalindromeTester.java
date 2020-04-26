import java. io. *;
public class PalindromeTester{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int idx, L;
		String s1, s2 = "";
		
		System.out.println("Palindrome Tester");
		System.out.println("Enter a Word String: ");
		s1 = input.readLine();
		L = s1.length();
		
		for(idx = L - 1; idx >= 0; idx--)
		{
			s2 = s2 + s1.charAt(idx);
		}
		System.out.println(s2);
		
		if(s1.equals(s2))
		{
			System.out.println("It's Palindrome.");
		}
		
		else
		{
			System.out.println("It's Not Palindrome.");
		}
	}
}