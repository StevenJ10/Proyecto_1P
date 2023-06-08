

public class Back extends javax.swing.JFrame {

    public Back() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        cobros_s_a1 = new javax.swing.JLabel();
        boton_buscar1 = new javax.swing.JButton();
        texto_buscar1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnModuloPropietarios = new javax.swing.JButton();
        btnModuloPagos = new javax.swing.JButton();
        btnModuloImpuestos = new javax.swing.JButton();
        btnModuloRecargos = new javax.swing.JButton();
        btnModuloCuenta = new javax.swing.JButton();
        text_home = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(1080, 650));
        setMinimumSize(new java.awt.Dimension(1080, 650));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 650));

        background.setBackground(new java.awt.Color(181, 218, 238));
        background.setMaximumSize(new java.awt.Dimension(1080, 650));
        background.setMinimumSize(new java.awt.Dimension(1080, 650));
        background.setPreferredSize(new java.awt.Dimension(1080, 650));
        background.setRequestFocusEnabled(false);
        background.setVerifyInputWhenFocusTarget(false);
        background.setLayout(null);

        cobros_s_a1.setFont(new java.awt.Font("Baskerville Old Face", 0, 60)); // NOI18N
        cobros_s_a1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cobros_s_a1.setText("COBROS S.A.");
        background.add(cobros_s_a1);
        cobros_s_a1.setBounds(340, 10, 380, 60);

        boton_buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        boton_buscar1.setBorder(null);
        boton_buscar1.setBorderPainted(false);
        boton_buscar1.setContentAreaFilled(false);
        boton_buscar1.setFocusPainted(false);
        background.add(boton_buscar1);
        boton_buscar1.setBounds(995, 65, 60, 60);

        texto_buscar1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        texto_buscar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        background.add(texto_buscar1);
        texto_buscar1.setBounds(730, 70, 320, 50);

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1);
        jButton1.setBounds(930, 10, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen_top.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1080, 630));
        background.add(jLabel1);
        jLabel1.setBounds(-410, 0, 1500, 140);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setLayout(null);

        btnModuloPropietarios.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloPropietarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Propietario.png"))); // NOI18N
        btnModuloPropietarios.setText("Propieratos");
        btnModuloPropietarios.setBorderPainted(false);
        btnModuloPropietarios.setContentAreaFilled(false);
        btnModuloPropietarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModuloPropietarios.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnModuloPropietarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModuloPropietarios.setIconTextGap(5);
        btnModuloPropietarios.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnModuloPropietarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModuloPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloPropietariosActionPerformed(evt);
            }
        });
        jPanel3.add(btnModuloPropietarios);
        btnModuloPropietarios.setBounds(30, 20, 210, 170);

        btnModuloPagos.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pagos.png"))); // NOI18N
        btnModuloPagos.setText("Pagos");
        btnModuloPagos.setContentAreaFilled(false);
        btnModuloPagos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModuloPagos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnModuloPagos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModuloPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloPagosActionPerformed(evt);
            }
        });
        jPanel3.add(btnModuloPagos);
        btnModuloPagos.setBounds(220, 210, 210, 170);

        btnModuloImpuestos.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloImpuestos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Impuestos.png"))); // NOI18N
        btnModuloImpuestos.setText("Impuestos");
        btnModuloImpuestos.setContentAreaFilled(false);
        btnModuloImpuestos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModuloImpuestos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnModuloImpuestos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModuloImpuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloImpuestosActionPerformed(evt);
            }
        });
        jPanel3.add(btnModuloImpuestos);
        btnModuloImpuestos.setBounds(410, 20, 210, 170);

        btnModuloRecargos.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloRecargos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recargos.png"))); // NOI18N
        btnModuloRecargos.setText("Recargos");
        btnModuloRecargos.setContentAreaFilled(false);
        btnModuloRecargos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModuloRecargos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnModuloRecargos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModuloRecargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloRecargosActionPerformed(evt);
            }
        });
        jPanel3.add(btnModuloRecargos);
        btnModuloRecargos.setBounds(770, 20, 210, 170);

        btnModuloCuenta.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Usuario.png"))); // NOI18N
        btnModuloCuenta.setText("Mi Cuenta");
        btnModuloCuenta.setContentAreaFilled(false);
        btnModuloCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnModuloCuenta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnModuloCuenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnModuloCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloCuentaActionPerformed(evt);
            }
        });
        jPanel3.add(btnModuloCuenta);
        btnModuloCuenta.setBounds(590, 210, 210, 170);

        background.add(jPanel3);
        jPanel3.setBounds(30, 180, 1020, 400);

        text_home.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        text_home.setText("Home");
        background.add(text_home);
        text_home.setBounds(30, 150, 110, 30);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setText("2023 Cobros S.A.");
        background.add(jLabel2);
        jLabel2.setBounds(920, 610, 140, 21);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModuloPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloPagosActionPerformed
        //Mostrará la interfaz del Modulo Pagos
        Modulo_Pagos mp =new Modulo_Pagos();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModuloPagosActionPerformed

    private void btnModuloPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloPropietariosActionPerformed
        //Mostrará la interfaz del Modulo Propietarios
        Modulo_Propietarios mp =new Modulo_Propietarios();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModuloPropietariosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Oculta la ventana actual y muestra la nueva ventana que se socilita
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnModuloImpuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloImpuestosActionPerformed
        //Mostrará la interfaz del Modulo Impuestos
        Modulo_Impuestos mi = new Modulo_Impuestos();
        mi.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModuloImpuestosActionPerformed

    private void btnModuloCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloCuentaActionPerformed
        //Mostrará la interfaz del Modulo Mi Cuenta
        Modulo_MiCuenta mc = new Modulo_MiCuenta();
        mc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModuloCuentaActionPerformed

    private void btnModuloRecargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloRecargosActionPerformed
        //Mostrará la interfaz del Modulo Recargos
        Modulo_Recargos mr = new Modulo_Recargos();
        mr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModuloRecargosActionPerformed

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
            java.util.logging.Logger.getLogger(Back.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Back.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Back.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Back.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Back().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton boton_buscar1;
    private javax.swing.JButton btnModuloCuenta;
    private javax.swing.JButton btnModuloImpuestos;
    private javax.swing.JButton btnModuloPagos;
    private javax.swing.JButton btnModuloPropietarios;
    private javax.swing.JButton btnModuloRecargos;
    private javax.swing.JLabel cobros_s_a1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel text_home;
    private javax.swing.JTextField texto_buscar1;
    // End of variables declaration//GEN-END:variables
}
