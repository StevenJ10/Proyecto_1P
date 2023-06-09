/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Darkness
 */
public class Modulo_MiCuenta extends javax.swing.JFrame {

    /**
     * Creates new form Modulo_MiCuenta
     */
    public Modulo_MiCuenta() {
        initComponents();
        
        //Indica que la ventana debe ser centrada en la pantalla
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Btn_Salir = new javax.swing.JButton();
        Logo_Name = new javax.swing.JLabel();
        Btn_FlechaIzquierda = new javax.swing.JButton();
        Btn_FlechaDerecha = new javax.swing.JButton();
        Btn_Recargar = new javax.swing.JButton();
        Btn_Home = new javax.swing.JButton();
        Btn_Buscar = new javax.swing.JButton();
        jTextField_Buscar = new javax.swing.JTextField();
        Background_Header = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Background_Main = new javax.swing.JPanel();
        Btn_Propietarios = new javax.swing.JButton();
        Btn_Pagos = new javax.swing.JButton();
        Btn_Impuestos = new javax.swing.JButton();
        Btn_Recargos = new javax.swing.JButton();
        Bg_SelectorMC = new javax.swing.JPanel();
        Btn_MiCuenta = new javax.swing.JButton();
        Bg_Contenido = new javax.swing.JPanel();
        Pnl_DatosPersonales = new javax.swing.JPanel();
        label_apellidos = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        label_nombres = new javax.swing.JLabel();
        txt_celular = new javax.swing.JTextField();
        label_celular = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        label_email = new javax.swing.JLabel();
        Pnl_DatosOrg = new javax.swing.JPanel();
        label_user = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        txt_cargo = new javax.swing.JTextField();
        label_cargo = new javax.swing.JLabel();
        txt_areaTrabajo = new javax.swing.JTextField();
        label_areaTrabajo = new javax.swing.JLabel();
        txt_fechaIncSesion = new javax.swing.JTextField();
        label_fechaIncSesion = new javax.swing.JLabel();
        txt_fechaActividad = new javax.swing.JTextField();
        label_fechaActividad = new javax.swing.JLabel();
        label_InfCuenta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(181, 218, 238));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Salir.setBackground(new java.awt.Color(204, 255, 204));
        Btn_Salir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Btn_Salir.setText("Salir");
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });
        Background.add(Btn_Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 130, 40));
        Btn_Salir.getAccessibleContext().setAccessibleDescription("");

        Logo_Name.setFont(new java.awt.Font("Baskerville Old Face", 0, 60)); // NOI18N
        Logo_Name.setText("COBROS S.A.");
        Logo_Name.setMaximumSize(new java.awt.Dimension(366, 60));
        Logo_Name.setMinimumSize(new java.awt.Dimension(366, 60));
        Logo_Name.setName(""); // NOI18N
        Logo_Name.setPreferredSize(new java.awt.Dimension(366, 60));
        Background.add(Logo_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 380, 60));
        Logo_Name.getAccessibleContext().setAccessibleDescription("");

        Btn_FlechaIzquierda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Flecha_izq (1).png"))); // NOI18N
        Btn_FlechaIzquierda.setBorderPainted(false);
        Btn_FlechaIzquierda.setContentAreaFilled(false);
        Background.add(Btn_FlechaIzquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 60, 60));

        Btn_FlechaDerecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha_derecha.png"))); // NOI18N
        Btn_FlechaDerecha.setBorderPainted(false);
        Btn_FlechaDerecha.setContentAreaFilled(false);
        Btn_FlechaDerecha.setMaximumSize(new java.awt.Dimension(60, 60));
        Btn_FlechaDerecha.setMinimumSize(new java.awt.Dimension(60, 60));
        Btn_FlechaDerecha.setPreferredSize(new java.awt.Dimension(60, 60));
        Background.add(Btn_FlechaDerecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 60, 60));

        Btn_Recargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/refresh (1).png"))); // NOI18N
        Btn_Recargar.setBorderPainted(false);
        Btn_Recargar.setContentAreaFilled(false);
        Btn_Recargar.setMaximumSize(new java.awt.Dimension(60, 60));
        Btn_Recargar.setMinimumSize(new java.awt.Dimension(60, 60));
        Btn_Recargar.setPreferredSize(new java.awt.Dimension(60, 60));
        Background.add(Btn_Recargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 60, 60));

        Btn_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        Btn_Home.setBorderPainted(false);
        Btn_Home.setContentAreaFilled(false);
        Btn_Home.setMaximumSize(new java.awt.Dimension(60, 60));
        Btn_Home.setMinimumSize(new java.awt.Dimension(60, 60));
        Btn_Home.setPreferredSize(new java.awt.Dimension(60, 60));
        Btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HomeActionPerformed(evt);
            }
        });
        Background.add(Btn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 60, 60));

        Btn_Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        Btn_Buscar.setBorderPainted(false);
        Btn_Buscar.setContentAreaFilled(false);
        Btn_Buscar.setMaximumSize(new java.awt.Dimension(60, 60));
        Btn_Buscar.setMinimumSize(new java.awt.Dimension(60, 60));
        Btn_Buscar.setPreferredSize(new java.awt.Dimension(60, 60));
        Background.add(Btn_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(995, 65, 60, 60));
        Btn_Buscar.getAccessibleContext().setAccessibleDescription("");

        jTextField_Buscar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_Buscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField_Buscar.setMinimumSize(new java.awt.Dimension(4, 33));
        jTextField_Buscar.setName(""); // NOI18N
        Background.add(jTextField_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 320, 50));
        jTextField_Buscar.getAccessibleContext().setAccessibleName("");

        Background_Header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen_top.jpg"))); // NOI18N
        Background_Header.setToolTipText("");
        Background.add(Background_Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 140));

        jButton1.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
        jButton1.setText("Home");
        jButton1.setToolTipText("");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setMaximumSize(new java.awt.Dimension(93, 37));
        jButton1.setMinimumSize(new java.awt.Dimension(93, 37));
        jButton1.setPreferredSize(new java.awt.Dimension(93, 37));
        Background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 155, 110, 40));

        jButton2.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
        jButton2.setText("Mi Cuenta");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setMaximumSize(new java.awt.Dimension(83, 37));
        jButton2.setMinimumSize(new java.awt.Dimension(83, 37));
        jButton2.setPreferredSize(new java.awt.Dimension(83, 37));
        Background.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 155, 160, 40));
        jButton2.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha_dere_sin (1).png"))); // NOI18N
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 30, 30));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        Background_Main.setBackground(new java.awt.Color(99, 184, 148));
        Background_Main.setToolTipText("");
        Background_Main.setPreferredSize(new java.awt.Dimension(1080, 50));
        Background_Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btn_Propietarios.setBackground(new java.awt.Color(99, 184, 148));
        Btn_Propietarios.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        Btn_Propietarios.setText("Propietarios");
        Btn_Propietarios.setToolTipText("");
        Btn_Propietarios.setBorderPainted(false);
        Btn_Propietarios.setContentAreaFilled(false);
        Btn_Propietarios.setMaximumSize(new java.awt.Dimension(175, 37));
        Btn_Propietarios.setMinimumSize(new java.awt.Dimension(175, 37));
        Btn_Propietarios.setPreferredSize(new java.awt.Dimension(175, 37));
        Btn_Propietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PropietariosActionPerformed(evt);
            }
        });
        Background_Main.add(Btn_Propietarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 210, -1));

        Btn_Pagos.setBackground(new java.awt.Color(99, 184, 148));
        Btn_Pagos.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        Btn_Pagos.setText("Pagos");
        Btn_Pagos.setBorderPainted(false);
        Btn_Pagos.setContentAreaFilled(false);
        Btn_Pagos.setMaximumSize(new java.awt.Dimension(175, 37));
        Btn_Pagos.setMinimumSize(new java.awt.Dimension(175, 37));
        Btn_Pagos.setPreferredSize(new java.awt.Dimension(97, 37));
        Btn_Pagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_PagosActionPerformed(evt);
            }
        });
        Background_Main.add(Btn_Pagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 11, 200, -1));

        Btn_Impuestos.setBackground(new java.awt.Color(99, 184, 148));
        Btn_Impuestos.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        Btn_Impuestos.setText("Impuestos");
        Btn_Impuestos.setBorderPainted(false);
        Btn_Impuestos.setContentAreaFilled(false);
        Btn_Impuestos.setMaximumSize(new java.awt.Dimension(175, 37));
        Btn_Impuestos.setMinimumSize(new java.awt.Dimension(175, 37));
        Btn_Impuestos.setPreferredSize(new java.awt.Dimension(175, 37));
        Btn_Impuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ImpuestosActionPerformed(evt);
            }
        });
        Background_Main.add(Btn_Impuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 11, 200, -1));

        Btn_Recargos.setBackground(new java.awt.Color(99, 184, 148));
        Btn_Recargos.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        Btn_Recargos.setText("Recargos");
        Btn_Recargos.setBorderPainted(false);
        Btn_Recargos.setContentAreaFilled(false);
        Btn_Recargos.setMaximumSize(new java.awt.Dimension(175, 37));
        Btn_Recargos.setMinimumSize(new java.awt.Dimension(175, 37));
        Btn_Recargos.setPreferredSize(new java.awt.Dimension(175, 37));
        Btn_Recargos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RecargosActionPerformed(evt);
            }
        });
        Background_Main.add(Btn_Recargos, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 11, 200, -1));

        Bg_SelectorMC.setBackground(new java.awt.Color(64, 149, 113));

        Btn_MiCuenta.setBackground(new java.awt.Color(99, 184, 148));
        Btn_MiCuenta.setFont(new java.awt.Font("Baskerville Old Face", 0, 36)); // NOI18N
        Btn_MiCuenta.setText("Mi Cuenta");
        Btn_MiCuenta.setBorderPainted(false);
        Btn_MiCuenta.setContentAreaFilled(false);
        Btn_MiCuenta.setMaximumSize(new java.awt.Dimension(175, 37));
        Btn_MiCuenta.setMinimumSize(new java.awt.Dimension(175, 37));
        Btn_MiCuenta.setPreferredSize(new java.awt.Dimension(175, 37));
        Btn_MiCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MiCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Bg_SelectorMCLayout = new javax.swing.GroupLayout(Bg_SelectorMC);
        Bg_SelectorMC.setLayout(Bg_SelectorMCLayout);
        Bg_SelectorMCLayout.setHorizontalGroup(
            Bg_SelectorMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(Bg_SelectorMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Bg_SelectorMCLayout.createSequentialGroup()
                    .addComponent(Btn_MiCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 13, Short.MAX_VALUE)))
        );
        Bg_SelectorMCLayout.setVerticalGroup(
            Bg_SelectorMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(Bg_SelectorMCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Bg_SelectorMCLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn_MiCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        Background_Main.add(Bg_SelectorMC, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 200, -1));

        Background.add(Background_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1080, 60));
        Background_Main.getAccessibleContext().setAccessibleName("");

        Bg_Contenido.setBackground(new java.awt.Color(204, 255, 204));
        Bg_Contenido.setToolTipText("");
        Bg_Contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pnl_DatosPersonales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14))); // NOI18N
        Pnl_DatosPersonales.setOpaque(false);

        label_apellidos.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        label_apellidos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_apellidos.setText("Apellidos:");
        label_apellidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_apellidos.setEditable(false);

        txt_nombres.setEditable(false);

        label_nombres.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        label_nombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_nombres.setText("Nombres:");
        label_nombres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_celular.setEditable(false);

        label_celular.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        label_celular.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_celular.setText("Celular:");
        label_celular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txt_email.setEditable(false);

        label_email.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        label_email.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label_email.setText("Email:");
        label_email.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout Pnl_DatosPersonalesLayout = new javax.swing.GroupLayout(Pnl_DatosPersonales);
        Pnl_DatosPersonales.setLayout(Pnl_DatosPersonalesLayout);
        Pnl_DatosPersonalesLayout.setHorizontalGroup(
            Pnl_DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_DatosPersonalesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_apellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_nombres, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_celular, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_email, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_celular, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_email)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pnl_DatosPersonalesLayout.setVerticalGroup(
            Pnl_DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_DatosPersonalesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(Pnl_DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_apellidos)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nombres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_celular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_DatosPersonalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_email))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Bg_Contenido.add(Pnl_DatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 106, -1, -1));

        Pnl_DatosOrg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Empresariales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Consolas", 1, 14))); // NOI18N
        Pnl_DatosOrg.setOpaque(false);

        label_user.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        label_user.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_user.setText("Usuario:");

        txt_user.setEditable(false);

        txt_cargo.setEditable(false);

        label_cargo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        label_cargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_cargo.setText("Cargo:");

        txt_areaTrabajo.setEditable(false);

        label_areaTrabajo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        label_areaTrabajo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_areaTrabajo.setText("Area de Trabajo:");

        txt_fechaIncSesion.setEditable(false);

        label_fechaIncSesion.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        label_fechaIncSesion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_fechaIncSesion.setText("Fecha de Inicio de Sesión:");

        txt_fechaActividad.setEditable(false);

        label_fechaActividad.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        label_fechaActividad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        label_fechaActividad.setText("Última Fecha de Actividad:");

        javax.swing.GroupLayout Pnl_DatosOrgLayout = new javax.swing.GroupLayout(Pnl_DatosOrg);
        Pnl_DatosOrg.setLayout(Pnl_DatosOrgLayout);
        Pnl_DatosOrgLayout.setHorizontalGroup(
            Pnl_DatosOrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_DatosOrgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_DatosOrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_cargo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_user, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_areaTrabajo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_fechaIncSesion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_fechaActividad, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_DatosOrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_fechaActividad)
                    .addComponent(txt_fechaIncSesion)
                    .addComponent(txt_areaTrabajo)
                    .addComponent(txt_cargo)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Pnl_DatosOrgLayout.setVerticalGroup(
            Pnl_DatosOrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pnl_DatosOrgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Pnl_DatosOrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_user)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_DatosOrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_cargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_DatosOrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_areaTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_areaTrabajo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_DatosOrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fechaIncSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_fechaIncSesion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pnl_DatosOrgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fechaActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_fechaActividad))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Bg_Contenido.add(Pnl_DatosOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 92, -1, -1));

        label_InfCuenta.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        label_InfCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_InfCuenta.setText("Información de la Cuenta ");
        Bg_Contenido.add(label_InfCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 26, -1, -1));

        Background.add(Bg_Contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 1020, 360));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setText("2023 Cobros S.A.");
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 660, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 1080, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        //Oculta la ventana actual y muestra la nueva ventana que se socilita
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void Btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HomeActionPerformed
        //Mostrará la interfaz del Modulo Home
        Back abrir = new Back();
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_HomeActionPerformed

    private void Btn_PropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PropietariosActionPerformed
        //Mostrará la interfaz del Modulo Propietarios
        Modulo_Propietarios mp = new Modulo_Propietarios();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_PropietariosActionPerformed

    private void Btn_PagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_PagosActionPerformed
        //Mostrará la interfaz del Modulo Pagos
        Modulo_Pagos pagos = new Modulo_Pagos();
        pagos.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_PagosActionPerformed

    private void Btn_ImpuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ImpuestosActionPerformed
        //Mostrará la interfaz del Modulo Impuestos
        Modulo_Impuestos mi = new Modulo_Impuestos();
        mi.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_ImpuestosActionPerformed

    private void Btn_RecargosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RecargosActionPerformed
        //Mostrará la interfaz del Modulo Recargos
        Modulo_Recargos mr = new Modulo_Recargos();
        mr.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_RecargosActionPerformed

    private void Btn_MiCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MiCuentaActionPerformed
        //Mostrará la interfaz del Modulo Mi Cuenta
        Modulo_MiCuenta cuenta = new Modulo_MiCuenta();
        cuenta.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_MiCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(Modulo_MiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo_MiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo_MiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo_MiCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modulo_MiCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Background_Header;
    private javax.swing.JPanel Background_Main;
    private javax.swing.JPanel Bg_Contenido;
    private javax.swing.JPanel Bg_SelectorMC;
    private javax.swing.JButton Btn_Buscar;
    private javax.swing.JButton Btn_FlechaDerecha;
    private javax.swing.JButton Btn_FlechaIzquierda;
    private javax.swing.JButton Btn_Home;
    private javax.swing.JButton Btn_Impuestos;
    private javax.swing.JButton Btn_MiCuenta;
    private javax.swing.JButton Btn_Pagos;
    private javax.swing.JButton Btn_Propietarios;
    private javax.swing.JButton Btn_Recargar;
    private javax.swing.JButton Btn_Recargos;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JLabel Logo_Name;
    private javax.swing.JPanel Pnl_DatosOrg;
    private javax.swing.JPanel Pnl_DatosPersonales;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField_Buscar;
    private javax.swing.JLabel label_InfCuenta;
    private javax.swing.JLabel label_apellidos;
    private javax.swing.JLabel label_areaTrabajo;
    private javax.swing.JLabel label_cargo;
    private javax.swing.JLabel label_celular;
    private javax.swing.JLabel label_email;
    private javax.swing.JLabel label_fechaActividad;
    private javax.swing.JLabel label_fechaIncSesion;
    private javax.swing.JLabel label_nombres;
    private javax.swing.JLabel label_user;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_areaTrabajo;
    private javax.swing.JTextField txt_cargo;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_fechaActividad;
    private javax.swing.JTextField txt_fechaIncSesion;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
