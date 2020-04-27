package com.java.collections;

import java.util.HashMap;

public class HashMapSize {
    
    public static void main(String[]args){
        //create hashmap object: capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        //Add (keys, values)
        capitalCities.put("England","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");
        capitalCities.size();
        
        System.out.println(capitalCities);
    }
}
