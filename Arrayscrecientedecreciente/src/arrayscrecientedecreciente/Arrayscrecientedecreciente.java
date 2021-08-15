/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayscrecientedecreciente;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Arrayscrecientedecreciente {

    
    public static void main(String[] args) {
        Scanner dato = new Scanner (System.in);
        int arrays[] = new int [10];
        boolean creciente = false, decreciente= false;
        
        for(int i=0;i<10;i++){
           System.out.print("Ingrese numeros al arrays por favor:");
           arrays[i]=dato.nextInt();
        }         
        for (int i=0;i<9;i++){  
            if(arrays[i] < arrays[i+1])
           {
             creciente= true;
           }
            if (arrays[i]> arrays[i+1])
            {
             decreciente = true;
            }
        }
        if(creciente == true && decreciente == false){  
            System.out.println("es creciente");  
        }
        else if (creciente==false && decreciente==true){
            System.out.println("es decreciente");  
         }  
        else if(creciente== true && decreciente==true){
            System.out.println("esta en desordenado");  
        }
        else if (creciente==false && decreciente== false){
            System.out.println("son Iguales");  
        }    
   }   
}
