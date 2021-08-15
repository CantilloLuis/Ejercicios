/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Modelo.Cliente;
import Control.Cliente_Controller;

import javax.swing.JOptionPane;

    public class Registro_Cliente extends javax.swing.JFrame {

    /**
     * Creates new form Registro_Cliente
     */
    public static Cliente_Controller cc = new Cliente_Controller();
    
    public Registro_Cliente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void TipoCaracter(java.awt.event.KeyEvent evt, int num){         
        switch (num) {
            case 1:
                {
                    char validar = evt.getKeyChar();       // 1 solo numeros
                    if(Character.isLetter(validar)){
                        getToolkit().beep();
                        evt.consume();
                        JOptionPane.showMessageDialog(rootPane,"SOLO NUMEROS");
                    }   break;
                }
            case 2:
                {
                    char validar = evt.getKeyChar();
                    if(!Character.isLetter(validar)){   // 2 solo letras
                        getToolkit().beep();
                        evt.consume();
                        JOptionPane.showMessageDialog(rootPane,"SOLO LETRAS");
                    }   break;
                }
            default:
                JOptionPane.showMessageDialog(null, "INDEX ERROR","ERROR",JOptionPane.ERROR_MESSAGE);
                break;
        }
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        boxID = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_telef = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_dir = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE CLIENTE ");

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new java.awt.GridLayout(6, 2, 20, 15));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2);

        txt_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_nombreMouseClicked(evt);
            }
        });
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        jPanel2.add(txt_nombre);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Apellido");
        jPanel2.add(jLabel3);

        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_apellido);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Tipo de identificación");
        jPanel2.add(jLabel4);

        boxID.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cedula de Ciudadanía", "Cedula de Extranjería", " Pasaporte" }));
        boxID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxIDActionPerformed(evt);
            }
        });
        jPanel2.add(boxID);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Identificación");
        jPanel2.add(jLabel5);

        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });
        jPanel2.add(txt_id);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Teléfono ");
        jPanel2.add(jLabel6);

        txt_telef.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_telefMouseClicked(evt);
            }
        });
        txt_telef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefKeyTyped(evt);
            }
        });
        jPanel2.add(txt_telef);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("Dirección  ");
        jPanel2.add(jLabel7);
        jPanel2.add(txt_dir);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/check (2) (1).png"))); // NOI18N
        jLabel8.setText("REGISTRAR");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back-arrow (1).png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(99, 99, 99))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel8)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed

    }//GEN-LAST:event_txt_nombreActionPerformed

    private void boxIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxIDActionPerformed

    }//GEN-LAST:event_boxIDActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        TipoCaracter(evt, 2);
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreMouseClicked

    private void txt_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyTyped
        TipoCaracter(evt, 2);
    }//GEN-LAST:event_txt_apellidoKeyTyped

    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped
        TipoCaracter(evt, 1);
    }//GEN-LAST:event_txt_idKeyTyped

    private void txt_telefMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_telefMouseClicked
        
    }//GEN-LAST:event_txt_telefMouseClicked

    private void txt_telefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefKeyTyped
       TipoCaracter(evt, 1);
    }//GEN-LAST:event_txt_telefKeyTyped

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        int contadorValidacion = 0 ; 
    
        if (!txt_nombre.getText().isEmpty()) {
            contadorValidacion++;
            if (!txt_apellido.getText().isEmpty()) {
                contadorValidacion++;
                if (!(boxID.getSelectedItem().toString().isEmpty())) {
                    contadorValidacion++;
                    if (!txt_id.getText().isEmpty()) {
                        contadorValidacion++;
                        if (!txt_telef.getText().isEmpty()) {
                            contadorValidacion++;
                            if (!txt_dir.getText().isEmpty()) {
                                contadorValidacion++;
                            }
                        }
                    }
                }
            }
        }
        
        if (contadorValidacion == 6){
            Cliente clte = new Cliente(
            txt_nombre.getText(),
            txt_apellido.getText(),
            boxID.getSelectedItem().toString(),
            txt_id.getText(),
            txt_telef.getText(),
            txt_dir.getText()
            );
        
            cc.addCliente(clte);
 
            JOptionPane.showMessageDialog(this, "Registro User Exitoso \n\n Nombre : "
            +txt_nombre.getText()+" "+txt_apellido.getText());
            dispose();   
            Menu_Principal mp = new Menu_Principal();
            mp.setVisible(true);
                    
        }else{
            JOptionPane.showMessageDialog(this, "FALTAN DATOS EN EL FORMULARIO");
        }
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
      dispose();
                Menu_Principal menu =new Menu_Principal();
                menu.setVisible(true); 
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_dir;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telef;
    // End of variables declaration//GEN-END:variables

    void setText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
