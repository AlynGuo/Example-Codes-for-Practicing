import java. io. *;
public class GradeCalculator{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		double q1, q2, q3, total;
		String str = "";
		
		System.out.println("Grade Calculator");
		System.out.println("\nEnter Quiz#1: ");
		str = input.readLine();
		q1 = Double.parseDouble(str);
		System.out.println("Enter Quiz#2: ");
		str = input.readLine();
		q2 = Double.parseDouble(str);
		System.out.println("Enter Quiz#3: ");
		str = input.readLine();
		q3 = Double.parseDouble(str);
		
		total = (q1 + q2 + q3) / 3;
		
		System.out.println("\nTotal Average = " + total);
	}
}