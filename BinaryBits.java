import java. io. *;
public class BinaryBits{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int powerNotion = 0, L, result;
		double sum = 0, r;
		String bitstr = "";
		
		System.out.println("Binary Bits");
		System.out.println("Enter Bytes: ");
		bitstr = input.readLine();
		L = bitstr.length();
		
		for(result = L - 1; result >= 0; result--)
		{
			if(bitstr.charAt(result) == '0')
			{
				powerNotion++;
			}
			else
			{
				r = Math.pow(2, powerNotion) * 1;
			    sum = sum + r;
				powerNotion++;
			}
		}
		
		System.out.println(sum);
	}
}