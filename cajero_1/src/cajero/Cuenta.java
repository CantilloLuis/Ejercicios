/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import javax.swing.JOptionPane;

/**
 *
 * @author LauraMar
 */
public class Cuenta {
    
    protected double saldo;

        public Cuenta( double saldo ){
        this.saldo = saldo;
        } // fin del constructor

        public double GetSaldo(){
        return this.saldo;
        }

    public void SetDeposita( double d ){
        if ( d <= 0 ){
        JOptionPane.showMessageDialog(null,"No existen pesos negativos" );
        return;
        }
        this.saldo += d;
        JOptionPane.showMessageDialog(null,"El saldo de la cuenta es: " + this.saldo );
    }

    public void SetRetira( double r ){
        if ( r <= 0 ){
        JOptionPane.showMessageDialog(null, "No existen pesos negativos... no se hizo nada" );
        return;
    }
    if ( this.saldo < r ){
      JOptionPane.showMessageDialog(null,"La cantidad a retirar es mayor que el saldo disponible... no se hizo nada" );
        return;
        }
        this.saldo -= r;
        JOptionPane.showMessageDialog(null,"El saldo de la cuenta es: " + this.saldo );
    }

}
