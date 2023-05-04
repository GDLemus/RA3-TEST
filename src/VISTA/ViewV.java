package VISTA;

import MODEL.ClientesDAORelacional;
import MODEL.clientesM;
import MODEL.vendedoresM;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import javax.swing.JLabel;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.Timer;
import MODEL_VENTA.vende;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewV extends javax.swing.JFrame {

    int xMouse, yMouse;
    LinkedList<clientesM> listaClientes = new LinkedList<clientesM>();
    vende ventaV = new vende();
    public ViewV() {
        initComponents();
        
        LocalDate fechaActual = LocalDate.now();
        labelfc.setText("Fecha: " + fechaActual);
        j_codigo.setEnabled(false);
        j_cantidad.setEnabled(false);
        agregarP.setEnabled(false);
        venderP.setEnabled(false);
        
        String[] columnas = {"Codigo", "Nombre", "Cantidad", "Precio", "Subtotal"};
        DefaultTableModel model = new DefaultTableModel(null, columnas);
        Ptable.setModel(model);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        head = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        Ventas = new javax.swing.JTabbedPane();
        Vent = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        j_fas = new javax.swing.JLabel();
        j_namev = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        j_fecha = new javax.swing.JTextField();
        j_nofactu1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        j_niti = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Filtro2 = new javax.swing.JPanel();
        filtro2 = new javax.swing.JLabel();
        NewV = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        j_nit = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        j_correo = new javax.swing.JTextField();
        j_genero = new javax.swing.JTextField();
        Filtro = new javax.swing.JPanel();
        filtro = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ComboCC = new javax.swing.JComboBox<>();
        j_name = new javax.swing.JTextField();
        Filtro1 = new javax.swing.JPanel();
        filtro1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ptable = new javax.swing.JTable();
        crearS = new javax.swing.JPanel();
        venderP = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        j_codigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        j_cantidad = new javax.swing.JTextField();
        crearS1 = new javax.swing.JPanel();
        agregarP = new javax.swing.JLabel();
        labelfc = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hi = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head.setBackground(new java.awt.Color(102, 102, 102));
        head.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headMouseDragged(evt);
            }
        });
        head.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(102, 102, 102));

        x.setBackground(new java.awt.Color(255, 255, 255));
        x.setFont(new java.awt.Font("Russo One", 0, 18)); // NOI18N
        x.setForeground(new java.awt.Color(0, 0, 0));
        x.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        x.setText("X");
        x.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        x.setPreferredSize(new java.awt.Dimension(70, 43));
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(x, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headLayout = new javax.swing.GroupLayout(head);
        head.setLayout(headLayout);
        headLayout.setHorizontalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headLayout.createSequentialGroup()
                .addContainerGap(608, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headLayout.setVerticalGroup(
            headLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 40));

        Ventas.setBackground(new java.awt.Color(0, 156, 223));

        Vent.setBackground(new java.awt.Color(139, 195, 74));

        jPanel4.setBackground(new java.awt.Color(139, 195, 74));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setBackground(new java.awt.Color(139, 195, 74));
        jLabel16.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 156, 223));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Listado General");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 141, -1));

        jLabel17.setBackground(new java.awt.Color(139, 195, 74));
        jLabel17.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Filtrar por:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        j_fas.setBackground(new java.awt.Color(139, 195, 74));
        j_fas.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_fas.setForeground(new java.awt.Color(0, 0, 0));
        j_fas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j_fas.setText("Fecha");
        jPanel4.add(j_fas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        j_namev.setBackground(new java.awt.Color(139, 195, 74));
        j_namev.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_namev.setForeground(new java.awt.Color(102, 102, 102));
        j_namev.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        j_namev.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_namev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_namevMousePressed(evt);
            }
        });
        j_namev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_namevActionPerformed(evt);
            }
        });
        jPanel4.add(j_namev, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 110, 30));

        jLabel19.setBackground(new java.awt.Color(139, 195, 74));
        jLabel19.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("No de Factura");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jLabel20.setBackground(new java.awt.Color(139, 195, 74));
        jLabel20.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Nombre");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        j_fecha.setBackground(new java.awt.Color(139, 195, 74));
        j_fecha.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_fecha.setForeground(new java.awt.Color(102, 102, 102));
        j_fecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        j_fecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_fechaMousePressed(evt);
            }
        });
        j_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_fechaActionPerformed(evt);
            }
        });
        jPanel4.add(j_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 110, 30));

        j_nofactu1.setBackground(new java.awt.Color(139, 195, 74));
        j_nofactu1.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_nofactu1.setForeground(new java.awt.Color(102, 102, 102));
        j_nofactu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        j_nofactu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_nofactu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_nofactu1MousePressed(evt);
            }
        });
        j_nofactu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_nofactu1ActionPerformed(evt);
            }
        });
        jPanel4.add(j_nofactu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 110, 30));

        jLabel21.setBackground(new java.awt.Color(139, 195, 74));
        jLabel21.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("NIT");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        j_niti.setBackground(new java.awt.Color(139, 195, 74));
        j_niti.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_niti.setForeground(new java.awt.Color(102, 102, 102));
        j_niti.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        j_niti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_niti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_nitiMousePressed(evt);
            }
        });
        j_niti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_nitiActionPerformed(evt);
            }
        });
        jPanel4.add(j_niti, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 110, 30));

        jLabel18.setBackground(new java.awt.Color(139, 195, 74));
        jLabel18.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Filtrados:");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 570, 230));

        Filtro2.setBackground(new java.awt.Color(102, 102, 102));
        Filtro2.setPreferredSize(new java.awt.Dimension(150, 55));
        Filtro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Filtro2MouseClicked(evt);
            }
        });

        filtro2.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        filtro2.setForeground(new java.awt.Color(139, 195, 74));
        filtro2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filtro2.setText("APLICAR FILTRO");
        filtro2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filtro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filtro2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                filtro2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                filtro2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Filtro2Layout = new javax.swing.GroupLayout(Filtro2);
        Filtro2.setLayout(Filtro2Layout);
        Filtro2Layout.setHorizontalGroup(
            Filtro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filtro2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        Filtro2Layout.setVerticalGroup(
            Filtro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filtro2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel4.add(Filtro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 300, 30));

        javax.swing.GroupLayout VentLayout = new javax.swing.GroupLayout(Vent);
        Vent.setLayout(VentLayout);
        VentLayout.setHorizontalGroup(
            VentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        VentLayout.setVerticalGroup(
            VentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        Ventas.addTab("Ventas", Vent);

        NewV.setBackground(new java.awt.Color(139, 195, 74));

        jPanel2.setBackground(new java.awt.Color(139, 195, 74));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(139, 195, 74));
        jLabel1.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 156, 223));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccionar Cliente");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, 141, -1));

        jLabel8.setBackground(new java.awt.Color(139, 195, 74));
        jLabel8.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Filtrar por:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 32, -1, -1));

        jLabel9.setBackground(new java.awt.Color(139, 195, 74));
        jLabel9.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Nombre");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 32, -1, -1));

        jLabel10.setBackground(new java.awt.Color(139, 195, 74));
        jLabel10.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("NIT");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 32, -1, -1));

        j_nit.setBackground(new java.awt.Color(139, 195, 74));
        j_nit.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_nit.setForeground(new java.awt.Color(102, 102, 102));
        j_nit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        j_nit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_nit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_nitMousePressed(evt);
            }
        });
        j_nit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_nitActionPerformed(evt);
            }
        });
        jPanel2.add(j_nit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 100, 30));

        jLabel11.setBackground(new java.awt.Color(139, 195, 74));
        jLabel11.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Correo");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 82, -1, -1));

        jLabel12.setBackground(new java.awt.Color(139, 195, 74));
        jLabel12.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Genero");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 82, -1, -1));

        j_correo.setBackground(new java.awt.Color(139, 195, 74));
        j_correo.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_correo.setForeground(new java.awt.Color(102, 102, 102));
        j_correo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        j_correo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_correoMousePressed(evt);
            }
        });
        j_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_correoActionPerformed(evt);
            }
        });
        jPanel2.add(j_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 110, 30));

        j_genero.setBackground(new java.awt.Color(139, 195, 74));
        j_genero.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_genero.setForeground(new java.awt.Color(102, 102, 102));
        j_genero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        j_genero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_genero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_generoMousePressed(evt);
            }
        });
        j_genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_generoActionPerformed(evt);
            }
        });
        jPanel2.add(j_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 100, 30));

        Filtro.setBackground(new java.awt.Color(102, 102, 102));
        Filtro.setPreferredSize(new java.awt.Dimension(150, 55));
        Filtro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FiltroMouseClicked(evt);
            }
        });

        filtro.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        filtro.setForeground(new java.awt.Color(139, 195, 74));
        filtro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filtro.setText("APLICAR FILTRO");
        filtro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filtro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filtroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                filtroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                filtroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout FiltroLayout = new javax.swing.GroupLayout(Filtro);
        Filtro.setLayout(FiltroLayout);
        FiltroLayout.setHorizontalGroup(
            FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filtro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FiltroLayout.setVerticalGroup(
            FiltroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FiltroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(filtro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(Filtro, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 111, 340, 27));

        jLabel13.setBackground(new java.awt.Color(139, 195, 74));
        jLabel13.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Filtrados:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 144, -1, -1));

        jLabel14.setBackground(new java.awt.Color(139, 195, 74));
        jLabel14.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Cliente");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        ComboCC.setBackground(new java.awt.Color(102, 102, 102));
        ComboCC.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        ComboCC.setForeground(new java.awt.Color(0, 156, 223));
        ComboCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCCActionPerformed(evt);
            }
        });
        jPanel2.add(ComboCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 150, 30));

        j_name.setBackground(new java.awt.Color(139, 195, 74));
        j_name.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_name.setForeground(new java.awt.Color(102, 102, 102));
        j_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        j_name.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_nameMousePressed(evt);
            }
        });
        j_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_nameActionPerformed(evt);
            }
        });
        jPanel2.add(j_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 110, 30));

        Filtro1.setBackground(new java.awt.Color(102, 102, 102));
        Filtro1.setPreferredSize(new java.awt.Dimension(150, 55));
        Filtro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Filtro1MouseClicked(evt);
            }
        });

        filtro1.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        filtro1.setForeground(new java.awt.Color(139, 195, 74));
        filtro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        filtro1.setText("NUEVO CLIENTE");
        filtro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filtro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filtro1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                filtro1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                filtro1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Filtro1Layout = new javax.swing.GroupLayout(Filtro1);
        Filtro1.setLayout(Filtro1Layout);
        Filtro1Layout.setHorizontalGroup(
            Filtro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Filtro1Layout.createSequentialGroup()
                .addComponent(filtro1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Filtro1Layout.setVerticalGroup(
            Filtro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(filtro1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(Filtro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 130, 30));

        jPanel3.setBackground(new java.awt.Color(139, 195, 74));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(139, 195, 74));
        jLabel2.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 156, 223));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Agregar Productos");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Ptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Ptable);

        crearS.setBackground(new java.awt.Color(102, 102, 102));
        crearS.setPreferredSize(new java.awt.Dimension(150, 55));
        crearS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearSMouseClicked(evt);
            }
        });

        venderP.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        venderP.setForeground(new java.awt.Color(139, 195, 74));
        venderP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        venderP.setText("VENDER");
        venderP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        venderP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                venderPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                venderPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                venderPMouseExited(evt);
            }
        });

        javax.swing.GroupLayout crearSLayout = new javax.swing.GroupLayout(crearS);
        crearS.setLayout(crearSLayout);
        crearSLayout.setHorizontalGroup(
            crearSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(venderP, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        crearSLayout.setVerticalGroup(
            crearSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearSLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(venderP, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setBackground(new java.awt.Color(139, 195, 74));
        jLabel3.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Total:");

        jLabel4.setBackground(new java.awt.Color(139, 195, 74));
        jLabel4.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Código");

        j_codigo.setBackground(new java.awt.Color(139, 195, 74));
        j_codigo.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_codigo.setForeground(new java.awt.Color(102, 102, 102));
        j_codigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        j_codigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_codigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_codigoMousePressed(evt);
            }
        });
        j_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_codigoActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(139, 195, 74));
        jLabel5.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cantidad");

        j_cantidad.setBackground(new java.awt.Color(139, 195, 74));
        j_cantidad.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        j_cantidad.setForeground(new java.awt.Color(102, 102, 102));
        j_cantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        j_cantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j_cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                j_cantidadMousePressed(evt);
            }
        });
        j_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j_cantidadActionPerformed(evt);
            }
        });

        crearS1.setBackground(new java.awt.Color(102, 102, 102));
        crearS1.setPreferredSize(new java.awt.Dimension(150, 55));
        crearS1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearS1MouseClicked(evt);
            }
        });

        agregarP.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        agregarP.setForeground(new java.awt.Color(139, 195, 74));
        agregarP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agregarP.setText("AGREGAR");
        agregarP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        agregarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                agregarPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                agregarPMouseExited(evt);
            }
        });

        javax.swing.GroupLayout crearS1Layout = new javax.swing.GroupLayout(crearS1);
        crearS1.setLayout(crearS1Layout);
        crearS1Layout.setHorizontalGroup(
            crearS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearS1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(agregarP, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        crearS1Layout.setVerticalGroup(
            crearS1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearS1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(agregarP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        labelfc.setBackground(new java.awt.Color(139, 195, 74));
        labelfc.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        labelfc.setForeground(new java.awt.Color(0, 0, 0));
        labelfc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelfc.setText("Fecha: 00-00-00");

        jLabel7.setBackground(new java.awt.Color(139, 195, 74));
        jLabel7.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("No.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 445, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(crearS, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(j_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(j_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelfc))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(crearS1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelfc)
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(j_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(j_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addComponent(crearS1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearS, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        javax.swing.GroupLayout NewVLayout = new javax.swing.GroupLayout(NewV);
        NewV.setLayout(NewVLayout);
        NewVLayout.setHorizontalGroup(
            NewVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewVLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(NewVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        NewVLayout.setVerticalGroup(
            NewVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NewVLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Ventas.addTab("Nueva Venta", NewV);

        jPanel1.add(Ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 650, 520));

        hi.setBackground(new java.awt.Color(139, 195, 74));
        hi.setFont(new java.awt.Font("Russo One", 0, 12)); // NOI18N
        hi.setForeground(new java.awt.Color(0, 156, 223));
        hi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(hi, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void informacion(vendedoresM vendedor){

     hi.setText("Bienvenido: "+ vendedor.getNombre());

    }
     

    
    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked

        System.exit(0);
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        exit.setBackground(Color.red);
        exit.setForeground(Color.white);
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        exit.setBackground(new Color(102, 102, 102));
        exit.setForeground(Color.black);
    }//GEN-LAST:event_xMouseExited

    private void headMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headMouseDragged

    private void headMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headMousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headMousePressed

    private void venderPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_venderPMouseClicked
        
    }//GEN-LAST:event_venderPMouseClicked

    private void venderPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_venderPMouseEntered
        crearS.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_venderPMouseEntered

    private void venderPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_venderPMouseExited
        crearS.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_venderPMouseExited

    private void crearSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearSMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crearSMouseClicked

    private void j_codigoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_codigoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_codigoMousePressed

    private void j_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_codigoActionPerformed

    private void j_cantidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_cantidadMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_cantidadMousePressed

    private void j_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_cantidadActionPerformed

    private void agregarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarPMouseClicked
       if (j_codigo.getText().isEmpty() || j_cantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes de llenar las casillas");
        }
        
    }//GEN-LAST:event_agregarPMouseClicked

//    public void enviarpro(){
//    
//    
//    
//    }
    
    
    private void agregarPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarPMouseEntered
        crearS1.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_agregarPMouseEntered

    private void agregarPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarPMouseExited
        crearS1.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_agregarPMouseExited

    private void crearS1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearS1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_crearS1MouseClicked

    private void FiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FiltroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FiltroMouseClicked

    private void filtroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtroMouseExited
        Filtro.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_filtroMouseExited

    private void filtroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtroMouseEntered
       Filtro.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_filtroMouseEntered

    private void filtroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtroMouseClicked
    ComboCC.removeAllItems();
    String nombre = j_name.getText();
    String nit = j_nit.getText();
    String correo = j_correo.getText();
    String genero = j_genero.getText();
    listaClientes = ventaV.listaFiltroClientes(nombre, nit, correo, genero);
    DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>();   
        for (clientesM c : listaClientes) {
            modelo.addElement(c.toString());
        }
        ComboCC.setModel(modelo);
    if (ComboCC.getSelectedItem() != null) {
        j_codigo.setEnabled(true);
        j_cantidad.setEnabled(true);
        agregarP.setEnabled(true);
        venderP.setEnabled(true);
     

     }
    }//GEN-LAST:event_filtroMouseClicked

      









    private void j_generoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_generoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_generoActionPerformed

    private void j_generoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_generoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_generoMousePressed

    private void j_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_correoActionPerformed

    private void j_correoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_correoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_correoMousePressed

    private void j_nitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_nitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nitActionPerformed

    private void j_nitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_nitMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nitMousePressed

    private void j_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nameActionPerformed

    private void j_nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_nameMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nameMousePressed

    private void Filtro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Filtro1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Filtro1MouseClicked

    private void filtro1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtro1MouseExited
       Filtro1.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_filtro1MouseExited

    private void filtro1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtro1MouseEntered
        Filtro1.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_filtro1MouseEntered

    private void filtro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtro1MouseClicked
        
        AddCV ac = new AddCV();
        ac.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_filtro1MouseClicked
       
    private void j_namevMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_namevMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_namevMousePressed

    private void j_namevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_namevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_namevActionPerformed

    private void j_fechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_fechaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_fechaMousePressed

    private void j_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_fechaActionPerformed

    private void j_nofactu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_nofactu1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nofactu1MousePressed

    private void j_nofactu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_nofactu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nofactu1ActionPerformed

    private void j_nitiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j_nitiMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nitiMousePressed

    private void j_nitiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j_nitiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j_nitiActionPerformed

    private void Filtro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Filtro2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Filtro2MouseClicked

    private void filtro2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtro2MouseExited
        Filtro2.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_filtro2MouseExited

    private void filtro2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtro2MouseEntered
        Filtro2.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_filtro2MouseEntered

    private void filtro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtro2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_filtro2MouseClicked

    private void ComboCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCCActionPerformed

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
            java.util.logging.Logger.getLogger(ViewV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewV().setVisible(true);
            }
        });
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboCC;
    private javax.swing.JPanel Filtro;
    private javax.swing.JPanel Filtro1;
    private javax.swing.JPanel Filtro2;
    private javax.swing.JPanel NewV;
    private javax.swing.JTable Ptable;
    private javax.swing.JPanel Vent;
    private javax.swing.JTabbedPane Ventas;
    private javax.swing.JLabel agregarP;
    private javax.swing.JPanel crearS;
    private javax.swing.JPanel crearS1;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel filtro;
    private javax.swing.JLabel filtro1;
    private javax.swing.JLabel filtro2;
    private javax.swing.JPanel head;
    private javax.swing.JLabel hi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField j_cantidad;
    private javax.swing.JTextField j_codigo;
    private javax.swing.JTextField j_correo;
    private javax.swing.JLabel j_fas;
    private javax.swing.JTextField j_fecha;
    private javax.swing.JTextField j_genero;
    private javax.swing.JTextField j_name;
    private javax.swing.JTextField j_namev;
    private javax.swing.JTextField j_nit;
    private javax.swing.JTextField j_niti;
    private javax.swing.JTextField j_nofactu1;
    private javax.swing.JLabel labelfc;
    private javax.swing.JLabel venderP;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
