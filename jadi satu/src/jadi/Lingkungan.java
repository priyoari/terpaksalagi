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
public class Lingkungan extends Identitas implements Spesialisnya_Kelas{
    //@Override;
            
     Scanner scan= new Scanner(System.in);
     kenalan kenal= new kenalan();
     
    private int Tkebisingan;
    private int Tbau;
    private int Tkebocoran;
    private int Tkerusakan;
    private int Tkeausan;

    public Lingkungan(String nm_ruang, String lokasi, String prog, int p, int l, int jumlah_kursi, int jumla_pintu, int jumlah_jendela, int jumlah_stopkontak, int rasio, String analisiskondisi, int stopkontak, String kondisi, String posisi, int luas, int kabel_lcd, String kondisi_kabel, String posisi_kabel, int lampu, String kondisi_lampu, String posisi_lampu, int kipas, String kondisi_kipas, String posisi_kipas, int AC, String kondisi_ac, String posisi_ac, int ssid, int bandwitd, String kondisi_cctv, String posisi_CCTV
            , String kondisi_lantai, String kodisi_atap, String kondisi_pintu, String kondisi_jendela, String cek_kondisi_bersih, int jumlah_pintu
            ,int bising,int bau,int bocor,int rusak,int aus) {
        super(nm_ruang, lokasi, prog, p, l, jumlah_kursi, jumla_pintu, jumlah_jendela, jumlah_stopkontak, rasio, analisiskondisi, stopkontak, kondisi, posisi, luas, kabel_lcd, kondisi_kabel, posisi_kabel, lampu, kondisi_lampu, posisi_lampu, kipas, kondisi_kipas, posisi_kipas, AC, kondisi_ac, posisi_ac, ssid, bandwitd, kondisi_cctv, posisi_CCTV, kondisi_lantai, kodisi_atap, kondisi_pintu, kondisi_jendela, cek_kondisi_bersih, jumlah_pintu);
        this.Tbau=bau;
        this.Tkeausan=aus;
        this.Tkebisingan=bising;
        this.Tkebocoran=bocor;
        this.Tkerusakan=rusak;
    
    }

    @Override
    boolean seleksi() {
        //To change body of generated methods, choose Tools | Templates.
        if(this.getTkebisingan()==1){
            System.out.println("Tidak sesuai");
            return false;
        }
        else{
            System.out.println("Sesuai");
        }
        //bau
        if(this.getTbau()==1){
            System.out.println("Tidak sesuai");
            return false;
        }
       else{
            System.out.println("Sesuai");
         }
        //bocor
        if(this.getTkebocoran()==1){
            System.out.println("Tidak sesuai");
            return false;
        }
        else{
            System.out.println("Sesuai");
        }
        
        return true;
    }

    @Override
    public void isi() {
        System.out.println("apakah bising:");
        this.Tkebisingan=scan.nextInt();
        System.out.println("1.ya");
        System.out.println("2.tidak");
        System.out.println();
        System.out.println("apakah bocor:");
        this.Tkebocoran=scan.nextInt();
        System.out.println("1.ya");
        System.out.println("2.tidak");
        System.out.println();
        System.out.println("apakah aus:");
        this.Tkeausan=scan.nextInt();
        System.out.println("1.ya");
        System.out.println("2.tidak");
        System.out.println();
        System.out.println("apakah rusak:");
        this.Tkerusakan=scan.nextInt();
        System.out.println("1.ya");
        System.out.println("2.tidak");
    }

    
}
