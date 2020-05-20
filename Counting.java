package tester;
import java.io.*;

public class Counting {

	public static void main(String[]args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		int start = 0, end = 0;
		System.out.println("COUNTING EVEN NUMBERS");
		System.out.println("Enter Start Term");
		str = br.readLine();
		start = Integer.parseInt(str);
		System.out.println("Enter End Term");
		str = br.readLine();
		end = Integer.parseInt(str);
		
		EvenMethod(start, end);
	}
	
	static void EvenMethod(int x, int y) {
		
		int start;
		int end = 0;
		
		for(start = x; start < y; start++) {
			
			if(start % 2 == 0) {
				end = end + 1;
			}
		}
		System.out.println("The numbers of even is "+end);
	}
}
