package com.javasample.practice;
import java.io.*;

class Emp implements Serializable{
    private static final long serialversionUID = 129348938L;
    
    transient int a;
    static int b;
    String name;
    int age;
    
    //Default constructor
    public Emp(String name, int age, int a, int b){
        this.name = name;
        this.age = age;
        this.a = a;
        Emp.b = b;
    }
    
}
public class SerialExample{
         public static void printData(Emp obj1){
             System.out.println("name = "+ obj1.name);
              System.out.println("age = "+ obj1.age);
               System.out.println("a = "+ obj1.a);
                System.out.println("b = "+ Emp.b);
         }
         
         public static void main(String[]args) throws ClassNotFoundException{
             Emp obj = new Emp("ab", 20, 2, 1000);
             String filename = "mine.txt";
             
             //Serialization
             try{
                 FileOutputStream fos = new FileOutputStream(filename);
                 ObjectOutputStream oos = new ObjectOutputStream(fos);
                 //Method for serialization
                 oos.writeObject(obj);
                 
                 oos.close();
                 fos.close();
                 
                 System.out.println("Object has been serialized\n" +
                                    "Data before Deserialization.");
                 printData(obj);
                 //Value of static variable changed
                 Emp.b = 1000;
                 
             }catch(IOException ex){
                 System.out.println("IOException is caught.");
             }
             
             obj = null;
             
             //Deserialization
             try{
                 //Reading the object from a file
                 FileInputStream fis = new  FileInputStream(filename);
                 ObjectInputStream ois = new ObjectInputStream(fis);
                 //Method for Deserialization
                 obj = (Emp)ois.readObject();
                 
                 ois.close();
                 fis.close();
                 System.out.println("Object has been deserialized\n " +
                                    "Data after Deserialization");
                 printData(obj);
                 
                 //System.out.println("z = "+ obj1.z);
             }catch(IOException ex){
                  System.out.println("IOException is caught.");
             }
         }
}
