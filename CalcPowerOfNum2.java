package calculate;

public class CalcPowerOfNum2 {

	public static void main(String[] args) {
		
        /*
         * Program to calculate
         * power of a number
         * using a while loop
         * 
         */
		
		int number = 5, p = 2;
		long result = 1;
		
		int i = p;
		
		while(i != 0) {
			
			result *= number;
			--i;
		}
		
		System.out.println(number + "^" + p + " = " + result);
	}

}
