import java. io. *;
public class GradingSystem{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		double grade;
		String str = "";
		
		System.out.println("Grading System");
		System.out.println("Enter Grade: ");
		str = input.readLine();
		grade = Double.parseDouble(str);
		
		if (grade >= 100)
		{
			System.out.println("Excellent!");
		}
		else if (grade >= 94)
		{
			System.out.println("Superior!");
		}
		else if (grade >= 89)
		{
			System.out.println("Outstanding!");
		}
		else if (grade >= 84)
		{
			System.out.println("Satisfactory!");
		}
		else if (grade >= 79)
		{
			System.out.println("Fair!");
		}
		else if (grade >= 74)
		{
			System.out.println("Failed!");
		}
	}
}