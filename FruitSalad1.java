import java. util. *;
public class FruitSalad1{
	public static void main(String[] args){
	    
	    Scanner input = new Scanner(System.in);
	    
		double lowest;
		double[] LowestQuantity = new double[5];
		int idx;
		String[] Fruits = new String[5];
		
		System.out.println("Fruit Salad");
		System.out.println("Programmed by: Estabillo, Evan Jan U.");
		System.out.println("\nEnter Five Fruits and Each Quantity: ");
		
		for(idx = 0; idx < 5; idx++)
		{
		    Fruits[idx] = input.next();
		    LowestQuantity[idx] = input.nextDouble();
		}
		System.out.println("\nLowest Quantity: ");
		
		lowest = LowestQuantity[0];
		
		for(idx = 0; idx < LowestQuantity.length; idx++)
		{
		    if(lowest > LowestQuantity[idx])
		    {
		        lowest = LowestQuantity[idx];
		    }
		}
		
		for(idx = 0; idx < Fruits.length; idx++)
		{
		    if(lowest == (LowestQuantity[idx]))
		    {
		        System.out.println(Fruits[idx] + " " + lowest);
		    }
		}
    }
}