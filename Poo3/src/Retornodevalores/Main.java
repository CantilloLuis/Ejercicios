

package Retornodevalores;

import javax.swing.JOptionPane;


public class Main {
    
     public static void main( String [] args){
     int nume1,nume2;
     
    nume1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero"));
    nume2= Integer.parseInt(JOptionPane.showInputDialog("Ingrese segundo numero"));
     
    Operaciones op = new Operaciones();
    
    int suma =  op.sumar(nume1, nume2);
    int resta = op.restar(nume1, nume2);
    int multiplicacion = op.multiplicar(nume1, nume2);
    float division = op.division(nume1, nume2);
    op.imprimir(suma, resta, multiplicacion, division);
     
    
 }  
    
    
}
