package Modelo;
//
//import com.mysql.jdbc.Connection;
//import java.awt.Image;
//import java.awt.image.BufferedImage;
//import java.io.ByteArrayInputStream;
//import java.io.FileInputStream;
//import java.sql.Blob;
//import java.sql.PreparedStatement;
//import javax.imageio.ImageIO;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
//import javax.swing.JOptionPane;
//
//public class ConexionPublicacionComputadoras extends Conexion{
//    
//    public interfazPrincipal ip ;
//    public int impar = 2;
//    
//    public ConexionPublicacionComputadoras(interfazPrincipal e) {
//        super(e);
//        ip = e;
//    }
//    
//      public boolean agregar(String codigo,String des,String precio,String ruta,FileInputStream archivo){
//           try{
//               on = (Connection)this.conexion();
//               PreparedStatement pps = on.prepareStatement("INSERT INTO proyecto."+ruta+"(Codigo,Descripcion,Precio,Imagen) VALUES(?,?,?,?)");
//               pps.setString(1, codigo);
//               pps.setString(2, des);
//               pps.setString(3, precio);
//               pps.setBinaryStream(4, archivo);
//               pps.executeUpdate();
//               ip.compuPanel.removeAll();
//               mostrarP();
//               return true;
//         }catch(Exception e){
//             JOptionPane.showMessageDialog(null, "Error, Imagen demasiado grande");
//         }
//       return false;
//     }   
//    public void mostrarP(){
//           try {
//             on = (java.sql.Connection) this.conexion();
//             consulta = on.prepareStatement("SELECT * FROM proyecto.computadoras");
//             datos = consulta.executeQuery();
//             
//             while(datos.next()){
//                 
//                 TablaPublicaciones tp = new TablaPublicaciones(this);
//                 tp.setVisible(true);
//
//                 tp.cod.setText(datos.getString("Codigo"));
//                 tp.des.setText(datos.getString("Descripcion"));
//                 tp.pres.setText(datos.getString("Precio"));
//              
//                 Blob blob = datos.getBlob(4);
//                 
//                 byte[] data = blob.getBytes(1,(int)blob.length());
//                
//                 BufferedImage img = null;
//                 
//                 try{
//                    img = ImageIO.read(new ByteArrayInputStream(data));
//                 }catch(Exception e){
//                    JOptionPane.showMessageDialog(null, "Error al leer imagen");
//                 }
//                 
//                 ImageIcon icon = new ImageIcon(img);
//            
//                 Icon icono = new ImageIcon(icon.getImage().getScaledInstance(450, 300, Image.SCALE_DEFAULT));
//                 tp.img.setText("");
//                 tp.img.setIcon(icono);
//
//               ip.compuPanel.add(tp);
//               impar++;
//             }    
//     
//         } catch (Exception e) {
//
//             JOptionPane.showMessageDialog(null, "Existe un error: " + e);
//         }
//
//    }
//}
