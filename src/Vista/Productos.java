
package Vista;

import Modelo.ConexionPublicacionComputadoras;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Productos extends javax.swing.JPanel {
    
    private InterfazMDI interfazPrincipal; //Llamamos a la interfaz principal por medio de inyeccion de codigo
    
    public Productos(ConexionPublicacionComputadoras cp) {
        initComponents();
        fondo(cp.impar);
    }

    private void fondo(int impar){
        if(impar%2 == 0){
            ImageIcon img = new ImageIcon(getClass().getResource("/Imagenes/intel.png"));
            Icon imge = new ImageIcon(img.getImage().getScaledInstance(982, 336, Image.SCALE_DEFAULT ));
            JLabel imagen = new JLabel(imge);
            imagen.setBounds(0, 0,982, 336);
            imagen.setVisible(true);
            add(imagen);
        }else{
            ImageIcon img = new ImageIcon(getClass().getResource("/Imagenes/msi.png"));
            Icon imge = new ImageIcon(img.getImage().getScaledInstance(982, 336, Image.SCALE_DEFAULT ));
            JLabel imagen = new JLabel(imge);
            imagen.setBounds(0, 0, 982, 336);
            imagen.setVisible(true);
            add(imagen);
        }
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));

        titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Titulo");

        imagen.setBackground(new java.awt.Color(0, 153, 204));
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setOpaque(false);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setOpaque(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        descripcion.setEditable(false);
        descripcion.setBackground(new java.awt.Color(255, 255, 255));
        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        descripcion.setForeground(new java.awt.Color(51, 51, 51));
        descripcion.setRows(5);
        descripcion.setBorder(null);
        descripcion.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(descripcion);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo:");

        codigo.setForeground(new java.awt.Color(255, 255, 255));
        codigo.setText("xxxx");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Precio: ‎₡");

        precio.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        precio.setForeground(new java.awt.Color(255, 255, 255));
        precio.setText("xxxx");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(codigo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titulo)
                                .addGap(173, 477, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(precio))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(interfazPrincipal.modo.getText().equals("Alministrador")){
        
            JOptionPane.showMessageDialog(null, "S");
        
        }else{
            JOptionPane.showMessageDialog(null, "Debes ser alministrador");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel codigo;
    public javax.swing.JTextArea descripcion;
    public javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel precio;
    public javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
