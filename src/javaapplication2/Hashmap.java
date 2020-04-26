/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    
    public void countDupChars(String str){  //ctto
                                            //code not mine
        //Create a HashMap
        Map <Character, Integer> map = new HashMap <>();
        
        //Convert the String to char array                              
        char [] chars = str.toCharArray();
        
        /*
        Logic: Char are inserted as keys and their count as 
        values. If map contains the char already then increase 
        the value by 1
        */
        
        for(Character ch : chars){ 
            if(map.containsKey(ch)){    
                map.put(ch, map.get(ch)+ 1);
            }
            else{   
              map.put(ch, 1);
            }
        }
        
        //Obtaining set of keys
        Set <Character> keys = map.keySet();
        
        /*
        Display count of chars if it is
        greater than 1. All duplicate chars would be
        having value greater than 1.
         */
        keys.stream().filter((ch) -> (map.get(ch) > 1)).forEachOrdered((ch) -> {
            System.out.println("Char "+ ch +" "+ map.get(ch));
        });
    }
    
    public static void main(String a[]){
        
        Hashmap obj = new Hashmap();
        System.out.println("String: Alyssum");
        System.out.println("-------------------------");
        obj.countDupChars("Alyssum");
        
        System.out.println("\nString: Abakada");
        System.out.println("------------------------");
        obj.countDupChars("Abakada");
        
        System.out.println("\nString: #@$@!#$%!!%@");
        System.out.println("------------------------");
        obj.countDupChars("#@$@!#$%!!%@");
    }
    
}
