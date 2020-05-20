package samplecreateobj;

public class Bag {
    
    String bagType;
    String color;
    String size;
    String brandName;
    
    String insideBag;
    
    
    public Bag(String bagType, String color, String size, String brandName, String insideBag){
        this.bagType = bagType;
        this.color = color;
        this.size = size;
        this.brandName = brandName;
        this.insideBag = insideBag;
    }
    
    public void printProperties(){
        
        System.out.println("Bag Type:" + bagType);
        System.out.println("Bag Color:" + color);
        System.out.println("Bag Size:" + size);
        System.out.println("Bag Brand Name:" + brandName);
    }
    
    public void open(){
        System.out.println("Your bag has been opened.");
    }
     
     public void close(){
         System.out.println("You closed your bag.");
     }
    
     public void checksTheBag(){
         
       switch (insideBag) {
            case "Empty":
                System.out.println("There is nothing here.");
                break;
            case "Messy":
                System.out.println("It looks messy inside.");
                break;
            default:
                System.out.println("It looks clean and neat.");
                break;
        }
     }
    public static void main(String[]args){
        
        Bag bg = new Bag("Backpack", "Black", "Medium", "MS", "Messy");
        bg.printProperties();
        bg.open();
        bg.checksTheBag();
        
    }
}
