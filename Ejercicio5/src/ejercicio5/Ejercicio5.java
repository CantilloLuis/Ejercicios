
package ejercicio5;

import java.util.Scanner;



public class Ejercicio5 {

    
    public static void main(String[] args) {

        Scanner dato =new Scanner(System.in);
        int matrix[][]= new int [3][3];
        int aux;
        
        System.out.println("Ingrese los datos porfavor: ");
        for(int i=0; i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
              System.out.print((i+1)+". ["+i+"]["+j+"]= ");
              matrix[i][j]= dato.nextInt();
            }
        
        }
        System.out.println("\nMatrix normal: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix.length;j++){
              System.out.print(matrix[i][j]+" ");
            
            }
            System.out.println("");
        
        }
        
        for(int i=0;i<matrix.length;i++){
            for( int j=0; j<i;j++){
               aux = matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=aux;
            }
           }
        
        System.out.println("\nMatrix traspuesta ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println("");
        }
                
      }
        
    }
    

