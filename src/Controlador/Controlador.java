
package Controlador;

import Modelo.Conexion;
import Modelo.ConexionPublicacionComputadoras;
import Modelo.ConexionUsuario;
import Vista.Ingresar;
import Vista.InterfazMDI;
import Vista.Productos;
import Vista.Registrar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Controlador {
    //VARIABLES NECESARIAS
    private InterfazMDI interfazPrincipal;
    private Conexion conexion;
    private Registrar registrar;
    private Ingresar ingresar;
    private ConexionUsuario cUsuario;
    private ConexionPublicacionComputadoras cpComputadoras;
    private ControladorIngresar cIngresar;
    private ControladorRegistrar cRegistrar;
    private ControladorPublicaciones cPublicaciones;
   
    public Controlador(){
        inicializar();
        
   
    }
    
    //Iniciar variables, y llamar funciones
    private void inicializar(){
        interfazPrincipal = new InterfazMDI();
        registrar = new Registrar(interfazPrincipal);
        ingresar = new Ingresar(interfazPrincipal);
        conexion = new Conexion(interfazPrincipal); // recibe la interfaz, para cambiar de color el indicador de conexio
        cpComputadoras = new ConexionPublicacionComputadoras(interfazPrincipal); // Recibe como parameto la interfaz mdi, para poder interactuar con los diferentes botones
        cUsuario = new ConexionUsuario(interfazPrincipal); //Recibe la interfaz para poder aplicar herencia a la clase conexion
        cIngresar = new ControladorIngresar(interfazPrincipal,ingresar,cUsuario); //Llamamos el controlador ingresar (Verifica el login) Controlador
        cRegistrar = new ControladorRegistrar(ingresar, registrar, cUsuario); //Llamamos el controlador ingresar (Verificar el registro) Controlador
        cPublicaciones = new ControladorPublicaciones(cpComputadoras); // Le mandamos el conexionComputaras, para poder acceder a los distintos metodos
        establecerConexion();
        registrarMDI();
        ingresarMDI();
       
  
    }
   
    //Establecer conexion con la base de datos
    private void establecerConexion(){
        conexion.conexion();
    }
    //Boton de registrar situado en la interfazMDI , este metodo escuchara cuando lo toquen
    private void registrarMDI(){
        interfazPrincipal.registrar.addActionListener(new ActionListener() {
          
            public void actionPerformed(ActionEvent ae) {
                interfazPrincipal.registrar.setEnabled(false);
                interfazPrincipal.ingresar.setEnabled(false);
                interfazPrincipal.pestañas.add("Registrar",registrar).repaint();
                interfazPrincipal.pestañas.setSelectedIndex(3);
                interfazPrincipal.pestañas.setEnabledAt(0, false);
                interfazPrincipal.pestañas.setEnabledAt(1, false);
                interfazPrincipal.pestañas.setEnabledAt(2, false);
            }
        });
 
    }
    //Boton en interfazMDI(Interfaz principal) action listen de Ingresar
    private void ingresarMDI(){
        interfazPrincipal.ingresar.addActionListener(new ActionListener() {
             public void actionPerformed(ActionEvent ae) {  
                interfazPrincipal.registrar.setEnabled(false);
                interfazPrincipal.ingresar.setEnabled(false); 
                interfazPrincipal.pestañas.add("Ingresar",ingresar).repaint();
                interfazPrincipal.pestañas.setSelectedIndex(3);
                interfazPrincipal.pestañas.setEnabledAt(0, false);
                interfazPrincipal.pestañas.setEnabledAt(1, false);
                interfazPrincipal.pestañas.setEnabledAt(2, false);
 
            }
        });
        
    }
}
