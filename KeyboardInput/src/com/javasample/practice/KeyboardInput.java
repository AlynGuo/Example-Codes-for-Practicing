package com.javasample.practice;
import java.io.*;

public class KeyboardInput {

    public static void main(String[] args) {
        try{
            
            System.out.println("Please press any key: ");
            char key = (char)System.in.read();
            System.out.println("The key pressed was: " + key);
            System.out.println("The class is "+ System.in.toString());
        }catch(IOException ioe){
            System.out.println("Error: " + ioe.getMessage());
        }
    }
    
}
