import java. io. *;
public class IPAddressDecoder{
	public static void main(String[] args)throws IOException{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		double sum = 0, result;
		int binary = 7, L, idx;
		String bitstr = "";
		
		System.out.println("IP Address Decoder");
		System.out.println("Programmed by: Estabillo, Evan Jan U.");
		System.out.println("\nEnter IP Address in Binary Bit Stream: ");
		bitstr = input.readLine();
		L = bitstr.length();
		
		System.out.println("\nIP Address in Decimal: ");
		
		for(idx = 0; idx < 35; idx++)
		{
			if(bitstr.charAt(idx) == '0')
			{
				binary--;
			}
			
			else if(bitstr.charAt(idx) == '1')
			{
				result = Math.pow(2, binary) * 1;
				sum = sum + result;
				binary--;
			}
			
			else
			{
			    System.out.print((int)sum);
			    System.out.print('.');
			    sum = 0;
			    binary = 7;
			}
		}
		System.out.print((int)sum);
	}
}