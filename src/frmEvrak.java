
import static java.lang.Integer.parseInt;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class frmEvrak extends javax.swing.JFrame {
    DefaultTableModel model = null;
    public frmEvrak() {
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
        int kullaniciNo = frmGiris.aktifKullanici.getHesap_no();
        
        model = (DefaultTableModel) tblSQL.getModel();
        dbHelper db = new dbHelper();
        try{
            ArrayList<Evrak> evraklar = db.sqlSelectEvrak();
            for(Evrak evrak : evraklar){
                Object[] row = {
                    evrak.getEvrak_no(),
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
                txtGHesapNo.setText("000");
                txtGAdres.setText("");
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
            txtgAdres.setText("");
            txtaTel.setText("");
            txtgHesapNo.setText("000");
            txtaAdres.setText("");
            txtgTel.setText("");
            txtaHesapNo.setText("000");
    }

    private void erisilebilirlik(boolean B){
        txtEvrakNo.enable(B);
        txtGUnvan.enable(B);
        txtGHesapNo.enable(B);
        txtGAdres.enable(B);
        txtGTel.enable(B);
        txtKonu.enable(B);
        txtAUnvan.enable(B);
        txtAAdres.enable(B);
        txtAHesapNo.enable(B);
        txtTarih.enable(B);
        txtIcerik.enable(B);
        txtATel.enable(B);
        txtAHesapNo.enable(B);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
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
        lblicerik = new javax.swing.JLabel();
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
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtTarih = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtgUnvan = new javax.swing.JTextField();
        txtgHesapNo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtkonu = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtaUnvan = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtaHesapNo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtENo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtgAdres = new javax.swing.JEditorPane();
        txtaAdres = new javax.swing.JEditorPane();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txticerik = new javax.swing.JEditorPane();
        btnEkle = new javax.swing.JButton();
        txtgTel = new javax.swing.JFormattedTextField();
        txtaTel = new javax.swing.JFormattedTextField();
        btnGeri1 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtTarih1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(700, 200));

        jPanel1.setBackground(new java.awt.Color(23, 96, 135));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel1.setText("Evrak No");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(46, 7, 60, 16);

        jLabel8.setText("Gonderen");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(35, 28, 60, 20);

        jLabel28.setText("Unvan");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(44, 60, 51, 16);

        jLabel3.setText("Hesap No");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(43, 88, 60, 16);

        jLabel7.setText("Adres");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(43, 113, 51, 16);

        jLabel11.setText("Adres");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(285, 113, 51, 16);

        jLabel13.setText("Hesap No");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(285, 82, 60, 16);

        jLabel12.setText("Unvan");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(285, 54, 51, 16);

        jLabel10.setText("Alici");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(275, 14, 30, 30);

        jLabel4.setText("Konu");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(540, 90, 40, 16);
        jPanel3.add(jSeparator1);
        jSeparator1.setBounds(101, 34, 104, 10);
        jPanel3.add(jSeparator2);
        jSeparator2.setBounds(312, 31, 139, 13);

        jLabel14.setText("Tarih");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(536, 24, 40, 20);

        lblicerik.setText("Icerik");
        jPanel3.add(lblicerik);
        lblicerik.setBounds(536, 121, 40, 16);

        txtKonu.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtKonu.setPreferredSize(null);
        txtKonu.setSelectionColor(new java.awt.Color(23, 96, 135));
        jPanel3.add(txtKonu);
        txtKonu.setBounds(580, 86, 99, 22);

        txtAUnvan.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtAUnvan.setPreferredSize(null);
        txtAUnvan.setSelectionColor(new java.awt.Color(23, 96, 135));
        jPanel3.add(txtAUnvan);
        txtAUnvan.setBounds(350, 60, 100, 22);

        txtAHesapNo.setText("000");
        txtAHesapNo.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtAHesapNo.setPreferredSize(null);
        txtAHesapNo.setSelectionColor(new java.awt.Color(23, 96, 135));
        txtAHesapNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAHesapNoFocusLost(evt);
            }
        });
        jPanel3.add(txtAHesapNo);
        txtAHesapNo.setBounds(350, 90, 100, 22);

        txtGHesapNo.setText("000");
        txtGHesapNo.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtGHesapNo.setPreferredSize(null);
        txtGHesapNo.setSelectionColor(new java.awt.Color(23, 96, 135));
        txtGHesapNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtGHesapNoFocusLost(evt);
            }
        });
        jPanel3.add(txtGHesapNo);
        txtGHesapNo.setBounds(116, 97, 100, 22);

        txtGUnvan.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtGUnvan.setPreferredSize(null);
        txtGUnvan.setSelectionColor(new java.awt.Color(23, 96, 135));
        jPanel3.add(txtGUnvan);
        txtGUnvan.setBounds(116, 63, 100, 22);

        txtEvrakNo.setEditable(false);
        txtEvrakNo.setBackground(new java.awt.Color(255, 255, 255));
        txtEvrakNo.setText("000");
        txtEvrakNo.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtEvrakNo.setPreferredSize(null);
        txtEvrakNo.setSelectionColor(new java.awt.Color(23, 96, 135));
        txtEvrakNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEvrakNoFocusLost(evt);
            }
        });
        jPanel3.add(txtEvrakNo);
        txtEvrakNo.setBounds(116, 6, 100, 22);

        jLabel15.setText("Ara");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(46, 231, 51, 20);
        jPanel3.add(jSeparator3);
        jSeparator3.setBounds(86, 241, 260, 10);

        btnKaydet.setText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });
        jPanel3.add(btnKaydet);
        btnKaydet.setBounds(470, 210, 100, 23);

        btnTemizle.setText("Temizle");
        btnTemizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTemizleActionPerformed(evt);
            }
        });
        jPanel3.add(btnTemizle);
        btnTemizle.setBounds(580, 210, 100, 23);

        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });
        jPanel3.add(btnSil);
        btnSil.setBounds(580, 250, 100, 23);

        btnGuncelle.setText("Guncelle");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });
        jPanel3.add(btnGuncelle);
        btnGuncelle.setBounds(470, 250, 100, 23);

        btnGoruntule.setText("Goruntule");
        btnGoruntule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoruntuleActionPerformed(evt);
            }
        });
        jPanel3.add(btnGoruntule);
        btnGoruntule.setBounds(350, 250, 100, 23);

        txtAra.setSelectionColor(new java.awt.Color(23, 96, 135));
        txtAra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAraKeyReleased(evt);
            }
        });
        jPanel3.add(txtAra);
        txtAra.setBounds(46, 251, 300, 22);

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

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(49, 291, 630, 250);

        jLabel6.setText("Telefon");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(46, 211, 39, 16);

        jLabel9.setText("Telefon");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(290, 210, 39, 16);

        txtAAdres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        txtAAdres.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtAAdres.setSelectionColor(new java.awt.Color(23, 96, 135));
        jPanel3.add(txtAAdres);
        txtAAdres.setBounds(350, 120, 100, 80);

        txtIcerik.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        txtIcerik.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtIcerik.setSelectionColor(new java.awt.Color(23, 96, 135));
        jPanel3.add(txtIcerik);
        txtIcerik.setBounds(580, 120, 100, 80);

        txtGAdres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        txtGAdres.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtGAdres.setSelectionColor(new java.awt.Color(23, 96, 135));
        jPanel3.add(txtGAdres);
        txtGAdres.setBounds(116, 129, 100, 80);

        btnGeri.setText("Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });
        jPanel3.add(btnGeri);
        btnGeri.setBounds(646, 570, 87, 23);

        try {
            txtATel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtATel.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtATel.setSelectionColor(new java.awt.Color(23, 96, 135));
        jPanel3.add(txtATel);
        txtATel.setBounds(350, 210, 100, 22);

        try {
            txtGTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtGTel.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtGTel.setSelectionColor(new java.awt.Color(23, 96, 135));
        jPanel3.add(txtGTel);
        txtGTel.setBounds(116, 215, 100, 22);

        jLabel29.setForeground(new java.awt.Color(255, 0, 51));
        jLabel29.setText("*");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(220, 10, 14, 16);

        jLabel30.setForeground(new java.awt.Color(255, 0, 51));
        jLabel30.setText("*");
        jPanel3.add(jLabel30);
        jLabel30.setBounds(222, 66, 14, 16);

        jLabel31.setForeground(new java.awt.Color(255, 0, 51));
        jLabel31.setText("*");
        jPanel3.add(jLabel31);
        jLabel31.setBounds(460, 56, 14, 30);

        jLabel32.setForeground(new java.awt.Color(255, 0, 51));
        jLabel32.setText("*");
        jPanel3.add(jLabel32);
        jLabel32.setBounds(685, 27, 14, 16);

        jLabel33.setForeground(new java.awt.Color(255, 0, 51));
        jLabel33.setText("*");
        jPanel3.add(jLabel33);
        jLabel33.setBounds(685, 89, 14, 16);

        txtTarih.setDateFormatString("YYYY-MM-DD");
        jPanel3.add(txtTarih);
        txtTarih.setBounds(580, 20, 100, 22);

        jTabbedPane1.addTab("Evrak Islemleri", jPanel3);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Unvan");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(38, 148, 86, 20);

        txtgUnvan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtgUnvan.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtgUnvan.setEnabled(false);
        jPanel2.add(txtgUnvan);
        txtgUnvan.setBounds(130, 145, 125, 26);

        txtgHesapNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtgHesapNo.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtgHesapNo.setEnabled(false);
        jPanel2.add(txtgHesapNo);
        txtgHesapNo.setBounds(130, 177, 125, 26);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Hesap No");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(38, 180, 86, 20);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Telefon");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(38, 212, 86, 20);

        txtkonu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtkonu);
        txtkonu.setBounds(130, 368, 454, 26);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Adres");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(38, 241, 86, 20);

        txtaUnvan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtaUnvan);
        txtaUnvan.setBounds(459, 145, 125, 26);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Unvan");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(367, 148, 86, 20);

        txtaHesapNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtaHesapNo.setText("000");
        txtaHesapNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtaHesapNoFocusLost(evt);
            }
        });
        jPanel2.add(txtaHesapNo);
        txtaHesapNo.setBounds(459, 177, 125, 26);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Hesap No");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(367, 180, 86, 20);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Telefon");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(367, 212, 86, 20);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Adres");
        jPanel2.add(jLabel23);
        jLabel23.setBounds(367, 241, 86, 20);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Evrak No");
        jPanel2.add(jLabel24);
        jLabel24.setBounds(38, 116, 86, 20);

        txtENo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtENo.setText("000");
        txtENo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtENoFocusLost(evt);
            }
        });
        jPanel2.add(txtENo);
        txtENo.setBounds(130, 113, 125, 26);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Tarih");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(367, 116, 86, 20);

        txtgAdres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtgAdres.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtgAdres.setEnabled(false);
        jPanel2.add(txtgAdres);
        txtgAdres.setBounds(130, 241, 125, 100);

        txtaAdres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel2.add(txtaAdres);
        txtaAdres.setBounds(459, 241, 125, 100);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Icerik");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(38, 411, 86, 20);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Konu");
        jPanel2.add(jLabel27);
        jLabel27.setBounds(38, 371, 86, 20);

        txticerik.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel2.add(txticerik);
        txticerik.setBounds(130, 400, 454, 132);

        btnEkle.setText("Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });
        jPanel2.add(btnEkle);
        btnEkle.setBounds(590, 494, 121, 38);

        try {
            txtgTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtgTel.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtgTel.setEnabled(false);
        txtgTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtgTel);
        txtgTel.setBounds(130, 209, 125, 26);

        try {
            txtaTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtaTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtaTel);
        txtaTel.setBounds(459, 209, 125, 26);

        btnGeri1.setText("Geri");
        btnGeri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });
        jPanel2.add(btnGeri1);
        btnGeri1.setBounds(650, 570, 87, 23);

        jLabel34.setForeground(new java.awt.Color(255, 0, 51));
        jLabel34.setText("*");
        jPanel2.add(jLabel34);
        jLabel34.setBounds(590, 151, 14, 16);

        jLabel35.setForeground(new java.awt.Color(255, 0, 51));
        jLabel35.setText("*");
        jPanel2.add(jLabel35);
        jLabel35.setBounds(590, 119, 14, 16);

        jLabel36.setForeground(new java.awt.Color(255, 0, 51));
        jLabel36.setText("*");
        jPanel2.add(jLabel36);
        jLabel36.setBounds(261, 119, 18, 16);

        jLabel37.setForeground(new java.awt.Color(255, 0, 51));
        jLabel37.setText("*");
        jPanel2.add(jLabel37);
        jLabel37.setBounds(590, 374, 18, 16);

        jLabel38.setForeground(new java.awt.Color(255, 0, 51));
        jLabel38.setText("*");
        jPanel2.add(jLabel38);
        jLabel38.setBounds(590, 400, 18, 16);

        txtTarih1.setDateFormatString("YYYY-MM-DD");
        txtTarih1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtTarih1);
        txtTarih1.setBounds(460, 110, 125, 22);

        jTabbedPane1.addTab("Evrak Ekle", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addContainerGap()))
        );

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
    
    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
        dbHelper db = new dbHelper();
        
        try {
            int kontrol =0;
            ArrayList<Evrak> evraklar = db.sqlSelectEvrak();
            for(Evrak evrak : evraklar){
                if(evrak.getEvrak_no()== parseInt(txtENo.getText())){
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
                Evrak evrak = new Evrak(
                        parseInt(txtENo.getText()),
                        txtgUnvan.getText(),
                        txtaUnvan.getText(),
                        txticerik.getText(),
                        ((JTextField)txtTarih1.getDateEditor().getUiComponent()).getText(),
                        txtkonu.getText(),
                        parseInt(txtgHesapNo.getText()),
                        parseInt(txtaHesapNo.getText()),
                        txtgTel.getText(),
                        txtaTel.getText(),
                        txtgAdres.getText(),
                        txtaAdres.getText());
                db.sqlInsert(evrak);
                JOptionPane.showMessageDialog(null, "Kaydiniz basariyla tamamlanmistir.", "Bİlgilendime", JOptionPane.INFORMATION_MESSAGE);
                temizle2();
            }
            else{
                JOptionPane.showMessageDialog(null, "Kirmizi isaretli yerler bos birakilamaz!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            DefaultTableModel model1 = (DefaultTableModel)tblSQL.getModel();
            model1.setRowCount(0);
            tabloGetir();
            }
            
        } catch (SQLException e) {
            db.showError(e);
        }
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        dbHelper db = new dbHelper();
        try {
            if(!txtEvrakNo.getText().isEmpty() && !txtAUnvan.getText().isEmpty()&& !txtGUnvan.getText().isEmpty() && !txtIcerik.getText().isEmpty() && !((JTextField)txtTarih.getDateEditor().getUiComponent()).getText().isEmpty() && !txtKonu.getText().isEmpty()){

                Evrak evrak = new Evrak(
                    parseInt(txtEvrakNo.getText()),
                    txtGUnvan.getText(),
                    txtAUnvan.getText(),
                    txtIcerik.getText(),
                    ((JTextField)txtTarih.getDateEditor().getUiComponent()).getText(),
                    txtKonu.getText(),
                    parseInt(txtGHesapNo.getText()),
                    parseInt(txtAHesapNo.getText()),
                    txtGTel.getText(),
                    txtATel.getText(),
                    txtGAdres.getText(),
                    txtAAdres.getText());
                db.sqlUpdate(evrak);
                btnKaydet.setVisible(true);
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
                    db.sqlDeleteEvrak(evrakNo);
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
        ArrayList<Evrak> evraklar = null;
        Evrak evrak = null;
        dbHelper db = new dbHelper();
        try {
            int column = 0;
            int row = tblSQL.getSelectedRow();
            if(row == -1 ){
                JOptionPane.showMessageDialog(null, "Lutfen once satir seciniz", "Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                String value = tblSQL.getModel().getValueAt(row, column).toString();
                evraklar = db.sqlSelectEvrak();
                for(Evrak e: evraklar){
                    if(e.getEvrak_no()== parseInt(value)){
                        evrak = e;
                        break;
                    }
                }
                txtEvrakNo.setText(String.valueOf(evrak.getEvrak_no()));
                txtGAdres.setText(evrak.getgAdres());
                txtGHesapNo.setText(String.valueOf(evrak.getgHesapNo()));
                txtGUnvan.setText(evrak.getgUnvan());
                txtGTel.setText(evrak.getgTel());
                txtKonu.setText(evrak.getKonu());
                txtAUnvan.setText(evrak.getaUnvan());
                txtAHesapNo.setText(String.valueOf(evrak.getaHesapNo()));
                txtAAdres.setText(evrak.getaAdres());
                txtATel.setText(evrak.getaTel());
                ((JTextField)txtTarih.getDateEditor().getUiComponent()).setText(String.valueOf(evrak.getTarih()));
                txtIcerik.setText(evrak.getIcerik());
                erisilebilirlik(true);
            }

        } catch (SQLException e) {
            db.showError(e);
        }
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnGoruntuleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoruntuleActionPerformed
        ArrayList<Evrak> evraklar = null;
        Evrak evrak = null;
        dbHelper db = new dbHelper();
        try {
            int column = 0;
            int row = tblSQL.getSelectedRow();
            if(row == -1 ){
                JOptionPane.showMessageDialog(null, "Lutfen bir satir seciniz", "Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                String value = tblSQL.getModel().getValueAt(row, column).toString();
                evraklar = db.sqlSelectEvrak();
                for(Evrak e: evraklar){
                    if(e.getEvrak_no()== parseInt(value)){
                        evrak = e;
                        break;
                    }
                }
                txtEvrakNo.setText(String.valueOf(evrak.getEvrak_no()));
                txtGAdres.setText(evrak.getgAdres());
                txtGTel.setText(evrak.getgTel());
                txtGUnvan.setText(evrak.getgUnvan());
                txtGHesapNo.setText(String.valueOf(evrak.getgHesapNo()));
                txtKonu.setText(evrak.getKonu());
                txtAAdres.setText(evrak.getaAdres());
                txtAUnvan.setText(evrak.getaUnvan());
                txtAHesapNo.setText(String.valueOf(evrak.getaHesapNo()));
                txtATel.setText(evrak.getaTel());
                ((JTextField)txtTarih.getDateEditor().getUiComponent()).setText(String.valueOf(evrak.getTarih()));
                txtIcerik.setText(evrak.getIcerik());
                erisilebilirlik(false);
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

    private void txtAHesapNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAHesapNoFocusLost
        if(txtAHesapNo.getText().isEmpty()){
            txtAHesapNo.setText("000");
        }
    }//GEN-LAST:event_txtAHesapNoFocusLost

    private void txtGHesapNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGHesapNoFocusLost
        if(txtGHesapNo.getText().isEmpty()){
            txtGHesapNo.setText("000");
        }
    }//GEN-LAST:event_txtGHesapNoFocusLost

    private void txtEvrakNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEvrakNoFocusLost
        if(txtEvrakNo.getText().isEmpty()){
            txtEvrakNo.setText("000");
        }
    }//GEN-LAST:event_txtEvrakNoFocusLost

    private void txtaHesapNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtaHesapNoFocusLost
        if(txtaHesapNo.getText().isEmpty()){
            txtaHesapNo.setText("000");
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
                new frmEvrak().setVisible(true);
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JEditorPane txtaAdres;
    private javax.swing.JTextField txtaHesapNo;
    private javax.swing.JFormattedTextField txtaTel;
    private javax.swing.JTextField txtaUnvan;
    private javax.swing.JEditorPane txtgAdres;
    private javax.swing.JTextField txtgHesapNo;
    private javax.swing.JFormattedTextField txtgTel;
    private javax.swing.JTextField txtgUnvan;
    private javax.swing.JEditorPane txticerik;
    private javax.swing.JTextField txtkonu;
    // End of variables declaration//GEN-END:variables
}
