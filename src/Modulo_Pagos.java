


public class Modulo_Pagos extends javax.swing.JFrame {

    public Modulo_Pagos() {
        initComponents();
        
        //Indica que la ventana debe ser centrada en la pantalla
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        boton_flecha_adelante1 = new javax.swing.JButton();
        boton_flecha_atras1 = new javax.swing.JButton();
        boton_home1 = new javax.swing.JButton();
        refresh1 = new javax.swing.JButton();
        boton_buscar1 = new javax.swing.JButton();
        texto_buscar1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        cobros_s_a1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        V_Prefectura = new javax.swing.JButton();
        V_SRI = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnModuloImpuestos2 = new javax.swing.JButton();
        btnModuloRecargos2 = new javax.swing.JButton();
        btnModuloCuenta2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnModuloPagos2 = new javax.swing.JButton();
        btnModuloPropietarios2 = new javax.swing.JButton();
        btnModuloRecargos3 = new javax.swing.JButton();
        btnModuloRecargos5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        background.setBackground(new java.awt.Color(181, 218, 238));
        background.setPreferredSize(new java.awt.Dimension(1500, 850));
        background.setRequestFocusEnabled(false);
        background.setVerifyInputWhenFocusTarget(false);
        background.setLayout(null);

        boton_flecha_adelante1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha_derecha.png"))); // NOI18N
        boton_flecha_adelante1.setBorder(null);
        boton_flecha_adelante1.setBorderPainted(false);
        boton_flecha_adelante1.setContentAreaFilled(false);
        boton_flecha_adelante1.setFocusPainted(false);
        boton_flecha_adelante1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_flecha_adelante1ActionPerformed(evt);
            }
        });
        background.add(boton_flecha_adelante1);
        boton_flecha_adelante1.setBounds(90, 60, 60, 60);

        boton_flecha_atras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flecha_izq (1).png"))); // NOI18N
        boton_flecha_atras1.setBorder(null);
        boton_flecha_atras1.setBorderPainted(false);
        boton_flecha_atras1.setContentAreaFilled(false);
        boton_flecha_atras1.setFocusPainted(false);
        boton_flecha_atras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_flecha_atras1ActionPerformed(evt);
            }
        });
        background.add(boton_flecha_atras1);
        boton_flecha_atras1.setBounds(20, 60, 60, 60);

        boton_home1.setBackground(java.awt.SystemColor.desktop);
        boton_home1.setForeground(new java.awt.Color(240, 240, 240));
        boton_home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        boton_home1.setBorder(null);
        boton_home1.setBorderPainted(false);
        boton_home1.setContentAreaFilled(false);
        boton_home1.setFocusPainted(false);
        boton_home1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_home1ActionPerformed(evt);
            }
        });
        background.add(boton_home1);
        boton_home1.setBounds(250, 60, 60, 60);

        refresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh (1).png"))); // NOI18N
        refresh1.setBorder(null);
        refresh1.setBorderPainted(false);
        refresh1.setContentAreaFilled(false);
        refresh1.setFocusPainted(false);
        background.add(refresh1);
        refresh1.setBounds(170, 60, 60, 60);

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

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        background.add(jButton3);
        jButton3.setBounds(910, 10, 130, 40);

        cobros_s_a1.setFont(new java.awt.Font("Baskerville Old Face", 0, 60)); // NOI18N
        cobros_s_a1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cobros_s_a1.setText("COBROS S.A.");
        background.add(cobros_s_a1);
        cobros_s_a1.setBounds(340, 10, 380, 60);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen_top.jpg"))); // NOI18N
        background.add(jLabel2);
        jLabel2.setBounds(-420, 0, 1500, 140);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha_dere_sin (1).png"))); // NOI18N
        jLabel5.setFocusable(false);
        background.add(jLabel5);
        jLabel5.setBounds(130, 160, 30, 30);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));
        jPanel4.setLayout(null);

        V_Prefectura.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        V_Prefectura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Prefectura.png"))); // NOI18N
        V_Prefectura.setText(" Valores de la prefectura");
        V_Prefectura.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        V_Prefectura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        V_Prefectura.setIconTextGap(5);
        V_Prefectura.setMaximumSize(new java.awt.Dimension(150, 23));
        V_Prefectura.setMinimumSize(new java.awt.Dimension(150, 23));
        V_Prefectura.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        V_Prefectura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        V_Prefectura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_PrefecturaActionPerformed(evt);
            }
        });
        jPanel4.add(V_Prefectura);
        V_Prefectura.setBounds(180, 30, 220, 150);

        V_SRI.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        V_SRI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SRI.png"))); // NOI18N
        V_SRI.setText("Valores a pagar SRI");
        V_SRI.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        V_SRI.setMaximumSize(new java.awt.Dimension(150, 23));
        V_SRI.setMinimumSize(new java.awt.Dimension(150, 23));
        V_SRI.setPreferredSize(new java.awt.Dimension(153, 23));
        V_SRI.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        V_SRI.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        V_SRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_SRIActionPerformed(evt);
            }
        });
        jPanel4.add(V_SRI);
        V_SRI.setBounds(620, 30, 220, 150);

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pago_Online.png"))); // NOI18N
        jButton1.setText("Pago en Línea");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(180, 210, 220, 150);

        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/AMT.png"))); // NOI18N
        jButton2.setText("Valores de AMT");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(620, 210, 220, 150);

        background.add(jPanel4);
        jPanel4.setBounds(20, 270, 1020, 400);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setText("2023 Cobros S.A.");
        background.add(jLabel3);
        jLabel3.setBounds(900, 680, 140, 21);

        jPanel1.setBackground(new java.awt.Color(99, 184, 148));

        btnModuloImpuestos2.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloImpuestos2.setText("Impuestos");
        btnModuloImpuestos2.setBorder(null);
        btnModuloImpuestos2.setBorderPainted(false);
        btnModuloImpuestos2.setContentAreaFilled(false);
        btnModuloImpuestos2.setFocusable(false);
        btnModuloImpuestos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloImpuestos2ActionPerformed(evt);
            }
        });

        btnModuloRecargos2.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloRecargos2.setText("Recargos");
        btnModuloRecargos2.setBorder(null);
        btnModuloRecargos2.setBorderPainted(false);
        btnModuloRecargos2.setContentAreaFilled(false);
        btnModuloRecargos2.setFocusable(false);
        btnModuloRecargos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloRecargos2ActionPerformed(evt);
            }
        });

        btnModuloCuenta2.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloCuenta2.setText("Mi Cuenta");
        btnModuloCuenta2.setBorder(null);
        btnModuloCuenta2.setBorderPainted(false);
        btnModuloCuenta2.setContentAreaFilled(false);
        btnModuloCuenta2.setFocusable(false);
        btnModuloCuenta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloCuenta2ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(64, 149, 113));

        btnModuloPagos2.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloPagos2.setText("Pagos");
        btnModuloPagos2.setBorder(null);
        btnModuloPagos2.setBorderPainted(false);
        btnModuloPagos2.setContentAreaFilled(false);
        btnModuloPagos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloPagos2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btnModuloPagos2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnModuloPagos2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnModuloPropietarios2.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloPropietarios2.setText("Propietarios");
        btnModuloPropietarios2.setBorder(null);
        btnModuloPropietarios2.setBorderPainted(false);
        btnModuloPropietarios2.setContentAreaFilled(false);
        btnModuloPropietarios2.setFocusable(false);
        btnModuloPropietarios2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloPropietarios2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnModuloPropietarios2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(613, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 462, Short.MAX_VALUE)
                    .addComponent(btnModuloImpuestos2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(btnModuloRecargos2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(btnModuloCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModuloPropietarios2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnModuloImpuestos2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModuloRecargos2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModuloCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(jPanel1);
        jPanel1.setBounds(0, 200, 1070, 50);

        btnModuloRecargos3.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloRecargos3.setText("Home");
        btnModuloRecargos3.setBorder(null);
        btnModuloRecargos3.setBorderPainted(false);
        btnModuloRecargos3.setContentAreaFilled(false);
        btnModuloRecargos3.setFocusable(false);
        btnModuloRecargos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloRecargos3ActionPerformed(evt);
            }
        });
        background.add(btnModuloRecargos3);
        btnModuloRecargos3.setBounds(20, 155, 110, 40);

        btnModuloRecargos5.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloRecargos5.setText("Pagos");
        btnModuloRecargos5.setBorder(null);
        btnModuloRecargos5.setBorderPainted(false);
        btnModuloRecargos5.setContentAreaFilled(false);
        btnModuloRecargos5.setFocusable(false);
        btnModuloRecargos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloRecargos5ActionPerformed(evt);
            }
        });
        background.add(btnModuloRecargos5);
        btnModuloRecargos5.setBounds(150, 157, 110, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 1058, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_flecha_atras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_flecha_atras1ActionPerformed
        //Mostrará la interfaz del Modulo Home
        Back abrir = new Back();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_flecha_atras1ActionPerformed

    private void boton_home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_home1ActionPerformed
        //Mostrará la interfaz del Modulo Home
        Back abrir =new Back();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_home1ActionPerformed

    private void boton_flecha_adelante1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_flecha_adelante1ActionPerformed
        //Mostrará la interfaz del Modulo Impuestos
        Modulo_Impuestos mi =new Modulo_Impuestos();
        mi.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_flecha_adelante1ActionPerformed

    private void V_PrefecturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_PrefecturaActionPerformed
        //Oculta la ventana actual y muestra la nueva ventana que se socilita
        this.setVisible(false);
        Valores_Prefectura vp =new Valores_Prefectura();
        vp.setVisible(true);
    }//GEN-LAST:event_V_PrefecturaActionPerformed

    private void V_SRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_SRIActionPerformed
        //Oculta la ventana actual y muestra la nueva ventana que se socilita
        this.setVisible(false);
        Valores_SRI sri =new Valores_SRI();
        sri.setVisible(true);
    }//GEN-LAST:event_V_SRIActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Oculta la ventana actual y muestra la nueva ventana que se socilita
        this.setVisible(false);
        Pago_en_Linea pl =new Pago_en_Linea();
        pl.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Oculta la ventana actual y muestra la nueva ventana que se socilita
        this.setVisible(false);
        Valores_AMT v_a =new Valores_AMT();
        v_a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnModuloPropietarios2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloPropietarios2ActionPerformed
        //Mostrará la interfaz del Modulo Propietarios
        Modulo_Propietarios mp = new Modulo_Propietarios();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModuloPropietarios2ActionPerformed

    private void btnModuloPagos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloPagos2ActionPerformed
        //Mostrará la interfaz del Modulo Pagos
        Modulo_Pagos pagos = new Modulo_Pagos();
        pagos.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModuloPagos2ActionPerformed

    private void btnModuloRecargos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloRecargos3ActionPerformed
        //Mostrará la interfaz del Modulo Home "back"
        Back abrir = new Back();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModuloRecargos3ActionPerformed

    private void btnModuloRecargos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloRecargos5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModuloRecargos5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Oculta la ventana actual y muestra la nueva ventana que se socilita
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnModuloImpuestos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloImpuestos2ActionPerformed
        //Mostrará la interfaz del Modulo Impuestos
        Modulo_Impuestos mi = new Modulo_Impuestos();
        mi.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModuloImpuestos2ActionPerformed

    private void btnModuloRecargos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloRecargos2ActionPerformed
        //Mostrará la interfaz del Modulo Recargos
        Modulo_Recargos mr = new Modulo_Recargos();
        mr.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModuloRecargos2ActionPerformed

    private void btnModuloCuenta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloCuenta2ActionPerformed
        //Mostrará la interfaz del Modulo Mi Cuenta
        Modulo_MiCuenta cuenta = new Modulo_MiCuenta();
        cuenta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModuloCuenta2ActionPerformed

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
            java.util.logging.Logger.getLogger(Modulo_Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo_Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo_Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo_Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Modulo_Pagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton V_Prefectura;
    private javax.swing.JButton V_SRI;
    private javax.swing.JPanel background;
    private javax.swing.JButton boton_buscar1;
    private javax.swing.JButton boton_flecha_adelante1;
    private javax.swing.JButton boton_flecha_atras1;
    private javax.swing.JButton boton_home1;
    private javax.swing.JButton btnModuloCuenta2;
    private javax.swing.JButton btnModuloImpuestos2;
    private javax.swing.JButton btnModuloPagos2;
    private javax.swing.JButton btnModuloPropietarios2;
    private javax.swing.JButton btnModuloRecargos2;
    private javax.swing.JButton btnModuloRecargos3;
    private javax.swing.JButton btnModuloRecargos5;
    private javax.swing.JLabel cobros_s_a1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton refresh1;
    private javax.swing.JTextField texto_buscar1;
    // End of variables declaration//GEN-END:variables
}
