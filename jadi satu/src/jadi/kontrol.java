package jadi;


import java.util.Scanner;

public class kontrol {
    Scanner scan = new Scanner(System.in);
    kenalan kenal = new kenalan();
    
    void input(){
    // identitas ruang
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
    kenal.setBersihlantai(scan.next());
            
    System.out.println("Kondisi Dinding : ");
//    System.out.println("1. Bersih");
//    System.out.println("2. Kotor");
//    System.out.print("Masukkan Pilihan    : ");
    kenal.setBersihdinding(scan.next());
            
    System.out.println("Kondisi Atap    : ");
//    System.out.println("1. Bersih");
//    System.out.println("2. Kotor");
//    System.out.print("Masukkan Pilihan    : ");
    kenal.setBersihatap(scan.next());
            
    System.out.println("Kondisi Pintu   : ");
//    System.out.println("1. Bersih");
//    System.out.println("2. Kotor");
//    System.out.print("Masukkan Pilihan    : ");
    kenal.setBersihpintu(scan.next());
            
    System.out.println("Kondisi Jendela : ");
//    System.out.println("1. Bersih");
//    System.out.println("2. Kotor");
//    System.out.print("Masukkan Pilihan    : ");
    kenal.setBersihjendela(scan.next());
        
    // kebersihan
    System.out.print("masukkan jumlah sirkulasi:");
    kenal.setSirkulasi(scan.nextInt());
    
    System.out.print("masukkan jumlah pencahayaan / lampu:");
    kenal.setPencahayaan(scan.nextInt());
    
    System.out.print("masukkan intensitas kelembapan");
    kenal.setLembab(scan.nextInt());
    
    System.out.print("masukkan suhu ruangan:");
    kenal.setSuhu(scan.nextInt());
        
    // kenyamanan
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
    
    // keamanan
    System.out.print("cek kondisi bangunan:");
    kenal.setAmankokoh(scan.next());
        
    System.out.print("apakah kunci ada:");
    kenal.setAmankunci(scan.next());
    System.out.print("apakah jendala aman:");
    kenal.setAmanjendela(scan.next());
        
    }
        
}
