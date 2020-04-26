package com.javasample.practice;
import java.io.*;

public class DoubleInputViaKeyboard {
   
    public static void main(String[]args){
          try
     {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter a double: ");
         String dbl_Str = br.readLine();
         Double dblNum = Double.valueOf(dbl_Str);
         System.out.println("The number is: "+ dblNum);
      
     }catch(IOException ioe)
     {
         
     }
    }
}
