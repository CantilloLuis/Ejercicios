/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Usuario {

    private String nombre;
    private String apellido;
    private String Tp_Id;
    private String id;
    private String telefono;
    private String Dir;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String Tp_Id, String id, String telefono, String Dir) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Tp_Id = Tp_Id;
        this.id = id;
        this.telefono = telefono;
        this.Dir = Dir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTp_Id() {
        return Tp_Id;
    }

    public void setTp_Id(String Tp_Id) {
        this.Tp_Id = Tp_Id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDir() {
        return Dir;
    }

    public void setDir(String Dir) {
        this.Dir = Dir;
    }



}
