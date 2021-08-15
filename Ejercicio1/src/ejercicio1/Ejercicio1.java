/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {

  
    public static void main(String[] args) {

     
        Scanner dato = new Scanner(System.in);
        int arrays1[] = new int [5];
        int arrays2[] = new int [5];
        int arrays3[] = new int [10];
     
        for (int i=0;i<5;i++){
           System.out.print((i+1)+". Ingrese datos por favor:");
           arrays1[i] = dato.nextInt();
        
        }
     
        for (int  i=0;i<5;i++){
           System.out.print((i+1)+". Ingrese datos por favor:");
           arrays2[i] = dato.nextInt();
        }
        int j=0;
        for (int i=0;i<5;i++){
     
           arrays3[j] = arrays1[i];
           j++;
           arrays3[j] = arrays2[i];
           j++;
        }
        for(int i=0;i<10;i++){
           System.out.print(arrays3[i]+" ");
      
        }
        System.out.println();

    }
    
}
