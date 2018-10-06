
package Vista;

import com.sun.awt.AWTUtilities;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
 
public class InterfazMDI extends javax.swing.JFrame {

    public int color; // Esta variable para darle color a las publicaciones y usuarios
    
    public InterfazMDI() {
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.png")).getImage());
        setLayout(null);
        initComponents();
        agregar.setEnabled(false);
        esquinasCurvasFrame();
        setLocationRelativeTo(null);
        setVisible(true);
        color = 2;
    }

    public void esquinasCurvasFrame(){ //Curvar las esquinas del Frame principal
        Shape forma = new RoundRectangle2D.Double(0,0,this.getBounds().width,this.getBounds().height,27,27);
        AWTUtilities.setWindowShape(this, forma);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        compras = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ingresar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        indicador = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        modo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pestañas = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenedorProductos = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        contenedorUsuarios = new javax.swing.JPanel();
        agregarAdmin = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        panelPrincipal.setForeground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/X2.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        compras.setBackground(new java.awt.Color(102, 0, 0));
        compras.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.darkGray));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito.png"))); // NOI18N

        javax.swing.GroupLayout comprasLayout = new javax.swing.GroupLayout(compras);
        compras.setLayout(comprasLayout);
        comprasLayout.setHorizontalGroup(
            comprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comprasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        comprasLayout.setVerticalGroup(
            comprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ingresar.setBackground(new java.awt.Color(51, 51, 51));
        ingresar.setForeground(new java.awt.Color(204, 204, 204));
        ingresar.setText("Ingresar");
        ingresar.setBorderPainted(false);

        registrar.setBackground(new java.awt.Color(51, 51, 51));
        registrar.setForeground(new java.awt.Color(204, 204, 204));
        registrar.setText("Registrar");
        registrar.setBorderPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ingresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(compras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(registrar)
                        .addComponent(ingresar))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(compras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        indicador.setBackground(new java.awt.Color(102, 102, 0));

        javax.swing.GroupLayout indicadorLayout = new javax.swing.GroupLayout(indicador);
        indicador.setLayout(indicadorLayout);
        indicadorLayout.setHorizontalGroup(
            indicadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        indicadorLayout.setVerticalGroup(
            indicadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Conexion:");

        modo.setBackground(new java.awt.Color(204, 204, 204));
        modo.setForeground(new java.awt.Color(204, 204, 204));
        modo.setText("Modo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(indicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(modo))
                    .addComponent(indicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logito.png"))); // NOI18N

        pestañas.setBackground(new java.awt.Color(51, 51, 51));
        pestañas.setForeground(new java.awt.Color(204, 204, 204));
        pestañas.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        pestañas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pestañas.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        pestañas.setVerifyInputWhenFocusTarget(false);

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        contenedorProductos.setBackground(new java.awt.Color(255, 255, 255));
        contenedorProductos.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(contenedorProductos);

        agregar.setBackground(new java.awt.Color(51, 51, 51));
        agregar.setForeground(new java.awt.Color(204, 204, 204));
        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        agregar.setText("Agregar Publicación");
        agregar.setBorderPainted(false);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
            .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregar))
        );

        pestañas.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/computadora.png")), jPanel14, "Productos"); // NOI18N

        jPanel15.setBackground(new java.awt.Color(153, 153, 153));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        contenedorUsuarios.setBackground(new java.awt.Color(153, 153, 153));
        contenedorUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contenedorUsuarios.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane2.setViewportView(contenedorUsuarios);

        agregarAdmin.setBackground(new java.awt.Color(102, 102, 102));
        agregarAdmin.setLayout(new java.awt.GridLayout(0, 1));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(agregarAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel15Layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 87, Short.MAX_VALUE)))
        );

        pestañas.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png")), jPanel15, "Usuarios"); // NOI18N

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        pestañas.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Imagenes/acerca.png")), jPanel16, "Acerca de..."); // NOI18N

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pestañas)))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pestañas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pestañas.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0); //Boton de salida (x) para salir del sistema por completo
    }//GEN-LAST:event_jButton1ActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton agregar;
    public javax.swing.JPanel agregarAdmin;
    private javax.swing.JPanel compras;
    public javax.swing.JPanel contenedorProductos;
    public javax.swing.JPanel contenedorUsuarios;
    public javax.swing.JPanel indicador;
    public javax.swing.JButton ingresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel modo;
    public javax.swing.JPanel panelPrincipal;
    public javax.swing.JTabbedPane pestañas;
    public javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
