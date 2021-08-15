


package POO;

import javax.swing.JOptionPane;


public class Cajero {
    
    private int saldo;
    
    public Cajero(int saldo){
    
    this.saldo=saldo;
    
    }
    
    public void setañadirsaldo(int d){
     
     if (d < 0){
     
         JOptionPane.showMessageDialog(null, " No puede ingresar valores negativos intente de nuevo");
         
       return;  
     }
     this.saldo+=d;
     JOptionPane.showMessageDialog(null, "Su nuevo saldo es: "+ saldo);

    }
    
    public void setretirosaldo(int f){
      
        if (f > saldo){
        
         JOptionPane.showMessageDialog(null," Ingrese un valor menor a lo almacenado en la cuenta.");
                 
         return;        
      
        }

        this.saldo-=f;
        JOptionPane.showMessageDialog(null," El saldo actual es de: " + saldo);

   }
    
    public int getsaldo(){
        return saldo;
    }

    
}
