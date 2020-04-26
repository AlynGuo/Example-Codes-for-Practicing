package com.schoolact.rectangular;

public class Rectangle {

    double length, width;
    double area, perimeter;
    
    public static void main(String[] args) {
        
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle();
        
        //This is computation result of R1
        System.out.println("Computation of R1 Area: ");
        R1.recArea(6, 3);
        System.out.println("Area of R1: " + R1.area);
        System.out.println("Computation of R1 Perimeter: ");
        R1.recPerimeter(6, 3);
        System.out.println("Perimeter of R1: " + R1.perimeter);
        
        //This is computation result of R2
        System.out.println("Computation of R2 Area: ");
        R2.recArea(10, 7);
        System.out.println("Area of R2: " + R2.area);
        System.out.println("Computation of R2 Perimeter: ");
        R2.recPerimeter(10, 7);
        System.out.println("Perimeter of R2: " + R2.perimeter);

    }

    public double recArea(double length, double width){
       return area = length * width;          //returns result of area
    }
    
    public double recPerimeter(double length, double width){
        return perimeter = 2 * length + width * 2;     //returns result of area
    }
  
    
}

