import java.awt.Color;
import java.awt.Image;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class frmGiris extends javax.swing.JFrame {

    public static Kullanici aktifKullanici = null;
    public frmGiris() {
        initComponents();
        scaleImage();
    }
    
    public void scaleImage(){
        ImageIcon icon = new ImageIcon("D:\\java\\EvrakOtomasyon\\images\\location-pin.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        image.setIcon(scaledIcon);
        ImageIcon icon2 = new ImageIcon("D:\\java\\EvrakOtomasyon\\images\\folders.png");
        Image img2 = icon2.getImage();
        Image imgScale2 = img2.getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
        logo.setIcon(scaledIcon2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        btnGiris = new javax.swing.JButton();
        txtSifre = new javax.swing.JPasswordField();
        txtHesap = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnKapat = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnKayit = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(600, 300));
        setMinimumSize(new java.awt.Dimension(570, 350));
        setUndecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(logo);
        logo.setBounds(20, 0, 100, 90);

        image.setBackground(new java.awt.Color(255, 255, 255));
        image.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(image);
        image.setBounds(130, 130, 100, 100);

        btnGiris.setText("Giris Yap");
        btnGiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGirisActionPerformed(evt);
            }
        });
        getContentPane().add(btnGiris);
        btnGiris.setBounds(370, 190, 90, 23);

        txtSifre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtSifre);
        txtSifre.setBounds(370, 160, 90, 17);

        txtHesap.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtHesap.setSelectionColor(new java.awt.Color(255, 51, 51));
        getContentPane().add(txtHesap);
        txtHesap.setBounds(370, 130, 90, 17);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Hesap Numarasi :");
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 130, 100, 16);

        jLabel2.setText("Sifre :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 160, 50, 16);

        jPanel1.setBackground(new java.awt.Color(23, 96, 135));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 270, 570, 80);

        btnKapat.setBackground(new java.awt.Color(70, 177, 201));
        btnKapat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnKapat.setForeground(new java.awt.Color(102, 102, 102));
        btnKapat.setText(" X");
        btnKapat.setOpaque(true);
        btnKapat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKapatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKapatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKapatMouseExited(evt);
            }
        });
        getContentPane().add(btnKapat);
        btnKapat.setBounds(546, 4, 20, 20);

        jLabel3.setText("Hesabınız yok mu?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(370, 220, 130, 16);

        btnKayit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnKayit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnKayit.setText("Kayit Ol");
        btnKayit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKayitMouseClicked(evt);
            }
        });
        getContentPane().add(btnKayit);
        btnKayit.setBounds(370, 240, 90, 30);

        jTextField1.setBackground(new java.awt.Color(70, 177, 201));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Simple Doc");
        jTextField1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField1.setEnabled(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(0, 0, 570, 90);

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextField2.setEnabled(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(0, 0, 570, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGirisActionPerformed
            ArrayList<Kullanici> kullanicilar = null;
            Kullanici K = null;
            dbHelper db = new dbHelper();
            
            try{
                kullanicilar = db.sqlSelectKullanici();
                for(Kullanici k : kullanicilar){
                    if(txtHesap.getText().equals(String.valueOf(k.getHesap_no())) && txtSifre.getText().equals(k.getSifre())){
                        K = k ;
                        break;
                    }
                }
                if(txtHesap.getText().isEmpty() || txtSifre.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Kullanici adi veya sifre bos birakilamaz!", "Error", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    if(K != null){
                    aktifKullanici = K;
                    frmAna ana = new frmAna();
                    ana.show();
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Hesap numarasi veya sifre hatali", "Error", JOptionPane.ERROR_MESSAGE);
                }
                }
                
                
            }catch(SQLException ex){
                db.showError(ex);
            }
    }//GEN-LAST:event_btnGirisActionPerformed

    private void btnKayitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKayitMouseClicked
        frmKayit kayit = new frmKayit();
        kayit.show();
        dispose();
    }//GEN-LAST:event_btnKayitMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnKapatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKapatMouseEntered
        btnKapat.setOpaque(true);
        btnKapat.setBackground(Color.getHSBColor(340, 100, -35));
        btnKapat.setForeground(Color.getHSBColor(0, 0, 80));
    }//GEN-LAST:event_btnKapatMouseEntered

    private void btnKapatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKapatMouseClicked
        dispose();
    }//GEN-LAST:event_btnKapatMouseClicked

    private void btnKapatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKapatMouseExited
        btnKapat.setOpaque(false);
        btnKapat.setForeground(Color.getHSBColor(0, 0, 40));
    }//GEN-LAST:event_btnKapatMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmGiris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiris;
    private javax.swing.JLabel btnKapat;
    private javax.swing.JLabel btnKayit;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtHesap;
    private javax.swing.JPasswordField txtSifre;
    // End of variables declaration//GEN-END:variables
}
