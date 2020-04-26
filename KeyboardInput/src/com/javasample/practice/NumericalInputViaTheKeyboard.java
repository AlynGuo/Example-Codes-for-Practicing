package com.javasample.practice;
import java.io.*;

public class NumericalInputViaTheKeyboard {
     
      public static void main(String[] args){
          try{
              
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              System.out.println("Enter an integer: ");
              String int_str = br.readLine();
              int num = Integer.parseInt(int_str);
              System.out.println("The number is: "+ num);
              
          }catch(IOException ioe){
              
          }
          
      }            
}
