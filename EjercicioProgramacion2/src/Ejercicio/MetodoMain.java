/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author Cantillo
 */
public class MetodoMain {
    public static void main(String[] args){
        
    double SaldoAhorrador1,SaldoAhorrador2,InteresMensual;
    CuentaDeAhorro ahorrador1 = new CuentaDeAhorro(2000.00);
    CuentaDeAhorro ahorrador2 = new CuentaDeAhorro(3000.00);
    
    ahorrador1.modificarTasaInteres(4.0);
    
    SaldoAhorrador1 = ahorrador1.getSaldoAhorro();
    InteresMensual = (ahorrador1.calcularInteresMensual());
    JOptionPane.showMessageDialog(null, " El interés generado por el ahorrador1 en el primer mes \n con la tasa anual del 4% es de: " + InteresMensual);
    JOptionPane.showMessageDialog(null, " Su saldo ahora es de: "+ (SaldoAhorrador1 + InteresMensual)+" Pesos ");
    //SaldoAhorrador1+=InteresMensual;
    
    ahorrador2.modificarTasaInteres(4.0);
    
    SaldoAhorrador2 = ahorrador2.getSaldoAhorro();
    InteresMensual = ahorrador2.calcularInteresMensual();
    JOptionPane.showMessageDialog(null, " El interés generado por el ahorrador2 en el primer mes \n con la tasa anual del 4% es de: " + InteresMensual);
    JOptionPane.showMessageDialog(null, " Su saldo ahora es de: "+ (SaldoAhorrador2 + InteresMensual)+" Pesos ");
    //SaldoAhorrador2+=InteresMensual;

    
    ahorrador1.modificarTasaInteres(5.0);
    
    InteresMensual = ahorrador1.calcularInteresMensual();
    JOptionPane.showMessageDialog(null, " El interés generado por el ahorrador1 en el siguiente mes \n con la tasa anual del 5% es de: " + InteresMensual);
    JOptionPane.showMessageDialog(null, " Su saldo ahora es de: "+ (SaldoAhorrador1 + InteresMensual) + " Pesos ");
    
    ahorrador2.modificarTasaInteres(5.0);
    
    InteresMensual = ahorrador2.calcularInteresMensual();
    JOptionPane.showMessageDialog(null, " El interés generado por el ahorrador2 en el siguiente \n con la tasa anual del 5% es de: " + InteresMensual);
    JOptionPane.showMessageDialog(null, " Su saldo ahora es de: "+ (SaldoAhorrador2 + InteresMensual) + " Pesos ");
    
    
    }
}     