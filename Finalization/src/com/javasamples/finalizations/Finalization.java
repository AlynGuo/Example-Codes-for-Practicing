package com.javasamples.finalizations;

import java.util.GregorianCalendar;

public class Finalization extends GregorianCalendar {

    public static void main(String[] args) {
       try{
           Finalization calen = new Finalization(); //create new object
           System.out.println("" + calen.getTime()); //print current time
           System.out.println("Finalizing...");
           calen.finalize();
           System.out.println("Finalized.");
           
       }catch(Throwable ex){
           ex.printStackTrace();
       }
    }
    
}
