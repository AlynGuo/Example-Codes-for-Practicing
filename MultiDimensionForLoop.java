package com.loop.arrays;

public class MultiDimensionForLoop {
    
    public static void main(String[]args){
        
        int[][] myNum = {{1,2,3,4},{5,6,7,8}};
        for(int i = 0; i < myNum.length; i++){
            
            for(int j = 0; j < myNum.length; ++j){
                System.out.println(myNum[i][j]);
            }
        }
    
    }
}
