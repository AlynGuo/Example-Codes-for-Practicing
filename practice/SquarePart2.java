
package practice;

public class SquarePart2 {
     double side;
     
     public double area(){
         
         return side * side;
     }
     
     public static void main(String[]args){
         
         SquarePart2 s1 = new SquarePart2();
         SquarePart2 s2 = new SquarePart2();
         double area;
         
         s1.side = 4;
         s2.side = 5;
         
         System.out.println("Computing for area of square s1");
         area = s1.area();
         System.out.println("The area of s1 is "+ area);
         
         System.out.println("Computing for area of square s2");
         area = s2.area();
         System.out.println("The area of square s2 is "+ area);
     }
}
