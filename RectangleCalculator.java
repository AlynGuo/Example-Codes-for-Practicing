import java. io. *;
public class RectangleCalculator{
	public static void main(String[]args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		double length, width, area, perimeter;
		String str = "";
		
		System.out.println("Rectangle Calculator");
		System.out.println("\nEnter Length: ");
		str = input.readLine();
		length = Double.parseDouble(str);
		System.out.println("Enter Width: ");
		str = input.readLine();
		width = Double.parseDouble(str);
		
		area = length * width;
		perimeter = 2 * length + width * 2;
		
		System.out.println("\nArea = " + area);
		System.out.println("Perimeter = " + perimeter);
	}
}