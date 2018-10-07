
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
    private InterfazMDI interfazPrincipal;
    
    public ControladorPublicaciones(ConexionPublicacionComputadoras e,InterfazMDI i){
    
        inicializar(e,i);
    
    }
    
    private void inicializar(ConexionPublicacionComputadoras e, InterfazMDI i){
    
        cpConexion = e;
        sPublicacion = new SubirPublicacion();
        interfazPrincipal = i;
        botonSubir();
        subirPublicacion();
        atras();
    
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
                
                if(validarEspacios()){
               
                try {
                    FileInputStream archivo = new FileInputStream(sPublicacion.ruta.getText());
                    cpConexion.agregar(sPublicacion.codigo.getText(), sPublicacion.titulo.getText(), 
                    sPublicacion.descripcion.getText(), sPublicacion.precio.getText(), archivo);
                    limpiar();
                    sPublicacion.dispose();
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Existe un error al subir la Imagen");
                }
                }else{
                    
                     JOptionPane.showMessageDialog(null, "Falta informacion o usted no ha seleccionado una imagen");
                
                }
            }
        });
    
    }
    //Este metodo verifica que el admin llene todos los datos necesarios para poder subir la publicacion
    private boolean validarEspacios (){
        
        if(!sPublicacion.codigo.getText().equals("") && !sPublicacion.titulo.getText().equals("") && 
                    !sPublicacion.descripcion.getText().equals("") && !sPublicacion.precio.getText().equals("") && 
                !sPublicacion.ruta.getText().equals("")){
            return true;        
        }else{
            return false;
        }
    }
    //Este metodo limpia los espacios 
    private void limpiar(){
        
        sPublicacion.image.setIcon(null);
        sPublicacion.image.setText("                  Toca aquí para subir imagen");
        sPublicacion.codigo.setText("");
        sPublicacion.titulo.setText("");
        sPublicacion.descripcion.setText("");
        sPublicacion.precio.setText("");
        sPublicacion.ruta.setText("");
    
    }
    //Este metodo hace que salga y se limpie en el panel subir publicaciones
    private void atras(){
        sPublicacion.atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                limpiar();
                sPublicacion.dispose();
            }
        });
    
    
    }
    
}
