/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres;

import java.util.Scanner;

 
public class Tres {
 
    
    public static void main(String[] args) {

        int aux,arrays[];
        Scanner dato = new Scanner (System.in);
        arrays = new int [5];
        System.out.print("Ingrese datos al arrays\n");
        for (int i=0;i<arrays.length;i++){
            System.out.print( (i+1) + ". ");
            arrays[i]= dato.nextInt(); 
        }
        
        for(int i=0;i<4;i++){
            for(int j=0; j<4;j++){
                if (arrays[j]>arrays[j+1]){
                    aux=arrays[j];
                    arrays[j]=arrays[j+1];
                    arrays[j+1]=aux;
                }
                
            }
        }
        for(int i=0;i<5;i++){
            System.out.print("\n"+ (i+1) + ". "+ arrays[i]);
            
        }
    }
    
}
