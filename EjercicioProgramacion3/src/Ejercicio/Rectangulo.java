/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author Cantillo
 */
public class Rectangulo {
  
   private double longitud=1;
   private double ancho=1;
   
    public Rectangulo(double longitud, double ancho){
        
        this.longitud= longitud;
        this.ancho=ancho;
    }    
    
    
    public void AreaRectangulo(){
    
       double area = longitud*ancho;
       JOptionPane.showMessageDialog(null,"El area del rectangulo con longitud "+ longitud + " y ancho de "+ ancho + " es de : "+ area + " m² ");

    }
    public void PerimetroRectangulo(){

       double perimetro = (longitud*2)+ (ancho*2);
       JOptionPane.showMessageDialog(null, "El perimetro del rectangulo con longitud de "+ longitud + " y con un ancho de "+ ancho + " es de "+ perimetro + " m ");
    } 
    
    public double getLongitud(){
       return longitud;
    }
    
    public void setLongitud(double longitud){
     if (longitud > 0.0 && longitud < 20.0){
        this.longitud=longitud;
     }
     else{
     
     JOptionPane.showMessageDialog(null," Ingrese valor de la longitud dentro del rango establecido: ");
     }
    }

    public double getAncho() {
        return ancho;
    }
 
    public void setAncho(double ancho) {
        if (ancho > 0.0 && ancho <20.0){
           this.ancho = ancho;
        }
        else{
       JOptionPane.showMessageDialog(null," Ingrese valor del ancho dentro del rango establecido: "); 
      
        }
     }
  }
