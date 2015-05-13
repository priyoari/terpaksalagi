/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jadi;

/**
 *
 * @author mozaze
 */
import java.util.Scanner;
public class Lingkungan extends Identitas{
    //@Override;
            
     Scanner scan= new Scanner(System.in);

    public Lingkungan(String nm_ruang, String lokasi, String prog, int p, int l, int jumlah_kursi, int jumla_pintu, int jumlah_jendela, int jumlah_stopkontak, int rasio, String analisiskondisi, int stopkontak, String kondisi, String posisi, int luas, int kabel_lcd, String kondisi_kabel, String posisi_kabel, int lampu, String kondisi_lampu, String posisi_lampu, int kipas, String kondisi_kipas, String posisi_kipas, int AC, String kondisi_ac, String posisi_ac, int ssid, int bandwitd, String kondisi_cctv, String posisi_CCTV, String kondisi_lantai, String kodisi_atap, String kondisi_pintu, String kondisi_jendela, String cek_kondisi_bersih, int jumlah_pintu) {
        super(nm_ruang, lokasi, prog, p, l, jumlah_kursi, jumla_pintu, jumlah_jendela, jumlah_stopkontak, rasio, analisiskondisi, stopkontak, kondisi, posisi, luas, kabel_lcd, kondisi_kabel, posisi_kabel, lampu, kondisi_lampu, posisi_lampu, kipas, kondisi_kipas, posisi_kipas, AC, kondisi_ac, posisi_ac, ssid, bandwitd, kondisi_cctv, posisi_CCTV, kondisi_lantai, kodisi_atap, kondisi_pintu, kondisi_jendela, cek_kondisi_bersih, jumlah_pintu);
    }
    void input_suhu(){
        System.out.print("masukkan intensitas kelembapan");
        this.getLembab();
    
        System.out.print("masukkan suhu ruangan:");
        this.getSuhu();
    }
    
    void input_lingkungan(){
        System.out.print("Tingkat kebisingan : \n");
        System.out.println("1. Bising");
        System.out.println("2. Tidak bising");
        System.out.print("Masukkan Pilihan    : ");
        this.getTkebisingan();

        System.out.println("Tingkat bau : ");
        System.out.println("1. Bau");
        System.out.println("2. Tidak Bau");
        System.out.print("Masukkan Pilihan    : ");
        this.getTbau();

        System.out.println("Tingkat kebocoran :");
        System.out.println("1. Bocor");
        System.out.println("2. Tidak bocor");
        System.out.print("Masukkan Pilihan    : ");
        this.getTkebocoran();

        System.out.println("Tingkat kerusakan :");
        System.out.println("1. Rusak");
        System.out.println("2. Baik");
        System.out.print("Masukkan Pilihan    : ");
        this.getTkerusakan();

        System.out.println("Tingkat keausan :");
        System.out.println("1. Aus");
        System.out.println("2. Baik");
        System.out.print("Masukkan Pilihan    : ");
        kenal.setTkeausan(scan.nextInt());
    
    }
    
    String cek_lingkungan(){
        if(kenal.getTkebisingan()==1){
            System.out.println("Tidak sesuai");
            return "sesuai";
        }
        else{
            System.out.println("Sesuai");
        }
        //bau
        if(kenal.getTbau()==1){
            System.out.println("Tidak sesuai");
            return "sesuai";
        }
       else{
            System.out.println("Sesuai");
         }
        //bocor
        if(kenal.getTkebocoran()==1){
            System.out.println("Tidak sesuai");
            return "sesuai";
        }
        else{
            System.out.println("Sesuai");
        }
        
        return "tidak sesuai";
    }
    
    
    void input_aman(){
            System.out.print("cek kondisi bangunan:");
            kenal.setAmankokoh(scan.next());

            System.out.print("apakah kunci ada:");
            kenal.setAmankunci(scan.next());
            System.out.print("apakah jendala aman:");
            kenal.setAmanjendela(scan.next());
    }
    
    
    String cek_aman(){
         if(kenal.getTkerusakan()==1){
            System.out.println("Tidak sesuai");
            return "ridak sesuai";
        }
        else
            System.out.println("Sesuai");
        
        
        //aus
        if(kenal.getTkeausan()==1){
            System.out.println("Tidak sesuai");
            return "tidak sesuai";
        }
        else{
            System.out.println("Sesuai");
        }
        //kondisi
        if(kenal.getAmankunci().equals("oke")){
            System.out.println("bangunan oke sip");
            return "sesuai";
        }
        else{
            System.out.println("bangunan perlu renofasi");
        }
        //jendela
        System.out.print("apakah jendela aman:");
        kenal.setAmanjendela(scan.next());
        if(kenal.getAmankunci().equals("ada")&&kenal.getAmanjendela().equals("aman")){
            System.out.println("keamanan oke sip");
            return "sesuai";
        }
        else{
            System.out.println("rawan pencurian");
            //return false;
        }
        //aman
        System.out.println("Deteksi bahaya");
        if(kenal.getAmankondisi().equals("oke")&&kenal.getAmankunci().equals("ada")){
            System.out.println("bahaya teratasi");
            return "sesuai";
        }
        else{
            System.out.println("banyak bahaya di ruangan itu");
            //return "tidak sesuai";
        }
        
        return "tidak sesuai";
       
    }
    
    
    
    
   // @Override;
    boolean ruang(int panjang,int lebar){
        System.out.println("Masukan nama ruang: ");
        kenal.setNamaRuang(scan.next());
        System.out.println("Masukan lokasi ruang: ");
        kenal.setLokasiRuang(scan.next());
        System.out.println("Pilih Program Studi/Fakultas");
        kenal.setProgramStudi(scan.next());
        
        
    
        if(kenal.getSuhu()<=25){
            System.out.println("sangat lembab");
            return false;
        }else if(kenal.getSuhu()<=35){
            System.out.println("suhu sesuai");
            return true;
        }else{
            System.out.println("suhu terlalu panas");
        }
        return false;
    }
    
    
}
