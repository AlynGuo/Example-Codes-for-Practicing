package sample;

public class AddComplexNumbers {

	//For real and imaginary parts of complex numbers
			double real, img;
			
			//Constructor to initialize the complex number
			AddComplexNumbers (double r, double i){
				this.real = r;
				this.img = i;
			}
			
			public static  AddComplexNumbers sum(AddComplexNumbers c1,  AddComplexNumbers c2) {
				
				//creating a temporary complex number to hold the sum of two numbers
				 AddComplexNumbers temp = new  AddComplexNumbers(0, 0);
				 
				 temp.real = c1.real + c2.real;
				 temp.img = c1.img + c2.img;
				 
				 //return the output complex number
				 return temp;
			}
			
	public static void main(String[] args) {
		                                            //real and img
		 AddComplexNumbers c1 = new  AddComplexNumbers(5.5, 4);   //adds 5.5 to 1.2 and adds 4 to 3.5
		 AddComplexNumbers c2 = new  AddComplexNumbers(1.2, 3.5);
		 AddComplexNumbers temp = sum(c1, c2);//adds c1 and c2
		 System.out.printf("Sum is "+ temp.real +" + "+ temp.img +"i");
	}

}
