package com.samplejava.practicecoding.overloadings.www;

public class DisplayOverLoading2 {
       
    public void disPlay(char c){
        System.out.println(c);
    }
    
    public void disPlay(int c){
        System.out.println(c);
    }
}
 class Sample2{
     
     public static void main(String args[]){
         DisplayOverLoading2 dis = new DisplayOverLoading2();
         dis.disPlay('W');
         dis.disPlay(45);
     }
 }
