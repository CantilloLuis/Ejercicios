
package Modelo;


    public class Administrador extends Usuario{
        
    private String rh;
    private String user;
    private String password;

    public Administrador() {
        super(null, null, null, null, null, null);
    }

    public Administrador(String rh, String nombre, String apellido, String Tp_Id, String id, String telefono, String Dir) {
        super(nombre, apellido, Tp_Id, id, telefono, Dir);
        this.rh = rh;
    }

    public Administrador(String rh, String user, String password) {
        this.rh = rh;
        this.user = user;
        this.password = password;
    }

    public Administrador(String rh, String user, String password, String nombre, String apellido, String Tp_Id, String id, String telefono, String Dir) {
        super(nombre, apellido, Tp_Id, id, telefono, Dir);
        this.rh = rh;
        this.user = user;
        this.password = password;
    }
     
   
    
    

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
