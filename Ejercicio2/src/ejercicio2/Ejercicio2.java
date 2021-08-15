

package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

   
    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);
        boolean creciente=false,decreciente=true;
        int arrays[] = new int [5];
        
        for(int i=0;i<arrays.length;i++){
          System.out.print((i+1)+". Ingrese datos: ");
          arrays[i]= dato.nextInt();
          
        }
        
        for(int i=0; i<(arrays.length)-1;i++){
          if (arrays[i] < arrays[i+1]){
              
          creciente=true;
          
          }
          
          if (arrays[i] > arrays[i+1]){
              
            decreciente = false;
            
          }
   
        }
        if (creciente== true){
        
        System.out.print("El arreglo esta creciente");
      
        }
       
        
        else if (decreciente==false){
        
        System.out.print("El arreglo esta de forma decreciente");
        
        
        }
        
        
        
       




    }
    
}
