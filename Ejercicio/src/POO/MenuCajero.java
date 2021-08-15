

package POO;

import javax.swing.JOptionPane;


public class MenuCajero {
    
   public static void main(String [] args ) {
   
    Cajero op = new Cajero(0);
    
    int d,f,opcion=-1;
    
    do{
    
        opcion= Integer.parseInt(JOptionPane.showInputDialog("========Bienvenidos al menu cajero======== \nSelecciones la opcion a consultar por favor \n"
                + "1. Si desea consultar saldo actual. \n" 
                + "2. Si desea agregar saldo. \n " +
                  "3. Si desea retir saldo. \n "+
                  "4. salir. "));
        
        
        switch(opcion){
            case 1:
                JOptionPane.showMessageDialog(null,"El saldo actual es: " + op.getsaldo());
                break;
            case 2: 
                d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el salo a agregar: "));
                op.setañadirsaldo(d);
                break;
            case 3:
                f = Integer.parseInt(JOptionPane.showInputDialog(" Ingrese el monto a retirar: "));
                op.setretirosaldo(f);
                break;
            case 4:
                break;
        }
    
    
    }while(opcion != 7);
    
   }
  
 }
    
    
    
    

