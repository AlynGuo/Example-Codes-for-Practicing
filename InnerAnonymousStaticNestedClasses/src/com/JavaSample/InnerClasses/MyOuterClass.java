package com.JavaSample.InnerClasses;

public class MyOuterClass {
    
    private final int x = 1;
    
    public void innerInstance(){
        MyInnerClass in= new MyInnerClass();
        in.seeOuter();
    }
    
    public static void main(String[]args){
        MyOuterClass out = new MyOuterClass();
        out.innerInstance();
    }
    
    class MyInnerClass{
    
        public void seeOuter(){
            System.out.println("Outer value is: " + x);
        }
}
}
