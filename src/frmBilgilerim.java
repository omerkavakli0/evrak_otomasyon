
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class frmBilgilerim extends javax.swing.JFrame {

    
    public frmBilgilerim() {
        initComponents();
        bilgileriGetir();
    }
    private void bilgileriGetir(){
        Kullanici K = frmGiris.aktifKullanici;
        txtAd.setText(K.getAd());
        txtSoyad.setText(K.getSoyad());
        txtHesapNo.setText(String.valueOf(K.getHesap_no()));
        txtSifre.setText(K.getSifre());
        txtUnvan.setText(K.getUnvan());
        txtTel.setText(K.getTel());
        txtAdres.setText(K.getAdres());
        
    }
    private void erisebilirlik(Boolean B){
        txtAd.enable(B);
        txtSoyad.enable(B);
        txtSifre.enable(B);
        txtAdres.enable(B);
        txtTel.enable(B);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtAd = new javax.swing.JTextField();
        txtUnvan = new javax.swing.JTextField();
        txtHesapNo = new javax.swing.JTextField();
        btnKaydet = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnGuncelle = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtSifre = new javax.swing.JTextField();
        txtAdres = new javax.swing.JEditorPane();
        jLabel5 = new javax.swing.JLabel();
        txtSoyad = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnGeri = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtTel = new javax.swing.JFormattedTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(700, 250));
        setMinimumSize(new java.awt.Dimension(430, 440));
        setResizable(false);

        jTextField3.setBackground(new java.awt.Color(23, 96, 135));
        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Hesap Bilgileri");
        jTextField3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField3.setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Adres");

        jLabel13.setText("Hesap No");

        jLabel12.setText("Unvan");

        txtAd.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAd.setEnabled(false);
        txtAd.setPreferredSize(null);
        txtAd.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSoyadCaretUpdate(evt);
            }
        });

        txtUnvan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtUnvan.setEnabled(false);
        txtUnvan.setPreferredSize(null);

        txtHesapNo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtHesapNo.setEnabled(false);
        txtHesapNo.setPreferredSize(null);

        btnKaydet.setText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        btnSil.setText("Hesabı Kapat");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        btnGuncelle.setText("Guncelle");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });

        jLabel9.setText("Sifre");

        txtSifre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSifre.setEnabled(false);

        txtAdres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        txtAdres.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAdres.setEnabled(false);

        jLabel5.setText("Soyad");

        txtSoyad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSoyad.setEnabled(false);
        txtSoyad.setPreferredSize(null);
        txtSoyad.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSoyadCaretUpdate(evt);
            }
        });

        jLabel17.setText("Ad");

        btnGeri.setText("Geri");
        btnGeri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeriActionPerformed(evt);
            }
        });

        jLabel10.setText("Telefon");

        try {
            txtTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTel.setEnabled(false);

        jLabel36.setForeground(new java.awt.Color(255, 0, 51));
        jLabel36.setText("*");

        jLabel37.setForeground(new java.awt.Color(255, 0, 51));
        jLabel37.setText("*");

        jLabel38.setForeground(new java.awt.Color(255, 0, 51));
        jLabel38.setText("*");

        jLabel39.setForeground(new java.awt.Color(255, 0, 51));
        jLabel39.setText("*");

        jLabel40.setForeground(new java.awt.Color(255, 0, 51));
        jLabel40.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnKaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSoyad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtTel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSifre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHesapNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUnvan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGeri)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel37)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel40)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtHesapNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel38)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel39)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuncelle)
                            .addComponent(btnKaydet))
                        .addGap(7, 7, 7)
                        .addComponent(btnSil)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGeri)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        erisebilirlik(true);
        
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
        dbHelper db = new dbHelper();
        try {
            int response = JOptionPane.showConfirmDialog(this, "Hesabinizi kapatmak istediginize emin misiniz?", "Bilgilendirme", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                db.sqlDeleteKisi(parseInt(txtHesapNo.getText()));
                frmGiris frm = new frmGiris();
                frm.show();
                dispose();
                JOptionPane.showMessageDialog(null, "Hesabiniz basariyla silinmistir.","Bilgilendirme",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (SQLException e) {
            db.showError(e);
        }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        dbHelper db = new dbHelper();
        try {
            if(!txtAd.getText().isEmpty() && !txtSoyad.getText().isEmpty() &&!txtUnvan.getText().isEmpty() && !txtHesapNo.getText().isEmpty() && !txtSifre.getText().isEmpty()){
                Kullanici k = new Kullanici(
                    parseInt(txtHesapNo.getText()),
                    txtSifre.getText(),
                    txtAd.getText(),
                    txtSoyad.getText(),
                    txtUnvan.getText(),
                    txtTel.getText(),
                    txtAdres.getText());
                db.sqlUpdate(k);
                frmGiris.aktifKullanici = k;
                erisebilirlik(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Kirmizi isaretli yerler bos birakilamaz!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch(SQLException e) {
            db.showError(e);
        }
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void btnGeriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeriActionPerformed
        frmAna frm = new frmAna();
        frm.show();
        dispose();
    }//GEN-LAST:event_btnGeriActionPerformed

    private void txtSoyadCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSoyadCaretUpdate
        String unvan = txtAd.getText().replaceAll("\\s", ".").toLowerCase()+"_"+txtSoyad.getText().toLowerCase();
        txtUnvan.setText(unvan);
    }//GEN-LAST:event_txtSoyadCaretUpdate

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBilgilerim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeri;
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnSil;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtAd;
    private javax.swing.JEditorPane txtAdres;
    private javax.swing.JTextField txtHesapNo;
    private javax.swing.JTextField txtSifre;
    private javax.swing.JTextField txtSoyad;
    private javax.swing.JFormattedTextField txtTel;
    private javax.swing.JTextField txtUnvan;
    // End of variables declaration//GEN-END:variables
}
