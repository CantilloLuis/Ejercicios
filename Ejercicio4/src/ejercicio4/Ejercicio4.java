

package ejercicio4;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class Ejercicio4 {

   
    public static void main(String[] args) {

      Scanner dato = new Scanner(System.in);
      boolean luz = false;
      int arrays[] =  new int [5];
      int datos;
      
      for(int i=0; i<arrays.length;i++){
      System.out.print((i+1)+". Ingrese los datos: ");
      arrays[i]= dato.nextInt();
   
      }
      
      System.out.print("Ingrese dato a buscar: ");
      datos = dato.nextInt();
      
      int i=0;
      while( i < arrays.length && luz ==false) {
        if (arrays[i] == datos){
       
          luz = true;  
        }
        i++;
       
      }
        if (luz == true){
        System.out.print("El dato fue encontrado en la posicion: "+ (i-1));
  
        }
        else if (luz== false){
            
            System.out.print("El dato no fue encontrado");   
        }
    }
 }

