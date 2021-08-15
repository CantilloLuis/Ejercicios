/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion_ejercicio1;
                                //Autor:Luis Eduardo Cantillo Zapateiro.
import javax.swing.JOptionPane;


public class Programacion_ejercicio1 {

    public static void main(String[] args) {

   
          //Entrada
        int numeros,numero,sumatotalnumeros=0;
        int totalpar=0,totalimpar=0,totalpos=0,totalnega=0;
      
             //Proceso
         numeros= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la "
                + "cantidad total de numeros a introducir: "));
        int i=0; 
        while(i<numeros)
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese "
                 + "numero por favor: "));
            sumatotalnumeros+=numero;
            if ( numero == 0){
            JOptionPane.showMessageDialog(null,"El cero es numero neutro, "
                    + "introduce numeros mayores de cero y numeros "
                    + "menores de cero pero el cero no");
            }
            else {
                if(numero % 2 == 0)
                {
                  totalpar+=1;
                }
                if (numero % 2 != 0 )
                {
                  totalimpar+=1;
                }
                if (numero > 0)
                {
                totalpos+=1;
                }   
                if (numero < 0)
                {
                 totalnega+=1;
                }
                i++;
            }
        }  
          //Salida
        if (totalpar == 0){
          System.out.print("\nNo hay numeros pares: "+ totalpar);
        }
        else{   
           System.out.print("\nEl total de numeros pares "
               + "es: " + totalpar + " numeros. " );
        } 
        
        if (totalimpar == 0){
           System.out.print("\nNo hay numeros impares: " + totalimpar);  
        }
        else{
           System.out.print("\nEl total de numeros impares "
                   + "es de "+ totalimpar + " numeros. ");
        }
        if (totalpos == 0){
            System.out.print("\nNo hay numeros positivos: " + totalpos);
        }
        else{
            System.out.print("\nEl total de numeros positivos "
                    + " es de " + totalpos + " numeros. ");
        } 
        if (totalnega == 0){
            System.out.print("\nNo hay numeros negativos: " + totalnega);
        }
        else{
            System.out.print("\nEl total de numeros negativos "
                    + "es de " + totalnega + " numeros ");
        }
        System.out.println("\nLa suma de todos los numeros "
                + "ingresados es de " + sumatotalnumeros); 
    }   
}
