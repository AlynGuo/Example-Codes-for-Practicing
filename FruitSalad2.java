import java. util. *;
public class FruitSalad2{
	public static void main(String[] args){
	    
	    Scanner input = new Scanner(System.in);
	    
		double highest;
		double[] HighestQuantity = new double[5];
		int idx;
		String[] Fruits = new String[5];
		
		System.out.println("Fruit Salad");
		System.out.println("Programmed by: Estabillo, Evan Jan U.");
		System.out.println("\nEnter Five Fruits and Each Quantity: ");
		
		for(idx = 0; idx < 5; idx++)
		{
		    Fruits[idx] = input.next();
		    HighestQuantity[idx] = input.nextDouble();
		}
		System.out.println("\nHighest Quantity: ");
		
		highest = HighestQuantity[0];
		
		for(idx = 0; idx < HighestQuantity.length; idx++)
		{
		    if(highest < HighestQuantity[idx])
		    {
		        highest = HighestQuantity[idx];
		    }
		}
		
		for(idx = 0; idx < Fruits.length; idx++)
		{
		    if(highest == (HighestQuantity[idx]))
		    {
		        System.out.println(Fruits[idx] + " " + highest);
		    }
		}
    }
}