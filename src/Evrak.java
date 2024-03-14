
import static java.lang.Integer.parseInt;
import java.util.Date;

public class Evrak extends Belge{
   
    private int evrak_no;
    private String gUnvan;
    private String aUnvan;
    private String icerik;
    private String tarih;
    private String konu;
    private int gHesapNo;
    private int aHesapNo;
    private String gTel;
    private String aTel;
    private String gAdres;
    private String aAdres;
    public String yeniUnvan;

    public Evrak(int evrak_no, String gUnvan, String aUnvan, String icerik, String tarih, String konu, int gHesapNo, int aHesapNo, String gTel, String aTel, String gAdres, String aAdres) {
        this.evrak_no = evrak_no;
        this.gUnvan = gUnvan;
        this.aUnvan = aUnvan;
        this.icerik = icerik;
        this.tarih = tarih;
        this.konu = konu;
        this.gHesapNo = gHesapNo;
        this.aHesapNo = aHesapNo;
        this.gTel = gTel;
        this.aTel = aTel;
        this.gAdres = gAdres;
        this.aAdres = aAdres;
    }

    public int getEvrak_no() {
        return evrak_no;
    }

    public void setEvrak_no(String evrak_no) {
        int no = parseInt(evrak_no);
        this.evrak_no = no;
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

    public int getgHesapNo() {
        return gHesapNo;
    }

    public void setgHesapNo(String gHesapNo) {
        int no = parseInt(gHesapNo);
        this.gHesapNo = no;
    }

    public int getaHesapNo() {
        return aHesapNo;
    }

    public void setaHesapNo(String aHesapNo) {
        int no = parseInt(aHesapNo);
        this.aHesapNo = no;
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
    
    @Override
    public void unvanOlustur(){
        this.yeniUnvan = this.aUnvan;
    }
    
}
