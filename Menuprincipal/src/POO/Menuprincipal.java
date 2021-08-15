/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import javax.swing.JOptionPane;

public class Menuprincipal {
    

public static void main(String [] args){
    
    int opcion = 0;
    do{
    
        opcion = Integer.parseInt(JOptionPane.showInputDialog("======= Menu Principal =====\n"+"Ingrese 1, para menu de administrador \n"+
            "Ingrese 2, para menu de operador por favor \n"+
            "Ingrese 3, para salir por favor"));
        
        if (opcion == 1){
            
            Menuadministrador dato = new Menuadministrador();
            dato.menuadministrador();
            
        }
        else if (opcion == 2){
            
           Menuoperador dato1 = new Menuoperador();
           dato1.menuoperador();
        }
        else if (opcion == 3){
            JOptionPane.showMessageDialog(null,"Gracias por visitar nuestro programa");
        }
      
    }while(opcion != 3);
    
    }   
}    
    
    
    
    
    
    
    
    
