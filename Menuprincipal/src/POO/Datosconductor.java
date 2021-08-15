/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

import javax.swing.JOptionPane;



public class Datosconductor {
    
    private String nombre;
    private String  horaentrada;
    private String placa;
    private String horasalida;
    
    
    public Datosconductor(String nombre,String placa, String horaentrada){
    
     this.nombre = nombre;
     this.placa = placa;
     this.horaentrada = horaentrada;
     
    }

    
    public String getnombre(){
        
        return nombre;

    }
    public String gethoraentrada(){
        return horaentrada;
    }
    
    public String getplaca(){
        return placa;
    }
    public String gethorasalida(){
    
    return horasalida;
    }
    
    public void sethorasalida( String horasalida){
         
        this.horasalida = horasalida;
    }
    
    
    public void imformacion(){
        
     JOptionPane.showMessageDialog(null,"El nombre del conductor es: "+nombre+"\n"+
     "La placa es:" + placa+ "\n"+
     "La hora de entrada es: " + horaentrada+"\n"+
     "La hora de salida es: " + horasalida + "\n");
        
    }
    
    
}
