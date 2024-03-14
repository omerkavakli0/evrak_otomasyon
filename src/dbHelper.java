import java.sql.*;
import java.util.ArrayList;

public class dbHelper {
    String sqlUser = "root";
    String sqlPassword = "12345";
    String sqlUrl = "jdbc:mysql://localhost:3306/evrak_otomasyon";
    
    public Connection getConnection()throws SQLException{
       return DriverManager.getConnection(sqlUrl,sqlUser,sqlPassword); 
    }
    
    public void showError(SQLException ex){
        System.out.println("Error"+ex.getMessage());
        System.out.println("Error Code:"+ex.getErrorCode());
    }
    
    public ArrayList<Kullanici> sqlSelectKullanici() throws SQLException{
        
        Connection connection = null;
        Statement statement;
        ResultSet rs;
        ArrayList<Kullanici> kullanicilar = null;
        try {
            connection = getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery("select * from evrak_otomasyon.kullanicilar");
            kullanicilar = new ArrayList<Kullanici>();
            while(rs.next()){
                kullanicilar.add(new Kullanici(
                        rs.getInt("hesap_no"),
                        rs.getString("sifre"),
                        rs.getString("ad"),
                        rs.getString("soyad"),
                        rs.getString("unvan"),
                        rs.getString("tel"),
                        rs.getString("adres")));
            }
             
            } catch (SQLException exception) {
                showError(exception);
            }
            finally{
                if (connection != null) {                
                        connection.close();
                }
            }
        System.out.println(kullanicilar);
        return kullanicilar;
    }
    public ArrayList<Evrak> sqlSelectEvrak()throws SQLException{
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        ArrayList<Evrak> evraklar = null;
        try {
            connection = getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery("select * from evrak_otomasyon.evraklar");
            evraklar = new ArrayList<Evrak>();
            while(rs.next()){
                evraklar.add(new Evrak(
                        rs.getInt("evrak_no"),
                        rs.getString("gUnvan"),
                        rs.getString("aUnvan"),
                        rs.getString("icerik"),
                        rs.getString("tarih"),
                        rs.getString("konu"),
                        rs.getInt("gHesapNo"),
                        rs.getInt("aHesapNo"),
                        rs.getString("gTel"),
                        rs.getString("aTel"),
                        rs.getString("gAdres"),
                        rs.getString("aAdres")
                ));
            }
        } catch (SQLException e) {
            showError(e);
        }finally{
            if (connection != null) {                
                    connection.close();
            }
        }
        return evraklar;
    }
    public ArrayList<MaliEvrak> sqlSelectMalievrak()throws SQLException{
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        ArrayList<MaliEvrak> maliEvraklar = null;
        try {
            connection = getConnection();
            statement = connection.createStatement();
            rs = statement.executeQuery("select * from evrak_otomasyon.malievraklar");
            maliEvraklar = new ArrayList<MaliEvrak>();
            while(rs.next()){
                maliEvraklar.add(new MaliEvrak(
                        rs.getInt("mEvrak_no"),
                        rs.getString("gUnvan"),
                        rs.getString("aUnvan"),
                        rs.getString("icerik"),
                        rs.getString("tarih"),
                        rs.getString("konu"),
                        rs.getString("tutar"),                        
                        rs.getString("kdv"),
                        rs.getInt("gHesapNo"),
                        rs.getInt("aHesapNo"),
                        rs.getString("gTel"),
                        rs.getString("aTel"),
                        rs.getString("gAdres"),
                        rs.getString("aAdres")
                ));       
            }
        } catch (SQLException e) {
            showError(e);
        }finally{
            if (connection != null) {                
                    connection.close();
            }
        }
        return maliEvraklar;
    }
    
    public int sqlInsert(Kullanici k) throws SQLException{
            Connection connection = null;
            PreparedStatement pStatement = null; 
            int kontrol = 0;
            try {
                connection = getConnection();
                
                String sqlCode = "insert into kullanicilar(hesap_no, sifre, ad, soyad,unvan, tel, adres) "
                        + "values(?,?,?,?,?,?,?)";
                pStatement = connection.prepareStatement(sqlCode);
                pStatement.setInt(1,k.getHesap_no() );
                pStatement.setString(2, k.getSifre());
                pStatement.setString(3, k.getAd());
                pStatement.setString(4, k.getSoyad());
                pStatement.setString(5, k.getUnvan());
                pStatement.setString(6, k.getTel());
                pStatement.setString(7, k.getAdres());
                kontrol = pStatement.executeUpdate();
                

            } catch (SQLException exception) {
                showError(exception);
            }
            finally{
                if (connection != null || pStatement != null) {
                        pStatement.close();
                        connection.close();

                }
            }   
            return kontrol;
        }
    public void sqlInsert(Evrak e) throws SQLException{
            Connection connection = null;
            PreparedStatement pStatement = null; 
            try {
                connection = getConnection();
                String sqlCode = "INSERT INTO evrak_otomasyon.evraklar (evrak_no, gUnvan, aUnvan, icerik, tarih, konu, gHesapNo, aHesapNo, gTel, aTel, gAdres, aAdres) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
                pStatement = connection.prepareStatement(sqlCode);
                pStatement.setInt(1,e.getEvrak_no() );
                pStatement.setString(2, e.getgUnvan());
                pStatement.setString(3, e.getaUnvan());
                pStatement.setString(4, e.getIcerik());
                pStatement.setString(5,e.getTarih());
                pStatement.setString(6, e.getKonu());
                pStatement.setInt(7, e.getgHesapNo());
                pStatement.setInt(8, e.getaHesapNo());
                pStatement.setString(9, e.getgTel());
                pStatement.setString(10, e.getaTel());
                pStatement.setString(11, e.getgAdres());
                pStatement.setString(12, e.getaAdres());
                
                int effected = pStatement.executeUpdate();
                System.out.println(effected);


            } catch (SQLException exception) {
                showError(exception);
            }
            finally{
                if (connection != null || pStatement != null) {
                        pStatement.close();
                        connection.close();

                }
            }   
        }
    public void sqlInsert(MaliEvrak m) throws SQLException{
            Connection connection = null;
            PreparedStatement pStatement = null; 
            try {
                connection = getConnection();
                String sqlCode = "INSERT INTO evrak_otomasyon.malievraklar (mEvrak_no, gUnvan, aUnvan, icerik, tarih, konu,tutar,kdv, gHesapNo, aHesapNo, gTel, aTel, gAdres, aAdres) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                pStatement = connection.prepareStatement(sqlCode);
                pStatement.setInt(1,m.getMEvrak_no());
                pStatement.setString(2, m.getgUnvan());
                pStatement.setString(3, m.getaUnvan());
                pStatement.setString(4, m.getIcerik());
                pStatement.setString(5,m.getTarih());
                pStatement.setString(6, m.getKonu());
                pStatement.setString(7, m.getTutar());
                pStatement.setString(8, m.getKdv());
                pStatement.setInt(9, m.getgHesapNo());
                pStatement.setInt(10, m.getaHesapNo());
                pStatement.setString(11, m.getgTel());
                pStatement.setString(12, m.getaTel());
                pStatement.setString(13, m.getgAdres());
                pStatement.setString(14, m.getaAdres());
                int effected = pStatement.executeUpdate();
                System.out.println(effected);


            } catch (SQLException exception) {
                showError(exception);
            }
            finally{
                if (connection != null || pStatement != null) {
                        pStatement.close();
                        connection.close();

                }
            }   
        }
    
    public void sqlUpdate(Evrak e) throws SQLException{
        Connection connection = null;
        PreparedStatement pStatement = null; 
        try {
            connection = getConnection();
            String sqlCode = "update evraklar set "
                    + "aAdres = ?,"
                    + "gUnvan = ?,"
                    + "aUnvan = ?,"
                    + "icerik = ?,"
                    + "tarih = ?,"
                    + "konu = ?,"
                    + "gHesapNo = ?,"
                    + "aHesapNo = ?,"
                    + "gTel = ?,"
                    + "aTel = ?,"
                    + "gAdres = ? where evrak_no = ?";
            pStatement = connection.prepareStatement(sqlCode);
            pStatement.setString(1,e.getaAdres() );
            pStatement.setString(2, e.getgUnvan());
            pStatement.setString(3, e.getaUnvan());
            pStatement.setString(4, e.getIcerik());
            pStatement.setString(5,e.getTarih());
            pStatement.setString(6, e.getKonu());
            pStatement.setInt(7, e.getgHesapNo());
            pStatement.setInt(8, e.getaHesapNo());
            pStatement.setString(9, e.getgTel());
            pStatement.setString(10, e.getaTel());
            pStatement.setString(11, e.getgAdres());
            pStatement.setInt(12, e.getEvrak_no() );
            int effected = pStatement.executeUpdate();
            System.out.println(effected+" data guncellendi");
            
            } catch (SQLException exception) {
                showError(exception);
            }
            finally{
                if (connection != null || pStatement != null) {
                        pStatement.close();
                        connection.close();
                }
            }
    }
    public void sqlUpdate(MaliEvrak m) throws SQLException{
        Connection connection = null;
        PreparedStatement pStatement = null; 
        try {
            connection = getConnection();
            String sqlCode = "update malievraklar set "
                    + "aAdres = ?,"
                    + "gUnvan = ?,"
                    + "aUnvan = ?,"
                    + "icerik = ?,"
                    + "tarih = ?,"
                    + "konu = ?,"
                    + "gHesapNo = ?,"
                    + "aHesapNo = ?,"
                    + "gTel = ?,"
                    + "aTel = ?,"
                    + "kdv = ?,"
                    + "tutar = ?,"
                    + "gAdres = ? where mEvrak_no = ?";
            pStatement = connection.prepareStatement(sqlCode);
            pStatement.setString(1,m.getaAdres() );
            pStatement.setString(2, m.getgUnvan());
            pStatement.setString(3, m.getaUnvan());
            pStatement.setString(4, m.getIcerik());
            pStatement.setString(5,m.getTarih());
            pStatement.setString(6, m.getKonu());
            pStatement.setInt(7, m.getgHesapNo());
            pStatement.setInt(8, m.getaHesapNo());
            pStatement.setString(9, m.getgTel());
            pStatement.setString(10, m.getaTel());
            pStatement.setString(11, m.getKdv());
            pStatement.setString(12, m.getTutar());
            pStatement.setString(13, m.getgAdres());
            pStatement.setInt(14, m.getMEvrak_no());
            int effected = pStatement.executeUpdate();
            System.out.println(effected+" data guncellendi");
            
            } catch (SQLException exception) {
                showError(exception);
            }
            finally{
                if (connection != null || pStatement != null) {
                        pStatement.close();
                        connection.close();
                }
            }
    }
    public void sqlUpdate(Kullanici k) throws SQLException{
        Connection connection = null;
        PreparedStatement pStatement = null; 
        try {
            connection = getConnection();
            String sqlCode = "update kullanicilar set "
                    + "sifre = ?,"
                    + "ad = ?,"
                    + "soyad = ?,"
                    + "unvan = ?,"
                    + "tel = ?,"
                    + "adres = ? where hesap_no = ?";
            pStatement = connection.prepareStatement(sqlCode);
            pStatement.setString(1,k.getSifre());
            pStatement.setString(2,k.getAd());
            pStatement.setString(3,k.getSoyad());
            pStatement.setString(4,k.getUnvan());
            pStatement.setString(5,k.getTel());
            pStatement.setString(6,k.getAdres());
            pStatement.setInt(7,k.getHesap_no());
            int effected = pStatement.executeUpdate();
            System.out.println(effected+" data guncellendi");
            
            } catch (SQLException exception) {
                showError(exception);
            }
            finally{
                if (connection != null || pStatement != null) {
                        pStatement.close();
                        connection.close();
                }
            }
    }

    public void sqlDeleteKisi(int hesapNo) throws SQLException{
            Connection connection = null;
            PreparedStatement pStatement = null; 
            try {
                connection = getConnection();
                String sqlCode = "delete from kullanicilar where hesap_no = ?";
                pStatement = connection.prepareStatement(sqlCode);
                pStatement.setInt(1, hesapNo);
                int effected = pStatement.executeUpdate();
                System.out.println(effected+" data silindi");

                } catch (SQLException exception) {
                    showError(exception);
                }
                finally{
                    if (connection != null || pStatement != null) {
                        pStatement.close();
                        connection.close();
                    }
                }
        }
    public void sqlDeleteMaliEvrak(int malievrakNo) throws SQLException{
            Connection connection = null;
            PreparedStatement pStatement = null; 
            try {
                connection = getConnection();
                String sqlCode = "delete from malievraklar where mEvrak_no = ?";
                pStatement = connection.prepareStatement(sqlCode);
                pStatement.setInt(1, malievrakNo);
                int effected = pStatement.executeUpdate();
                System.out.println(effected+" data silindi");

                } catch (SQLException exception) {
                    showError(exception);
                }
                finally{
                    if (connection != null || pStatement != null) {
                        pStatement.close();
                        connection.close();
                    }
                }
        }
    public void sqlDeleteEvrak(int evrakNo) throws SQLException{
            Connection connection = null;
            PreparedStatement pStatement = null; 
            try {
                connection = getConnection();
                String sqlCode = "delete from evraklar where evrak_no = ?";
                pStatement = connection.prepareStatement(sqlCode);
                pStatement.setInt(1, evrakNo);
                int effected = pStatement.executeUpdate();
                System.out.println(effected+" data silindi");

                } catch (SQLException exception) {
                    showError(exception);
                }
                finally{
                    if (connection != null || pStatement != null) {
                        pStatement.close();
                        connection.close();
                    }
                }
        }
}
