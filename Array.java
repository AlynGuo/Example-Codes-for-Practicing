import java. util. *;
public class Array{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		double average, highest;
		double key;
		double[] number = new double[5];
		double sum = 0;
		int x;
		
		System.out.println("Enter Five Numbers in the Array: ");
		
		for(x = 0; x < number.length; x++)
		{
			number[x] = input.nextDouble();
		}
		
		System.out.println("The Content of the Array are: ");
		
		for(x = 0; x < number.length; x++)
		{
			System.out.println(number[x]);
		}
		
		System.out.println("The Sum of All Element is: ");
		
		for(x = 0; x < number.length; x++)
		{
			sum = sum + number[x];
		}
		
		System.out.println(sum);
		
		average = sum / 5;
		
		System.out.println("The Average is: " + average);
		System.out.println("Finding the Highest Number in the Array: ");
		
		highest = number[0];
		
		for(x = 1; x < number.length; x++)
		{
			if(highest < number[x])
			{
				highest = number[x];
			}
		}
		
		System.out.println("The Highest Number is: " + highest);
		System.out.println("Enter a Number to Find: ");
		key = input.nextDouble();
	}
}