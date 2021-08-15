

package ejercicio6;

import java.util.Scanner;
 


public class Ejercicio6 {

   
    
    public static void main(String[] args) {

            Scanner dato = new Scanner(System.in);
            int matrix[][] = new int [2][2];
            
            
         
            for(int i=0; i<matrix.length;i++){
                for(int j=0; j<matrix.length;j++){
                   System.out.print((i+1)+".["+i+"]["+j+"] = ");
                   matrix[i][j]= dato.nextInt();
                }
            }
         
            System.out.println("Matrix normal");
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix.length;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println("");
            }
            for(int i=0; i<matrix.length;i++){
                int sumafil=0;
                for(int j=0;j<matrix.length;j++){
                   sumafil+=matrix[i][j];
        
                }System.out.println(" La suma en la fila ["+i+"] es: "+sumafil);
                
           }
           System.out.print("");
        
            for(int j=0;j<matrix.length;j++){
               int sumacol=0;
               for(int i=0;i<matrix.length;i++){
                   sumacol+=matrix[i][j];
               
               
               }System.out.println(" La suma de la columna ["+j+"] es: "+sumacol);
             
            }
            System.out.print("");
            
    }
    
}
