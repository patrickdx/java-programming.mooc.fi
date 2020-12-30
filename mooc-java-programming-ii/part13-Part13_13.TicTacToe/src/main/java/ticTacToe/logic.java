/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import java.sql.JDBCType;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javafx.scene.control.Button;

/**
 *
 * @author Liwen Qu
 */
public class logic {    // 3 in a row to win
    
    private static char [][] grid;
    
    public logic(int size){
        grid = new char [size][size];
        
    }
   
    public boolean gameFinished(){              // check if someone won tic tac toe
       
//System.out.println(Arrays.deepToString(grid).replace("], ", "]\n").replace("[[", "[").replace("]]", "]"));
        
     if(full() == false){
         if (checkDiagonally() || checkVertically() || checkHorizontally()){
         return true;
     }
         return false;
         
     }
   
        return true;
    }
    
    public static boolean full(){
         for (int row =0; row<grid.length; row++){ 
              for (int col=0; col<grid[row].length; col++){
                  if (grid[row][col] == 0){     // if find empty space
                      return false;
                  }
              }
         } 
         return true;
    }
    
    public static boolean checkHorizontally(){
        
           for (int row =0; row<grid.length; row++){        // horizontal matches
            int count =0;
            int count1=0;
            for (int col=0; col<grid[row].length; col++){
                if(grid[row][col]==('X')){
                    
                    count++;
                }
                if(grid[row][col] ==('O')){
                    count1++;
                }
                if (count == 3 || count1==3){
                    return true;
                }
            }
        }
           return false;
    }
    
    
        public static boolean checkVertically(){
         for (int row =0; row<grid.length; row++){        // horizontal matches
            int count =0;
            int count1=0;
            for (int col=0; col<grid[row].length; col++){
                if(grid[col][row]==('X')){
                    count++;
                } if(grid[col][row] ==('O')){
                    count1++;
                }
                if (count == 3 || count1==3){
                    return true;
                }
            }
        }
           return false;
    }
        
        public static boolean checkDiagonally(){
            char dia1[] = new char[grid.length];
            char dia2[] = new char [grid.length];
            int i=0;
            for (int row=0; row<grid.length; row++){
                dia1[row] = grid[row][i];
                dia2[row] = grid[row][grid.length-1-i];
                
                i++;
            }
            boolean diagonal = false;
            int counter=0;
               int counter1=0;
           for (int xd =0; xd<dia1.length; xd++){              // check for matches
               
               if (dia1[xd] == 'X'){
                   counter++;
               }
               if (dia2[xd] == 'O'){
                   counter1++;
               }
           }
           if (counter ==3 || counter1 == 3){
               return true;
           }
           
           

         return false;
            
            
            
        }
        
   
        
    public void add(int row, int col, char charcter){
        grid[row][col] = charcter;
    }
       
}
    
    

