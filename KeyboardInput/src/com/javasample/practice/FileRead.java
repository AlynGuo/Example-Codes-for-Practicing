package com.javasample.practice;


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileRead {

       public static void main(String[]args) throws IOException{
           
           BufferedReader br;
           try {
               br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\OneDrive\\Documents\\Greetings.txt"));
               String intStr = br.readLine();
           System.out.println("The contents of file are: " + intStr);
           } catch (FileNotFoundException ex) {
               Logger.getLogger(FileRead.class.getName()).log(Level.SEVERE, null, ex);
           }
           
          
       }
}
