


package Retornodevalores;


public class Operaciones {
   
    public int sumar(int numero1, int numero2){
        
     int suma = numero1 + numero2;   
        return suma;
    }
    
    
    public int restar(int numero1, int numero2){
      int resta = numero1 - numero2;
      return resta;
        
    }
    
    public int multiplicar(int numero1, int numero2){
        
      int multiplicacion = numero1 * numero2;
      return multiplicacion;
        
    } 
    
    
    public float division(int numero1, int numero2){
        
        float division = (float) numero1 / numero2;
        return division;
       
    }
    
    public void imprimir(int suma,int resta, int multiplicacion, float division) {
        
      System.out.print("\nLa suma es: "+ suma);
      System.out.print("\nLa resta es: "+ resta);
      System.out.print("\nLa multiplicacion es: "+ multiplicacion);
      System.out.print("\nLa division es: "+ division);
        
    }
    
    
    
    
    
    
    
}

