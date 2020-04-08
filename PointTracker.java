import java. io. *;
public class PointTracker{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int x, y;
		String str = "";
		
		System.out.println("Point Tracker");
		System.out.println("\nEnter X-Ordinate: ");
		str = input.readLine();
		x = Integer.parseInt(str);
		System.out.println("Enter Y-Ordinate: ");
		str = input.readLine();
		y = Integer.parseInt(str);

		if((x > 0) && (y > 0))
		{
			System.out.println("\nThe Point is in the 1st Quadrant.");
		}
		
		else if((x <= -1) && (y >= 0))
		{
			System.out.println("\nThe Point is in the 2nd Quadrant.");
		}
		
		else if((x <= -1) && (y <= -1))
		{
			System.out.println("\nThe Point is in the 3nd Quadrant.");
		}
		
		else if((x > 0)&& (y <= -1))
		{
			System.out.println("\nThe Point is in the 4nd Quadrant.");
		}
	}
}