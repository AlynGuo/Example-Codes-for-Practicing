package com.instance;

public class Rectangle {
     double length, width;
    
     //Guo, Alyssa Lyn J.
     //BIT-201
    public static void main(String[]args){
        
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        
        double area, perimeter;
        
       area = r1.Area(6,3);
       perimeter = r1.Perimeter(6,3);
       
        System.out.println("Area of r1 is "+ area);
        System.out.println("Perimeter of r1 is: "+ perimeter);
       
       area = r2.Area(10, 7);
       perimeter = r2.Perimeter(10, 7);
       
         System.out.println("\nArea of r2 is "+ area);
        System.out.println("Perimeter of r2 is: "+ perimeter);
        
    }    
    
    public double Area(double length, double width){
        return length * width;
    }
    public double Perimeter(double length, double width){
        return 2 * length + width * 2;
    }
}
