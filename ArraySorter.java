import java. util. *;
public class ArraySorter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int pass, temp, x;
		int[] n = new int[5];
		
		System.out.println("Enter Five Different Numbers into the Array: ");
		
		for(x = 0; x < 5; x++)
		{
			n[x] = input.nextInt();
		}
		
		System.out.println("\nThe Contents of Array: ");
		
		for(x = 0; x < 5; x++)
		{
			System.out.print(n[x] + " ");
		}
		
		System.out.println("\n\nSorting the Array in Ascending: ");
		
		for(pass = 1; pass < 5; pass++)
		{
			for(x = 0; x < 5 - pass; x++)
			{
				temp = n[x];
				n[x] = n[x + 1];
				n[x + 1] = temp;
			}
		}
		
		for(x = 0; x < 5; x++)
		{
			System.out.println(n[x] + " ");
		}
	}
}