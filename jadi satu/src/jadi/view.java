package jadi;

public class view extends Barang{
    
   

    public view(String nm_ruang, String lokasi, String prog, int p, int l, int jumlah_kursi, int jumla_pintu, int jumlah_jendela, int jumlah_stopkontak, int rasio, String analisiskondisi, int stopkontak, String kondisi, String posisi, int luas, int kabel_lcd, String kondisi_kabel, String posisi_kabel, int lampu, String kondisi_lampu, String posisi_lampu, int kipas, String kondisi_kipas, String posisi_kipas, int AC, String kondisi_ac, String posisi_ac, int ssid, int bandwitd, String kondisi_cctv, String posisi_CCTV, String kondisi_lantai, String kodisi_atap, String kondisi_pintu, String kondisi_jendela, String cek_kondisi_bersih, int jumlah_pintu) {
        super(nm_ruang, lokasi, prog, p, l, jumlah_kursi, jumla_pintu, jumlah_jendela, jumlah_stopkontak, rasio, analisiskondisi, stopkontak, kondisi, posisi, luas, kabel_lcd, kondisi_kabel, posisi_kabel, lampu, kondisi_lampu, posisi_lampu, kipas, kondisi_kipas, posisi_kipas, AC, kondisi_ac, posisi_ac, ssid, bandwitd, kondisi_cctv, posisi_CCTV, kondisi_lantai, kodisi_atap, kondisi_pintu, kondisi_jendela, cek_kondisi_bersih, jumlah_pintu);
    }
    
   

    @Override
    boolean ruang(int p, int l, int luas) {
        return super.ruang(p, l, luas); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String [] args){
        
    }

    
    
}
