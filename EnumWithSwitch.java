package com.enumjava.sample;
enum Grade{
    A,
    B,
    C,
    D
}
public class EnumWithSwitch {
    
    public static void main(String[]args){
        Grade grade = Grade.B;
        
        switch(grade){
            case A:
                System.out.println("Your grade is "+Grade.A+"+");
                break;
            case B:
                System.out.println("Your grade is "+Grade.B+"+");
                break;
            case C:
                System.out.println("Your grade is "+Grade.C+"+");
                break;
            case D:
                System.out.println("Your grade is "+Grade.D+"+");
                break;
        }
    }
}
