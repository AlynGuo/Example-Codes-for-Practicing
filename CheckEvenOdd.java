package sample;
import java.util.*;

public class CheckEvenOdd {

	public static void main(String[] args) {
		// start...
      int num;
	  System.out.println("Enter an integer:");
      Scanner input = new Scanner(System.in);
      num = input.nextInt();
      
      if(num % 2 == 0) {
    	  
    	  System.out.println("Entered number is even");
      }
      else {
    	  
    	  System.out.println("Entered number is odd");
      }
	}

}
