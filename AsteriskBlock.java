import java. io. *;
public class AsteriskBlock{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int height, weight, h, w;
		String abstr = "";
		
		System.out.println("Asterisk Block");
		System.out.println("Enter Height: ");
		abstr = input.readLine();
		height = Integer.parseInt(abstr);
		System.out.println("Enter Weight: ");
		abstr = input.readLine();
		weight = Integer.parseInt(abstr);
		
		for(w = weight; w > 0; w--)
		{
			System.out.print("*");
		}
		
		for(h = height; h > 0; h--)
		{
			System.out.println("*");
		}
		
		for(h = height; h <= w-1; h--)
		{
			System.out.println(" ");
		}
		
		for(w = weight; w > 0; w--)
		{
			System.out.print("*");
		}
	}
}