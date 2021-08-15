/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion1_ejercicio3;
                                //Autor:Luis Eduardo Cantillo Zapateiro.
import javax.swing.JOptionPane;


public class Programacion1_ejercicio3 {

   
    public static void main(String[] args) {

        int horastrabajadas,ganancia,ganancia2,ganancia3,Nhoras,gananciatotal;
        int Dato=1;
        while (Dato != 0) {
 
        horastrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese"
            + " el numero de horas trabajadas por el obrero por favor: "));

        if (horastrabajadas <= 40){
          ganancia = (int) (horastrabajadas * 20000);
          System.out.print("\nEl salario del obrero con las " + horastrabajadas + 
                " horas es de " + ganancia + " pesos ");
        }
        else if (horastrabajadas > 40) {
            Nhoras = (horastrabajadas - 40);
            ganancia2 = (int) (40 * 20000);
            ganancia3 = (int) (Nhoras * 25000);
            gananciatotal = (ganancia2 + ganancia3);
            System.out.print("\nEl salario del obrero con las " + horastrabajadas + 
                " horas es de " + gananciatotal + " pesos ");
            }
        Dato = Integer.parseInt(JOptionPane.showInputDialog("\nDesea calcular "
                + "salario a otro obrero, introdusca 1 o sino "
                + " quiere introdusca 0"));
        }
    }
    
}
