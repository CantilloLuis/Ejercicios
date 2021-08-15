
package ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {

   
    public static void main(String[] args) {

        Scanner dato =new Scanner(System.in);
        int arrays[] = new int [10];
        int aux=0;
        for(int i=0; i<arrays.length;i++){
           System.out.print((i+1)+".  Ingrese los datos: ");
           arrays[i]= dato.nextInt();
            
        }

        for (int i=0; i<(arrays.length)-1; i++) {
            for(int j=0; j<(arrays.length)-1;j++){
        
                if (arrays[j] >  arrays[j+1]){
                   aux = arrays[j];
                   arrays[j]=arrays[j+1];
                   arrays[j+1]=aux;
                }
            }
        }
        System.out.print("Arrays Ordenado \n");
        for(int i=0;i<arrays.length;i++){
        
        System.out.println((i+1)+". "+ arrays[i]);
         
        }
             
    }
    
}
