
package Controlador;

import Modelo.Conexiones.ConexionUsuario;
import Vista.AccesosLoginRegistro.Ingresar;
import Vista.MDI.InterfazMDI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class ControladorIngresar {
 
    
    private InterfazMDI interfazPrincipal; 
    private Ingresar ingresar;
    private ConexionUsuario cUsuario;
    
    public ControladorIngresar(InterfazMDI itfMDI,Ingresar ing, ConexionUsuario conxU){ //Constructor con parametros (Inyeccion de datos)
        inicializar(itfMDI, ing, conxU);
    }
    //En este metodo iniciaremos todas las variables necesarias
    private void inicializar(InterfazMDI itfMDI,Ingresar ing, ConexionUsuario conxU){
        interfazPrincipal = itfMDI;      
        ingresar = ing;
        cUsuario = conxU;
        IngresarLogin();
        IngresarAtras();
        EnterFuncionAceptar();
    }

    //Metodo para validar el login en la clase Ingresar, si es estandar o admin
    private void IngresarLogin(){
        //Boton ingresar (Aceptar), validaciones basicas para ver si es admin o usuario estandar
        ingresar.ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                  
                if(ValidarEspaciosEnBlanco()){
                    if(cUsuario.login(ingresar.correo.getText(), ingresar.contra.getText())){

                          CerrarDespuesDeLogin();

                    }else{
                     JOptionPane.showMessageDialog(null, "El correo o la contraseña estan incorrectos", "Error", JOptionPane.ERROR_MESSAGE,null );
                     LimpiarPantalla();
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No dejar espacios en blanco", "Error", JOptionPane.ERROR_MESSAGE,null);
                }
        
            }
        });
    }
    //Metodo para cerrar la ventana de Ingresar
    private void IngresarAtras(){
    //Boton atras
        ingresar.atras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                interfazPrincipal.pestañas.setEnabledAt(0, true);
                interfazPrincipal.pestañas.setEnabledAt(1, true);
                interfazPrincipal.pestañas.setEnabledAt(2, true);
                interfazPrincipal.pestañas.remove(3);
                interfazPrincipal.pestañas.setSelectedIndex(0);
                interfazPrincipal.ingresar.setEnabled(true);
                interfazPrincipal.registrar.setEnabled(true);
            }
        });
    }
    //Este metodo cerrara la ventana de ingresar, y cargara el incio normal del programa
    private void CerrarDespuesDeLogin(){
        interfazPrincipal.pestañas.setEnabledAt(0, true);
        interfazPrincipal.pestañas.setEnabledAt(1, true); 
        interfazPrincipal.pestañas.setEnabledAt(2, true);
        interfazPrincipal.pestañas.remove(3);
        interfazPrincipal.pestañas.setSelectedIndex(0);
        interfazPrincipal.ingresar.setEnabled(true);
        interfazPrincipal.registrar.setEnabled(true);  
    }
    //Este metodo limpiara los espacios del correo y contraseña, si estos son equivocados
    private void LimpiarPantalla(){
        ingresar.correo.setText("");
        ingresar.contra.setText("");
    }
    //Este metodo hará que cuando yo toque enter, el espacio brinque al siguiente, hasta que este llegue al boton ingresar()
    private void EnterFuncionAceptar(){

        //Captura cuando toca enter en la casilla de correo
         ingresar.correo.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent ke) { //Captura la tecla precionada
               if(ke.getKeyCode() == KeyEvent.VK_ENTER){
                   ingresar.contra.requestFocus(); //Este metodo da foco 
               }
            }
        });
        //Captura cuando toca enter en la casilla de contraseña 
         ingresar.contra.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
               if(ke.getKeyCode() == KeyEvent.VK_ENTER){
               //Evento al tocar enter en la ultima casilla
                    if(ValidarEspaciosEnBlanco()){
                       if(cUsuario.login(ingresar.correo.getText(), ingresar.contra.getText())){   
                          CerrarDespuesDeLogin(); 
                      }else{
                         JOptionPane.showMessageDialog(null, "El correo o la contraseña estan incorrectos", "Error", JOptionPane.ERROR_MESSAGE,null );
                         LimpiarPantalla();
                      }
                    }else{
                        JOptionPane.showMessageDialog(null, "No dejar espacios en blanco", "Error", JOptionPane.ERROR_MESSAGE,null);
                    }
               }
            }
        }); 
    }
    //Este metodo valida que no hayan espacios en blanco
    private boolean ValidarEspaciosEnBlanco(){
       if((!ingresar.correo.getText().equals("") 
         && !ingresar.contra.getText().equals("")) 
         && (!ingresar.correo.getText().equals("") 
         || !ingresar.contra.getText().equals(""))){
           return true;
       }
          return false;
    }   
}
