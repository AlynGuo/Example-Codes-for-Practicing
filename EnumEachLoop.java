package com.enumjava.sample;

enum Level{
    LOW, 
    MEDIUM,
    HIGH
}
public class EnumEachLoop {
    
    public static void main(String[]args){
        
        for(Level lvl : Level.values()){
            System.out.println(lvl);
        }
    }
}
