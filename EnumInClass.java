package com.enumjava.sample;

public class EnumInClass {
    enum Level{
        NEWBIE,
        NOOB,
        MODERATE,
        PRO
    }
    
    public static void main(String[]args){
        Level lvl = Level.PRO;
        System.out.println("Player level: "+ lvl);
                
    }
}
