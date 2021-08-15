
package Poo;


public class Parametrosyargumentos {
    
    int suma,resta,multiplicacion;
    float division;
    
    
    public void sumar(int numero1, int numero2){
     suma = numero1 + numero2;    
        
    }
    
   public void restar(int numero1, int numero2){
       
     resta = numero1 - numero2;
       
   } 
   
   public void multiplicar(int numero1, int numero2){
      
       multiplicacion = numero1 * numero2;
       
   }
   
   public void dividir(int numero1, int numero2){
       
       division = (float) numero1 / numero2;
   }
    
    public void imprimir(){
        System.out.print("\nLa suma es: "+ suma);
        System.out.print("\nLa resta es: "+ resta);
        System.out.print("\nLa multiplicacion es: "+ multiplicacion);
        System.out.print("\nLa division es: "+ division);
        
    }
    
    
}
