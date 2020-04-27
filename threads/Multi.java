package com.threads;

public class Multi extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running...");
    } 
    
    public static void main(String args[]){
        Multi M1 = new Multi();
        M1.start();
    }
}
