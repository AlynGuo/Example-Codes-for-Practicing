import java. io. *;
public class SimpleCalculator{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		double num1, num2, total;
		String str = "";
		
		System.out.println("Simple Calculator");
		System.out.println("\nEnter First Number: ");
		str = input.readLine();
		num1 = Double.parseDouble(str);
		System.out.println("Enter Second Number: ");
		str = input.readLine();
		num2 = Double.parseDouble(str);
		
		total = num1 + num2;
		
		System.out.println("\nSum = " + total);
	}
}