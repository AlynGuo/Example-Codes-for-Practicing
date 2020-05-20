package com.javasample.practice;
import java.io.*;

public class StringInputViaKeyboard {
      
     public static void main(String[]args){
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
         
         try{
             
             System.out.println("Enter some characters and press: "+ "return when finished: ");
             String s = br.readLine();
             System.out.println("The String was: "+ s);
             br.close();
             
         }catch(IOException ioe){
             ioe.printStackTrace();
         }
     }    
}
