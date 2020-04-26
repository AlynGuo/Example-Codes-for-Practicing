import java. io. *;
public class EqualityTester{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		double a, b;
		String str = "";
		
		System.out.println("Equality Tester");
		System.out.println("\nEnter First Number: ");
		str = input.readLine();
		a = Double.parseDouble(str);
		System.out.println("Enter Second Number: ");
		str = input.readLine();
		b = Double.parseDouble(str);
		
		myMethod(a, b);
		//if(a == b){
			
}
		
		static void myMethod(double a, double b)
		{
			if(a == b)
			{
				System.out.println("\nThe Numbers are Equal.");
			}
			
			else
			{
				System.out.println("\nThe Numbers are Not Equal.");
			}
		}
}