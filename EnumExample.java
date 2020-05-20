package com.enumjava.sample;
enum Size{
    EXTRASMALL,
    SMALL,
    MEDIUM,
    LARGE,
    EXTRALARGE
}
public class EnumExample {
    
    public static void main(String[]args){
        Size s = Size.SMALL;
        System.out.println(s);
        
    }
}
