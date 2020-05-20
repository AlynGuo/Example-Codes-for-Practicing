
//Name: Guo, Alyssa Lyn J. 
//Section: BIT-201
//Title: Answer To Midterm Exam
public class Rectangle{
   
    int length, width;
    
    public static void main(String[]args){
        //Instantiation
        Rectangle firstRectangle = new Rectangle();
        Rectangle secondRectangle = new Rectangle();
        
        boolean res;
        
        //Assigned values for first Rectangle
        firstRectangle.length = 6;
        firstRectangle.width = 5;
        
        //Assigned values for second Rectangle
        secondRectangle.length = 7;
        secondRectangle.width = 4;
        
        //Calling Class Method
        res = rectangle_CompareMethod(firstRectangle, secondRectangle);
        System.out.println(res);//Prints return of class method
    }
    
    public int getPerimeter(){
        
        return 2 * length + width * 2;
        
    }
   
    public static Boolean rectangle_CompareMethod(Rectangle first, Rectangle second){
          
            if(first.getPerimeter() == second.getPerimeter()){
            return true;
        }else{
            return false;
        }
        
    }
    
    
}
