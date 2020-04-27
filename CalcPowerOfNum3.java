package calculate;

public class CalcPowerOfNum3 {

	public static void main(String[] args) {
	     
       /*
        * Program to calculate 
        * power of a number 
        * using pow() function
        */
		
		int number = 10, p = 3;
		double result = Math.pow(number, p);
		
		//outputs
		System.out.println(number + "^" + p + " = " + result);
	}

}
