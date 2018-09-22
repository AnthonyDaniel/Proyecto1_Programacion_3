
package Modelo;

import Vista.InterfazMDI;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {

    //Atributos necesarios para la conexion a la Base de datos.
    public Connection on; //necesario para la conexion
    public PreparedStatement consulta;//Sirve para realizar consultas
    public ResultSet datos; // Sirve para guardar de manera local los datos recompilados de la BD
    public InterfazMDI interfazPrincipal; //Creacion de la interfaz principal, para aplicar inyeccion de codigo
   
    public Conexion(InterfazMDI e){ //contructor con parametros, para aplicai inyeccion de codigo
        interfazPrincipal = e;                                  //Y poder trar conmigo el obeto unico de la interfaz, sin volver a crear otro
    }
public Connection conexion(){ //Esta es la funcion más importante, esta conecta con la base de datos
    
        try{
           Class.forName("com.mysql.jdbc.Driver"); // llamar el driver para poder vincular al servidor
           on = DriverManager.getConnection("jdbc:mysql://localhost/proyecto1", "root" , ""); //Tenemos que dar la direcion exacta a nuestras tablas mysql y de una, tabien el login
           interfazPrincipal.indicador.setBackground(Color.GREEN); //indicador de concexion, verde, para conexion establecidad
        }catch(Exception e){
           interfazPrincipal.indicador.setBackground(Color.RED); //Indicador de conexion, rojo, para conexion fallida
           JOptionPane.showMessageDialog(null, "Existen errores al conectar con el servidor");
        }

        return on;
    }
}
