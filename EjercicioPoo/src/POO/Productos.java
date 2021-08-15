
//Autor: Luis Eduardo Cantillo Zapateiro.
package POO;
 

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Productos{
    
    private String nombre;
    private int precio;
    private int dias_caducar;
    private int cantidadproducto;
    private ArrayList<Productos>lista = new ArrayList<Productos>();
    private ArrayList<Productos> lista2 = new ArrayList<Productos>();
    private double resultado1,resultado2,resultado3,resultado4,resultado_total,resultado_total1;
  
    public Productos(String nombre, int precio,int dias_caducar,int cantidadproducto) {
        this.nombre = nombre;
        this.precio = precio;
        this.dias_caducar = dias_caducar;
        this.cantidadproducto = cantidadproducto;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getDias_caducar() {
        return dias_caducar;
    }

    public int getCantidadproducto() {
        return cantidadproducto;
    }

    public void calcular(){
        
    int opcion=3;
    do{
     
    opcion = Integer.parseInt(JOptionPane.showInputDialog("========= Bienvenido al menu de ventas ========= \nIntroduce 1 si quieres adquirir productos no perecederos.\nIntroduce 2 si quieres adquirir productos perecederos. \nIntroduce 3 para salir.\n"
           + "\n1. Producto no perecedero\n "  +
              "2. Producto perecedero\n "
            + "3. Para salir. "));
    
    switch(opcion){ 
       
        case 1:
         JOptionPane.showMessageDialog(null," =====Productos no perecederos=====\n"+
         "\nNombre: Atun enlatado.\n"+
         "Precio: 3500 pesos.\n"+
         "\nNombre: Bolsita de arroz.\n"
         +"Precio: 1600 pesos.\n"+
          "\nNombre: Botella Aceite oliva.\n"+
         "Precio: 3600 pesos.\n"+
         "\nNombre: Sobresito de salsa de tomate.\n"
         +"Precio: 4000 pesos.\n"+
          "\nNombre: Bolsa de azucar morena.\n"+
         "Precio: 3300 pesos.\n"+
         "\nNombre: Botella de vinagre. \n"
         +"Precio: 2700 pesos.");
         JOptionPane.showMessageDialog(null,"Introduzca la informacion del producto o los productos que desea adquirir");
         String Nombre_Producto; 
         int Precio_Producto;
         int cantidad_producto;
         Nombre_Producto = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
         Precio_Producto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto "));
         cantidad_producto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de producto a adquirir de: "));
         Productos op1 = new Productos(Nombre_Producto,Precio_Producto,0,cantidad_producto);
         lista2.add(op1);
         resultado_total+= op1.getCantidadproducto()*op1.getPrecio();
         
        for(int i=0; i<lista2.size();i++){
            JOptionPane.showMessageDialog(null,"==Producto no perecedero== \nEl nombre es: "+lista2.get(i).getNombre() + "\n" +
            "El precio del producto es: "+ lista2.get(i).getPrecio()+ "\n" + 
            "Cantidad a llevar es: "+ lista2.get(i).getCantidadproducto());
            
            }
            
          JOptionPane.showMessageDialog(null,"El precio total de los productos es de: "+ resultado_total+ " pesos ");
            
            break;  
        case 2:
             JOptionPane.showMessageDialog(null," =====Productos perecederos=====\n"+
         "\nNombre: Kilo de papa. \n"+
         "Precio: 1400 pesos. caduca 7 dias \n"+
         "\nNombre: Kilo de queso. \n"
         +"Precio: 14000  pesos. caduca 3 dias \n"+
          "\nNombre: Kilo de pollo. \n"+ 
         "Precio: 6000 pesos. caduca 2 dias \n"+
         "\nNombre: Kilo de tomate. \n"
         +"Precio: 2500 pesos. caduca 8 dias \n"+
          "\nNombre: Carton de huevo.\n"+
         "Precio: 9000 pesos. caduca 1 dias \n"+
         "\nNombre: Bolsa de leche de un litro.\n"
         +"Precio: 2500. caduca 12 dias");
          JOptionPane.showMessageDialog(null,"Introduzca la informacion del producto o los productos que desea adquirir");
           String NombreProducto;
            int PrecioProducto;
            int diascaducar;
            NombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
            PrecioProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto "));
            diascaducar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dias de caducacion del producto: "));
            Productos op = new Productos(NombreProducto,PrecioProducto,diascaducar,0);
            lista.add(op);
            
            if (op.getDias_caducar()== 1){
               resultado1 = (op.getPrecio()/4);                
            }
       
            else if(op.getDias_caducar()==2){
              resultado2 = (op.getPrecio()/3);
              
            }
            else if(op.getDias_caducar()==3){
               resultado3 =  (op.getPrecio() / 2);
                 
            }
            else if (op.getDias_caducar()>=4){
            
            resultado4 = (op.getPrecio());
               
            }
              
            for(int i=0; i<lista.size();i++){
                JOptionPane.showMessageDialog(null,"==Producto perecedero== \nEl nombre es: "+lista.get(i).getNombre() + "\n" +
                "El precio del producto es: "+ lista.get(i).getPrecio()+ "\n" +
                "El dia a caducar del producto es: "+ lista.get(i).getDias_caducar());
            }
           
            resultado_total1=+(resultado1+resultado2+resultado3+resultado4); 
            
            JOptionPane.showMessageDialog(null,"El resultado de los productos es: "+ (resultado_total1));
             
            break;
           
        case 3:
            break;
        }
     
    }while(opcion != 3);
     
  }
 
 public static void main(String[] args){
   
   Productos dato = new Productos("",0,0,0);
   dato.calcular();
   
   }
}

       

