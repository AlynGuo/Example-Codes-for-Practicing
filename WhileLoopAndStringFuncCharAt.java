/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class WhileLoopAndStringFuncCharAt {
    
public static void main(String args[]){
    
    String reverseString = "";
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter a string to check if it is a palindrome:");
    String inputString = scanner.nextLine();
    
    int length = inputString.length();
    
    for(int i = length - 1; i >= 0; i--)
        reverseString = reverseString + inputString.charAt(i);
    
    if(inputString.equals(reverseString))
        System.out.println("Input String is a palindrome.");
    else
        System.out.println("Input String is not a palindrome.");
}    
}
