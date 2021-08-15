
package vista;

import Control.Gestion_Proyectos_Controller;
import Modelo.Cliente;
import Modelo.Proyecto;
import javax.swing.JOptionPane;
import static vista.Registro_Cliente.cc;
import vista.G_proyectos_id;


public class Gestion_Proyectos extends javax.swing.JFrame {


    
    public Gestion_Proyectos() {
        initComponents(); 
        this.setLocationRelativeTo(null);
    }
    int cantidadDias;
    
    public static Gestion_Proyectos_Controller gpc 
            = new Gestion_Proyectos_Controller();
    G_proyectos_id id_Gestion = new G_proyectos_id();

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        combobox_t_mueble = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        combobox_t_madera = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        combobox_t_cuero = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        combobox_t_pintura = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txt_Color = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_duracion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_cant_trab = new javax.swing.JTextField();
        combobox_opc_t_mueble = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        txt_cantidad_madera = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_cantidad_cuero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_cantidad_pintu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("GESTIÓN DE PROYECTOS ");

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setText("Cotizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new java.awt.GridLayout(8, 2, 0, 10));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("TIPO DE MUEBLE");
        jPanel2.add(jLabel15);

        combobox_t_mueble.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sala", "Cuarto", "Comedor", "Cocina" }));
        combobox_t_mueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_t_muebleActionPerformed(evt);
            }
        });
        jPanel2.add(combobox_t_mueble);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("TIPO DE MADERA");
        jPanel2.add(jLabel4);

        combobox_t_madera.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A", "Abeto", "Alamo", "Roble", "Nogal", " " }));
        combobox_t_madera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_t_maderaActionPerformed(evt);
            }
        });
        jPanel2.add(combobox_t_madera);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("TIPO DE CUERO");
        jPanel2.add(jLabel5);

        combobox_t_cuero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A", "Sintético", "Animal - Vaca", "Animal - Oveja", "Animal - Cabra", "  " }));
        combobox_t_cuero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combobox_t_cueroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                combobox_t_cueroFocusLost(evt);
            }
        });
        combobox_t_cuero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_t_cueroActionPerformed(evt);
            }
        });
        jPanel2.add(combobox_t_cuero);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("TIPO DE PINTURA");
        jPanel2.add(jLabel6);

        combobox_t_pintura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A", "Mate", "Aceite", "Satinado", "Brillante" }));
        combobox_t_pintura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                combobox_t_pinturaFocusLost(evt);
            }
        });
        combobox_t_pintura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_t_pinturaActionPerformed(evt);
            }
        });
        jPanel2.add(combobox_t_pintura);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("COLOR");
        jPanel2.add(jLabel7);
        jPanel2.add(txt_Color);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("DURACION (DIAS)");
        jPanel2.add(jLabel13);

        txt_duracion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_duracionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_duracionFocusLost(evt);
            }
        });
        txt_duracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_duracionActionPerformed(evt);
            }
        });
        jPanel2.add(txt_duracion);

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("CANTIDAD DE TRABAJADORES");
        jPanel2.add(jLabel14);
        jPanel2.add(txt_cant_trab);

        combobox_opc_t_mueble.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A" }));
        combobox_opc_t_mueble.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                combobox_opc_t_muebleFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("CANTIDAD DE MADERA (METROS)");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("CANTIDAD DE MADERA (METROS)");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("CANTIDAD DE PINTURA (GALON)");

        txt_cantidad_pintu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_cantidad_pintuFocusGained(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back-arrow (1).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(431, 431, 431))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(combobox_opc_t_mueble, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txt_cantidad_madera, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_cantidad_cuero, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_cantidad_pintu, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(combobox_opc_t_mueble, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cantidad_madera, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cantidad_cuero, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_cantidad_pintu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(29, 29, 29))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        double tipoMadera=0;
        double tipoCuero=0;
        double tipoPintura=0;
        
        if(combobox_t_madera.getSelectedItem().toString().equalsIgnoreCase("abeto")){
           tipoMadera = 150000; 
        }else if(combobox_t_madera.getSelectedItem().toString().equalsIgnoreCase("Alamo")){
           tipoMadera = 150000; 
        }else if(combobox_t_madera.getSelectedItem().toString().equalsIgnoreCase("roble")){
           tipoMadera = 165000;  
        }else if(combobox_t_madera.getSelectedItem().toString().equalsIgnoreCase("nogal")){
           tipoMadera = 165000;  
        }else if(combobox_t_madera.getSelectedItem().toString().equalsIgnoreCase("N/A")){
           tipoMadera = 0;  
        }
        
        if(combobox_t_cuero.getSelectedItem().toString().equalsIgnoreCase("abeto")){
           tipoCuero = 20000; 
        }else if(combobox_t_cuero.getSelectedItem().toString().equalsIgnoreCase("Alamo")){
           tipoCuero = 55000; 
        }else if(combobox_t_cuero.getSelectedItem().toString().equalsIgnoreCase("roble")){
           tipoCuero = 53000;  
        }else if(combobox_t_cuero.getSelectedItem().toString().equalsIgnoreCase("nogal")){
           tipoCuero = 50000;  
        }else if(combobox_t_cuero.getSelectedItem().toString().equalsIgnoreCase("N/A")){
           tipoCuero = 0;  
        }


        if(combobox_t_madera.getSelectedItem().toString().equalsIgnoreCase("abeto")){
           tipoPintura = 20500; 
        }else if(combobox_t_madera.getSelectedItem().toString().equalsIgnoreCase("Alamo")){
           tipoPintura = 30000; 
        }else if(combobox_t_madera.getSelectedItem().toString().equalsIgnoreCase("roble")){
           tipoPintura = 23000;  
        }else if(combobox_t_madera.getSelectedItem().toString().equalsIgnoreCase("nogal")){
           tipoPintura = 25000;  
        }else if(combobox_t_madera.getSelectedItem().toString().equalsIgnoreCase("N/A")){
           tipoPintura = 0;  
        }

        int valorTrabajadores = (Integer.parseInt(txt_cant_trab.getText())*25000);
        

        
        double costos = ((tipoMadera+tipoCuero+tipoPintura)+(valorTrabajadores));
        
        Cliente cliente = cc.findCliente(id_Gestion.getID_ClienteB());

        Proyecto project = new Proyecto(
                combobox_t_mueble.getSelectedItem().toString(),
                combobox_opc_t_mueble.getSelectedItem().toString(),
                combobox_t_madera.getSelectedItem().toString(),
                txt_cantidad_madera.getText(),
                combobox_t_cuero.getSelectedItem().toString(),
                txt_cantidad_cuero.getText(),
                combobox_t_pintura.getSelectedItem().toString(),
                txt_Color.getText(),
                txt_cantidad_pintu.getText(),
                txt_duracion.getText(),
                txt_cant_trab.getText(),
                cliente,
                costos
        );      
        
        gpc.addProject(project);
        
        JOptionPane.showMessageDialog(this, "Se ha Registrado El proyecto para "+cliente.getNombre()+" Tiene un Valor de : " +project.getCosto());
        
        dispose();
        Menu_Principal  menu = new Menu_Principal();
        menu.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addComboItems(Object [] o , javax.swing.JComboBox combo){
        combo.removeAllItems();
        for(int i = 0 ; i<o.length ;i++){
            combo.addItem(o[i]);
        }
    }
    
    
    private void combobox_t_muebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_t_muebleActionPerformed
        int index = combobox_t_mueble.getSelectedIndex();
        Object [] index0 = {"Muebles","Mesa De Centro","Mecedora","Marco Para Cuadro"};
        Object [] index1 = {"Cama","Nochero","Closet","Peinador"};
        Object [] index2 = {"Silla","Mesa","Bife"};
        Object [] index3 = {"Gabinete","Repisa","Cajones"};               
        switch (index){           
            case 0:  
                addComboItems(index0, combobox_opc_t_mueble);
                break;
            case 1: 
                addComboItems(index1, combobox_opc_t_mueble);
                break;
            case 2:
                addComboItems(index2, combobox_opc_t_mueble);
                break;
            case 3:
                addComboItems(index3, combobox_opc_t_mueble);
                break;
            case -1:
                combobox_opc_t_mueble.removeAllItems();
            break;
            default:
                JOptionPane.showMessageDialog(this, "Error Desconocido","Indice Fuera de Rango",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_combobox_t_muebleActionPerformed

    private void txt_duracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_duracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_duracionActionPerformed

    private void combobox_t_cueroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobox_t_cueroFocusLost

    }//GEN-LAST:event_combobox_t_cueroFocusLost

    private void combobox_t_pinturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobox_t_pinturaFocusLost

    }//GEN-LAST:event_combobox_t_pinturaFocusLost

    private void combobox_t_cueroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_t_cueroActionPerformed

        

    }//GEN-LAST:event_combobox_t_cueroActionPerformed

    private void combobox_t_pinturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_t_pinturaActionPerformed

    }//GEN-LAST:event_combobox_t_pinturaActionPerformed

    private void combobox_t_cueroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobox_t_cueroFocusGained

        
    }//GEN-LAST:event_combobox_t_cueroFocusGained

    private void txt_duracionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_duracionFocusLost

    }//GEN-LAST:event_txt_duracionFocusLost

    private void combobox_t_maderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_t_maderaActionPerformed
        
        
    }//GEN-LAST:event_combobox_t_maderaActionPerformed

    private void combobox_opc_t_muebleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobox_opc_t_muebleFocusLost

    }//GEN-LAST:event_combobox_opc_t_muebleFocusLost

    private void txt_cantidad_pintuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cantidad_pintuFocusGained

    }//GEN-LAST:event_txt_cantidad_pintuFocusGained

    private void txt_duracionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_duracionFocusGained
       Integer tempcantidad = 0 ;
        
        switch (combobox_opc_t_mueble.getSelectedItem().toString()) {
            case "Muebles":
                tempcantidad = 20;
                break;
            case "Mesa De Centro":
                tempcantidad = 10;
                break;
            case "Mecedora":
                tempcantidad = 10;
                break;
            case "Marco Para Cuadro":
                tempcantidad = 1;
                break;
            case "Cama":
                tempcantidad = 20;
                break;
            case "Nochero":
                tempcantidad = 15;
                break;
            case "Closet":
                tempcantidad = 25;
                break;
            case "Peinador":
                tempcantidad = 20;
                break;
            case "Silla":
                tempcantidad = 3;
                break;
            case "Mesa":
                tempcantidad = 5;
                break;
            case "Bife":
                tempcantidad = 12;
                break;
            case "Gabinete":
                tempcantidad = 17;
                break;
            case "Repisa":
                tempcantidad = 1;
                break;
            case "Cajones":
                tempcantidad = 3;
                break;
            default:
                break;
        }
        txt_duracion.setText(tempcantidad.toString());
        txt_duracion.disable();
        txt_duracion.setFocusable(false);
      
        int trabajadores = 0;
        
        if((combobox_t_madera.getSelectedIndex()>0) && (combobox_t_cuero.getSelectedIndex()>0) && (combobox_t_pintura.getSelectedIndex()>0)){
            trabajadores=3;
        }else if((combobox_t_madera.getSelectedIndex()>0) && (combobox_t_cuero.getSelectedIndex()==0) && (combobox_t_pintura.getSelectedIndex()>0)){
            trabajadores=2;
        }else if((combobox_t_madera.getSelectedIndex()>0) && (combobox_t_cuero.getSelectedIndex()>0) && (combobox_t_pintura.getSelectedIndex()==0)){
            trabajadores=2;
        }else{
            trabajadores=1;
        }
        
        int dias = (Integer.parseInt(txt_duracion.getText())/7);
        
           
        txt_cant_trab.setText((trabajadores+dias)+"");
        txt_cant_trab.disable();
        txt_cant_trab.setFocusable(false);
    }//GEN-LAST:event_txt_duracionFocusGained

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        dispose();
        G_proyectos_id i = new G_proyectos_id();
        i.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gestion_Proyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion_Proyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion_Proyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion_Proyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion_Proyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combobox_opc_t_mueble;
    private javax.swing.JComboBox combobox_t_cuero;
    private javax.swing.JComboBox combobox_t_madera;
    private javax.swing.JComboBox combobox_t_mueble;
    private javax.swing.JComboBox combobox_t_pintura;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_Color;
    private javax.swing.JTextField txt_cant_trab;
    private javax.swing.JTextField txt_cantidad_cuero;
    private javax.swing.JTextField txt_cantidad_madera;
    private javax.swing.JTextField txt_cantidad_pintu;
    private javax.swing.JTextField txt_duracion;
    // End of variables declaration//GEN-END:variables
}
