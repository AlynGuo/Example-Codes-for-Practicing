package sample;
import java.util.*;

public class CheckLeapYr {

	public static void main(String[] args) {
		
      int yr;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Enter any year:");
      yr = scan.nextInt();
      scan.close();
      
      boolean isLeap = false;
      
      if(yr % 4 == 0) {
    	  
    	  if(yr % 100 == 0) {
    		  
    		  if(yr % 400 == 0) {
    			  isLeap = true;
    		  }
    		  else {
    			  isLeap = false;
    		  }
    		
    		  }
    	  else {
    		  isLeap = true;
    	  }
      }
      else {
    	  isLeap = false;
      }
      
      if( isLeap == true) {
    	  
    	  System.out.println(yr + " is a Leap Year.");
      }
      else {
    	  System.out.println(yr + " is not a Leap Year");
      }
	}

}
