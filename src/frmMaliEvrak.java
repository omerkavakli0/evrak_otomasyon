
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class frmMaliEvrak extends javax.swing.JFrame {
    DefaultTableModel model = null;
    public frmMaliEvrak() {
        initComponents();
        tabloGetir();
        eklemeBilgileri();
    }
    private void eklemeBilgileri(){
        Kullanici K  =frmGiris.aktifKullanici;
        txtgUnvan.setText(K.getUnvan());
        txtgHesapNo.setText(String.valueOf(K.getHesap_no()));
        txtgTel.setText(K.getTel());
        txtgAdres.setText(K.getAdres());        
    }

    private void tabloGetir(){
        
        model = (DefaultTableModel) tblSQL.getModel();
        dbHelper db = new dbHelper();
        int kullaniciNo = frmGiris.aktifKullanici.getHesap_no();
        try{
            ArrayList<MaliEvrak> malievraklar = db.sqlSelectMalievrak();
            for(MaliEvrak evrak : malievraklar){
                Object[] row = {
                    evrak.getMEvrak_no(),
                    evrak.getKonu(),
                    evrak.getgUnvan(),
                    evrak.getaUnvan(),
                    evrak.getTarih()};
                if(evrak.getaHesapNo() == kullaniciNo || evrak.getgHesapNo() == kullaniciNo){
                    model.addRow(row);
                }
            }
            tblSQL.setModel(model);
        }
        catch(SQLException ex){
            System.out.println("Tablo asamasinda bir hata bulundu.");  
        }
    }
    private void temizle(){
        txtEvrakNo.setText("000");
        txtGUnvan.setText("");
        txtAUnvan.setText("");
        txtKonu.setText("");
        ((JTextField)txtTarih.getDateEditor().getUiComponent()).setText("");
        txtIcerik.setText("");
        txtTutar.setText("");
        cmbKdv.setSelectedIndex(0);
        txtGAdres.setText("");
        txtGHesapNo.setText("000");
        txtGTel.setText("");
        txtAAdres.setText("");
        txtAHesapNo.setText("000");
        txtATel.setText("");

    }
    private void temizle2(){
            txtENo.setText("000");
            txtgUnvan.setText("");
            txtaUnvan.setText("");
            txtkonu.setText("");
            ((JTextField)txtTarih1.getDateEditor().getUiComponent()).setText("");
            txticerik.setText("");
            txtTutar1.setText("");
            cmbKdv1.setSelectedIndex(0);
            txtgAdres.setText("");
            txtgTel.setText("");
            txtgHesapNo.setText("000");
            txtaAdres.setText("");
            txtaTel.setText("");
            txtaHesapNo.setText("000");
    }

    private void erisilebilirlik(boolean B){
                txtGUnvan.enable(B);
                txtGAdres.enable(B);
                txtGHesapNo.enable(B);
                txtGHesapNo.enable(B);
                txtTutar.enable(B);
                cmbKdv.enable(B);
                txtKonu.enable(B);
                txtAUnvan.enable(B);
                txtAAdres.enable(B);
                txtAHesapNo.enable(B);
                txtTarih.enable(B);
                txtIcerik.enable(B);
                txtGTel.enable(B);
                txtATel.enable(B);
                txtAHesapNo.enable(B);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblicerik = new javax.swing.JLabel();
        cmbKdv = new javax.swing.JComboBox<>();
        txtTutar = new javax.swing.JTextField();
        txtKonu = new javax.swing.JTextField();
        txtAUnvan = new javax.swing.JTextField();
        txtAHesapNo = new javax.swing.JTextField();
        txtGHesapNo = new javax.swing.JTextField();
        txtGUnvan = new javax.swing.JTextField();
        txtEvrakNo = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btnKaydet = new javax.swing.JButton();
        btnTemizle = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        btnGoruntule = new javax.swing.JButton();
        txtAra = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSQL = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAAdres = new javax.swing.JEditorPane();
        txtIcerik = new javax.swing.JEditorPane();
        txtGAdres = new javax.swing.JEditorPane();
        btnGeri = new javax.swing.JButton();
        txtATel = new javax.swing.JFormattedTextField();
        txtGTel = new javax.swing.JFormattedTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtTarih = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtgUnvan = new javax.swing.JTextField();
        txtgHesapNo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtgTel = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtkonu = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtaUnvan = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtaHesapNo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtENo = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtgAdres = new javax.swing.JEditorPane();
        txtaAdres = new javax.swing.JEditorPane();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txticerik = new javax.swing.JEditorPane();
        btnEkle = new javax.swing.JButton();
        cmbKdv1 = new javax.swing.JComboBox<>();
        txtTutar1 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btnGeri1 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        txtaTel = new javax.swing.JFormattedTextField();
        txtTarih1 = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 200));

        jPanel2.setBackground(new java.awt.Color(45, 132, 138));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setText("Evrak No");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(42, 12, 60, 16);

        jLabel8.setText("Gonderen");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(52, 47, 60, 16);

        jLabel16.setText("Unvan");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(51, 79, 51, 16);

        jLabel3.setText("Hesap No");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 107, 60, 16);

        jLabel7.setText("Adres");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 132, 51, 16);

        jLabel11.setText("Adres");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(297, 125, 51, 16);

        jLabel13.setText("Hesap No");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(297, 98, 60, 16);

        jLabel12.setText("Unvan");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(297, 75, 51, 16);

        jLabel10.setText("Alici");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(297, 27, 30, 30);

        jLabel4.setText("Konu");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(545, 109, 40, 16);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(119, 49, 113, 10);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(342, 50, 121, 13);

        jLabel14.setText("Tarih");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(545, 11, 40, 20);

        jLabel2.setText("Tutar");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(545, 55, 37, 16);

        jLabel5.setText("KDV");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(545, 83, 37, 16);

        lblicerik.setText("Icerik");
        jPanel1.add(lblicerik);
        lblicerik.setBounds(543, 140, 40, 16);

        cmbKdv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "%0", "%1", "%10", "%20" }));
        cmbKdv.setPreferredSize(null);
        jPanel1.add(cmbKdv);
        cmbKdv.setBounds(603, 80, 100, 22);

        txtTutar.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtTutar.setPreferredSize(null);
        jPanel1.add(txtTutar);
        txtTutar.setBounds(603, 49, 100, 22);

        txtKonu.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtKonu.setPreferredSize(null);
        jPanel1.add(txtKonu);
        txtKonu.setBounds(603, 106, 100, 22);

        txtAUnvan.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtAUnvan.setPreferredSize(null);
        jPanel1.add(txtAUnvan);
        txtAUnvan.setBounds(363, 74, 102, 22);

        txtAHesapNo.setText("000");
        txtAHesapNo.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtAHesapNo.setPreferredSize(null);
        txtAHesapNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAHesapNoFocusLost(evt);
            }
        });
        jPanel1.add(txtAHesapNo);
        txtAHesapNo.setBounds(363, 102, 102, 22);

        txtGHesapNo.setText("000");
        txtGHesapNo.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtGHesapNo.setPreferredSize(null);
        txtGHesapNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGHesapNoFocusLost(evt);
            }
        });
        jPanel1.add(txtGHesapNo);
        txtGHesapNo.setBounds(120, 104, 100, 22);

        txtGUnvan.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtGUnvan.setPreferredSize(null);
        jPanel1.add(txtGUnvan);
        txtGUnvan.setBounds(120, 76, 100, 22);

        txtEvrakNo.setEditable(false);
        txtEvrakNo.setBackground(new java.awt.Color(255, 255, 255));
        txtEvrakNo.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtEvrakNo.setPreferredSize(null);
        jPanel1.add(txtEvrakNo);
        txtEvrakNo.setBounds(119, 9, 100, 22);

        jLabel15.setText("Ara");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(53, 250, 51, 20);
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(93, 260, 260, 10);

        btnKaydet.setText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });
        jPanel1.add(btnKaydet);
        btnKaydet.setBounds(483, 230, 100, 23);

        btnTemizle.setText("Temizle");
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });
        jPanel1.add(btnTemizle);
        btnTemizle.setBounds(603, 230, 100, 23);

        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });
        jPanel1.add(btnSil);
        btnSil.setBounds(603, 270, 100, 23);

        btnGuncelle.setText("Guncelle");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuncelle);
        btnGuncelle.setBounds(483, 270, 100, 23);

        btnGoruntule.setText("Goruntule");
        btnGoruntule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoruntuleActionPerformed(evt);
            }
        });
        jPanel1.add(btnGoruntule);
        btnGoruntule.setBounds(365, 268, 100, 23);

        txtAra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAraKeyReleased(evt);
            }
        });
        jPanel1.add(txtAra);
        txtAra.setBounds(53, 268, 300, 22);

        tblSQL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Evrak No", "Tanim", "Gonderen Unvan", "Alici Unvan", "Tarih"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSQL);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(53, 300, 650, 229);

        jLabel6.setText("Telefon");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(53, 230, 39, 16);

        jLabel9.setText("Telefon");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(293, 230, 39, 16);

        txtAAdres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        txtAAdres.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtAAdres);
        txtAAdres.setBounds(363, 140, 100, 80);

        txtIcerik.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        txtIcerik.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtIcerik);
        txtIcerik.setBounds(603, 140, 100, 80);

        txtGAdres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        txtGAdres.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtGAdres);
        txtGAdres.setBounds(119, 142, 100, 80);

        btnGeri.setText("Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });
        jPanel1.add(btnGeri);
        btnGeri.setBounds(661, 543, 87, 23);

        try {
            txtATel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtATel.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtATel);
        txtATel.setBounds(360, 228, 105, 22);

        try {
            txtGTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtGTel.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtGTel);
        txtGTel.setBounds(119, 228, 100, 22);

        jLabel40.setForeground(new java.awt.Color(255, 0, 51));
        jLabel40.setText("*");
        jPanel1.add(jLabel40);
        jLabel40.setBounds(225, 12, 25, 16);

        jLabel41.setForeground(new java.awt.Color(255, 0, 51));
        jLabel41.setText("*");
        jPanel1.add(jLabel41);
        jLabel41.setBounds(225, 77, 25, 16);

        jLabel42.setForeground(new java.awt.Color(255, 0, 51));
        jLabel42.setText("*");
        jPanel1.add(jLabel42);
        jLabel42.setBounds(471, 77, 25, 16);

        jLabel43.setForeground(new java.awt.Color(255, 0, 51));
        jLabel43.setText("*");
        jPanel1.add(jLabel43);
        jLabel43.setBounds(709, 12, 25, 16);

        jLabel44.setForeground(new java.awt.Color(255, 0, 51));
        jLabel44.setText("*");
        jPanel1.add(jLabel44);
        jLabel44.setBounds(709, 52, 25, 16);

        jLabel45.setForeground(new java.awt.Color(255, 0, 51));
        jLabel45.setText("*");
        jPanel1.add(jLabel45);
        jLabel45.setBounds(709, 83, 5, 16);

        jLabel46.setForeground(new java.awt.Color(255, 0, 51));
        jLabel46.setText("*");
        jPanel1.add(jLabel46);
        jLabel46.setBounds(709, 109, 25, 16);

        jLabel47.setForeground(new java.awt.Color(255, 0, 51));
        jLabel47.setText("*");
        jPanel1.add(jLabel47);
        jLabel47.setBounds(709, 140, 25, 16);

        txtTarih.setDateFormatString("YYYY-MM-DD");
        jPanel1.add(txtTarih);
        txtTarih.setBounds(600, 10, 100, 22);

        jTabbedPane1.addTab("Mali Evrak Islemleri", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Unvan");

        txtgUnvan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtgUnvan.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtgUnvan.setEnabled(false);

        txtgHesapNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtgHesapNo.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtgHesapNo.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Hesap No");

        txtgTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtgTel.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtgTel.setEnabled(false);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Telefon");

        txtkonu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Adres");

        txtaUnvan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Unvan");

        txtaHesapNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtaHesapNo.setText("000");
        txtaHesapNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtaHesapNoFocusLost(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Hesap No");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Telefon");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Adres");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Evrak No");

        txtENo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtENo.setText("000");
        txtENo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtENoFocusLost(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Tarih");

        txtgAdres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtgAdres.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtgAdres.setEnabled(false);

        txtaAdres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Icerik");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setText("Konu");

        txticerik.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        btnEkle.setText("Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });

        cmbKdv1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbKdv1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "%0", "%1", "%10", "%20" }));

        txtTutar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("KDV");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setText("Tutar");

        btnGeri1.setText("Geri");
        btnGeri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        jLabel48.setForeground(new java.awt.Color(255, 0, 51));
        jLabel48.setText("*");

        jLabel49.setForeground(new java.awt.Color(255, 0, 51));
        jLabel49.setText("*");

        jLabel50.setForeground(new java.awt.Color(255, 0, 51));
        jLabel50.setText("*");

        jLabel51.setForeground(new java.awt.Color(255, 0, 51));
        jLabel51.setText("*");

        jLabel52.setForeground(new java.awt.Color(255, 0, 51));
        jLabel52.setText("*");

        jLabel53.setForeground(new java.awt.Color(255, 0, 51));
        jLabel53.setText("*");

        jLabel54.setForeground(new java.awt.Color(255, 0, 51));
        jLabel54.setText("*");

        try {
            txtaTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtaTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTarih1.setDateFormatString("YYYY-MM-DD");
        txtTarih1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGeri1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtkonu, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txticerik, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtENo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgHesapNo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgTel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTarih1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTutar1, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(cmbKdv1, 0, 125, Short.MAX_VALUE)
                            .addComponent(txtaUnvan, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(txtaHesapNo, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(txtaAdres, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(txtaTel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTutar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbKdv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtENo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel49))
                    .addComponent(jLabel53)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(txtTarih1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtgUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtaUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel21))))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtgHesapNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtaHesapNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel22))))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtgTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(txtaTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(txtgAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtaAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel28))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtkonu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel54)))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel27))
                    .addComponent(txticerik, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addGap(78, 78, 78)
                        .addComponent(btnEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGeri1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Mali Evrak Ekle", jPanel3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        dbHelper db = new dbHelper();

        try {
            int kontrol =0;
            
            ArrayList<MaliEvrak> malievraklar = db.sqlSelectMalievrak();
            for(MaliEvrak evrak : malievraklar){
                if(evrak.getMEvrak_no() == parseInt(txtENo.getText())){
                    kontrol = -1;
                    break;
                }
            }
            if(kontrol == -1){
                JOptionPane.showMessageDialog(null, "Bu evrak numarasi kayitlidir. Lutfen bilgilerinizi kontrol ediniz.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(parseInt(txtENo.getText()) < 1){
                JOptionPane.showMessageDialog(null, "Lutfen bir evrak numarasi giriniz", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(!txtENo.getText().isEmpty() && !txtgUnvan.getText().isEmpty() &&!txtaUnvan.getText().isEmpty() && !txticerik.getText().isEmpty() && !((JTextField)txtTarih1.getDateEditor().getUiComponent()).getText().isEmpty() && !txtkonu.getText().isEmpty()){
                MaliEvrak evrak = new MaliEvrak(
                    parseInt(txtENo.getText()),
                    txtgUnvan.getText(),
                    txtaUnvan.getText(),
                    txticerik.getText(),
                    ((JTextField)txtTarih1.getDateEditor().getUiComponent()).getText(),
                    txtkonu.getText(),
                    txtTutar1.getText(), 
                    String.valueOf(cmbKdv1.getSelectedItem()),
                    parseInt(txtgHesapNo.getText()),
                    parseInt(txtaHesapNo.getText()),
                    txtgTel.getText(),
                    txtaTel.getText(),
                    txtgAdres.getText(),
                    txtaAdres.getText());
                db.sqlInsert(evrak);
                JOptionPane.showMessageDialog(null, "Kaydiniz basariyla tamamlanmistir.", "Bİlgilendime", JOptionPane.INFORMATION_MESSAGE);
                temizle2();
                DefaultTableModel model1 = (DefaultTableModel)tblSQL.getModel();
                model1.setRowCount(0);
                tabloGetir();
            }
            else{
                JOptionPane.showMessageDialog(null, "Kirmizi isaretli yerler bos birakilamaz!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            }
        } catch (SQLException e) {
            db.showError(e);
        }
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        dbHelper db = new dbHelper();
        try {
            if(!txtEvrakNo.getText().isEmpty() &&!txtAUnvan.getText().isEmpty() && !txtGUnvan.getText().isEmpty() &&!txtTutar.getText().isEmpty() && !txtIcerik.getText().isEmpty() && !((JTextField)txtTarih.getDateEditor().getUiComponent()).getText().isEmpty() && !txtKonu.getText().isEmpty()){

                MaliEvrak evrak = new MaliEvrak(
                    parseInt(txtEvrakNo.getText()),
                    txtGUnvan.getText(),
                    txtAUnvan.getText(),
                    txtIcerik.getText(),
                    ((JTextField)txtTarih.getDateEditor().getUiComponent()).getText(),
                    txtKonu.getText(),
                    txtTutar.getText(),
                    String.valueOf(cmbKdv.getSelectedItem()),
                    parseInt(txtGHesapNo.getText()),
                    parseInt(txtAHesapNo.getText()),
                    txtGTel.getText(),
                    txtATel.getText(),
                    txtGAdres.getText(),
                    txtAAdres.getText());
                db.sqlUpdate(evrak);
                DefaultTableModel model1 = (DefaultTableModel)tblSQL.getModel();
                model1.setRowCount(0);
                tabloGetir();
                temizle();
            }
            else{
                JOptionPane.showMessageDialog(null, "Kirmizi isaretli yerler bos birakilamaz!", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            db.showError(e);
        }
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void btnTemizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTemizleActionPerformed
        temizle();
        erisilebilirlik(true);
    }//GEN-LAST:event_btnTemizleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        dbHelper db = new dbHelper();
        try {
            int column = 0;
            int row = tblSQL.getSelectedRow();
            if(row == -1 ){
                JOptionPane.showMessageDialog(null, "Lutfen bir satir seciniz", "Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                int evrakNo = (int) tblSQL.getModel().getValueAt(row, column);
                int response = JOptionPane.showConfirmDialog(this, "Silmek istediginize emin misiniz?", "Bilgilendirme", JOptionPane.YES_NO_OPTION);
                if(response == JOptionPane.YES_OPTION){
                    db.sqlDeleteMaliEvrak(evrakNo);
                }
            }
            DefaultTableModel model1 = (DefaultTableModel)tblSQL.getModel();
            model1.setRowCount(0);
            tabloGetir();
        } catch (SQLException e) {
            db.showError(e);
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        ArrayList<MaliEvrak> malievraklar = null;
        MaliEvrak evrak = null;
        dbHelper db = new dbHelper();
        try {
            int column = 0;
            int row = tblSQL.getSelectedRow();
            if(row == -1 ){
                JOptionPane.showMessageDialog(null, "Lutfen once satir seciniz", "Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                String value = tblSQL.getModel().getValueAt(row, column).toString();
                malievraklar = db.sqlSelectMalievrak();
                for(MaliEvrak e: malievraklar){
                    if(e.getMEvrak_no()== parseInt(value)){
                        evrak = e;
                        break;
                    }
                }
                txtEvrakNo.setText(String.valueOf(evrak.getMEvrak_no()));
                txtGAdres.setText(evrak.getgAdres());
                txtGUnvan.setText(evrak.getgUnvan());
                txtGTel.setText(evrak.getgTel());
                txtGHesapNo.setText(String.valueOf(evrak.getgHesapNo()));
                txtKonu.setText(evrak.getKonu());
                txtTutar.setText(String.valueOf(evrak.getTutar()));
                cmbKdv.setSelectedItem(evrak.getKdv());
                txtAUnvan.setText(evrak.getaUnvan());
                txtAHesapNo.setText(String.valueOf(evrak.getaHesapNo()));
                txtAAdres.setText(evrak.getaAdres());
                txtATel.setText(evrak.getaTel());
                ((JTextField)txtTarih.getDateEditor().getUiComponent()).setText(String.valueOf(evrak.getTarih()));
                txtIcerik.setText(evrak.getIcerik());
                erisilebilirlik(true);
                btnKaydet.setVisible(true);
            }

        } catch (SQLException e) {
            db.showError(e);
        }
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnGoruntuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoruntuleActionPerformed
        ArrayList<MaliEvrak> malievraklar = null;
        MaliEvrak evrak = null;
        dbHelper db = new dbHelper();
        try {
            int column = 0;
            int row = tblSQL.getSelectedRow();
            if(row == -1 ){
                JOptionPane.showMessageDialog(null, "Lutfen bir satir seciniz", "Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                String value = tblSQL.getModel().getValueAt(row, column).toString();
                malievraklar = db.sqlSelectMalievrak();
                for(MaliEvrak e: malievraklar){
                    if(e.getMEvrak_no()== parseInt(value)){
                        evrak = e;
                        break;
                    }
                }
                txtEvrakNo.setText(String.valueOf(evrak.getMEvrak_no()));
                txtGAdres.setText(evrak.getgAdres());
                txtGTel.setText(evrak.getgTel());
                txtGUnvan.setText(evrak.getgUnvan());
                txtGHesapNo.setText(String.valueOf(evrak.getgHesapNo()));
                txtKonu.setText(evrak.getKonu());
                cmbKdv.setSelectedItem(evrak.getKdv());
                txtTutar.setText(evrak.getTutar());
                txtAAdres.setText(evrak.getaAdres());
                txtAUnvan.setText(evrak.getaUnvan());
                txtAHesapNo.setText(String.valueOf(evrak.getaHesapNo()));
                txtATel.setText(evrak.getaTel());
                ((JTextField)txtTarih.getDateEditor().getUiComponent()).setText(String.valueOf(evrak.getTarih()));
                txtIcerik.setText(evrak.getIcerik());
                erisilebilirlik(false);
                btnTemizle.setVisible(true);

            }
        } catch (SQLException e) {
            db.showError(e);
        }
    }//GEN-LAST:event_btnGoruntuleActionPerformed

    private void txtAraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAraKeyReleased
        String searchKey = txtAra.getText();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
        tblSQL.setRowSorter(sorter);
        sorter.setRowFilter(RowFilter.regexFilter(searchKey));
    }//GEN-LAST:event_txtAraKeyReleased

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        frmAna frm = new frmAna();
        frm.show();
        dispose();
    }//GEN-LAST:event_btnGeriActionPerformed

    private void txtGHesapNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGHesapNoFocusLost
        if(txtGHesapNo.getText().isEmpty()){
            txtGHesapNo.setText("000");
        }
    }//GEN-LAST:event_txtGHesapNoFocusLost

    private void txtAHesapNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAHesapNoFocusLost
        if(txtAHesapNo.getText().isEmpty()){
            txtAHesapNo.setText("000");
        }
    }//GEN-LAST:event_txtAHesapNoFocusLost

    private void txtaHesapNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaHesapNoFocusLost
        if(txtaHesapNo.getText().isEmpty()){
            txtaHesapNo.setText("0");
        }
    }//GEN-LAST:event_txtaHesapNoFocusLost

    private void txtENoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtENoFocusLost
        if(txtENo.getText().isEmpty()){
            txtENo.setText("000");
        }
    }//GEN-LAST:event_txtENoFocusLost

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMaliEvrak().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnGeri1;
    private javax.swing.JButton btnGoruntule;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnTemizle;
    private javax.swing.JComboBox<String> cmbKdv;
    private javax.swing.JComboBox<String> cmbKdv1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblicerik;
    private javax.swing.JTable tblSQL;
    private javax.swing.JEditorPane txtAAdres;
    private javax.swing.JTextField txtAHesapNo;
    private javax.swing.JFormattedTextField txtATel;
    private javax.swing.JTextField txtAUnvan;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtENo;
    private javax.swing.JTextField txtEvrakNo;
    private javax.swing.JEditorPane txtGAdres;
    private javax.swing.JTextField txtGHesapNo;
    private javax.swing.JFormattedTextField txtGTel;
    private javax.swing.JTextField txtGUnvan;
    private javax.swing.JEditorPane txtIcerik;
    private javax.swing.JTextField txtKonu;
    private com.toedter.calendar.JDateChooser txtTarih;
    private com.toedter.calendar.JDateChooser txtTarih1;
    private javax.swing.JTextField txtTutar;
    private javax.swing.JTextField txtTutar1;
    private javax.swing.JEditorPane txtaAdres;
    private javax.swing.JTextField txtaHesapNo;
    private javax.swing.JFormattedTextField txtaTel;
    private javax.swing.JTextField txtaUnvan;
    private javax.swing.JEditorPane txtgAdres;
    private javax.swing.JTextField txtgHesapNo;
    private javax.swing.JTextField txtgTel;
    private javax.swing.JTextField txtgUnvan;
    private javax.swing.JEditorPane txticerik;
    private javax.swing.JTextField txtkonu;
    // End of variables declaration//GEN-END:variables
}
