/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LauraMar
 */
public class Cajeromain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double d;
        Cuenta c = new Cuenta(0.0);
        CuentaCorriente cc = new CuentaCorriente(0.0,0.0);
        CuentaAhorro ca = new CuentaAhorro(0.0);
       String op; 
        do {
          op = JOptionPane.showInputDialog(null,"Seleccione una opción"
                  ,"Banco Cedesarrollo",JOptionPane.QUESTION_MESSAGE,null
                  ,new String[]{"Cuenta corriente","Cuenta de ahorro","Salir"},0).toString();
      switch(op)
      {
          case "Cuenta corriente": 
              int opcion = Integer.parseInt(JOptionPane.showInputDialog("1) Consulta de saldo\n"
                      + "2) Deposito\n"
                      + "3) Retiro\n"
                      + "4) Interes\n"
                      + "0) Salir"));
            switch (opcion) {
                case 1: // Consultar saldo
                    JOptionPane.showMessageDialog(null, "* CONSULTA DE SALDO *");
                    JOptionPane.showMessageDialog(null, "El saldo de la cuenta es: " + c.GetSaldo());
                    break;
                case 2: // Hacer un deposito
                    JOptionPane.showMessageDialog(null, "* DEPOSITAR EN LA CUENTA *");
                    d = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad a depositar: "));
                    c.SetDeposita(d);
                    break;
                case 3: // Hacer un retiro
                    JOptionPane.showMessageDialog(null, "* RETIRAR DE LA CUENTA *");
                    d = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad a retirar:"));
                    c.SetRetira(d);
                    break;
                case 4: 
                    JOptionPane.showMessageDialog(null,"* INTERES *");
                    cc.CalcularInteres();
                    break; 
                case 0:
                    JOptionPane.showMessageDialog(null, "* Gracias por utilizar nuestros servicios *");
            } //COrchete final para la cuenta corriente//
          case "Cuenta de ahorro":
              int opcion1 = Integer.parseInt(JOptionPane.showInputDialog("1) Consulta de saldo\n"
                      + "2) Deposito\n"
                      + "3) Retiro\n"
                      + "4) Interes\n"
                      + "0) Salir"));
            switch (opcion1) {
                case 1: // Consultar saldo
                    JOptionPane.showMessageDialog(null, "* CONSULTA DE SALDO *");
                    JOptionPane.showMessageDialog(null, "El saldo de la cuenta es: " + c.GetSaldo());
                    break;
                case 2: // Hacer un deposito
                    JOptionPane.showMessageDialog(null, "* DEPOSITAR EN LA CUENTA *");
                    d = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad a depositar: "));
                    c.SetDeposita(d);
                    break;
                case 3: // Hacer un retiro
                    JOptionPane.showMessageDialog(null, "* RETIRAR DE LA CUENTA *");
                    d = Integer.parseInt(JOptionPane.showInputDialog("Escriba la cantidad a retirar:"));
                    c.SetRetira(d);
                    break;
                case 4: 
                    JOptionPane.showMessageDialog(null,"* INTERES *");
                    ca.CalcularInteres();
                    break; 
                case 0:
                    JOptionPane.showMessageDialog(null, "* Gracias por utilizar nuestros servicios *");
            }             
              break; 
          case "Salir": 
              JOptionPane.showMessageDialog(null,"Gracias por visitar el cajero de Cedesarrollo"
                      ,"Vuelva pronto",JOptionPane.WARNING_MESSAGE);
              
      } //Corchete del switch//
              

        } while (!op.equalsIgnoreCase("Salir"));
    }
    
}
