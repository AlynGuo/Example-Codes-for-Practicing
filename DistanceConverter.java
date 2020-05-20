import java. io. *;
public class DistanceConverter{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		double mile, km;
		String str = "";
		
		System.out.println("Distance Converter");
		System.out.println("\nEnter Distance in Miles: ");
		str = input.readLine();
		mile = Double.parseDouble(str);
		
		km = mile * 1.609;
		
		System.out.println("\nKilometer = " + km);
	}
}
