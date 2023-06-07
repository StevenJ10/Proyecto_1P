
import java.awt.Color;

public class Modulo_Propietarios extends javax.swing.JFrame {

    public Modulo_Propietarios() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.btnModuloPropietarios1.setSelected(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        boton_flecha_adelante = new javax.swing.JButton();
        boton_flecha_atras = new javax.swing.JButton();
        boton_home = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        cobros_s_a1 = new javax.swing.JLabel();
        boton_buscar1 = new javax.swing.JButton();
        texto_buscar1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnModuloPagos1 = new javax.swing.JButton();
        btnModuloImpuestos1 = new javax.swing.JButton();
        btnModuloRecargos1 = new javax.swing.JButton();
        btnModuloCuenta1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnModuloPropietarios1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_Propietarios = new javax.swing.JTable();
        BtnEliminarPropietario = new javax.swing.JToggleButton();
        BtnEditarPropietario = new javax.swing.JToggleButton();
        BtnConsultarPropietario = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        text_propietarios3 = new javax.swing.JLabel();
        jToggleButton13 = new javax.swing.JToggleButton();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnModuloRecargos2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        background.setBackground(new java.awt.Color(181, 218, 238));
        background.setPreferredSize(new java.awt.Dimension(1500, 850));
        background.setRequestFocusEnabled(false);
        background.setVerifyInputWhenFocusTarget(false);
        background.setLayout(null);

        boton_flecha_adelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha_derecha.png"))); // NOI18N
        boton_flecha_adelante.setBorder(null);
        boton_flecha_adelante.setBorderPainted(false);
        boton_flecha_adelante.setContentAreaFilled(false);
        boton_flecha_adelante.setFocusPainted(false);
        boton_flecha_adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_flecha_adelanteActionPerformed(evt);
            }
        });
        background.add(boton_flecha_adelante);
        boton_flecha_adelante.setBounds(90, 60, 60, 60);

        boton_flecha_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flecha_izq (1).png"))); // NOI18N
        boton_flecha_atras.setBorder(null);
        boton_flecha_atras.setBorderPainted(false);
        boton_flecha_atras.setContentAreaFilled(false);
        boton_flecha_atras.setFocusPainted(false);
        boton_flecha_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_flecha_atrasActionPerformed(evt);
            }
        });
        background.add(boton_flecha_atras);
        boton_flecha_atras.setBounds(20, 60, 60, 60);

        boton_home.setBackground(java.awt.SystemColor.desktop);
        boton_home.setForeground(new java.awt.Color(240, 240, 240));
        boton_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        boton_home.setBorder(null);
        boton_home.setBorderPainted(false);
        boton_home.setContentAreaFilled(false);
        boton_home.setFocusPainted(false);
        boton_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_homeMouseClicked(evt);
            }
        });
        boton_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_homeActionPerformed(evt);
            }
        });
        background.add(boton_home);
        boton_home.setBounds(250, 60, 60, 60);

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh (1).png"))); // NOI18N
        refresh.setBorder(null);
        refresh.setBorderPainted(false);
        refresh.setContentAreaFilled(false);
        refresh.setFocusPainted(false);
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        background.add(refresh);
        refresh.setBounds(170, 60, 60, 60);

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
        jButton1.setBounds(920, 10, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen_top.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        background.add(jLabel1);
        jLabel1.setBounds(-440, 0, 1500, 140);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha_dere_sin (1).png"))); // NOI18N
        jLabel4.setFocusable(false);
        background.add(jLabel4);
        jLabel4.setBounds(130, 160, 30, 30);

        jPanel1.setBackground(new java.awt.Color(99, 184, 148));

        btnModuloPagos1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloPagos1.setText("Pagos");
        btnModuloPagos1.setBorder(null);
        btnModuloPagos1.setBorderPainted(false);
        btnModuloPagos1.setContentAreaFilled(false);
        btnModuloPagos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloPagos1ActionPerformed(evt);
            }
        });

        btnModuloImpuestos1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloImpuestos1.setText("Impuestos");
        btnModuloImpuestos1.setBorder(null);
        btnModuloImpuestos1.setBorderPainted(false);
        btnModuloImpuestos1.setContentAreaFilled(false);
        btnModuloImpuestos1.setFocusable(false);

        btnModuloRecargos1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloRecargos1.setText("Recargos");
        btnModuloRecargos1.setBorder(null);
        btnModuloRecargos1.setBorderPainted(false);
        btnModuloRecargos1.setContentAreaFilled(false);
        btnModuloRecargos1.setFocusable(false);

        btnModuloCuenta1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloCuenta1.setText("Mi Cuenta");
        btnModuloCuenta1.setBorder(null);
        btnModuloCuenta1.setBorderPainted(false);
        btnModuloCuenta1.setContentAreaFilled(false);
        btnModuloCuenta1.setFocusable(false);

        jPanel2.setBackground(new java.awt.Color(64, 149, 113));

        btnModuloPropietarios1.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloPropietarios1.setText("Propietarios");
        btnModuloPropietarios1.setBorder(null);
        btnModuloPropietarios1.setBorderPainted(false);
        btnModuloPropietarios1.setContentAreaFilled(false);
        btnModuloPropietarios1.setFocusable(false);
        btnModuloPropietarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloPropietarios1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(btnModuloPropietarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnModuloPropietarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 797, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 292, Short.MAX_VALUE)
                    .addComponent(btnModuloPagos1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(btnModuloImpuestos1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(btnModuloRecargos1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(btnModuloCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 18, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnModuloPagos1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModuloImpuestos1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModuloRecargos1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnModuloCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        background.add(jPanel1);
        jPanel1.setBounds(0, 200, 1070, 50);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        Tabla_Propietarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre de Propietario", "Cedula", "Número de autos asignados", "Fecha de ingreso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabla_Propietarios.setColumnSelectionAllowed(true);
        Tabla_Propietarios.setGridColor(new java.awt.Color(187, 149, 51));
        Tabla_Propietarios.setMinimumSize(new java.awt.Dimension(50, 50));
        Tabla_Propietarios.setRowHeight(40);
        Tabla_Propietarios.setSelectionBackground(new java.awt.Color(99, 184, 148));
        Tabla_Propietarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Tabla_Propietarios);

        BtnEliminarPropietario.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        BtnEliminarPropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_propietarios/trash.png"))); // NOI18N
        BtnEliminarPropietario.setSelected(true);
        BtnEliminarPropietario.setText("Eliminar Propietario");
        BtnEliminarPropietario.setBorder(null);
        BtnEliminarPropietario.setBorderPainted(false);
        BtnEliminarPropietario.setContentAreaFilled(false);
        BtnEliminarPropietario.setFocusable(false);
        BtnEliminarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarPropietarioActionPerformed(evt);
            }
        });

        BtnEditarPropietario.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        BtnEditarPropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_propietarios/pencil.png"))); // NOI18N
        BtnEditarPropietario.setText("Editar Propietario");
        BtnEditarPropietario.setBorder(null);
        BtnEditarPropietario.setBorderPainted(false);
        BtnEditarPropietario.setContentAreaFilled(false);
        BtnEditarPropietario.setFocusable(false);
        BtnEditarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarPropietarioActionPerformed(evt);
            }
        });

        BtnConsultarPropietario.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        BtnConsultarPropietario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img_propietarios/lupa_borde.png"))); // NOI18N
        BtnConsultarPropietario.setText("Consultar Propietario");
        BtnConsultarPropietario.setBorder(null);
        BtnConsultarPropietario.setBorderPainted(false);
        BtnConsultarPropietario.setContentAreaFilled(false);
        BtnConsultarPropietario.setFocusable(false);
        BtnConsultarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsultarPropietarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(BtnEliminarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204)
                        .addComponent(BtnEditarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnConsultarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEliminarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnEditarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConsultarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        background.add(jPanel3);
        jPanel3.setBounds(20, 270, 1020, 400);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setText("2023 Cobros S.A.");
        background.add(jLabel2);
        jLabel2.setBounds(900, 680, 140, 21);

        text_propietarios3.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        text_propietarios3.setText("Propietarios");
        background.add(text_propietarios3);
        text_propietarios3.setBounds(170, 160, 180, 30);

        jToggleButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/config.png"))); // NOI18N
        jToggleButton13.setBorder(null);
        jToggleButton13.setBorderPainted(false);
        jToggleButton13.setContentAreaFilled(false);
        jToggleButton13.setFocusable(false);
        background.add(jToggleButton13);
        jToggleButton13.setBounds(1010, 160, 30, 30);

        jPanel11.setBackground(new java.awt.Color(187, 149, 51));
        jPanel11.setLayout(null);

        jPanel12.setBackground(new java.awt.Color(141, 172, 149));
        jPanel12.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 26)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Administrador");
        jPanel12.add(jLabel3);
        jLabel3.setBounds(5, 7, 180, 20);

        jPanel11.add(jPanel12);
        jPanel12.setBounds(77, 2, 190, 36);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User");
        jPanel11.add(jLabel5);
        jLabel5.setBounds(10, 5, 60, 31);

        background.add(jPanel11);
        jPanel11.setBounds(730, 150, 270, 40);

        btnModuloRecargos2.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        btnModuloRecargos2.setText("Home");
        btnModuloRecargos2.setBorder(null);
        btnModuloRecargos2.setBorderPainted(false);
        btnModuloRecargos2.setContentAreaFilled(false);
        btnModuloRecargos2.setFocusable(false);
        btnModuloRecargos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModuloRecargos2ActionPerformed(evt);
            }
        });
        background.add(btnModuloRecargos2);
        btnModuloRecargos2.setBounds(20, 155, 110, 40);

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
    }// </editor-fold>//GEN-END:initComponents

    private void boton_flecha_adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_flecha_adelanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_flecha_adelanteActionPerformed

    private void boton_flecha_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_flecha_atrasActionPerformed
        Back abrir = new Back();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_flecha_atrasActionPerformed

    private void boton_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_homeActionPerformed
        Back abrir = new Back();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_homeActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void boton_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_homeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_homeMouseClicked

    private void BtnEliminarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarPropietarioActionPerformed
        Advertencia_eliminar mpro = new Advertencia_eliminar();
        mpro.setVisible(true);

    }//GEN-LAST:event_BtnEliminarPropietarioActionPerformed

    private void BtnEditarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarPropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnEditarPropietarioActionPerformed

    private void BtnConsultarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsultarPropietarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnConsultarPropietarioActionPerformed

    private void btnModuloPropietarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloPropietarios1ActionPerformed
        
        
    }//GEN-LAST:event_btnModuloPropietarios1ActionPerformed

   
    private void btnModuloPagos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloPagos1ActionPerformed
        Modulo_Pagos abrir = new Modulo_Pagos();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModuloPagos1ActionPerformed

    private void btnModuloRecargos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModuloRecargos2ActionPerformed
        Back abrir = new Back();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnModuloRecargos2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Modulo_Propietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo_Propietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo_Propietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo_Propietarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modulo_Propietarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BtnConsultarPropietario;
    private javax.swing.JToggleButton BtnEditarPropietario;
    private javax.swing.JToggleButton BtnEliminarPropietario;
    private javax.swing.JTable Tabla_Propietarios;
    private javax.swing.JPanel background;
    private javax.swing.JButton boton_buscar1;
    private javax.swing.JButton boton_flecha_adelante;
    private javax.swing.JButton boton_flecha_atras;
    private javax.swing.JButton boton_home;
    private javax.swing.JButton btnModuloCuenta1;
    private javax.swing.JButton btnModuloImpuestos1;
    private javax.swing.JButton btnModuloPagos1;
    private javax.swing.JButton btnModuloPropietarios1;
    private javax.swing.JButton btnModuloRecargos1;
    private javax.swing.JButton btnModuloRecargos2;
    private javax.swing.JLabel cobros_s_a1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton13;
    private javax.swing.JButton refresh;
    private javax.swing.JLabel text_propietarios3;
    private javax.swing.JTextField texto_buscar1;
    // End of variables declaration//GEN-END:variables
}
