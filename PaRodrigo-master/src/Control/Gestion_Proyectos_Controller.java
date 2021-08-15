
package Control;

import java.util.ArrayList;
import Modelo.Proyecto;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;


public class Gestion_Proyectos_Controller {
    
    ArrayList<Proyecto> listaProyectos = new ArrayList<>();
    
    public void addProject(Proyecto p){
        listaProyectos.add(p);
    }
    
    public void removeProject(Proyecto p){
        listaProyectos.remove(p);
    }
    

    public Proyecto BuscarID_PersonaProyecto(String identify){
        for(Proyecto x :listaProyectos ){
            if(x.getCliente().getId().matches(identify)){
                return x; 
            }
        }
        return null;
    }
    
    
    public ArrayList<Proyecto> ID_Projects( String identify ){
       return((ArrayList<Proyecto>) listaProyectos.stream().filter(p -> p.getCliente().getId().equals(identify) )
         .collect(Collectors.toList())) ;
    }
    
    
    public int PosProyecto(String id ){
        int pos = 0;
        for(Proyecto x:listaProyectos){
            if(x.getCliente().getId().equals(id)){
                return pos;
            }
        pos++;    
        }
        JOptionPane.showMessageDialog(null, "No Hay Elementos En El Array","ERROR 404",JOptionPane.ERROR_MESSAGE);
        return pos;
    }

    

    public ArrayList<Proyecto> getAllRecurse(){
        return listaProyectos;
    }
    

        
        
        
}
