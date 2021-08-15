
package Control;

import java.util.ArrayList;
import Modelo.Cliente;

public class Cliente_Controller {
    
    ArrayList<Cliente> listaCliente = new ArrayList<>();
    
    public void addCliente(Cliente ct){
        listaCliente.add(ct);
    }
    
    public void RemoveCliente(Cliente ct){
        listaCliente.remove(ct);
    }
    
    public Cliente findCliente(String id){
        
        for(Cliente x:listaCliente){
            if(x.getId().matches(id)){
                return x;
            }
            System.out.println("No Se Ha Encontrado Un Cliente");
        }      
        return null;
    }

}
