/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import javax.swing.JOptionPane;

public class Menuoperador {

    
   public void menuoperador(){
        int opc = 0;
        Parqueadero op = new Parqueadero();
        do{
          opc = Integer.parseInt(JOptionPane.showInputDialog("==== Menu operador ==== \n"+"Ingrese 1, para registro de vehiculo \n"+
                  "Ingrese 2, para la salida del vehiculo \n"+
                  "Ingrese 3, para mostrar vehiculos estacionados \n"+
                  "Ingrese 4, para regresar al menu principal "));
          
        switch(opc){

            case 1:  
                 op.entradaauto();
                  break;
            case 2:
                op.salidaauto();
                 break;
                 
            case 3:
                op.imprimirvehiculos();
                break;
                
            default:
                break;
          }
   
       }while(opc != 4);
    
    
    
    
    
    
    
}
}
