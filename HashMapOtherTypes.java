package com.java.collections;

import java.util.HashMap;

public class HashMapOtherTypes {
    public static void main(String[]args){
        
        HashMap<String, Integer> people = new HashMap <String, Integer>();
        
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);
        
        for(String i : people.keySet()){
            System.out.println("Key: "+ i + " Value: " + people.get(i));
        }
    }
}
