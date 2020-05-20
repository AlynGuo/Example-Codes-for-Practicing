import java. io. *;
public class VowelConverter{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int counter = 0, idx, L, a_count = 0, e_count = 0, i_count = 0, o_count = 0, u_count = 0;
		String str;
		
		System.out.println("Vowel Converter");
		System.out.println("\nEnter a String: ");
		str = input.readLine();
		L = str.length();
		
		for(idx = 0; idx < L; idx++)
		{
			if((str.charAt(idx) == 'a') || (str.charAt(idx) == 'e') || (str.charAt(idx) == 'i') || (str.charAt(idx) == 'o') || (str.charAt(idx) == 'u'))
			{
				counter++;
			}
			if(str.charAt(idx) == 'a')
			{
				a_count++;
			}
			if(str.charAt(idx) == 'e')
			{
				e_count++;
			}
			if(str.charAt(idx) == 'i')
			{
				i_count++;
			}
			if(str.charAt(idx) == 'o')
			{
				o_count++;
			}
			if(str.charAt(idx) == 'u')
			{
				u_count++;
			}
		}
		System.out.println("\nNumber of Vowels: " + counter);
		System.out.println("\nNumber of a: " + a_count);
		System.out.println("Number of e: " + e_count);
		System.out.println("Number of i: " + i_count);
		System.out.println("Number of o: " + o_count);
		System.out.println("Number of u: " + u_count);
	}
}