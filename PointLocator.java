import java. io. *;
public class PointLocator{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				
		double cx, cy, r, d, px, py, num1, num2, sum;
		String str = "";
		
		System.out.println("Point Locator");
		System.out.println("Enter the CX of Circle: ");
		str = input.readLine();
		cx = Double.parseDouble(str);
		System.out.println("Enter the CY of Circle: ");
		str = input.readLine();
		cy = Double.parseDouble(str);
		System.out.println("Enter the Radius of Circle: ");
		str = input.readLine();
		r = Double.parseDouble(str);
		System.out.println("Enter PX: ");
		str = input.readLine();
		px = Double.parseDouble(str);
		System.out.println("Enter PY: ");
		str = input.readLine();
		py = Double.parseDouble(str);
		
		num1 = Math.pow((cx - px), 2);
		num2 = Math.pow((cy - py), 2);
		sum = num1 + num2;
		d = Math.sqrt(sum);
		
		if(d > r)
		{
			System.out.println("\nThe Point is Outside the Circle.");
		}
		
		else
		{
			System.out.println("\nThe Point is Inside the Circle.");		
		}
	}
}