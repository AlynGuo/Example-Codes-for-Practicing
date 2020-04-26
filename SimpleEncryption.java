import java. io. *;
public class SimpleEncryption{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		char Letter;
		int idx, L, n;
		String str = "";
		
		System.out.println("Simple Encryption");
		System.out.println("\nEnter Plain Text: ");
		str = input.readLine();
		L = str.length();
		
		System.out.println("\nEncrypted: ");
		
		for(idx = 0; idx < L; idx++)
		{
			Letter = str.charAt(idx);
			n = (int)Letter;
			n = n + 1;
			Letter = (char)n;
			
			System.out.print(Letter);
		}
		System.out.println("");
	}
}