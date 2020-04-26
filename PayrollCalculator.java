import java. io. *;
public class PayrollCalculator{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); 

		double nhw, pph, ssdr, gp, np;
		String str = "";
		
		System.out.println("Payroll Calculator");
		System.out.println("Programmed by: Estabillo, Evan Jan U.");
		System.out.println("\nEnter Number of Hours Worked: ");
		str = input.readLine();
		nhw = Double.parseDouble(str);
		System.out.println("Enter Pay Per Hour: ");
		str = input.readLine();
		pph = Double.parseDouble(str);
		System.out.println("Enter Social Security Deduction Rate: ");
		str = input.readLine();
		ssdr = Double.parseDouble(str);
		
		gp = nhw * pph;
		ssdr = gp * ssdr / 100;
		np = gp - ssdr;
		
		System.out.println("\nGross Pay: " + gp);
		System.out.println("Net Pay: " + np);
	}
}