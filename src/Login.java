


import DataBase.Conexion;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    //Variables para almacenar la posición del mouse
    int xMouse, yMouse;

    public Login() {
        initComponents();
        
        //Indica que la ventana debe ser centrada en la pantalla
        this.setLocationRelativeTo(null);
        //Establece un título a la ventana 
        this.setTitle("Login");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        logoname = new javax.swing.JLabel();
        fondo_lateral = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btn_exit = new javax.swing.JPanel();
        txt_exit = new javax.swing.JLabel();
        logo_pequeño = new javax.swing.JLabel();
        iniciar_sesion = new javax.swing.JLabel();
        label_user = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        separador_user = new javax.swing.JSeparator();
        label_pass = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        separador_pass = new javax.swing.JSeparator();
        btn_login = new javax.swing.JPanel();
        txt_login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(840, 500));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Login/Logo-Izquierdo.png"))); // NOI18N
        background.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 320, 170));

        logoname.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname.setText("COBROS S.A.");
        background.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 290, 320, -1));

        fondo_lateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Login/Fondo.png"))); // NOI18N
        fondo_lateral.setToolTipText("");
        background.add(fondo_lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 320, 500));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(255, 255, 255));

        txt_exit.setFont(new java.awt.Font("Yu Gothic Light", 1, 18)); // NOI18N
        txt_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_exit.setText("X");
        txt_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_exitLayout = new javax.swing.GroupLayout(btn_exit);
        btn_exit.setLayout(btn_exitLayout);
        btn_exitLayout.setHorizontalGroup(
            btn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        btn_exitLayout.setVerticalGroup(
            btn_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_exit, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 790, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        logo_pequeño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_pequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_Login/Logo-reducido.png"))); // NOI18N
        background.add(logo_pequeño, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 50, 50));

        iniciar_sesion.setFont(new java.awt.Font("Courier New", 1, 30)); // NOI18N
        iniciar_sesion.setText("INICIAR SESION");
        background.add(iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        label_user.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        label_user.setText("USUARIO");
        background.add(label_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txt_user.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt_user.setForeground(new java.awt.Color(204, 204, 204));
        txt_user.setText("Ingrese su nombre de usuario");
        txt_user.setBorder(null);
        txt_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_userMousePressed(evt);
            }
        });
        background.add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 400, 30));
        background.add(separador_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 400, -1));

        label_pass.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        label_pass.setText("CONTRASEÑA");
        background.add(label_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        txt_pass.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        txt_pass.setForeground(new java.awt.Color(204, 204, 204));
        txt_pass.setText("*****");
        txt_pass.setBorder(null);
        txt_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_passMousePressed(evt);
            }
        });
        background.add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 400, 30));
        background.add(separador_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 400, -1));

        btn_login.setBackground(new java.awt.Color(203, 231, 234));

        txt_login.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        txt_login.setForeground(new java.awt.Color(0, 51, 51));
        txt_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_login.setText("ENTRAR");
        txt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_loginMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_loginLayout = new javax.swing.GroupLayout(btn_login);
        btn_login.setLayout(btn_loginLayout);
        btn_loginLayout.setHorizontalGroup(
            btn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_login, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        btn_loginLayout.setVerticalGroup(
            btn_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        //Se almacena la posición "x" & "y" en las siguientes variables...
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        //Evento cuando el mouse es arrastrado con la ventana
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void txt_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exitMouseClicked
        //Función para cerrar la ventana
        System.exit(0);
    }//GEN-LAST:event_txt_exitMouseClicked

    private void txt_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exitMouseEntered
        //Efecto hover de entrada del mouse cuando entra al panel
        btn_exit.setBackground(Color.darkGray);
        txt_exit.setForeground(Color.white);
    }//GEN-LAST:event_txt_exitMouseEntered

    private void txt_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exitMouseExited
        //Efecto hover de salida del mouse
        btn_exit.setBackground(Color.white);
        txt_exit.setForeground(Color.darkGray);
    }//GEN-LAST:event_txt_exitMouseExited

    private void txt_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_loginMouseEntered
        //Efecto hover de entrada del mouse cuando entra al panel
        btn_login.setBackground(new Color(203, 240, 255));
    }//GEN-LAST:event_txt_loginMouseEntered

    private void txt_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_loginMouseExited
        //Efecto hover de salida del mouse
        btn_login.setBackground(new Color(203, 231, 234));
    }//GEN-LAST:event_txt_loginMouseExited

    private void txt_userMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_userMousePressed
        /*Validar el campo clickeado se ponga vacio siempre cuando el texto de 
            contenido en él sea el que tiene por defecto*/
        if(txt_user.getText().equals("Ingrese su nombre de usuario")){
            txt_user.setText("");
            txt_user.setForeground(Color.black);
        }
        /* Y el otro campo regresará a su texto por defecto siempre y cuando
            se encuentra vacío*/
        if(String.valueOf(txt_pass.getPassword()).isEmpty()){
            txt_pass.setText("*****");
            txt_pass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_userMousePressed

    private void txt_passMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passMousePressed
        /*Validar el campo clickeado se ponga vacio siempre cuando el texto de 
            contenido en él sea el que tiene por defecto*/
        if(String.valueOf(txt_pass.getPassword()).equals("*****")){
            txt_pass.setText("");
            txt_pass.setForeground(Color.black);
        }
        /* Y el otro campo regresará a su texto por defecto siempre y cuando
            se encuentra vacío*/
        if(txt_user.getText().isEmpty()){
            txt_user.setText("Ingrese su nombre de usuario");
            txt_user.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txt_passMousePressed

    private void txt_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_loginMouseClicked
        //Mostrará la interfaz del menú principal del sistema
        /*Back abrir = new Back();
        abrir.setVisible(true);
        realizarInicioSesion();
        dispose();*/
        
        String usuario = txt_user.getText();
        String pass = txt_pass.getText();
        
        if (pass.isEmpty() || usuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo obligatorio");
        } else {
            Conexion conectar = new Conexion();
            Statement st = conectar.Conectar();
        }
        Conexion conectar = new Conexion();
        Statement st = conectar.Conectar();
        
        try {
            ResultSet rs = st.executeQuery("SELECT * FROM tblUsers Where usuario='"+usuario+"'and clave='"+pass+"'");
            rs.last();
            int encontrado = rs.getRow();
            if (encontrado == 1) {
                JOptionPane.showMessageDialog(null, "Login Exitoso");
                Back abrir = new Back();
                abrir.setVisible(true);
                hide();
            } else {
                txt_user.setText("");
                txt_pass.setText("");
                JOptionPane.showMessageDialog(null, "Crendenciales incorrectas");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_txt_loginMouseClicked

    
    public void realizarInicioSesion() {
    int intentosMaximos = 3;
    int intentoActual = 1;
    boolean exito = false;

    while (intentoActual <= intentosMaximos && !exito) {
        try {
            boolean resultado = ToleranciaFallosInicioSesion.iniciarSesion();
            if (resultado) {
                exito = true;
                System.out.println("Inicio de sesión exitoso");
                // Mostrar la interfaz del menú principal del sistema
                Back abrir = new Back();
                abrir.setVisible(true);
                dispose();
            } else {
                System.out.println("Credenciales incorrectas");
                intentoActual++;
                if (intentoActual <= intentosMaximos) {
                    System.out.println("Intentando nuevamente...");
                } else {
                    System.out.println("Se excedió el número máximo de intentos");
                }
            }
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
                intentoActual++;
                if (intentoActual <= intentosMaximos) {
                    System.out.println("Intentando nuevamente...");
                } else {
                    System.out.println("Se excedió el número máximo de intentos");
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel btn_exit;
    private javax.swing.JPanel btn_login;
    private javax.swing.JLabel fondo_lateral;
    private javax.swing.JPanel header;
    private javax.swing.JLabel iniciar_sesion;
    private javax.swing.JLabel label_pass;
    private javax.swing.JLabel label_user;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logo_pequeño;
    private javax.swing.JLabel logoname;
    private javax.swing.JSeparator separador_pass;
    private javax.swing.JSeparator separador_user;
    private javax.swing.JLabel txt_exit;
    private javax.swing.JLabel txt_login;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
