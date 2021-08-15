/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import javax.swing.JOptionPane;


public class Menuadministrador {
    
    public void menuadministrador(){
        
    Parqueadero op7 = new Parqueadero();
    int opcion = 0;
    do{
    
     opcion = Integer.parseInt(JOptionPane.showInputDialog("==== Menu administrado ====\n"+"Ingrese 1, para la disponibilidad de cupos actual \n"+
             "Ingrese 2, para modificar tarifa por hora \n"+
             "Ingrese 3, para Modificar cupos del parqueo \n"+
             "Ingrese 4, para mostrar facturas \n"+
             "Ingrese 5, para regresar a menu principal"));
    
    
    switch(opcion){
        
        case 1: 
            
        case 2:
            
        case 3:
            
        case 4:
            op7.imprimirvehiculos();
             break;
        default :
            break;
          
    }
    
    }while(opcion != 5);
    
    }
}