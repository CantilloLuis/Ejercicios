/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import java.util.ArrayList;
import javax.swing.JOptionPane;

 

public class Parqueadero {
    
    Datosconductor op;
    private ArrayList<Datosconductor> autos = new ArrayList<>();
    int puntos,dato;

    public void entradaauto(){
     
     String Nombre;
     String placa;
     String Horaentrada;
     Nombre = JOptionPane.showInputDialog("Ingrese nombre del conductor: ");
     placa = JOptionPane.showInputDialog("Ingrese placa: ");
     Horaentrada = JOptionPane.showInputDialog("Ingrese la hora de entrada ");
     op = new Datosconductor(Nombre,placa,Horaentrada);
     autos.add(op);
     
    } 
    
  
    public void salidaauto(){
    //puntos =  (autos.size() == dato);
    String autoa_buscar;
    String horade_salida;
    
    autoa_buscar= JOptionPane.showInputDialog("Ingrese la placa del auto a salir por favor: ");
    horade_salida = JOptionPane.showInputDialog("Ingrese hora de salida por favor: ");
    op.sethorasalida(horade_salida);
    autos.remove(autoa_buscar.indexOf(autoa_buscar));
    
    }
    
    public void imprimirvehiculos(){
    String nombre;
    nombre = JOptionPane.showInputDialog("Ingrese Nombre del vehiculo a buscar: ");
    boolean encontrar = false;
    int i=0;
    while (encontrar == false && i<autos.size()){
        if(autos.get(i).getnombre().compareToIgnoreCase(nombre)==0){
             encontrar = true;
        }
        else{
          i++;}
    }
    if(encontrar== true){
        
    JOptionPane.showMessageDialog(null,"El nombre del conductor es: "+ autos.get(i).getnombre() +"\n"+
    "La placa es:" + autos.get(i).getplaca() + "\n"+
    "La hora de entrada es: " + autos.get(i).gethoraentrada());
    
    }
    else{
     JOptionPane.showMessageDialog(null, "no existe, intente nuevamente");
     
    }
    }
    
    
    
    
    
   }
  

