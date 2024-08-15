package antrianfastfood;

import com.mysql.jdbc.Driver;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import antrianfastfood.DatabaseConnection;

public class MenuBurger extends javax.swing.JFrame {

    /**
     * Creates new form MenuBurger
     */
    public MenuBurger() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelbody = new javax.swing.JPanel();
        panelheader = new javax.swing.JPanel();
        labelfastfood = new javax.swing.JLabel();
        buttonhome = new rojerusan.RSButtonMetro();
        panelmenu = new javax.swing.JPanel();
        buttonfrenchfries = new rojerusan.RSButtonMetro();
        buttonburger = new rojerusan.RSButtonMetro();
        buttonhotdog = new rojerusan.RSButtonMetro();
        buttondrink = new rojerusan.RSButtonMetro();
        panelmenuburger = new javax.swing.JPanel();
        menuburger4 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        harga1 = new javax.swing.JLabel();
        jumlah1 = new javax.swing.JTextField();
        box1 = new javax.swing.JCheckBox();
        jPanel27 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        harga2 = new javax.swing.JLabel();
        jumlah2 = new javax.swing.JTextField();
        box2 = new javax.swing.JCheckBox();
        jPanel28 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        harga3 = new javax.swing.JLabel();
        jumlah3 = new javax.swing.JTextField();
        box3 = new javax.swing.JCheckBox();
        buttonpesan1 = new javax.swing.JButton();
        buttonreset1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelbody.setBackground(new java.awt.Color(255, 255, 255));

        panelheader.setBackground(new java.awt.Color(153, 0, 0));
        panelheader.setPreferredSize(new java.awt.Dimension(800, 95));

        labelfastfood.setBackground(new java.awt.Color(153, 0, 0));
        labelfastfood.setFont(new java.awt.Font("Helvetica Neue", 3, 60)); // NOI18N
        labelfastfood.setForeground(new java.awt.Color(255, 255, 255));
        labelfastfood.setText("FASTFOOD");

        buttonhome.setBackground(new java.awt.Color(153, 0, 0));
        buttonhome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/antrianfastfood/iconhome.png"))); // NOI18N
        buttonhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelheaderLayout = new javax.swing.GroupLayout(panelheader);
        panelheader.setLayout(panelheaderLayout);
        panelheaderLayout.setHorizontalGroup(
            panelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelheaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelfastfood, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addComponent(buttonhome, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelheaderLayout.setVerticalGroup(
            panelheaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelheaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelfastfood, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
            .addComponent(buttonhome, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
        );

        panelmenu.setBackground(new java.awt.Color(153, 0, 0));

        buttonfrenchfries.setBackground(new java.awt.Color(153, 0, 0));
        buttonfrenchfries.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonfrenchfries.setIcon(new javax.swing.ImageIcon(getClass().getResource("/antrianfastfood/iconfrenchfries.jpg"))); // NOI18N
        buttonfrenchfries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonfrenchfriesActionPerformed(evt);
            }
        });

        buttonburger.setBackground(new java.awt.Color(153, 0, 0));
        buttonburger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonburger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/antrianfastfood/icon burger.jpg"))); // NOI18N
        buttonburger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonburgerActionPerformed(evt);
            }
        });

        buttonhotdog.setBackground(new java.awt.Color(153, 0, 0));
        buttonhotdog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonhotdog.setIcon(new javax.swing.ImageIcon(getClass().getResource("/antrianfastfood/iconhotdog.jpg"))); // NOI18N
        buttonhotdog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhotdogActionPerformed(evt);
            }
        });

        buttondrink.setBackground(new java.awt.Color(153, 0, 0));
        buttondrink.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttondrink.setIcon(new javax.swing.ImageIcon(getClass().getResource("/antrianfastfood/icondrink.jpg"))); // NOI18N
        buttondrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttondrinkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelmenuLayout = new javax.swing.GroupLayout(panelmenu);
        panelmenu.setLayout(panelmenuLayout);
        panelmenuLayout.setHorizontalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buttonfrenchfries, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
            .addComponent(buttonburger, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(buttonhotdog, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(buttondrink, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelmenuLayout.setVerticalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(buttonburger, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonfrenchfries, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonhotdog, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttondrink, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelmenuburger.setBackground(new java.awt.Color(153, 0, 0));

        menuburger4.setBackground(new java.awt.Color(255, 255, 255));
        menuburger4.setFont(new java.awt.Font("Impact", 3, 36)); // NOI18N
        menuburger4.setForeground(new java.awt.Color(242, 179, 53));
        menuburger4.setText("MENU BURGER");

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setPreferredSize(new java.awt.Dimension(205, 340));

        jPanel58.setPreferredSize(new java.awt.Dimension(193, 230));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/antrianfastfood/burger1.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        harga1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        harga1.setText("Rp. 50.000");

        jumlah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah1ActionPerformed(evt);
            }
        });

        box1.setText("BEEF BURGER");

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(harga1)
                            .addComponent(jumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel47Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(box1)))
                .addGap(0, 43, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(box1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harga1)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setPreferredSize(new java.awt.Dimension(205, 340));

        jPanel36.setPreferredSize(new java.awt.Dimension(193, 230));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/antrianfastfood/Burger2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel27)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        harga2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        harga2.setText("Rp. 35.000");

        jumlah2.setDisabledTextColor(new java.awt.Color(255, 153, 0));
        jumlah2.setSelectionColor(new java.awt.Color(153, 0, 51));
        jumlah2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah2ActionPerformed(evt);
            }
        });

        box2.setText("CHICKEN BURGER");

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(harga2)
                            .addComponent(jumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel48Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(box2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harga2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(255, 255, 255));
        jPanel28.setPreferredSize(new java.awt.Dimension(205, 340));

        jPanel37.setPreferredSize(new java.awt.Dimension(193, 230));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/antrianfastfood/Burger3.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(39, 39, 39))
        );

        harga3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        harga3.setText("Rp. 28.000");

        jumlah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah3ActionPerformed(evt);
            }
        });

        box3.setText("MINI CHICKE BURGER");

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(harga3)
                            .addComponent(jumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(box3)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(box3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(harga3)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        buttonpesan1.setFont(new java.awt.Font("Helvetica Neue", 3, 17)); // NOI18N
        buttonpesan1.setForeground(new java.awt.Color(242, 179, 53));
        buttonpesan1.setText("PESAN");
        buttonpesan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonpesan11ActionPerformed(evt);
            }
        });

        buttonreset1.setFont(new java.awt.Font("Helvetica Neue", 3, 17)); // NOI18N
        buttonreset1.setForeground(new java.awt.Color(153, 0, 51));
        buttonreset1.setText("RESET");
        buttonreset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonreset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelmenuburgerLayout = new javax.swing.GroupLayout(panelmenuburger);
        panelmenuburger.setLayout(panelmenuburgerLayout);
        panelmenuburgerLayout.setHorizontalGroup(
            panelmenuburgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmenuburgerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelmenuburgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuburger4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelmenuburgerLayout.createSequentialGroup()
                        .addGroup(panelmenuburgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelmenuburgerLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(buttonreset1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonpesan1))
                            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelmenuburgerLayout.setVerticalGroup(
            panelmenuburgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmenuburgerLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(menuburger4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(panelmenuburgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(panelmenuburgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonreset1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(buttonpesan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelbodyLayout = new javax.swing.GroupLayout(panelbody);
        panelbody.setLayout(panelbodyLayout);
        panelbodyLayout.setHorizontalGroup(
            panelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbodyLayout.createSequentialGroup()
                .addComponent(panelmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelmenuburger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelbodyLayout.setVerticalGroup(
            panelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelbodyLayout.createSequentialGroup()
                .addComponent(panelheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelbodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelmenuburger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelbody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhomeActionPerformed
        // TODO add your handling code here:
        new Home().show();
        this.dispose();
    }//GEN-LAST:event_buttonhomeActionPerformed

    private void buttonfrenchfriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonfrenchfriesActionPerformed
        // TODO add your handling code here:
        new MenuFrenchFries().show();
        this.dispose();
    }//GEN-LAST:event_buttonfrenchfriesActionPerformed

    private void buttonburgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonburgerActionPerformed
        // TODO add your handling code here:
        new MenuBurger().show();
        this.dispose();
    }//GEN-LAST:event_buttonburgerActionPerformed

    private void buttonhotdogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhotdogActionPerformed
        // TODO add your handling code here:
        new MenuHotDog().show();
        this.dispose();
    }//GEN-LAST:event_buttonhotdogActionPerformed

    private void buttondrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttondrinkActionPerformed
        // TODO add your handling code here:
        new MenuDrink().show();
        this.dispose();
    }//GEN-LAST:event_buttondrinkActionPerformed

    private void jumlah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah1ActionPerformed

    private void jumlah2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah2ActionPerformed

    private void jumlah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah3ActionPerformed

    private void buttonpesan11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonpesan11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonpesan11ActionPerformed

    private void buttonreset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonreset1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonreset1ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuBurger.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuBurger().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox box1;
    private javax.swing.JCheckBox box2;
    private javax.swing.JCheckBox box3;
    private rojerusan.RSButtonMetro buttonburger;
    private rojerusan.RSButtonMetro buttondrink;
    private rojerusan.RSButtonMetro buttonfrenchfries;
    private rojerusan.RSButtonMetro buttonhome;
    private rojerusan.RSButtonMetro buttonhotdog;
    private javax.swing.JButton buttonpesan1;
    private javax.swing.JButton buttonreset1;
    private javax.swing.JLabel harga1;
    private javax.swing.JLabel harga2;
    private javax.swing.JLabel harga3;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JTextField jumlah1;
    private javax.swing.JTextField jumlah2;
    private javax.swing.JTextField jumlah3;
    private javax.swing.JLabel labelfastfood;
    private javax.swing.JLabel menuburger4;
    private javax.swing.JPanel panelbody;
    private javax.swing.JPanel panelheader;
    private javax.swing.JPanel panelmenu;
    private javax.swing.JPanel panelmenuburger;
    // End of variables declaration//GEN-END:variables
}
