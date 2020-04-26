import java. io. *;
public class FactorialCalculator{
    public static void main(String[] args)throws IOException{   
    	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    
    	double p = 1;
    	int num;
    	String str = "";
    
    	System.out.println("Factorial Calculator");
    	System.out.println("Enter a Whole Number: ");
    	str = input.readLine();
    	num = Integer.parseInt(str);
    
    	while(num >= 1)
    	{
    		p = p * num;
    		num--;
    	}
    	System.out.println("\nFactorial = " + p);
    }
}
