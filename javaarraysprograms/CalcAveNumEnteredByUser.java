package javaarraysprograms;

import java.util.Scanner;

public class CalcAveNumEnteredByUser {
   
    public static void main(String[]args){
        
        System.out.println("How many numbers you want to enter? ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        /*
        Declaring array of n elements, the value 
        of n is provided by the user
        */
        double[] arr = new double[n];
        double total = 0;
        
        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter element no. "+ (i + 1) + ": ");
            arr[i] = scan.nextDouble();
        }
        
        scan.close();
        for(int i = 0; i < arr.length; i++){
            total = total + arr[i];
        }
        
        double average = total / arr.length;
        
        System.out.format("The average is: %.3f", average);
    }
}
