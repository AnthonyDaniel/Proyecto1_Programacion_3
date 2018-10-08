
package Controlador;

import Modelo.Conexiones.ConexionPublicacionComputadoras;
import Vista.Carrito.ComprarContenedor;
import Vista.MDI.InterfazMDI;
import Vista.Publicaciones.SubirPublicacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class ControladorPublicaciones {
    
    private SubirPublicacion sPublicacion; // Para poder darle un evento al boton subir imagen del main
    private ConexionPublicacionComputadoras cpConexion;
    private InterfazMDI interfazPrincipal;
    private ComprarContenedor cc; //Para poder controlar los distintos aspectos del compras    
    public ControladorPublicaciones(ConexionPublicacionComputadoras e,InterfazMDI i,ComprarContenedor _cc){
    
        inicializar(e,i,_cc);
    
    }
    
    private void inicializar(ConexionPublicacionComputadoras e, InterfazMDI i,ComprarContenedor _cc){
    
        cpConexion = e;
        sPublicacion = new SubirPublicacion();
        interfazPrincipal = i;
        cc = _cc;
        botonSubir();
        subirPublicacion();
        atras();
        clickCompras();
    
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
    //Este metodo me hace posible entrar al aparatado de compras 
    private void clickCompras(){
        
       interfazPrincipal.compras.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent me) {
           
               cc.setVisible(true);
           
           }
       });
    }  
    
}
