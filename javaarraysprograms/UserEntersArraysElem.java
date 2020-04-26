
package javaarraysprograms;

import java.util.Scanner;

/*
User would enter the 10 elements and 
the program will store them into an array and 
will display  the sum of them.
*/
public class UserEntersArraysElem {
    
    public static void main(String[]args){
        
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0; 
        
        System.out.println("Enter the elements: ");
        for(int i = 0; i < 10; i++){
            array[i] = scan.nextInt();
        }
        
        for(int num : array){
            sum = sum + num;
        }
        
        System.out.println("Sum of array elements is: " + sum);
    }
}
