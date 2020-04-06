/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Xbonacci {
    
    public double[] tribonacci(double[] s, int n) {
      // hackonacci me
    double[] result = new double[n];
    
   result[0] = result[1] = 0;
   result[2] = 1;
   
   for(int i = 3; i < n; i++){
       
       result[i] = result[i - 1] +
                   result[i - 2] + 
                   result[i - 3];
   }
   
   for(int i = 0; i < n; i++){
       
       System.out.print(result[i] + " ");
   }
       
   return result;
  }
     public static void main(String[] args)throws IOException{
        
        int n;
        String str;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       str = br.readLine();
       n = Integer.parseInt(str);
        
        Xbonacci me = new Xbonacci();
        double[] result = new double[n];
        me.tribonacci(result, n);
   
       
    }

}