import java. util. *;
public class StringSorter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int pass, x;
		int[] n = new int[5];
		String temp;
		String[] tab = new String[5];
		
		System.out.println("Enter Five Names into the Array: ");
		
		for(x = 0; x < 5; x++)
		{
			tab[x] = input.next();
		}
		
		System.out.println("\nThe Contents of Array: ");
		
		for(x = 0; x < 5; x++)
		{
			System.out.print(tab[x] + " ");
		}
		
		System.out.println("\n\nSorting the Array Alphabetically: ");
		
		for(pass = 1; pass < 5; pass++)
		{
			for(x = 0; x < 5 - pass; x++)
			{
				if(tab[x].compareTo(tab[x + 1]) > 0)
				{
					temp = tab[x];
					tab[x] = tab[x + 1];
					tab[x + 1] = temp;
				}
			}
		}
		
		for(x = 0; x < 5; x++)
		{
			System.out.println(tab[x] + " ");
		}
	}
}