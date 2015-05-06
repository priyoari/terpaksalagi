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
public class Identitas {
    kenalan kenal= new kenalan();
    void lokasi(){
    Scanner scan = new Scanner(System.in);
    //kenalan kenal= new kenalan();
    System.out.println("Masukan nama ruang: ");
    kenal.setNamaRuang(scan.next());
    System.out.println("Masukan lokasi ruang: ");
    kenal.setLokasiRuang(scan.next());
    System.out.println("Pilih Program Studi/Fakultas");
    kenal.setProgramStudi(scan.next());
    
    // kondisi ruang
    System.out.println("Masukkan panjang ruang  : ");
    kenal.setPanjang(scan.nextInt());
        
    System.out.println("Masukkan lebar ruang    : ");
    kenal.setLebar(scan.nextInt());
            
//    System.out.println("Masukkan jumlah pintu   : ");
//    kenal.setJpintu(scan.nextInt());
//        
//    System.out.println("Masukkan jumlah jendela : ");
//    kenal.setJjendela(scan.nextInt());
    }
    
    
    boolean ruang(){
        kenal.setLuas(kenal.getPanjang()*kenal.getLebar());
       System.out.println("Luas ruang = "+kenal.getLuas());
       //cek bentuk ruang
       
       
       if(kenal.getPanjang()>kenal.getLebar()){
           System.out.println("sesuai");
           return true;
       }else if(kenal.getPanjang()<kenal.getLebar()){
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
        kenal.setRasio(kenal.getLuas()/kenal.getJkursi());
        if(kenal.getRasio()>=1){
            System.out.println("Rasio = "+kenal.getRasio() +"Sesuai");
            return true;
        }else{
            System.out.println("Rasio = "+kenal.getRasio() +"Tidak Sesuai");
        }
      return false;
         
    }
    
    
    

    
    
}
