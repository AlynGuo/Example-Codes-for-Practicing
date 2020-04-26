
package com.polymorph.javasamples;

public class Horse extends Animal{
    
    @Override
    public void sound(){
        System.out.println("Neigghh");
    }
    
    @Override
    public void walks(){
        System.out.println("thump... thump... thump");
    }
    
    @Override
    public void eat(){
        System.out.println("grunchss");
    }
    
  public static void main(String[]args){
      
      Animal hrse = new Horse();
      hrse.sound();
  }
}
