import java. io. *;
public class PreliminaryExamination{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int cob, d, l, v;
		String str = "";
		
		System.out.println("Twilight");
		System.out.println("Programmed by: Estabillo, Evan Jan U.");
		System.out.println("\nEnter the Number of Vampires: ");
		str = input.readLine();
		v = Integer.parseInt(str);
		System.out.println("Enter the Number of Cups of Blood: ");
		str = input.readLine();
		cob = Integer.parseInt(str);
	
		l = cob / 3;
		d = v - l;
		
		if(l == 0)
		{
			System.out.println("\nAll Vampire Dies!");
		}
		
		else if(l >= v)
		{
			System.out.println("\nAll Vampires Live!");
		}
		
		else
		{
		    System.out.println("\nLive = " + l);
		    System.out.println("Die = " + d);
		}
	}
}