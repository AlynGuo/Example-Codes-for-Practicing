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
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

class PalindromeCheckQueue {
    
    public static void main(String[] args){
        
        System.out.print("Enter any string:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Queue queue = new LinkedList();
        
        for(int i = inputString.length()-1; i >= 0; i--){
            
            queue.add(inputString.charAt(i));
        }
        
        String reverseString = "";
        
        while(!queue.isEmpty()){
            
            reverseString = reverseString + queue.remove();
        }
        
        if(inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");
    }
}
