/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;



public class POO {
     String Nombre, Apellido, Edad,Telefono;
    
    public POO(String Nombre, String Apellido, String Edad, String Telefono){
    this.Nombre=Nombre;
    this.Apellido=Apellido;
    this.Edad = Edad;
    this.Telefono=Telefono;
    }
    
    public String getNombre(){
    
    return Nombre;
    
    }
    
    public String getApellido(){
    
    return Apellido;
    
    }
    
    public String getEdad(){
    
    return Edad;
    }
    
    public String getTelefono(){
    
    return Telefono;
    
    }
}
