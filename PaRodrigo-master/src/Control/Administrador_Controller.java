
package Control;

import java.util.ArrayList;
import Modelo.Administrador;

public class Administrador_Controller {
    
    private ArrayList<Administrador> listaAdmin = new ArrayList<>();
   
    public Administrador_Controller() {
    }

    public void AddAdmin(Administrador a){
        listaAdmin.add(a);
    }
    
    public void RemoveAdmin(Administrador a){
        listaAdmin.remove(a);
    }

    public ArrayList<Administrador> getListaAdmin() {
        return listaAdmin;
    }

    public void setListaAdmin(ArrayList<Administrador> listaAdmin) {
        this.listaAdmin = listaAdmin;
    }
    
    public Administrador ConsultarUserAdmin(String user){
        for(Administrador x:listaAdmin){
            if(x.getUser().equalsIgnoreCase(user)){
                return x;
            }
        }
        return null;
    }
    
    
    
    
    
}
