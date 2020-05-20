import java. io. *;
public class RightTriangleCalculator{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		double b, h, d, num1, num2, sum;
		String str = "";
		
		System.out.println("Right Triangle Calculator");
		System.out.println("\nEnter the Base of Triangle: ");
		str = input.readLine();
		b = Double.parseDouble(str);
		System.out.println("Enter the Height of Triangle: ");
		str = input.readLine();
		h = Double.parseDouble(str);
		
		num1 = Math.pow(b, 2);
		num2 = Math.pow(h, 2);
		sum = num1 + num2;
		d = Math.sqrt(sum);
		
		System.out.println("\nHypotenuse = " + d);
	}
}