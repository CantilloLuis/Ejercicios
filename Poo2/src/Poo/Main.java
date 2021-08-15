




package Poo;

import javax.swing.JOptionPane;


public class Main {
    
    
    public static void main(String [] args ){
     
        int nume1,nume2;
        nume1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero: "));
        nume2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero: "));
        
        Parametrosyargumentos op = new Parametrosyargumentos();
    
         op.sumar(nume1, nume2);
         op.restar(nume1, nume2);
         op.multiplicar(nume1, nume2);
         op.dividir(nume1, nume2);
         op.imprimir();
            
 
   } 
    
}
