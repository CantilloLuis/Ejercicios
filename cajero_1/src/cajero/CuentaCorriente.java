/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import javax.swing.JOptionPane;

/**
 *
 * @author docente
 */
public class CuentaCorriente extends Cuenta{
    double interes;
    public CuentaCorriente(double saldo,double interes) {
        super(saldo);
        this.interes=interes;
    }
    
    public void CalcularInteres (){
        interes = saldo * 1.5;
        JOptionPane.showMessageDialog(null,"su interes es de : "+interes);
        return;       
    }
    
}
