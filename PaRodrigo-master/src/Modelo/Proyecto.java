
package Modelo;


public class Proyecto {
    
    private String tipoMueble;
    private String opcTipoMueble;
    private String tipoMadera;
    private String cantidadMadera;
    private String tipoCuero;
    private String cantidadCuero;
    private String tipoPintura;
    private String color;
    private String CantidadPintura;
    private String duracion;
    private String CantidadTrabajadores;
    private Cliente cliente;
    private double costo;

    public Proyecto(String tipoMueble, String opcTipoMueble, String tipoMadera, String cantidadMadera, String tipoCuero, String cantidadCuero, String tipoPintura, String color, String CantidadPintura, String duracion, String CantidadTrabajadores, Cliente cliente, double costo) {
        this.tipoMueble = tipoMueble;
        this.opcTipoMueble = opcTipoMueble;
        this.tipoMadera = tipoMadera;
        this.cantidadMadera = cantidadMadera;
        this.tipoCuero = tipoCuero;
        this.cantidadCuero = cantidadCuero;
        this.tipoPintura = tipoPintura;
        this.color = color;
        this.CantidadPintura = CantidadPintura;
        this.duracion = duracion;
        this.CantidadTrabajadores = CantidadTrabajadores;
        this.cliente = cliente;
        this.costo = costo;
    }




    public String getOpcTipoMueble() {
        return opcTipoMueble;
    }

    public void setOpcTipoMueble(String opcTipoMueble) {
        this.opcTipoMueble = opcTipoMueble;
    }

    
    public Proyecto() {
    }

    public String getTipoMueble() {
        return tipoMueble;
    }

    public void setTipoMueble(String tipoMueble) {
        this.tipoMueble = tipoMueble;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public String getCantidadMadera() {
        return cantidadMadera;
    }

    public void setCantidadMadera(String cantidadMadera) {
        this.cantidadMadera = cantidadMadera;
    }

    public String getTipoCuero() {
        return tipoCuero;
    }

    public void setTipoCuero(String tipoCuero) {
        this.tipoCuero = tipoCuero;
    }

    public String getCantidadCuero() {
        return cantidadCuero;
    }

    public void setCantidadCuero(String cantidadCuero) {
        this.cantidadCuero = cantidadCuero;
    }

    public String getTipoPintura() {
        return tipoPintura;
    }

    public void setTipoPintura(String tipoPintura) {
        this.tipoPintura = tipoPintura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCantidadPintura() {
        return CantidadPintura;
    }

    public void setCantidadPintura(String CantidadPintura) {
        this.CantidadPintura = CantidadPintura;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getCantidadTrabajadores() {
        return CantidadTrabajadores;
    }

    public void setCantidadTrabajadores(String CantidadTrabajadores) {
        this.CantidadTrabajadores = CantidadTrabajadores;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
}
