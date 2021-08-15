/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

import javax.swing.JOptionPane;

public class CuentaAhorro extends Cuenta{
    

    public CuentaAhorro(double saldo) {
        super(saldo);
       
    }
        
    
    public void CalcularInteres(){
        double x = Double.parseDouble(JOptionPane.showInputDialog(null,"Diga cual es el interes: "));
       double interes = saldo * x;
        JOptionPane.showMessageDialog(null, "El interes es de: " + interes);
    }

}
