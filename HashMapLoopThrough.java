package com.java.collections;

import java.util.HashMap;

public class HashMapLoopThrough {
    
    public static void main(String[]args){
        //create hashmap object: capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        //Add (keys, values)
        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");
       
        for(String i : capitalCities.keySet()){
        
            System.out.println("Keyset: "+i);
        }
        System.out.println(" ");
        for(String i : capitalCities.values()){
        
            System.out.println("values: "+i);
        }
        
    }
}
