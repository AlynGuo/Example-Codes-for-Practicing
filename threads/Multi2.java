package com.threads;

public class Multi2 implements Runnable{
    
    @Override
    public void run(){
        System.out.println("Thread is running...");
    }
    
    public static void main(String args[]){
        Multi2 M2 = new Multi2();
        Thread t1 = new Thread(M2);
        t1.start();
    }
}
