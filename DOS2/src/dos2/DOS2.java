/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dos2;

import java.util.Scanner;


 
public class DOS2 {

  
    
    public static void main(String[] args) {

    Scanner dato = new Scanner (System.in);
    boolean creciente=false,decreciente=false;
    int arrays[] = new int[5];
    
    System.out.print("Ingrese datos del arrays por favor:\n ");
    for(int i=0;i<5;i++){
        System.out.print((i+1) + ". ");
        arrays[i]= dato.nextInt();
    }
    
    for(int i=0;i<4;i++){
        if (arrays[i]<arrays[i+1]){
            creciente = true;
          
        } 
        if (arrays[i]> arrays[i+1]){
            decreciente = true;
        }
    } 
    if (creciente == true && decreciente == false){
        System.out.print("El arrays esta de forma creciente");
    }   
    else if (creciente == false && decreciente == true){
        System.out.print("El arrays esta de forma decreciente");
    }    
  }
}
