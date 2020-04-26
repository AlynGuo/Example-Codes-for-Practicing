package com.synchronization;
//ctto 
class ControlTower{
    void permission(String message){       //this code is a example java code from google...
        System.out.print("[[" + message);
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]]");
    }
}

class Flight implements Runnable{
    String message;
    ControlTower target;
    Thread t;

    public Flight(ControlTower targ, String s){
        target=targ;
        message=s;
        t=new Thread(this);
        t.start();
    }

    @Override
    public void run(){
        
        synchronized(target){
        target.permission(message);
        }
    }
}

class SynDemo{
    public static void main(String [] args){
        ControlTower target=new ControlTower();

        Flight flight1= new Flight(target, "Flight 1");
        Flight flight2= new Flight(target, "Flight 2");
        Flight flight3= new Flight(target, "Flight 3");

        try{
            flight1.t.join();
            flight2.t.join();
            flight3.t.join();
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
