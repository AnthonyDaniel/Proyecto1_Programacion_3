package Modelo.Conexiones;

import Vista.Carrito.ComprarContenedor;
import Vista.MDI.InterfazMDI;
import Vista.Publicaciones.Productos;
import com.mysql.jdbc.Connection;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ConexionPublicacionComputadoras extends Conexion{
    
    public InterfazMDI interfazPrincipal ;
    public ComprarContenedor cc;
    public int impar = 2;
    
    public ConexionPublicacionComputadoras(InterfazMDI e, ComprarContenedor _cc) {
        super(e);
        interfazPrincipal = e;
        cc = _cc;
        mostrarP();
        interfazPrincipal.repaint();
    }
    
      public boolean agregar(String codigo,String titu,String des,String precio,FileInputStream archivo){
           try{
               on = (Connection)this.conexion();
               PreparedStatement pps = on.prepareStatement("INSERT INTO proyecto1.producto(codigo,titulo,descripcion,precio,imagen) VALUES(?,?,?,?,?)");
               pps.setString(1, codigo);
               pps.setString(2, titu);
               pps.setString(3, des);
               pps.setString(4, precio);
               pps.setBinaryStream(5, archivo);
               pps.executeUpdate();
               interfazPrincipal.contenedorProductos.removeAll();
               mostrarP();
               interfazPrincipal.repaint();
               return true;
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Error, Imagen demasiado grande");
         }
       return false;
     }   
    public void mostrarP(){
           try {
             on = (java.sql.Connection) this.conexion();
             consulta = on.prepareStatement("SELECT * FROM proyecto1.producto");
             datos = consulta.executeQuery();
             
             while(datos.next()){
                  
                 Productos tp = new Productos(this,interfazPrincipal, cc);
                 tp.setVisible(true);

                 tp.titulo.setText(datos.getString("titulo"));
                 tp.codigo.setText(datos.getString("codigo"));
                 tp.descripcion.setText(datos.getString("descripcion"));
                 tp.precio.setText(datos.getString("precio"));
              
                 Blob blob = datos.getBlob(5);
                 
                 byte[] data = blob.getBytes(1,(int)blob.length());
                
                 BufferedImage img = null;
                 
                 try{
                    img = ImageIO.read(new ByteArrayInputStream(data));
                 }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Error al leer imagen"); 
                 }
                 
                 ImageIcon icon = new ImageIcon(img);
            
                 Icon icono = new ImageIcon(icon.getImage().getScaledInstance(342, 261, Image.SCALE_DEFAULT));
                 tp.imagen.setIcon(icono);

               interfazPrincipal.contenedorProductos.add(tp);
               
               impar++;
             }    
         } catch (Exception e) {

             JOptionPane.showMessageDialog(null, "Existe un error: " + e);
         }
    }
    public boolean eliminar(Productos e){
          try {
                on = (java.sql.Connection) this.conexion();
                PreparedStatement pps = on.prepareStatement("DELETE FROM proyecto1.producto WHERE codigo=?");
                pps.setString(1, e.codigo.getText());
                return pps.executeUpdate() == 1;
                
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error Eliminar: " + e, "Error", JOptionPane.ERROR_MESSAGE,null);
        }
         return false;
    }
}
