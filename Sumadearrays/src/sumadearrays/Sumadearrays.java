/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumadearrays;

import java.util.Scanner;


public class Sumadearrays {

       public static void main(String[] args) {
     Scanner dato = new Scanner(System.in);
        int a[],b[],c[];
        
        a = new int [5];
        b = new int [5];
        c = new int [10];
        
        System.out.println("Primer vector");
        for(int i=0;i<5;i++){
            System.out.print("Ingrese el numero por favor: " );
            a[i]= dato.nextInt();
        }
        System.out.println("Segundo vector");
        for(int i=0;i<5;i++){
            System.out.print("Ingrese numero por favor: ");
            b[i] = dato.nextInt();
        }
       
        int j = 0;
        for (int i=0;i<5;i++){
          c[j] = a[i];
          j++;
          c[j] = b[i];
          j++;
        }
        for(int i=0;i<10;i++){
            System.out.println(c[i]);
        }
    }
}