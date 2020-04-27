/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

//codewars answer
//ctto
public class MultiplesOf3Or5 {
    
     public static int Solution(int number) {
   
    int result;     
   result = 0;
	if (number > 3)
	{
		int min = 3;
		int count = (number - 1) / 3;
		int max = number - 1;
		while (max % 3 != 0)
		{
			max--;
		}
		int tempResult = count * (min + max) / 2;
		result += tempResult;
	}
	if (number > 5)
	{
		int min = 5;
		int count = (number - 1) / 5;
		int max = number - 1;
		while (max % 5 != 0)
		{
			max--;
		}
		int tempResult = count * (min + max) / 2;
		result += tempResult;
	}
	if (number > 15)
	{
		int min = 15;
		int count = (number - 1) / 15;
		int max = number - 1;
		while (max % 15 != 0)
		{
			max--;
		}
		int tempResult = count * (min + max) / 2;
		result -= tempResult;
	}

	return result;
  }
     
    //no main, just create on your own
     
}
