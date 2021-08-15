/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Cantillo
 */
public class MetodoMain {
    public static void main(String [] args){
        
         
    Rectangulo op = new Rectangulo(0.0,0.0);
    
    op.setAncho(7.4);
    op.setLongitud(10.5);
    
    if ((op.getAncho()> 0.0 && op.getAncho()<20.0) && (op.getLongitud()> 0.0 && op.getLongitud() < 20.0)){
        
    op.AreaRectangulo();
    op.PerimetroRectangulo();
    }
    
   }
}
