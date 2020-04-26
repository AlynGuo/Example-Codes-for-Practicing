package com.javasamples.finalizations;

public class GarbageCollectionJava {
       
    public static void main(String[]args){
        
        GarbageCollectionJava obj = new GarbageCollectionJava();
        obj = null; //assigning a null value to reference to become unreachable
        
        GarbageCollectionJava a = new GarbageCollectionJava();
        GarbageCollectionJava b = new GarbageCollectionJava();
        b = a;
        System.gc();
    }
    
    @Override
    protected void finalize() throws Throwable{
        try {
            System.out.println("Garbage Collection is performed by JVM");
        } finally {
            super.finalize();
        }
    }
}
