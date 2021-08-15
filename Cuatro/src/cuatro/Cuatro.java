/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuatro;

import javax.swing.JOptionPane;



public class Cuatro {


    
    public static void main(String[] args) {

    int dato, arrays[] = {1,2,3,4,5};
    boolean game = false;
    dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero por "
            + "favor a buscar en el arrays:"));
    int i=0;
    while(i<5 && game == false){
        
        if (arrays[i]== dato){
           game=true; 
       }
       i++; 
    }  
    if (game == true){
       System.out.print("El numero fue encontrada en la posicion de: " + (i-1));
    }
    if (game == false){
        System.out.print("El numero no fue encontrado");
    }
    }
    
}
