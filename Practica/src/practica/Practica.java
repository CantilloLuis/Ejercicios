
package practica;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;


public class Practica {

  
public static void main(String [] args) throws Exception{
    
    String rutaKtronix = "https://www.ktronix.com/computadores-tablets/computadores-portatiles/c/BI_104_KTRON";
    URL url = new URL(rutaKtronix);
    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
    String codigoFuente = "";
    String linea;
    while((linea = reader.readLine()) != null){
       codigoFuente = codigoFuente + linea;
    }
    reader.close();
    //System.out.println(codigoFuente);
    //use indexOf, substring y length
    //System.out.println(codigoFuente.substring(12777,12782));
    //System.out.println(codigoFuente.substring(12777, 12904));
  
         //System.out.println(codigoFuente.indexOf(": ((String('"));
         //System.out.println(codigoFuente);
        String s = "n";

        for( int i=0; i < codigoFuente.length() ; i++){
            if (s == "n" ){
                System.out.println("s");
            
            }    
            
            
            
            
            
            
            
            
            
    }
    
    
    }

 
}
        
 
    

