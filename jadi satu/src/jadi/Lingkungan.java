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
    void input_suhu(){
        System.out.print("masukkan intensitas kelembapan");
        kenal.setLembab(scan.nextInt());
    
        System.out.print("masukkan suhu ruangan:");
        kenal.setSuhu(scan.nextInt());
    }
    
    void input_lingkungan(){
        System.out.print("Tingkat kebisingan : \n");
        System.out.println("1. Bising");
        System.out.println("2. Tidak bising");
        System.out.print("Masukkan Pilihan    : ");
        kenal.setTkebisingan(scan.nextInt());

        System.out.println("Tingkat bau : ");
        System.out.println("1. Bau");
        System.out.println("2. Tidak Bau");
        System.out.print("Masukkan Pilihan    : ");
        kenal.setTbau(scan.nextInt());

        System.out.println("Tingkat kebocoran :");
        System.out.println("1. Bocor");
        System.out.println("2. Tidak bocor");
        System.out.print("Masukkan Pilihan    : ");
        kenal.setTkebocoran(scan.nextInt());

        System.out.println("Tingkat kerusakan :");
        System.out.println("1. Rusak");
        System.out.println("2. Baik");
        System.out.print("Masukkan Pilihan    : ");
        kenal.setTkerusakan(scan.nextInt());

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
    boolean ruang(){
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
