/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysencontrarnumeroejemplo2;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Arraysencontrarnumeroejemplo2 {

   
    public static void main(String[] args) {
        
    Scanner data = new Scanner (System.in);
    int arrays[],dato,nelementos;
    boolean band=false;
    
    nelementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numeros que contendra el arrays"));
    arrays = new int [nelementos];
    
    for(int i=0;i<nelementos;i++){
       System.out.print("Ingrese los numeros:");
       arrays[i]= data.nextInt();
    }
    System.out.print("El arreglo que has creado es: ");
    for(int i=0;i<nelementos;i++){
       System.out.print(arrays[i]);
    }
    JOptionPane.showMessageDialog(null,"ahora buscaremos el numero en el arreglo si es que esta.");
    dato= Integer.parseInt(JOptionPane.showInputDialog("Ingesa el numero a buscar"));
    int i=0;
    while(i<nelementos && band== false){
        if (arrays[i]==dato){   
           band=true;
        }
        i++;
    }
    if (band==true){
        System.out.print("\nEl numero fue encontrado en la posicion: "+ (i-1));
    }      
    else if (band==false){
      System.out.print("\nEl numero no fue encontrado lo siento.");  
    }
  }
    
}
