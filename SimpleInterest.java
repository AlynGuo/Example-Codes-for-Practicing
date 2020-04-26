import java.util.*;

public class MyClass {

	public static void main(String[] args){
		
         /* P is the principal, R is rate per annum, T is time in yrs
                                                                   */
          
	float p, r, t, interest;  //variables

	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the principal:");
	p = scan.nextFloat();                          //inputs principal
	System.out.println("Enter the rate of interest:");
	r = scan.nextFloat();                              //inputs rate of interest
	System.out.println("Enter the time period:");
	t = scan.nextFloat();                        //inputs time period
	scan.close();  //end of inputing closing
	
        //Formula or calculation
	interest = (p * r * t)/100;
	System.out.println("Simple interest is " + interest);

        //Simple interest formula
        //simple interest = (P * R * T)/ 100
        // simple interest = 2000 * 6 * 3 / 100 = 360 

        
	}
}


