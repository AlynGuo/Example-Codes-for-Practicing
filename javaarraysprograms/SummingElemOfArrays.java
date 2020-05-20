package javaarraysprograms;

public class SummingElemOfArrays {
    
    public static void main(String[]args){   //ctto
                                              // this code is not mine
        int[] array = {10, 20, 30, 40, 50, 10};
        int sum = 0;
        
        //Advanced for loop
        for(int num : array){
            sum = sum + num;
        }
        
        System.out.println("Sum of array elements is: " + sum);
    }
}
