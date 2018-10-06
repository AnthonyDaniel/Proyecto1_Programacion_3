
package Controlador;

import Modelo.ConexionPublicacionComputadoras;
import Vista.InterfazMDI;
import Vista.SubirPublicacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ControladorPublicaciones {
    
    private SubirPublicacion sPublicacion; // Para poder darle un evento al boton subir imagen del main
    private ConexionPublicacionComputadoras cpConexion;
    
    public ControladorPublicaciones(ConexionPublicacionComputadoras e){
    
        inicializar(e);
    
    }
    
    private void inicializar(ConexionPublicacionComputadoras e){
    
        cpConexion = e;
        sPublicacion = new SubirPublicacion();
        botonSubir();
        subirPublicacion();
    
    }
    private void botonSubir(){
        //Este boton, llamara a la interfaz de Subir
        cpConexion.interfazPrincipal.agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                sPublicacion.setVisible(true);
            }
        });
    }
    private void subirPublicacion(){
    
        sPublicacion.subir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                try {
                    FileInputStream archivo = new FileInputStream(sPublicacion.ruta.getText());
                    cpConexion.agregar(sPublicacion.codigo.getText(), sPublicacion.titulo.getText(), 
                    sPublicacion.descripcion.getText(), sPublicacion.precio.getText(), archivo);
                
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Existe un error al subir la Imagen");
                }

            }
        });
    
    }
}
