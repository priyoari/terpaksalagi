package jadi;

import java.util.Scanner;
public abstract class Identitas {
   // kenalan kenal= new kenalan();
    private String namaRuang;
    private String lokasiRuang;
    private String programStudi;
    
// kondisi ruang
    private int Panjang;
    private int Lebar;
    private int Luas;
    private int Jkursi;
    private int Rasio;
    private int Jpintu;
    private int Jjendela;
    private String Analisiskondisi;
    
// jumlah,kondisi dan posisi
    private int Kontak;
    private String KondisiKontak;
    private String PosisiKontak;
    
    private int KabelLCD;
    private String KondisiKabelLCD;
    private String PosisiKabelLCD;
    
    private int Lampu;
    private String KondisiLampu;
    private String PosisiLampu;
    
    private int Kipas;
    private String KondisiKipas;
    private String PosisiKipas;
    
    private int AC;
    private String KondisiAC;
    private String PosisiAC;
    
    private int SSID;
    private int Bandwidth;
    
    private int CCTV;
    private String KondisiCCTV;
    private String PosisiCCTV;

// lingkungan
    private String Bersihlantai;
    private String Bersihdinding;
    private String Bersihatap;
    private String Bersihpintu;
    private String Bersihjendela;
    private String Analisisbersih;
    
// kebersihan
    private int sirkulasi;
    private int pencahayaan;
    private int lembab;
    private int suhu;
    
// kenyamanan
    private int Tkebisingan;
    private int Tbau;
    private int Tkebocoran;
    private int Tkerusakan;
    private int Tkeausan;
    
// keamanan
    private String amankokoh;
    private String amankunci;
    private String amanjendela;
    private String amankondisi;

    
    public Identitas(String nm_ruang,String lokasi,String prog,int p,int l
            ,int jumlah_kursi,int jumla_pintu,int jumlah_jendela,int jumlah_stopkontak,int rasio,String analisiskondisi,int stopkontak,String kondisi,String posisi
            ,int luas,int kabel_lcd,String kondisi_kabel,String posisi_kabel,int lampu,String kondisi_lampu,String posisi_lampu
            ,int kipas,String kondisi_kipas,String posisi_kipas,int AC,String kondisi_ac,String posisi_ac,int ssid,int bandwitd,String kondisi_cctv
            ,String posisi_CCTV,String kondisi_lantai,String kodisi_atap,String kondisi_pintu,String kondisi_jendela,String cek_kondisi_bersih
            ,int jumlah_pintu){
        this.namaRuang=nm_ruang;
        this.lokasiRuang=lokasi;
        this.programStudi=prog;
        this.Lebar=l;
        this.Panjang=p;
        this.Luas=luas;
        this.AC=AC;
        this.Bandwidth=bandwitd;
        this.Bersihjendela=kondisi_jendela;
        this.Bersihatap=kodisi_atap;
        this.Bersihlantai=kondisi_lantai;
        this.Bersihpintu=kondisi_pintu;
        this.Jjendela=jumlah_jendela;
        this.Jkursi=jumlah_kursi;
        this.Jpintu=jumlah_pintu;
        this.KabelLCD=kabel_lcd;
        this.Kipas=kipas;
        this.KondisiAC=kondisi_ac;
        this.KondisiCCTV=kondisi_cctv;
        this.KondisiKabelLCD=kondisi_kabel;
        this.KondisiKipas=kondisi_kipas;
        this.KondisiKontak=kondisi;
        this.KondisiLampu=kondisi_lampu;
        //this.Kontak=;
        this.Rasio=rasio;
    }
    
    
    
    

    
    
    void lokasi(String nm_ruang,String lokasi,String prog,int l,int p){
    Scanner scan = new Scanner(System.in);
    //kenalan kenal= new kenalan();
    System.out.println("Masukan nama ruang: ");
    this.namaRuang=scan.next();
    System.out.println("Masukan lokasi ruang: ");
    this.lokasiRuang=scan.next();
    System.out.println("Pilih Program Studi/Fakultas");
    this.programStudi=scan.next();
    
    // kondisi ruang
    System.out.println("Masukkan panjang ruang  : ");
    this.Panjang=scan.nextInt();
        
    System.out.println("Masukkan lebar ruang    : ");
    this.Lebar=scan.nextInt();
            
//    System.out.println("Masukkan jumlah pintu   : ");
//    kenal.setJpintu(scan.nextInt());
//        
//    System.out.println("Masukkan jumlah jendela : ");
//    kenal.setJjendela(scan.nextInt());
    }
    
    
    
    abstract boolean seleksi();
    
    
    boolean ruang(int p,int l,int luas){
        luas=p*l;
       System.out.println("Luas ruang = "+luas);
       //cek bentuk ruang
       
       
       if(p>l){
           System.out.println("sesuai");
           return true;
       }else if(p<l){
           System.out.println("lebar");
           return true;
       }else{
           System.out.println("tidak");
       }
//        if(kenal.getPanjang()==kenal.getLebar()){
//            System.out.print("Persegi, Tidak sesuai");
//            return true;
//        }else{
//            System.out.println("Persegi panjang, Sesuai");
//            
//        }
        //ini separator
        //System.out.println("////////////////////////////////");
        //cek rasio
//        kenal.setRasio(kenal.getLuas()/kenal.getJkursi());
//        if(kenal.getRasio()>=1){
//            System.out.println("Rasio = "+kenal.getRasio() +"Sesuai");
//            return true;
//        }else{
//            System.out.println("Rasio = "+kenal.getRasio() +"Tidak Sesuai");
//        }
      return false;
         
    }

    /**
     * @return the namaRuang
     */
    public String getNamaRuang() {
        return namaRuang;
    }

    /**
     * @return the lokasiRuang
     */
    public String getLokasiRuang() {
        return lokasiRuang;
    }

    /**
     * @return the programStudi
     */
    public String getProgramStudi() {
        return programStudi;
    }

    /**
     * @return the Panjang
     */
    public int getPanjang() {
        return Panjang;
    }

    /**
     * @return the Lebar
     */
    public int getLebar() {
        return Lebar;
    }

    /**
     * @return the Luas
     */
    public int getLuas() {
        return Luas;
    }

    /**
     * @return the Jkursi
     */
    public int getJkursi() {
        return Jkursi;
    }

    /**
     * @return the Rasio
     */
    public int getRasio() {
        return Rasio;
    }

    /**
     * @return the Jpintu
     */
    public int getJpintu() {
        return Jpintu;
    }

    /**
     * @return the Jjendela
     */
    public int getJjendela() {
        return Jjendela;
    }

    /**
     * @return the Analisiskondisi
     */
    public String getAnalisiskondisi() {
        return Analisiskondisi;
    }

    /**
     * @return the Kontak
     */
    public int getKontak() {
        return Kontak;
    }

    /**
     * @return the KondisiKontak
     */
    public String getKondisiKontak() {
        return KondisiKontak;
    }

    /**
     * @return the PosisiKontak
     */
    public String getPosisiKontak() {
        return PosisiKontak;
    }

    /**
     * @return the KabelLCD
     */
    public int getKabelLCD() {
        return KabelLCD;
    }

    /**
     * @return the KondisiKabelLCD
     */
    public String getKondisiKabelLCD() {
        return KondisiKabelLCD;
    }

    /**
     * @return the PosisiKabelLCD
     */
    public String getPosisiKabelLCD() {
        return PosisiKabelLCD;
    }

    /**
     * @return the Lampu
     */
    public int getLampu() {
        return Lampu;
    }

    /**
     * @return the KondisiLampu
     */
    public String getKondisiLampu() {
        return KondisiLampu;
    }

    /**
     * @return the PosisiLampu
     */
    public String getPosisiLampu() {
        return PosisiLampu;
    }

    /**
     * @return the Kipas
     */
    public int getKipas() {
        return Kipas;
    }

    /**
     * @return the KondisiKipas
     */
    public String getKondisiKipas() {
        return KondisiKipas;
    }

    /**
     * @return the PosisiKipas
     */
    public String getPosisiKipas() {
        return PosisiKipas;
    }

    /**
     * @return the AC
     */
    public int getAC() {
        return AC;
    }

    /**
     * @return the KondisiAC
     */
    public String getKondisiAC() {
        return KondisiAC;
    }

    /**
     * @return the PosisiAC
     */
    public String getPosisiAC() {
        return PosisiAC;
    }

    /**
     * @return the SSID
     */
    public int getSSID() {
        return SSID;
    }

    /**
     * @return the Bandwidth
     */
    public int getBandwidth() {
        return Bandwidth;
    }

    /**
     * @return the CCTV
     */
    public int getCCTV() {
        return CCTV;
    }

    /**
     * @return the KondisiCCTV
     */
    public String getKondisiCCTV() {
        return KondisiCCTV;
    }

    /**
     * @return the PosisiCCTV
     */
    public String getPosisiCCTV() {
        return PosisiCCTV;
    }

    /**
     * @return the Bersihlantai
     */
    public String getBersihlantai() {
        return Bersihlantai;
    }

    /**
     * @return the Bersihdinding
     */
    public String getBersihdinding() {
        return Bersihdinding;
    }

    /**
     * @return the Bersihatap
     */
    public String getBersihatap() {
        return Bersihatap;
    }

    /**
     * @return the Bersihpintu
     */
    public String getBersihpintu() {
        return Bersihpintu;
    }

    /**
     * @return the Bersihjendela
     */
    public String getBersihjendela() {
        return Bersihjendela;
    }

    /**
     * @return the Analisisbersih
     */
    public String getAnalisisbersih() {
        return Analisisbersih;
    }

    /**
     * @return the sirkulasi
     */
    public int getSirkulasi() {
        return sirkulasi;
    }

    /**
     * @return the pencahayaan
     */
    public int getPencahayaan() {
        return pencahayaan;
    }

    /**
     * @return the lembab
     */
    public int getLembab() {
        return lembab;
    }

    /**
     * @return the suhu
     */
    public int getSuhu() {
        return suhu;
    }

    /**
     * @return the Tkebisingan
     */
    public int getTkebisingan() {
        return Tkebisingan;
    }

    /**
     * @return the Tbau
     */
    public int getTbau() {
        return Tbau;
    }

    /**
     * @return the Tkebocoran
     */
    public int getTkebocoran() {
        return Tkebocoran;
    }

    /**
     * @return the Tkerusakan
     */
    public int getTkerusakan() {
        return Tkerusakan;
    }

    /**
     * @return the Tkeausan
     */
    public int getTkeausan() {
        return Tkeausan;
    }

    /**
     * @return the amankokoh
     */
    public String getAmankokoh() {
        return amankokoh;
    }

    /**
     * @return the amankunci
     */
    public String getAmankunci() {
        return amankunci;
    }

    /**
     * @return the amanjendela
     */
    public String getAmanjendela() {
        return amanjendela;
    }

    /**
     * @return the amankondisi
     */
    public String getAmankondisi() {
        return amankondisi;
    }
    
    
    

    
    
}