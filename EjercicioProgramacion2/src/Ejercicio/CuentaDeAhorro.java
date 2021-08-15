/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;

/**
 *
 * @author Cantillo
 */
public class CuentaDeAhorro {
    
  private  double tasaInteresAnual;
  private double saldoAhorros;
    
  public double getSaldoAhorro(){

       return saldoAhorros;
   
  }
  
  public CuentaDeAhorro(double saldoahorro){
  
      this.saldoAhorros = saldoahorro;
 
  }
  
  public double calcularInteresMensual(){
  
  double InteresMensual = ((saldoAhorros * tasaInteresAnual)/12);
  
    return InteresMensual;

  }
  
  
  public void modificarTasaInteres(double tasainteres){
  
    this.tasaInteresAnual = tasainteres;
  }
  
}
