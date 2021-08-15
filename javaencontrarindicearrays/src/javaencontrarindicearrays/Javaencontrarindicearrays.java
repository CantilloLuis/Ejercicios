/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaencontrarindicearrays;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Javaencontrarindicearrays {

  
public static void main(String[] args) {

    Scanner dato = new Scanner (System.in);
    int arrays[] = {1,2,3,4,5};
    int datos;
    boolean band = false;
    
    datos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa numero a enco"
            + "ntrar en el arrays"));
    int i=0;
    while(i<5 && band==false){
        if (arrays[i]==datos){
          band=true;
        }
        i++;
    }
    if(band==true){
        JOptionPane.showMessageDialog(null,"Se econtro el numero "
     + "solicitado en el lugar "+ (i-1));
    } 
    else if(band==false){
      JOptionPane.showMessageDialog(null,"No se encontro el numero indicado");
    }     
    
  }
}

