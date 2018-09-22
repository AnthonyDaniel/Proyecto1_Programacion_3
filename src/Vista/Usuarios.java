
package Vista;

import Modelo.ConexionUsuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class Usuarios extends javax.swing.JPanel {

    private ConexionUsuario cUsuario; //aplico inyeccion de datos
    
    public Usuarios(ConexionUsuario e){
        cUsuario = e;
        initComponents();
        setVisible(true);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        apellidos = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        correo = new javax.swing.JTextField();
        contraseña = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 153));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/persona.png"))); // NOI18N

        eliminar.setBackground(new java.awt.Color(51, 51, 51));
        eliminar.setForeground(new java.awt.Color(204, 204, 204));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        modificar.setBackground(new java.awt.Color(51, 51, 51));
        modificar.setForeground(new java.awt.Color(204, 204, 204));
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        apellidos.setBackground(new java.awt.Color(153, 153, 153));
        apellidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        apellidos.setForeground(new java.awt.Color(51, 51, 51));
        apellidos.setText("Apellidos");
        apellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apellidosKeyReleased(evt);
            }
        });

        nombre.setBackground(new java.awt.Color(153, 153, 153));
        nombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(51, 51, 51));
        nombre.setText("Nombre");
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nombreKeyReleased(evt);
            }
        });

        correo.setEditable(false);
        correo.setBackground(new java.awt.Color(153, 153, 153));
        correo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        correo.setForeground(new java.awt.Color(51, 51, 51));
        correo.setText("Correo");

        contraseña.setBackground(new java.awt.Color(153, 153, 153));
        contraseña.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(51, 51, 51));
        contraseña.setText("Contraseña");
        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contraseñaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminar)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
      if(cUsuario.eliminar(this)){ //Eliminar por medio de inyeccion de datos
             cUsuario.interfazPrincipal.contenedorUsuarios.removeAll();
             cUsuario.interfazPrincipal.repaint();
             cUsuario.mostrar();
         }
                          
    }//GEN-LAST:event_eliminarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
         if(cUsuario.modificar(this)){ //Modificar por medio de inyeccion de datos
             if(cUsuario.interfazPrincipal.modo.getText().equals("Alministrador")){
                 cUsuario.interfazPrincipal.contenedorUsuarios.removeAll();
                 cUsuario.interfazPrincipal.repaint();
                 cUsuario.mostrar();
             }
         }
    }//GEN-LAST:event_modificarActionPerformed

    private void nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            apellidos.requestFocus();
        }
    }//GEN-LAST:event_nombreKeyReleased

    private void apellidosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidosKeyReleased
          if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            contraseña.requestFocus();
        }
    }//GEN-LAST:event_apellidosKeyReleased

    private void contraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyReleased
          if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(cUsuario.modificar(this)){ //Modificar por medio de inyeccion de datos
             cUsuario.interfazPrincipal.contenedorUsuarios.removeAll();
             cUsuario.interfazPrincipal.repaint();
             cUsuario.mostrar();
         }
        }
    }//GEN-LAST:event_contraseñaKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField apellidos;
    public javax.swing.JTextField contraseña;
    public javax.swing.JTextField correo;
    public javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton modificar;
    public javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables
}
