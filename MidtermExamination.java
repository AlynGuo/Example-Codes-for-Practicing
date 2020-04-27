import java. io. *;
public class MidtermExamination{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0, idx, L;
		String strnum = "";
		
		System.out.println("Sum of Digits");
		System.out.println("Programmed by: Estabillo, Evan Jan U.");
		System.out.println("Enter a Number: ");
		strnum = input.readLine();
		L = strnum.length();
		
		for(idx = 0; idx < L; idx++)
		{
			if(scr.charAt(idx) == '0' || 'X')
			{
				sum = sum + 0;
			}
			if(scr.charAt(idx) == '0' || 'X')
			{
				sum = sum + 1;
			}
			if(scr.charAt(idx) == '0' || 'X')
			{
				sum = sum + 2;
			}
			if(scr.charAt(idx) == '0' || 'X')
			{
				sum = sum + 3;
			}
			if(scr.charAt(idx) == '0' || 'X')
			{
				sum = sum + 4;
			}
			if(scr.charAt(idx) == '0' || 'X')
			{
				sum = sum + 5;
			}
			if(scr.charAt(idx) == '0' || 'X')
			{
				sum = sum + 6;
			}
			if(scr.charAt(idx) == '0' || 'X')
			{
				sum = sum + 7;
			}
			if(scr.charAt(idx) == '0' || 'X')
			{
				sum = sum + 8;
			}
			if(scr.charAt(idx) == '0' || 'X')
			{
				sum = sum + 9;
			}
 		}
 		System.out.println("\nSum of Digits is: " + sum);
	}
}