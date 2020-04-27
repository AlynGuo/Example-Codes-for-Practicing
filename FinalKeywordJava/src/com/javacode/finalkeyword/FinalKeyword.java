package com.javacode.finalkeyword;

public class FinalKeyword {
    //Blank final variable
    final int MAX_VALUE, MIN_VALUE;
    
    FinalKeyword(){
        //It must be initialized in constructor
        MAX_VALUE = 1000;
        MIN_VALUE = 1;
    }
    
    void myMethod(){
        System.out.println(MAX_VALUE);
        System.out.println(MIN_VALUE);
    }
    public static void main(String[]args){
        FinalKeyword fk = new FinalKeyword();
        fk.myMethod();
    }
}
