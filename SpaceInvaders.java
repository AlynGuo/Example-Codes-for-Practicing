import java. io. *;
public class SpaceInvaders{
	public static void main(String[] args)throws IOException{
		BufferedReader sisb = new BufferedReader(new InputStreamReader(System.in));
		
		int bp, s, ts;
		String str = "";
		
		System.out.println("Space Invaders Score Board");
		System.out.println("Programmed by: Estabillo, Evan Jan U.");
		System.out.println("\nEnter Your Score: ");
		str = sisb.readLine();
		s = Integer.parseInt(str);
		
		if (s >= 50000)
		{
			bp = 10000;
			System.out.println("\nYour Bonus Points:  " + bp);
			ts = s + bp;
			System.out.println("\nYour Total Score:  " + ts);
		}
		
		else if (s >= 20000)
		{
			bp = 5000;
			System.out.println("\nYour Bonus Points:  " + bp);
			ts = s + bp;
			System.out.println("\nYour Total Score:  " + ts);
		}
		
		else if (s >= 10000)
		{
			bp = 1000;
			System.out.println("\nYour Bonus Points:  " + bp);
			ts = s + bp;
			System.out.println("\nYour Total Score:  " + ts);
		}
		
		else if (s >= 1000)
		{
			bp = 100;
			System.out.println("\nYour Bonus Points:  " + bp);
			ts = s + bp;
			System.out.println("\nYour Total Score:  " + ts);
		}
		
		else if (s <= 1000)
		{
			bp = 0;
			System.out.println("\nYour Bonus Points:  " + bp);
			ts = s + bp;
			System.out.println("\nYour Total Score:  " + ts);
		}
	}
}