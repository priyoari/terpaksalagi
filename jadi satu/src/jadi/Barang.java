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
public class Barang extends Identitas {
    Scanner scan= new Scanner (System.in);
    
    void input_infrastruktur(){
//    System.out.println("Masukkan panjang ruang  : ");
//    kenal.setPanjang(scan.nextInt());
//        
//    System.out.println("Masukkan lebar ruang    : ");
//    kenal.setLebar(scan.nextInt());
            
    System.out.println("Masukkan jumlah pintu   : ");
    kenal.setJpintu(scan.nextInt());
        
    System.out.println("Masukkan jumlah jendela : ");
    kenal.setJjendela(scan.nextInt());
        
    // jumlah,kondisi dan posisi
    System.out.println("Jumlah stop kontak: ");
    kenal.setKontak(scan.nextInt());
    System.out.print("Kondisi stop kontak baik (ya/tidak): ");
    kenal.setKondisiKontak(scan.next());
    System.out.print("Posisi stop kontak dekat dosen & dipojok (ya/tidak): ");
    kenal.setPosisiKontak(scan.next());
    
    // lingkungan
    System.out.println("Kondisi Lantai  : ");
//    System.out.println("1. Bersih");
//    System.out.println("2. Kotor");
//    System.out.print("Masukkan Pilihan    : ");
    kenal.setBersihlantai(scan.next().toUpperCase());
            
    System.out.println("Kondisi Dinding : ");
//    System.out.println("1. Bersih");
//    System.out.println("2. Kotor");
//    System.out.print("Masukkan Pilihan    : ");
    kenal.setBersihdinding(scan.next().toUpperCase());
            
    System.out.println("Kondisi Atap    : ");
//    System.out.println("1. Bersih");
//    System.out.println("2. Kotor");
//    System.out.print("Masukkan Pilihan    : ");
    kenal.setBersihatap(scan.next().toUpperCase());
            
    System.out.println("Kondisi Pintu   : ");
//    System.out.println("1. Bersih");
//    System.out.println("2. Kotor");
//    System.out.print("Masukkan Pilihan    : ");
    kenal.setBersihpintu(scan.next().toUpperCase());
            
    System.out.println("Kondisi Jendela : ");
//    System.out.println("1. Bersih");
//    System.out.println("2. Kotor");
//    System.out.print("Masukkan Pilihan    : ");
    kenal.setBersihjendela(scan.next().toUpperCase());
    
//    System.out.println("input jumlah stop kontak:");
//    kenal.getKontak(scan.nextInt());
//    
//        System.out.println("input konsisi stop kontak:");
//        kenal.getKondisiKontak(scan.next());
//    
    }
    
    @Override
    boolean ruang(){
        System.out.println("Masukan nama ruang: ");
        kenal.setNamaRuang(scan.next());
        System.out.println("Masukan lokasi ruang: ");
        kenal.setLokasiRuang(scan.next());
        System.out.println("Pilih Program Studi/Fakultas");
        kenal.setProgramStudi(scan.next());
        
        if(kenal.getJpintu()>=2){
            System.out.println("Jumlah pintu sesuai");
            return true;
        }else{
            System.out.println("Jumlah pintu tidak sesuai");
        }
       //ini yang jendela
       if(kenal.getJjendela()<1){
            System.out.println("Jumlah jendela sesuai");
            return true;
       }else{
            System.out.println("Jumlah jendela tidak sesuai");
        }

        return false;
    }
    
    boolean bangunan(){
       if(kenal.getBersihlantai().equals("BERSIH")){
            System.out.println("Kondisi lantai bersih, Sesuai");
            return true; 
        }   
        else{
            System.out.println("Kondisi lantai kotor, Tidak sesuai");
            //return false;
        }
        
        //atap
        if(kenal.getBersihatap().equals("BERSIH")){
            System.out.println("Kondisi atap bersih, Sesuai");
           return true;
        }
        else{
            System.out.println("Kondisi atap kotor, Tidak sesuai");
            //return false;
        }
        
        //pintu
         if(kenal.getBersihpintu().equals("BERSIH")){
            System.out.println("Kondisi pintu bersih, Sesuai");
            return true;
         }
         else{
            System.out.println("Kondisi pintu kotor, Tidak sesuai");
            //return false;
         }
         
           //jendela
         if(kenal.getBersihjendela().equals("BERSIH")){
            System.out.println("Kondisi jendela bersih, Sesuai");
            return true;
         }
         else{
            System.out.println("Kondisi jendela kotor, Tidak sesuai"); 
         }
         
         if(kenal.getKontak()>=4&&kenal.getKondisiKontak().equals("ya")&&kenal.getPosisiKontak().equals("ya")){
            System.out.println("Sesuai");
            return true;
         }
        if(kenal.getKontak()<=4||kenal.getKondisiKontak().equals("tidak")||kenal.getPosisiKontak().equals("tidak")){
            System.out.println("tidak Sesuai");
            return true;
        }
        
        
         
         return false;  
    }
    
}
