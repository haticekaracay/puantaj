
import Connection.DatabaseConnection;
import entity.arkadurum;
import entity.arkamesai;
import entity.gegitimgorev;
import entity.gorunendurum;
import entity.gorunenmesai;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author haticeozbakir
 */
public class personelEkranı extends javax.swing.JFrame {

    personel p = new personel();
    public personelEkranı pr;

    public personelEkranı() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel6.setVisible(false);
        this.setSize(1920, 1033);
    }

    public personel parentt2;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        geri = new javax.swing.JButton();
        sicil = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bastarihi = new com.toedter.calendar.JDateChooser();
        bittarihi = new com.toedter.calendar.JDateChooser();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        mDurum = new javax.swing.JComboBox<>();
        mesaisuresi = new javax.swing.JLabel();
        mSure = new javax.swing.JTextField();
        mesaidurumu = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        mesaiTarihi = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        mhakkinda = new javax.swing.JTextPane();
        myer = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        gorevBas = new com.toedter.calendar.JDateChooser();
        gorevBit = new com.toedter.calendar.JDateChooser();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PERSONEL");
        setBackground(new java.awt.Color(153, 153, 255));

        geri.setBackground(new java.awt.Color(0, 102, 102));
        geri.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        geri.setForeground(new java.awt.Color(255, 255, 255));
        geri.setText("←");
        geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriActionPerformed(evt);
            }
        });

        sicil.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sicil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sicilActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("SİCİL NO:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yıllık İzin", "Ücretli Mazeret İzni", "Ücretsiz Mazeret İzni", "Rapor", "Sevkli", "Refakatli", "İdari İzinli" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jButton1.setText("OLUŞTUR");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("HAKKINDA:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bastarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bittarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(bastarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(bittarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        mDurum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GÜNLÜK FAZLA ÇALIŞMA", "HAFTASONU FAZLA ÇALIŞMA", "BAYRAM GÜNÜ ÇALIŞMASI", "GENEL TATİL ÇALIŞMASI", "6 GÜN 45 SAAT" }));
        mDurum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDurumActionPerformed(evt);
            }
        });

        mesaisuresi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        mesaisuresi.setText("MESAİ SÜRENİZ:");

        mSure.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        mSure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSureActionPerformed(evt);
            }
        });

        mesaidurumu.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        mesaidurumu.setText("MESAİ DURUMU:");

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jButton4.setText("OLUŞTUR");
        jButton4.setBorder(null);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("(Ondalık veri için nokta kullanınız..)");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("MESAİ TARİHİ:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("MESAİNİZ HAKKINDA:");

        jScrollPane3.setViewportView(mhakkinda);

        myer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myerActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("MESAİ YERİNİZ:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mesaidurumu, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mesaisuresi, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(mSure, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mesaiTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(myer)
                                        .addComponent(mDurum, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3)))
                                .addGap(0, 92, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(mesaiTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesaidurumu)
                    .addComponent(mDurum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesaisuresi)
                    .addComponent(mSure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jButton2.setText("MESAİ EKLE");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jButton6.setText("DURUM");
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton8.setText("GÖREV/EĞİTİM");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jButton3.setText("İZİN TALEBİ");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GÖREV", "EĞİTİM" }));

        jButton5.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        jButton5.setText("EKLE");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("GÖREV/EĞİTİM HAKKINDA:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("GÖREV/EĞİTİM YERİ:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gorevBit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gorevBas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(gorevBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(gorevBit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setText("                                   (Silmek istediğiniz Onay-Red bilgisine tıklayınız..)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ciz.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tt.jg.jpg"))); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("NO:");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel8.setText("(İptal etmek istediğiniz talep no'yu giriniz..)");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jButton7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton7.setText("SİL");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jButton9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton9.setText("SİL");
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jButton10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton10.setText("SİL");
        jButton10.setBorder(null);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(geri, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sicil, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(294, 294, 294))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(geri)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(sicil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriActionPerformed
        personel per = new personel();
        per.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_geriActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            SimpleDateFormat dFormat1 = new SimpleDateFormat("dd");
            String date = dFormat1.format(bastarihi.getDate());
            int gun1 = Integer.parseInt(date);
            SimpleDateFormat dFormat2 = new SimpleDateFormat("MM");
            String date2 = dFormat2.format(bastarihi.getDate());
            int ay1 = Integer.parseInt(date2);
            SimpleDateFormat dFormat3 = new SimpleDateFormat("yyyy");
            String date3 = dFormat3.format(bastarihi.getDate());
            int yil1 = Integer.parseInt(date3);
            SimpleDateFormat dFormat4 = new SimpleDateFormat("dd");
            String date4 = dFormat4.format(bittarihi.getDate());
            int gun2 = Integer.parseInt(date4);
            SimpleDateFormat dFormat5 = new SimpleDateFormat("MM");
            String date5 = dFormat5.format(bittarihi.getDate());
            int ay2 = Integer.parseInt(date5);
            SimpleDateFormat dFormat6 = new SimpleDateFormat("yyyy");
            String date6 = dFormat6.format(bittarihi.getDate());
            int yil2 = Integer.parseInt(date6);
            Connection con = DatabaseConnection.connectDatabase();
            Statement st = con.createStatement();
            Statement st2 = con.createStatement();
            gorunendurum gor = new gorunendurum();
            arkadurum arka = new arkadurum();
            int scl = Integer.parseInt(sicil.getText());
            gor.setSicil(scl);
            gor.setBastarihi(bastarihi.getDate());
            gor.setBittarihi(bittarihi.getDate());
            gor.setDurum(jComboBox1.getSelectedItem().toString());
            if ((ay2 < ay1 && yil2 < yil1) || yil2 < yil1 || (yil2 == yil1 && ay2 < ay1) || (yil2 == yil1 && ay2 == ay1 && gun2 < gun1)) {
                JOptionPane.showMessageDialog(pr, "Bilgileri Kontrol Ediniz(Bitiş tarihi,başlangıç tarihinden büyük olamaz..)");
            } else {
                st.executeUpdate("insert into gorunendurum (sicil,bastarihi,bittarihi,durum,dhakkinda) values('" + gor.getSicil() + "','"
                        + gor.getBastarihi() + "','" + gor.getBittarihi() + "','" + gor.getDurum() + "','" + jTextArea1.getText() + "')");
                JOptionPane.showMessageDialog(pr, "TALEBİNİZ ALINDI..");
                String sql = "select g.gorno AS \"NO\",g.bastarihi AS "
                        + "\"BAŞLANGIÇ TRH\",g.bittarihi AS \"BİTİŞ TRH\",\n"
                        + "g.durum AS \"DURUM\",g.dhakkinda AS\"HAKKINDA\" from gorunendurum g,personel p where p.sicil='" + scl + "'and g.sicil='" + scl + "'";
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            }
            bastarihi.setCalendar(null);
            bittarihi.setCalendar(null);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(pr, "HATA..");
        }
        jTextArea1.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sicil.setText(p.s2);//kullanıcı adı ve şifreye göre butona bağlı sicil getirme..
        int scl = Integer.parseInt(sicil.getText());
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel6.setVisible(true);
        jPanel7.setVisible(true);
        jPanel8.setVisible(false);
        jPanel9.setVisible(false);
        jTable2.setRowHeight(30);//satır genişliği..
        try {
            Connection con = DatabaseConnection.connectDatabase();
            Statement st = con.createStatement();
            String sql = "select g.mesaino AS \"NO\",g.tarih AS \"TARİH\",g.durum AS \"DURUM\",g.msure AS \"MESAİ SÜRESİ\"\n"
                    + ",g.mhakkinda AS \"HAKKINDA\",g.myeri AS \"YER\" from gorunenmesai g,personel p where p.sicil='" + scl + "'and g.sicil='" + scl + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(pr, "HATA..");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        sicil.setText(p.s2);
        int scl = Integer.parseInt(sicil.getText());
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel6.setVisible(true);
        jPanel7.setVisible(false);
        jPanel8.setVisible(true);
        jPanel9.setVisible(false);
        jTable2.setRowHeight(30);//satır genişliği.
        try {
            Connection con = DatabaseConnection.connectDatabase();
            Statement st = con.createStatement();
            String sql = "select g.gorno AS \"NO\",g.sicil AS \"SİCİL\", g.bastarihi AS \"BAŞLANGIÇ TRH\",g.bittarihi AS\""
                    + " BİTİŞ TRH\",g.durum AS \"DURUM\",g.dhakkinda AS \"HAKKINDA\" from gorunendurum g,personel p where "
                    + "p.sicil='" + scl + "'and g.sicil='" + scl + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(pr, "HATA..");
        }
        jTextArea1.setText(null);
    }//GEN-LAST:event_jButton3ActionPerformed
    personel prsnl = new personel();
    private void sicilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sicilActionPerformed

    }//GEN-LAST:event_sicilActionPerformed

    private void mSureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mSureActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        sicil.setText(p.s2);
        int scl = Integer.parseInt(sicil.getText());
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(true);
        jPanel4.setVisible(false);
        jPanel6.setVisible(true);
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
        jPanel9.setVisible(true);
        jTable2.setRowHeight(30);//satır genişliği.
        try {
            Connection con = DatabaseConnection.connectDatabase();
            Statement st = con.createStatement();
            String sql = "select g.gegno AS \"NO\",g.bastarihi AS \"BAŞLANGIÇ TRH\",g.bittarihi AS \"BİTİŞ TRH\",g.durum AS \"DURUM\" \n"
                    + ",g.eghakkinda AS\"HAKKINDA\",g.egyer AS\"YER\" from gegitimgorev g,personel p where p.sicil='" + scl + "'and g.sicil='" + scl + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(pr, "HATA..");
        }
        gorevBas.setCalendar(null);
        gorevBit.setCalendar(null);
        jTextArea2.setText(null);
        jTextField2.setText(null);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Connection con = DatabaseConnection.connectDatabase();
            Statement st = con.createStatement(), st2 = con.createStatement(), st3 = con.createStatement(), st4 = con.createStatement();
            arkamesai ark = new arkamesai();
            gorunenmesai gorm = new gorunenmesai();
            SimpleDateFormat dFormat1 = new SimpleDateFormat("dd");
            String date = dFormat1.format(mesaiTarihi.getDate());
            int gun = Integer.parseInt(date);
            SimpleDateFormat dFormat2 = new SimpleDateFormat("MM");
            String date2 = dFormat2.format(mesaiTarihi.getDate());
            int ay = Integer.parseInt(date2);
            SimpleDateFormat dFormat3 = new SimpleDateFormat("yyyy");
            String date3 = dFormat3.format(mesaiTarihi.getDate());
            int yil = Integer.parseInt(date3);
            int scl = Integer.parseInt(sicil.getText());
            ark.setSicil(scl);
            ark.setGun(gun);
            ark.setAy(ay);
            ark.setYil(yil);
            ark.setDurum(mDurum.getSelectedItem().toString());
            gorm.setSicil(scl);
            gorm.setTarih(mesaiTarihi.getDate());
            gorm.setMhakkinda(mhakkinda.getText());
            gorm.setMyer(myer.getText());
            gorm.setDurum(mDurum.getSelectedItem().toString());

            if ("6 GÜN 45 SAAT".equals(mDurum.getSelectedItem().toString())) {
                st.executeUpdate("insert into gorunenmesai (sicil,tarih,durum,msure,mhakkinda,myeri) values ('" + gorm.getSicil() + "','" + gorm.getTarih() + "','" + gorm.getDurum() + "',1,'" + gorm.getMhakkinda() + "','" + gorm.getMyer() + "')");
                JOptionPane.showMessageDialog(pr, "TALEBİNİZ ALINDI..");
                System.out.println("gormes eklendi..");

            } else {
                try {
                    float sr = Float.parseFloat(mSure.getText());
                    gorm.setMsure(sr);
                    st3.executeUpdate("insert into gorunenmesai (sicil,tarih,durum,msure,mhakkinda,myeri) values ('" + gorm.getSicil() + "','" + gorm.getTarih() + "','" + gorm.getDurum() + "','" + gorm.getMsure() + "','" + gorm.getMhakkinda() + "','" + gorm.getMyer() + "')");
                    JOptionPane.showMessageDialog(pr, "TALEBİNİZ ALINDI..");
                    System.out.println("gormes eklendi..");
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(pr, "SADECE SAYI GİRİNİZ..");
                }
                String sql = "select g.mesaino AS \"NO\",g.tarih AS \"TARİH\",g.durum AS \"DURUM\",g.msure AS \"MESAİ SÜRESİ\",\n"
                        + "g.mhakkinda AS \"HAKKINDA\",g.myeri AS \"YER\" from gorunenmesai g,personel p where p.sicil='" + scl + "'and g.sicil='" + scl + "'";
                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));
                mesaiTarihi.setCalendar(null);
                myer.setText(null);
                mhakkinda.setText(null);
                mSure.setText(null);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(pr, "HATA");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void mDurumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDurumActionPerformed
        if ("6 GÜN 45 SAAT".equals(mDurum.getSelectedItem().toString())) {
            mesaisuresi.setVisible(false);
            mSure.setVisible(false);
            jLabel2.setVisible(false);
        } else {
            mesaisuresi.setVisible(true);
            mSure.setVisible(true);
            jLabel2.setVisible(true);
        }
    }//GEN-LAST:event_mDurumActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try { //görev eğitim butonu..
            SimpleDateFormat dFormat1 = new SimpleDateFormat("dd");
            String date = dFormat1.format(gorevBas.getDate());
            int gun1 = Integer.parseInt(date);
            SimpleDateFormat dFormat2 = new SimpleDateFormat("MM");
            String date2 = dFormat2.format(gorevBas.getDate());
            int ay1 = Integer.parseInt(date2);
            SimpleDateFormat dFormat3 = new SimpleDateFormat("yyyy");
            String date3 = dFormat3.format(gorevBas.getDate());
            int yil1 = Integer.parseInt(date3);
            SimpleDateFormat dFormat4 = new SimpleDateFormat("dd");
            String date4 = dFormat4.format(gorevBit.getDate());
            int gun2 = Integer.parseInt(date4);
            SimpleDateFormat dFormat5 = new SimpleDateFormat("MM");
            String date5 = dFormat5.format(gorevBit.getDate());
            int ay2 = Integer.parseInt(date5);
            SimpleDateFormat dFormat6 = new SimpleDateFormat("yyyy");
            String date6 = dFormat6.format(gorevBit.getDate());
            int yil2 = Integer.parseInt(date6);
            Connection con = DatabaseConnection.connectDatabase();
            Statement st = con.createStatement();
            Statement st2 = con.createStatement();
            gegitimgorev geg = new gegitimgorev();
            int scl = Integer.parseInt(sicil.getText());
            geg.setSicil(scl);
            geg.setBastarihi(gorevBas.getDate());
            geg.setBittarihi(gorevBit.getDate());
            geg.setDurum(jComboBox2.getSelectedItem().toString());
            if ((ay2 < ay1 && yil2 < yil1) || yil2 < yil1 || (yil2 == yil1 && ay2 < ay1) || (yil2 == yil1 && ay2 == ay1 && gun2 < gun1)) {
                JOptionPane.showMessageDialog(pr, "Bilgileri Kontrol Ediniz(Bitiş tarihi,başlangıç tarihinden büyük olamaz..)");
            } else {
                st.executeUpdate("insert into gegitimgorev (sicil,bastarihi,bittarihi,durum,eghakkinda,egyer) "
                        + "values('" + geg.getSicil() + "','" + geg.getBastarihi() + "','" + geg.getBittarihi() + "',"
                                + "'" + geg.getDurum() +"','"+jTextArea2.getText()+"','"+jTextField2.getText()+ "')");
                JOptionPane.showMessageDialog(pr, "TALEBİNİZ ALINDI..");
                String sql = "select g.gegno AS \"NO\",g.bastarihi AS \"BAŞLANGIÇ TRH\",g.bittarihi AS \"BİTİŞ TRH\",g.durum AS \"DURUM\" \n"
                        + ",g.eghakkinda AS \"HAKKINDA\",g.egyer AS \"YER\" from gegitimgorev g,personel p where p.sicil='" + scl + "'and g.sicil='" + scl + "'";

                PreparedStatement pst = con.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            }
            gorevBas.setCalendar(null);
            gorevBit.setCalendar(null);
            jTextArea2.setText(null);
            jTextField2.setText(null);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(pr, "HATA..");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        sicil.setText(p.s2);//kullanıcı adı ve şifreye göre butona bağlı sicil getirme..
        int scl = Integer.parseInt(sicil.getText());
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(true);
        jPanel6.setVisible(false);
        jTable1.setRowHeight(30);//satır genişliği.. 
        try {
            Connection con = DatabaseConnection.connectDatabase();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select no AS \"NO\",bastarihi AS \"BAŞLANGIÇ TARİHİ\",bittarihi AS\"BİTİŞ TARİHİ\","
                    + "msure AS\"MESAİ SÜRESİ\",durum AS\"TALEP\",onayred AS \"DURUM\" from durumlar where sicil='" + scl + "';");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int sorgu = JOptionPane.showOptionDialog(pr, "SİLMEK İSTEDİĞİNİZE EMİN MİSİNİZ?", "SİLME", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, NORMAL);
        sicil.setText(p.s2);//kullanıcı adı ve şifreye göre butona bağlı sicil getirme..
        int scl = Integer.parseInt(sicil.getText());
        if (sorgu == 0) {
            try {
                int t3satir = jTable1.getSelectedRow();
                int t3sutun = jTable1.getSelectedColumn();
                Connection con = DatabaseConnection.connectDatabase();
                Statement st = con.createStatement(), st2 = con.createStatement();
                String numara = jTable1.getValueAt(t3satir, 0).toString();
                int no = Integer.parseInt(numara);
                st.executeUpdate("delete from durumlar where no='" + no + "'");
                JOptionPane.showMessageDialog(pr, "Silme işlemi başarılı..");
                ResultSet rs2 = st2.executeQuery("select no AS \"NO\",bastarihi AS \"BAŞLANGIÇ TARİHİ\",bittarihi AS\"BİTİŞ TARİHİ\","
                        + "msure AS\"MESAİ SÜRESİ\",durum AS\"TALEP\",onayred AS \"DURUM\" from durumlar where sicil='" + scl + "';");
                jTable1.setModel(DbUtils.resultSetToTableModel(rs2));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(pr, "HATA!Tekrar deneyiniz..");
            }
        } else if (sorgu == 1) {

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            sicil.setText(p.s2);//kullanıcı adı ve şifreye göre butona bağlı sicil getirme..
            int scl = Integer.parseInt(sicil.getText());
            Connection con = DatabaseConnection.connectDatabase();
            Statement st = con.createStatement(), st2 = con.createStatement();
            String a = jTextField1.getText();
            int b = Integer.parseInt(a);
            st.executeUpdate("delete from gorunenmesai where mesaino='" + b + "';");
            JOptionPane.showMessageDialog(pr, "İPTAL İŞLEMİ BAŞARILI..");
            String sql = "select g.mesaino AS \"NO\",g.tarih AS \"TARİH\",g.durum AS \"DURUM\",g.msure AS \"MESAİ SÜRESİ\"\n"
                    + ",g.mhakkinda AS\"HAKKINDA\" , g.myeri AS \"YER\" from gorunenmesai g,personel p where p.sicil='" + scl + "'and g.sicil='" + scl + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            jTextField1.setText(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(pr, "HATA!Tekrar deneyiniz..");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            sicil.setText(p.s2);//kullanıcı adı ve şifreye göre butona bağlı sicil getirme..
            int scl = Integer.parseInt(sicil.getText());
            Connection con = DatabaseConnection.connectDatabase();
            Statement st = con.createStatement(), st2 = con.createStatement();
            String a = jTextField1.getText();
            int b = Integer.parseInt(a);
            st.executeUpdate("delete from gorunendurum where gorno='" + b + "';");
            JOptionPane.showMessageDialog(pr, "İPTAL İŞLEMİ BAŞARILI..");
            String sql = "select g.gorno AS \"NO\",g.bastarihi AS \"BAŞLANGIÇ TRH\",g.bittarihi AS \"BİTİŞ TRH\",\n"
                    + "g.durum AS \"DURUM\" ,g.dhakkinda AS\"HAKKINDA\" from gorunendurum g,personel"
                    + " p where p.sicil='" + scl + "'and g.sicil='" + scl + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            jTextField1.setText(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(pr, "HATA!Tekrar deneyiniz..");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            sicil.setText(p.s2);//kullanıcı adı ve şifreye göre butona bağlı sicil getirme..
            int scl = Integer.parseInt(sicil.getText());
            Connection con = DatabaseConnection.connectDatabase();
            Statement st = con.createStatement(), st2 = con.createStatement();
            String a = jTextField1.getText();
            int b = Integer.parseInt(a);
            st.executeUpdate("delete from gegitimgorev where gegno='" + b + "';");
            JOptionPane.showMessageDialog(pr, "İPTAL İŞLEMİ BAŞARILI..");
            String sql = "select g.gegno AS \"NO\",g.bastarihi AS \"BAŞLANGIÇ TRH\",g.bittarihi AS \"BİTİŞ TRH\",g.durum AS \"DURUM\" \n"
                    + ",g.eghakkinda AS\"HAKKINDA\",g.egyer AS \"YER\" from gegitimgorev g,personel p where p.sicil='" + scl + "'and g.sicil='" + scl + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            jTextField1.setText(null);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(pr, "HATA!Tekrar deneyiniz..");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void myerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myerActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(personelEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(personelEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(personelEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(personelEkranı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new personelEkranı().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser bastarihi;
    private com.toedter.calendar.JDateChooser bittarihi;
    private javax.swing.JButton geri;
    private com.toedter.calendar.JDateChooser gorevBas;
    private com.toedter.calendar.JDateChooser gorevBit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox<String> mDurum;
    private javax.swing.JTextField mSure;
    private com.toedter.calendar.JDateChooser mesaiTarihi;
    private javax.swing.JLabel mesaidurumu;
    private javax.swing.JLabel mesaisuresi;
    private javax.swing.JTextPane mhakkinda;
    private javax.swing.JTextField myer;
    private javax.swing.JTextField sicil;
    // End of variables declaration//GEN-END:variables
}
