
package cajero;

import javax.swing.JOptionPane;


public class Prueba 
{
    public static void main(String[] args)
    {
      int op = JOptionPane.showOptionDialog(null,"Seleccione su tipo de cuenta"
              ,"Banco Cedesarrollo",JOptionPane.YES_NO_CANCEL_OPTION
              ,JOptionPane.PLAIN_MESSAGE, null,new String[]{"Cuenta corriente"
                      ,"Cuenta de ahorro","Salir"},0);
      
        
    }
    
}
