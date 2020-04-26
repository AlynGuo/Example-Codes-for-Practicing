package calculate;

public class CompoundInterestCalcu {

	public void calculate(int p, int t, double r, int n) {
		
	    double amount = p * Math.pow(1 + (r / n), n * t);
	    double cinterest = amount - p;
	    System.out.println("Compound interest after " + t + " years: " + cinterest);
	    System.out.println("Amount after " + t + " years: " + amount);
	}
	
	public static void main(String[] args) {
		
		CompoundInterestCalcu obj = new CompoundInterestCalcu();
		obj.calculate(2000, 5, .08, 12);
		/**
		 * 
		 * p = 2000
		 * r = 8/10 = 0.08 decimal
		 * n = 12
		 * t = 5
		 * 
		 * compound interest = 2000 (1 + 0.08 / 12 )(12 * 5) - 2000 = $979.69
		 * 
		 * p is the principal amount
		 * r is the annual interest rate
		 * t is the time the money is invested or borrowed
		 * n is the number of times that interest is compounded per unit t.
		 * 
		 * formula p ( 1 + r / n ) ( n * t ) - p
		 * 
		 */
	}

}
