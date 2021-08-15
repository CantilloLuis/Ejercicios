/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1_ejercicio2;
                                  //Autor:Luis Eduardo Cantillo Zapateiro.
import javax.swing.JOptionPane;


public class Programacion1_ejercicio2 {

    
    public static void main(String[] args) {
       
           //Entrada
        int sueldo,venta1,venta2,venta3,ventacomision1,comisiontotal;
        int ventacomision2,ventacomision3,total,Dato=1;
        
           
          //Proceso
      
        while(Dato != 0){    
        sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese sueldo"
              + " base del empleado por favor:"));
       
       venta1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor"
                + " de su primera venta en la semana por favor:"));
        
       venta2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor"
                + " de su segunda venta en la semana por favor:"));
       venta3 = Integer.parseInt(JOptionPane.showInputDialog("Ingre el valor de"
                + " sus tercera venta en la semana por favor"));
       
        ventacomision1 = (int) (venta1 * 0.10);
        ventacomision2 = (int) (venta2 * 0.10);
        ventacomision3 = (int) (venta3 * 0.10);
        comisiontotal = (ventacomision1 + ventacomision2 + ventacomision3);
        total = (comisiontotal + sueldo);
        
          //salidas
        System.out.print("\nEn la semana por concepto de "
                + "comision obtendras " + comisiontotal + " pesos ");
        
        System.out.println("\nEl total de ganancia que obtendra incluyendo "
                + "comisiones sobre las ventas y el sueldo"
                + " base sera de: " + total + " pesos ");
        
        Dato = Integer.parseInt(JOptionPane.showInputDialog("Desea calcular "
               + "Saldo total de otro empleado Introdusca 1 o si no desea "
                + "calcular introdusca 0 para salir"));
        }
    }
    
}
