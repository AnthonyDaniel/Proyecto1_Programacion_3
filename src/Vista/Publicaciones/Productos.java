
package Vista.Publicaciones;

import Vista.MDI.InterfazMDI;
import Modelo.Conexiones.ConexionPublicacionComputadoras;
import Vista.Carrito.Carrito;
import Vista.Carrito.ComprarContenedor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Productos extends javax.swing.JPanel {
    
    public InterfazMDI interfazPrincipal; //Llamamos a la interfaz principal por medio de inyeccion de codigo
    private ConexionPublicacionComputadoras cp;
    private Carrito carrito;
    public ComprarContenedor comprarC;
   
    public Productos(ConexionPublicacionComputadoras _cp, InterfazMDI i, ComprarContenedor comprarContenedor) {
        initComponents();
        fondo(_cp.impar);
        interfazPrincipal = i;
        comprarC = comprarContenedor;
        cp = _cp;
       
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
        comprar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        codigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Titulo");

        imagen.setBackground(new java.awt.Color(0, 153, 204));
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono.png"))); // NOI18N

        comprar.setBackground(new java.awt.Color(255, 255, 255));
        comprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito.png"))); // NOI18N
        comprar.setBorderPainted(false);
        comprar.setOpaque(false);
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(255, 255, 255));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        eliminar.setBorderPainted(false);
        eliminar.setOpaque(false);
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
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
                                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(eliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comprar, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
      
        if(interfazPrincipal.modo.getText().equals("Alministrador")){
            if(cp.eliminar(this)){
              interfazPrincipal.contenedorProductos.removeAll();
              cp.mostrarP(); 
              interfazPrincipal.repaint();
            }else{
              JOptionPane.showMessageDialog(null, "No se puede borrar la publicacion");
            }
        }else{
             JOptionPane.showMessageDialog(null, "Debes ser alministrador");
        }
          
            
      
    }//GEN-LAST:event_eliminarActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
       interfazPrincipal.cantidad.setText("");
       interfazPrincipal.total.setText("");
         
        if(!interfazPrincipal.modo.getText().equals("Modo")){
           try{
               carrito = new Carrito(this);
               carrito.title.setText(titulo.getText());
               carrito.cod.setText(codigo.getText());
               carrito.des.setText(descripcion.getText());
               carrito.precio.setText(precio.getText());
               carrito.img.setText("");
               ImageIcon img = (ImageIcon) imagen.getIcon();
               Icon imge = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT ));
               carrito.img.setIcon(imge);
               comprarC.contenedorC.add(carrito);
               comprarC.repaint();
               
               interfazPrincipal.cantidad_++;
               interfazPrincipal.total_ = interfazPrincipal.total_ + Double.parseDouble(precio.getText());
               interfazPrincipal.cantidad.setText(interfazPrincipal.cantidad_+"₡");
               interfazPrincipal.total.setText(interfazPrincipal.total_ + "");
               interfazPrincipal.repaint();
               comprarC.total.setText(interfazPrincipal.total.getText());
               comprarC.cantidad.setText(interfazPrincipal.cantidad_+"");
               interfazPrincipal.repaint();
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Error" + e);
           } 
        }else{
             JOptionPane.showMessageDialog(null, "Debes estar logiado, para poder comprar");
        }
    }//GEN-LAST:event_comprarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if(evt.getClickCount()==2){
        
             interfazPrincipal.cantidad.setText("");
       interfazPrincipal.total.setText("");
         
        if(!interfazPrincipal.modo.getText().equals("Modo")){
           try{
               carrito = new Carrito(this);
               carrito.title.setText(titulo.getText());
               carrito.cod.setText(codigo.getText());
               carrito.des.setText(descripcion.getText());
               carrito.precio.setText(precio.getText());
               carrito.img.setText("");
               ImageIcon img = (ImageIcon) imagen.getIcon();
               Icon imge = new ImageIcon(img.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT ));
               carrito.img.setIcon(imge);
               comprarC.contenedorC.add(carrito);
               comprarC.repaint();
               
               interfazPrincipal.cantidad_++;
               interfazPrincipal.total_ = interfazPrincipal.total_ + Double.parseDouble(precio.getText());
               interfazPrincipal.cantidad.setText(interfazPrincipal.cantidad_+"₡");
               interfazPrincipal.total.setText(interfazPrincipal.total_ + "");
               interfazPrincipal.repaint();
               comprarC.total.setText(interfazPrincipal.total.getText());
               comprarC.cantidad.setText(interfazPrincipal.cantidad_+"");
               interfazPrincipal.repaint();
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Error" + e);
           } 
        }else{
             JOptionPane.showMessageDialog(null, "Debes estar logiado, para poder comprar");
        }
                
        }
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel codigo;
    private javax.swing.JButton comprar;
    public javax.swing.JTextArea descripcion;
    public javax.swing.JButton eliminar;
    public javax.swing.JLabel imagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel precio;
    public javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
