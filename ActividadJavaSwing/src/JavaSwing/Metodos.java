

package JavaSwing;




public class Metodos {

    public double getResultado() {
        return Resultado;
    }

    public double getVuelto_A_Regresar() {
        return Vuelto_A_Regresar;
    }
    
    double Resultado,Precio,Vuelto_A_Regresar;
    public double CalcularPrecioFinal(String Tipo, int Cantidad_Producto){
       
        
        if (Tipo == "Capuchino"){
            Precio = 1;
            Resultado = Precio * Cantidad_Producto;
            return Resultado;
        }     
        else if (Tipo == "Latte"){
            Precio = 1.5;
            Resultado = Precio * Cantidad_Producto;
            return Resultado;
        }       
        else if (Tipo == "Moca"){
            Precio = 2;
            Resultado = Precio * Cantidad_Producto;
            return Resultado;
        
        }
        else if (Tipo == "Coke"){
            Precio = 2;
            Resultado = Precio * Cantidad_Producto;
            return Resultado;
        }
        else if (Tipo == "Fanta"){
            Precio = 1;
            Resultado = Precio * Cantidad_Producto;
            return Resultado;
        }
        else if (Tipo == "Sprite"){
            Precio = 1.5;
            Resultado = Precio * Cantidad_Producto;
            return Resultado;
        
        }
        else if (Tipo == "Cake"){
            Precio = 3;
            Resultado = Precio * Cantidad_Producto;
            return Resultado;
        
        }
        else if (Tipo == "Pie"){
            Precio = 5;
            Resultado = Precio * Cantidad_Producto;
            return Resultado;
        }
        else if (Tipo == "Brownies"){
            Precio = 4;
            Resultado = Precio * Cantidad_Producto;
            return Resultado;
        }
        return Resultado;
    }
    
     
    
    
    
    public double ValorDeVuelto(double Valor_A_Dar){
    
       Vuelto_A_Regresar =  Valor_A_Dar - Resultado;
        return Vuelto_A_Regresar;
    
    
    }
    
}
