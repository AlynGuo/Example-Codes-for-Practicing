import java. util. *;
public class MyBFFs{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int idx;
		String key;
		String[] names = new String[5];
		
		System.out.println("BFFs List");
		System.out.println("\nEnter Five Names: ");
		
		for(idx = 0; idx < names.length; idx++)
		{
			names[idx] = input.nextLine();
		}
		
		System.out.println("BFFs List Content: ");
		
		for(idx = 0; idx < names.length; idx++)
		{
			System.out.println(names[idx]);
		}
		
		System.out.println("Enter Name to Find: ");
		
		key = input.nextLine();
		
		for(idx = 0; idx < names.length; idx++)
		{
			if(key.equals(names[idx]))
			{
				System.out.println("\nMatch Found at: " + idx);
				break;
			}
		}		
			if(idx == names.length)
			{
				System.out.println("\nNo Match Found!");
			}
	}
}