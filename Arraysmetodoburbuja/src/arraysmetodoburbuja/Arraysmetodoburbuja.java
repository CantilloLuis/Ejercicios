/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysmetodoburbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class Arraysmetodoburbuja {

   
    
    public static void main(String[] args) {
    Scanner datos = new Scanner (System.in);
    int arrays[],nelementos,aux;
   
 
    nelementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el "
            + "numero de elementos del arrays: "));
    arrays = new int [nelementos];
    for(int i=0; i<nelementos;i++){
     System.out.println("Ingrese numeros por favor: ");
     arrays[i] = datos.nextInt();
   
    }
    for(int i=0;(i<nelementos-1);i++){
        for(int j=0;(j<nelementos-1);j++){
            if (arrays[j]> arrays[j+1]){
               aux=arrays[j];
               arrays[j]=arrays[j+1];
               arrays[j+1]=aux;
            }
        }
    }     
   for(int i=0;(i<nelementos);i++){
     System.out.println("la lista ordenada es:"+arrays[i]);  
   }
       
 
  } 
}
