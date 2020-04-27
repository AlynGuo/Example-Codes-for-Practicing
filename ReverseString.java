/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 * ctto BeginnersBook.com
 * @author Lenovo
 */
public class ReverseString {
    
    public void reverseWordInMyString(String str){
        
        /*
        The split() method of String class splits 
        a string in several strings based on the
        delimiter passed as an argument to it
        */
        
        String[] words = str.split(" ");
        String reversedString = "";
        for(int i = 0; i < words.length; i++){
        
        String word = words[i];
        String reversedWord = "";
        for(int j = word.length() - 1; j >= 0; j--){
            
            /*
            The charAt() function returns the character
            at the given position in a string
            */
            reversedWord = reversedWord + word.charAt(j);
        }
        reversedString = reversedString + reversedWord;
    }
        System.out.println(str);
        System.out.println(reversedString);
    }
    
    public static void main(String[]args){
        
        ReverseString obj = new ReverseString();
        obj.reverseWordInMyString("Java is kind of hard to understand.");
        obj.reverseWordInMyString("I am first year BSIT college student");
    }
}
