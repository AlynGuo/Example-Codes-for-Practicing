package com.samplejava.practicecoding.overloadings.www;

class Human{
    //Overriden method here...
    public void eat(){
        System.out.println("A human is eating...");
    }
}

public class Boy extends Human{
    
    @Override
    public void eat(){
        System.out.println("The little boy is eating...");
    }
    
    public static void main(String args[]){
            Boy b = new Boy();
            //calling child class version of eat()
            b.eat();
    }
}
