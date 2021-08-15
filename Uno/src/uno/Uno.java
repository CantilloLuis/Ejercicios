/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uno;

import java.util.Scanner;



public class Uno {

  
    public static void main(String[] args) {

       Scanner dato = new Scanner (System.in);
       int arrays1[], arrays2[],arrays3[];
       arrays1 = new int [5];
       arrays2 = new int [5];
       arrays3 = new int [10];
       
       System.out.print("\nRellene primera arrays1\n ");
       for(int i=0;i<arrays1.length;i++){
          System.out.print( (i+1) + ". ");
          arrays1[i] = dato.nextInt();
       }
        System.out.print("\nRelleno de segundo arrays\n");
        for(int i=0;i<arrays2.length;i++){
            System.out.print((i+1) + ". ");
            arrays2[i] = dato.nextInt();    
        }
      int j =0;
      for(int i=0;i<arrays2.length;i++)  {
         arrays3[j] = arrays1[i];
         j++;
         arrays3[j] = arrays2[i];
         j++;
      }
     
        System.out.print("la union del arreglo es: ");
        for(int i=0;i<arrays3.length;i++){
            System.out.print("\n"+(i+1)+". "+ arrays3[i]);
        }
      
    }
    
}
