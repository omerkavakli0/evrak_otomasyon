
import java.util.Date;

public class MaliEvrak {

    private int mEvrak_no;
    private String gUnvan;
    private String aUnvan;
    private String icerik;
    private String tarih;
    private String konu;
    private String tutar;
    private String kdv;
    private int gHesapNo;
    private int aHesapNo;
    private String gTel;
    private String aTel;
    private String gAdres;
    private String aAdres;

    public MaliEvrak(int mEvrak_no, String gUnvan, String aUnvan, String icerik, String tarih, String konu, String tutar, String kdv, int gHesapNo, int aHesapNo, String gTel, String aTel, String gAdres, String aAdres) {
        this.mEvrak_no = mEvrak_no;
        this.gUnvan = gUnvan;
        this.aUnvan = aUnvan;
        this.icerik = icerik;
        this.tarih = tarih;
        this.konu = konu;
        this.tutar = tutar;
        this.kdv = kdv;
        this.gHesapNo = gHesapNo;
        this.aHesapNo = aHesapNo;
        this.gTel = gTel;
        this.aTel = aTel;
        this.gAdres = gAdres;
        this.aAdres = aAdres;
    }

    public int getMEvrak_no() {
        return mEvrak_no;
    }

    public void setMEvrak_no(int mEvrak_no) {
        this.mEvrak_no = mEvrak_no;
    }

    public String getgUnvan() {
        return gUnvan;
    }

    public void setgUnvan(String gUnvan) {
        this.gUnvan = gUnvan;
    }

    public String getaUnvan() {
        return aUnvan;
    }

    public void setaUnvan(String aUnvan) {
        this.aUnvan = aUnvan;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public String getTutar() {
        return tutar;
    }

    public void setTutar(String tutar) {
        this.tutar = tutar;
    }

    public String getKdv() {
        return kdv;
    }

    public void setKdv(String kdv) {
        this.kdv = kdv;
    }

    public int getgHesapNo() {
        return gHesapNo;
    }

    public void setgHesapNo(int gHesapNo) {
        this.gHesapNo = gHesapNo;
    }

    public int getaHesapNo() {
        return aHesapNo;
    }

    public void setaHesapNo(int aHesapNo) {
        this.aHesapNo = aHesapNo;
    }

    public String getgTel() {
        return gTel;
    }

    public void setgTel(String gTel) {
        this.gTel = gTel;
    }

    public String getaTel() {
        return aTel;
    }

    public void setaTel(String aTel) {
        this.aTel = aTel;
    }

    public String getgAdres() {
        return gAdres;
    }

    public void setgAdres(String gAdres) {
        this.gAdres = gAdres;
    }

    public String getaAdres() {
        return aAdres;
    }

    public void setaAdres(String aAdres) {
        this.aAdres = aAdres;
    }
    
}
