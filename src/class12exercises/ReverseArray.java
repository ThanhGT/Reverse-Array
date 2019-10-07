/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class12exercises;

import java.lang.Math;

/**
 *  Class Exercise 12-1 
 *  Thanh Tran
 *  An array that prints an array using 2 main methods to display the array and reverse's it
 * 11-26-18
 */
public class ReverseArray {

    // main method
    public static void main (String[] args) {
        
        // declare and create an array
        int [] myList = new int[10];      
        
        // for loop that loops 10 times
        for(int i = 0; i < myList.length; i++) {
            
            // generates a random number between 1 and 100
            myList[i] = (int)(Math.random()*100) + 1;
        }
          
          printArray(myList);
          int[] revList = reverseArray(myList);
          printArray(revList);
    }
    
    // Method for printArray
    public static void printArray (int[] arrayList) {
        
        // displays 5 values per line in the array list 
        for (int i = 0; i < arrayList.length; i++) {   
        
            System.out.printf("%5d", arrayList[i]);
            
        // starts a new line after the 5th value
            if ((i+1) % 5 == 0) {
                System.out.println();
            }     
        }
    }
    
    // Method for reverseArray
    public static int[] reverseArray (int list[]) {
        
        int[] result = new int[list.length];
        
        // displays 5 values per line in the array list reversed
            for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
                result[j] = list[i];

//                System.out.printf("%5d", result[j]);

            if ((j+1) % 5 == 0) {
                System.out.println();
            }
        
        }
        return result;
    }
    
}
