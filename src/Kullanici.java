public class Kullanici {
    private int hesap_no;
    private String sifre;
    private String ad;
    private String soyad;
    private String unvan;
    private String tel;
    private String adres;

    public Kullanici(int hesap_no, String sifre, String ad, String soyad, String unvan, String tel, String adres) {
        this.hesap_no = hesap_no;
        this.sifre = sifre;
        this.ad = ad;
        this.soyad = soyad;
        this.unvan = unvan;
        this.tel = tel;
        this.adres = adres;
    }

    public int getHesap_no() {
        return hesap_no;
    }

    public void setHesap_no(int hesap_no) {
        this.hesap_no = hesap_no;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    
   
}
