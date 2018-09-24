
package Vista;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;



public class Seleccionar extends javax.swing.JFrame {
//    public File archivo;
//    private Publicacion publicacion;
    public Seleccionar() { //Publicacion e
//        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
//        setLayout(null);
//        setUndecorated(true);
//        initComponents();
//        setLocationRelativeTo(null);
//        publicacion = e;
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seleccionar");

        jFileChooser1.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
 
//        JFileChooser selectorArchivo = (JFileChooser)evt.getSource();
//        
//        String command = evt.getActionCommand(); //Para los botones del seleccionador
//        
//        if(command.equals(JFileChooser.APPROVE_SELECTION)){
//        
//            setVisible(false);
//            
//            archivo = selectorArchivo.getSelectedFile();
//            
//            publicacion.file.setText(archivo.getAbsolutePath());
//            
//            publicacion.archivo = archivo;
//            
//        }else if(command.equals(JFileChooser.CANCEL_SELECTION)){
//        
//            setVisible(false);
//        
//        }
        
    }//GEN-LAST:event_jFileChooser1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JFileChooser jFileChooser1;
    // End of variables declaration//GEN-END:variables
}
