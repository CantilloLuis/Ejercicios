/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class Practica1 {


    public static void main(String[] args) {

    //int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor"));
    Scanner dato = new Scanner(System.in);

    int numero = dato.nextInt();

    System.out.println("Factorial de "+ numero + " es: " + factorial(numero));
        
        
    }
    
    public static double factorial(int numero){
        
    double factorial = 1;
    
    for(int i = 1; i<=numero;i++){
        
        factorial = factorial * i;
    
        
    }
    
    return factorial;
    
    
    
    }
    
    
      

    }



    

