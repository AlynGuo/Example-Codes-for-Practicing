package com.javasample.practice;
import java.io.*;

public class Files {
     
      public static void main(String[]args){
          File file = new File("C:\\Users\\Lenovo\\OneDrive\\Documents\\wifipass.txt");
          System.out.println(file.getName());
          System.out.println(file.getPath());
          System.out.println(file.exists());
      }   
    
}
