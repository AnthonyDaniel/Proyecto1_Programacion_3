
package Controlador;

import Modelo.ConexionUsuario;
import Vista.Ingresar;
import Vista.Registrar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class ControladorRegistrar {
    // Con esto aplicacos inyeccion de codigo
    private Registrar registrar; 
    private ConexionUsuario cUsuario;
    private Ingresar ingresar; 
    public ControladorRegistrar(Ingresar ing,Registrar reg, ConexionUsuario conxU){
        inicializar(ing,reg,conxU);
    }
    private void inicializar(Ingresar ing,Registrar reg, ConexionUsuario conxU){
        ingresar = ing; // Yo me traje este objeto para que cuando la persna se registre, me lo direccione al metodo registrar 
        registrar = reg;
        cUsuario = conxU;
        registrar();
        atras();
        evaluarEnter();
    }
    //Aqui le daremos utilidad al boton registrar del registro estandar (No para administrador)
    private void registrar(){
        registrar.aceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(verificarEspacios()){
                    if(verificarContraseña()){
                        if(cUsuario.agregar(registrar._correo.getText(), registrar._nombre.getText(), registrar._apellidos.getText(), registrar._contra.getText())){
                            limpiarPantalla();
                            cUsuario.interfazPrincipal.pestañas.setEnabledAt(0, true);
                            cUsuario.interfazPrincipal.pestañas.setEnabledAt(1, true);
                            cUsuario.interfazPrincipal.pestañas.setEnabledAt(2, true);
                            cUsuario.interfazPrincipal.pestañas.remove(3);
                            cUsuario.interfazPrincipal.pestañas.setSelectedIndex(0);
                            cUsuario.interfazPrincipal.ingresar.setEnabled(true);
                            cUsuario.interfazPrincipal.registrar.setEnabled(true);
                            cUsuario.interfazPrincipal.registrar.setEnabled(false);
                            cUsuario.interfazPrincipal.ingresar.setEnabled(false); 
                            cUsuario.interfazPrincipal.pestañas.add("Ingresar",ingresar).repaint();
                            cUsuario.interfazPrincipal.pestañas.setSelectedIndex(3);
                            cUsuario.interfazPrincipal.pestañas.setEnabledAt(0, false);
                            cUsuario.interfazPrincipal.pestañas.setEnabledAt(1, false);
                            cUsuario.interfazPrincipal.pestañas.setEnabledAt(2, false);
                            JOptionPane.showMessageDialog(null, "El Usuario fue agregado, Por favor ingresar sesiión");
                        }else
                            JOptionPane.showMessageDialog(null, "El Usuario ya fue registrado con anterioridad");
                    }else{
                        JOptionPane.showMessageDialog(null,"La contraseña no conside");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No dejar espacios en blanco");
                }   
            }
        });
   }
   //Este metodo verificara que todos los espacios contengan información
    private boolean verificarEspacios(){
        //La razon que no pongo de una vez la verificacion de lla contraseña, es que asi le puedo dar al usuario,
        //un mensaje más exacto del error de porque no se puede registrar
        if(registrar._correo.getText().equals("") || registrar._nombre.getText().equals("") 
        || registrar._apellidos.getText().equals("") || registrar._contra.getText().equals("") 
        ||registrar._contra2.getText().equals("")){
            return false;
        }else{
            return true;
        }
    
    }
   //Este metodo verificara si la contraseña esta bien (Confirmar contraseña)
    private boolean verificarContraseña(){
        if(registrar._contra.getText().equals(registrar._contra2.getText())){
            return true;
        }else{
            return false;
        }    
    }
    //Este metodo limpia el metodo una vez se haya subido a la base de datos
    private void limpiarPantalla(){
        registrar._apellidos.setText("");
        registrar._contra.setText("");
        registrar._contra2.setText("");
        registrar._correo.setText("");
        registrar._nombre.setText("");
    }
    //Este metodo nos permitira limpiar cuando nos salgamos del panel de registro
    private void atras(){
        registrar.atras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                limpiarPantalla();
            }
        });
    }
    //Metodo para que al tocar enter, envalue el resgistro, sin tener que desplazar el mouse
    private void evaluarEnter(){
        registrar._contra2.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke){
                if(ke.getKeyCode()==KeyEvent.VK_ENTER){
                      if(verificarEspacios()){
                    if(verificarContraseña()){
                        if(cUsuario.agregar(registrar._correo.getText(), registrar._nombre.getText(), registrar._apellidos.getText(), registrar._contra.getText())){
                            limpiarPantalla();
                            cUsuario.interfazPrincipal.pestañas.setEnabledAt(0, true);
                            cUsuario.interfazPrincipal.pestañas.setEnabledAt(1, true);
                            cUsuario.interfazPrincipal.pestañas.setEnabledAt(2, true);
                            cUsuario.interfazPrincipal.pestañas.remove(3);
                            cUsuario.interfazPrincipal.pestañas.setSelectedIndex(0);
                            cUsuario.interfazPrincipal.ingresar.setEnabled(true);
                            cUsuario.interfazPrincipal.registrar.setEnabled(true);
                            cUsuario.interfazPrincipal.registrar.setEnabled(false);
                            cUsuario.interfazPrincipal.ingresar.setEnabled(false); 
                            cUsuario.interfazPrincipal.pestañas.add("Ingresar",ingresar).repaint();
                            cUsuario.interfazPrincipal.pestañas.setSelectedIndex(3);
                            cUsuario.interfazPrincipal.pestañas.setEnabledAt(0, false);
                            cUsuario.interfazPrincipal.pestañas.setEnabledAt(1, false);
                            cUsuario.interfazPrincipal.pestañas.setEnabledAt(2, false);
                            JOptionPane.showMessageDialog(null, "El Usuario fue agregado, Por favor ingresar sesiión");
                        }else
                            JOptionPane.showMessageDialog(null, "El Usuario ya fue registrado con anterioridad");
                    }else{
                        JOptionPane.showMessageDialog(null,"La contraseña no conside");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "No dejar espacios en blanco");
                }   
            }
                }
            
        });
    
    }
}
