package Modelo.Conexiones;


import Vista.MDI.InterfazMDI;
import Vista.AccesosLoginRegistro.Registrar;
import Vista.AccesosLoginRegistro.UsuarioAgregarMDI;
import Vista.AccesosLoginRegistro.Usuarios;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConexionUsuario extends Conexion {
   
    private Registrar registrar; // Con esta clase podemos habilitar los botones de registrar y las validaciones correspondientes
    private Usuarios user; //Con esta clase comenzare moldeare los datos para que se impriman en una lista
    private UsuarioAgregarMDI uAgregarMDI; // Este metodo solo esta disponible para el desarrolador, es para facilitarle al momento de agregar
    
    public ConexionUsuario(InterfazMDI e) {
        super(e);
        uAgregarMDI = new UsuarioAgregarMDI(this);
        registrar = new Registrar(e);
        e.agregarAdmin.add(uAgregarMDI).repaint();
    }
  
    public boolean login(String correo, String contra){ //Login, dos tipos de usuarios, Admin y estandar
         try {
             on = (Connection) this.conexion();
             consulta = on.prepareStatement("SELECT correo, nombre, apellidos, contraseña FROM proyecto1.usuario WHERE correo='"+correo+"'AND COntraseña='"+contra+"'");
             datos = consulta.executeQuery(); 
         
             while(datos.next()){   
                 if(datos.getString("correo").equals("admin") && datos.getString("contraseña").equals("1234")){
                    interfazPrincipal.modo.setText("Alministrador");
                    interfazPrincipal.ingresar.setVisible(false);
                    interfazPrincipal.registrar.setVisible(false);
                    interfazPrincipal.agregar.setEnabled(true);
                    uAgregarMDI.setVisible(true);
                    mostrar();
                    return true;
                 }else if(datos.getString("correo").equals(correo) && datos.getString("Contraseña").equals(contra)){
                    user = new Usuarios(this);
                    interfazPrincipal.modo.setText("Estandar");
                    user.correo.setText(datos.getString("correo"));
                    user.nombre.setText(datos.getString("nombre"));
                    user.apellidos.setText(datos.getString("apellidos"));
                    user.contraseña.setText(datos.getString("contraseña"));
                    interfazPrincipal.contenedorUsuarios.add(user);
                    
                    user.eliminar.addActionListener(new ActionListener() { 
                        
                     public void actionPerformed(ActionEvent ae) {
                        if(eliminar(user)){
                            interfazPrincipal.contenedorUsuarios.removeAll();
                            interfazPrincipal.repaint();
                            cerrarSesion();
                            }
                          }
                     });
                    return true;
                 }
             }
                
         } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE,null);
         }
      return false;
    }
    //Este metodo solo estara disponible para el administrador, y lo que hace es agregar usuarios de una manera muy intuitiva 
     public boolean agregarAdmin(){
        
      if(validarCompletado()){
       
         if(agregar(uAgregarMDI.correo.getText(),uAgregarMDI.nombre.getText(),uAgregarMDI.apellidos.getText(),uAgregarMDI.contraseña.getText())){
              interfazPrincipal.contenedorUsuarios.removeAll();
              interfazPrincipal.repaint();
              mostrar();
              limpiarUsuarioAgregarMDI();
              JOptionPane.showMessageDialog(null, "El usuario fue agregado correctamente");
             return true;
         }else{
             limpiarUsuarioAgregarMDI();
             JOptionPane.showMessageDialog(null, "El usuario ya existe");
             return false;
         }
      }else{
          JOptionPane.showMessageDialog(null, "Todos los espacios deben contener información");
          return false;
      }
     }
     //Este metodo valida si todos los campos estan llenos con alguin tipo de informacion (uAgregarMDI)
     public boolean validarCompletado(){
         
         if((uAgregarMDI.nombre.getText().equals("") || uAgregarMDI.apellidos.getText().equals("") 
            || uAgregarMDI.contraseña.getText().equals("") || uAgregarMDI.correo.getText().equals(""))){
             return false;
         }else{
             return true;
         }
     
     }
     //Este metodo limpia el jpanel UsuarioAgregarMDI (El que solo es para el administrador)
     public void limpiarUsuarioAgregarMDI(){
         uAgregarMDI.nombre.setText("");
         uAgregarMDI.apellidos.setText("");
         uAgregarMDI.correo.setText("");
         uAgregarMDI.contraseña.setText("");
     }
     //Este metodo es el agregar principal, aqui esta la logica del metodo >|<
     public boolean agregar(String cor,String nom,String ape,String contr){
     
         if(!login(cor,contr)){
           try{
               PreparedStatement pps = on.prepareStatement("INSERT INTO proyecto1.usuario(correo,nombre,apellidos,Contraseña) VALUES(?,?,?,?)");
               pps.setString(1, cor);
               pps.setString(2, nom);
               pps.setString(3, ape);
               pps.setString(4, contr);

               pps.executeUpdate();
               return true;
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE,null);
         }
       
       }
       return false;
     }
     public void mostrar(){
         try {
             on = (Connection) this.conexion();
             consulta = on.prepareStatement("SELECT * FROM proyecto1.usuario");
             datos = consulta.executeQuery();
             
             while(datos.next()){
                  user = new Usuarios(this);
                  user.correo.setText(datos.getString("correo"));
                  user.nombre.setText(datos.getString("nombre"));
                  user.apellidos.setText(datos.getString("apellidos"));
                  user.contraseña.setText(datos.getString("contraseña"));
           
                    if(interfazPrincipal.color % 2 == 0){
                        user.setBackground(Color.LIGHT_GRAY);
                    }else{
                         user.setBackground(Color.GRAY);
                    }
                    interfazPrincipal.color++;
                    
                    interfazPrincipal.contenedorUsuarios.add(user).repaint();
             }    
         } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Error mostrar: " + e, "Error", JOptionPane.ERROR_MESSAGE,null);
         }
     } 
     //Este metodo permitira Eliminar
     public boolean eliminar(Usuarios e){     
        try {
            if(!(e.correo.getText().equals("admin"))){
                on = (Connection) this.conexion();
                PreparedStatement pps = on.prepareStatement("DELETE FROM proyecto1.usuario WHERE correo=?");
                pps.setString(1, e.correo.getText());
                return pps.executeUpdate() == 1;
            }else{
                JOptionPane.showMessageDialog(null, "El administrador no se puede borrar");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Eliminar: " + e, "Error", JOptionPane.ERROR_MESSAGE,null);
        }
         return false;
     }
     //Este metodo puede modificar los datos
     public boolean modificar(Usuarios e){    
      
       if(verificarModificarEspacios(e)){
        try {
            if(!(e.correo.getText().equals("admin"))){
                on = (Connection) this.conexion();
                PreparedStatement pps = on.prepareStatement("UPDATE proyecto1.usuario SET nombre='"+e.nombre.getText()+"',apellidos='"+e.apellidos.getText()+"',contraseña='"+e.contraseña.getText()+
                "' WHERE correo='"+e.correo.getText()+"'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Se han actualizado los registros del usuario");
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "El administrador no se puede modificar");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Modificar: " + e, "Error", JOptionPane.ERROR_MESSAGE,null);
        }
         return false;
       }else{
           JOptionPane.showMessageDialog(null, "No dejar espacios en blanco");
           return false;
       }  
        
     }
     //Este metodo verifica si los espacios estan llenos en modificar
     public boolean verificarModificarEspacios(Usuarios e){
         if(e.nombre.getText().equals("") || e.apellidos.getText().equals("") || e.contraseña.getText().equals("") || e.correo.getText().equals("")){
             return false;
         }else{
             return true;
         }
     }
     //Este metodo cierra sesión
     public void cerrarSesion(){
        String path = "/Imagenes/adios.gif";  
        URL url = this.getClass().getResource(path);
        System.out.println(url);
        ImageIcon icon = new ImageIcon(url);
        JOptionPane.showMessageDialog(null, "", "Adios", JOptionPane.INFORMATION_MESSAGE, icon);     
        JOptionPane.showMessageDialog(null, " Gracias por ver sido parte de la comunidad, esperamos que vuelva");
         try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            
        }
         System.exit(0);
     }
}
