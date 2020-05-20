package com.samplejava.practicecoding.overloadings.www;

public class OverloadingMethodsInJava {
    
    public void disPlay(char c){
        System.out.println(c);
    }
    
    public void disPlay(char c, int num){
        System.out.println(c +" "+ num);
    }
    
    public static void main(String args[]){
        
        OverloadingMethodsInJava obj = new OverloadingMethodsInJava();
        obj.disPlay('a');
        obj.disPlay('b', 100);
    }
}
