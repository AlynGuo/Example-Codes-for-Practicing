package com.file;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreatingAFile implements Serializable{
    
    String name;
    int age;
    String major;
    String gender;
    
    public CreatingAFile(String name, String major, String gender){
        this.name = name;
        this.major = major;
        this.gender = gender;
    }
    
    public int Age(int age){
        return this.age = age;
    }
    
    public static void main(String[]args){
        
        CreatingAFile p1 = new CreatingAFile("Maritielleai Godianne", "Major in late", "female");
        p1.Age(20);
        String fileName = "Data.txt";
        
        try {
            try (FileOutputStream fos = new  FileOutputStream(fileName); 
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                
                oos.writeObject(p1);
                oos.close();
                fos.close();
                
            }
            
            System.out.println("Object has been serialized.");
           
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreatingAFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CreatingAFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        p1 = null;
        
         try{
            try ( //Reading the object from a file
                    FileInputStream fis = new  FileInputStream(fileName); 
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                //Method for Deserialization
                p1 = (CreatingAFile)ois.readObject();
                
            }
                 System.out.println("Object has been deserialized");
                 
                
             }catch(IOException ex){
                  System.out.println("IOException is caught.");
             } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreatingAFile.class.getName()).log(Level.SEVERE, null, ex);
        }
         
      File newFile = new File("C:\\Users\\Lenovo\\OneDrive\\Documents\\NetBeansProjects\\JavaAdvancePractice\\Data.txt");
       System.out.println("File name: "+newFile.getName());
       System.out.println("Directory path: "+newFile.getPath());
       System.out.println("Exists: "+newFile.exists());
    }
}
