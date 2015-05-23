package jadi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class Barang extends Identitas implements Spesialisnya_Kelas{
    Scanner scan= new Scanner (System.in);
        private int jumlah_pintu;
        private int jumlah_jendela;
        private int kontak;
        private String kondisi_kontak;
        private String posisi_kontak;
        private int kondisi_lantai;
        private int kondisi_dinding;
        private int kondisi_atap;
        private int kondisi_pintu;
        private int kondisi_jendela;
                
    public Barang(String nm_ruang, String lokasi, String prog, int p, int l, int jumlah_kursi, int jumla_pintu, int jumlah_jendela, int jumlah_stopkontak, int rasio, String analisiskondisi, int stopkontak, String kondisi, String posisi, int luas, int kabel_lcd, String kondisi_kabel, String posisi_kabel, int lampu, String kondisi_lampu, String posisi_lampu, int kipas, String kondisi_kipas, String posisi_kipas, int AC, String kondisi_ac, String posisi_ac, int ssid, int bandwitd, String kondisi_cctv, String posisi_CCTV, String kondisi_lantai, String kodisi_atap, String kondisi_pintu, String kondisi_jendela, String cek_kondisi_bersih, int jumlah_pintu) {
        super(nm_ruang, lokasi, prog, p, l, jumlah_kursi, jumla_pintu, jumlah_jendela, jumlah_stopkontak, rasio, analisiskondisi, stopkontak, kondisi, posisi, luas, kabel_lcd, kondisi_kabel, posisi_kabel, lampu, kondisi_lampu, posisi_lampu, kipas, kondisi_kipas, posisi_kipas, AC, kondisi_ac, posisi_ac, ssid, bandwitd, kondisi_cctv, posisi_CCTV, kondisi_lantai, kodisi_atap, kondisi_pintu, kondisi_jendela, cek_kondisi_bersih, jumlah_pintu);
        this.jumlah_jendela=jumlah_jendela;
        this.jumlah_pintu=jumlah_pintu;
        this.kondisi_kontak=kondisi_kontak;
        
    }

    
    
    
   
   
    
    
   
    
//    void input_infrastruktur(){
////    System.out.println("Masukkan panjang ruang  : ");
////    kenal.setPanjang(scan.nextInt());
////        
////    System.out.println("Masukkan lebar ruang    : ");
////    kenal.setLebar(scan.nextInt());
//            
//    System.out.println("Masukkan jumlah pintu   : ");
//    this.jumlah_pintu=scan.nextInt();
//        
//    System.out.println("Masukkan jumlah jendela : ");
//    this.jumlah_jendela=scan.nextInt();
//        
//    // jumlah,kondisi dan posisi
//    System.out.println("Jumlah stop kontak: ");
//    this.kontak=scan.nextInt();
//    System.out.print("Kondisi stop kontak baik (ya/tidak): ");
//    this.kondisi_kontak=scan.next();
//    System.out.print("Posisi stop kontak dekat dosen & dipojok (ya/tidak): ");
//    
//    
//    // lingkungan
//    System.out.println("Kondisi Lantai  : ");
////    System.out.println("1. Bersih");
////    System.out.println("2. Kotor");
////    System.out.print("Masukkan Pilihan    : ");
//   // this.=scan.next();
//            
//    System.out.println("Kondisi Dinding : ");
////    System.out.println("1. Bersih");
////    System.out.println("2. Kotor");
////    System.out.print("Masukkan Pilihan    : ");
//    this.getBersihdinding();
//    
//            
//    System.out.println("Kondisi Atap    : ");
////    System.out.println("1. Bersih");
////    System.out.println("2. Kotor");
////    System.out.print("Masukkan Pilihan    : ");
//    this.getBersihatap();
//            
//    System.out.println("Kondisi Pintu   : ");
////    System.out.println("1. Bersih");
////    System.out.println("2. Kotor");
////    System.out.print("Masukkan Pilihan    : ");
//    this.getBersihpintu();
//            
//    System.out.println("Kondisi Jendela : ");
////    System.out.println("1. Bersih");
////    System.out.println("2. Kotor");
////    System.out.print("Masukkan Pilihan    : ");
//    this.getBersihjendela();
//    
////    System.out.println("input jumlah stop kontak:");
////    kenal.getKontak(scan.nextInt());
////    
////        System.out.println("input konsisi stop kontak:");
////        kenal.getKondisiKontak(scan.next());
////    
//    }
    
//    @Override
//    boolean ruang(int p, int l,int luas){
//        System.out.println("Masukan nama ruang: ");
//        this.getNamaRuang();
//        System.out.println("Masukan lokasi ruang: ");
//        this.getLokasiRuang();
//        System.out.println("Pilih Program Studi/Fakultas");
//        this.getProgramStudi();
//        
//        if(this.getJpintu()>=2){
//            System.out.println("Jumlah pintu sesuai");
//            return true;
//        }else{
//            System.out.println("Jumlah pintu tidak sesuai");
//        }
//       //ini yang jendela
//       if(this.getJjendela()<1){
//            System.out.println("Jumlah jendela sesuai");
//            return true;
//       }else{
//            System.out.println("Jumlah jendela tidak sesuai");
//        }
//
//        return false;
//    }
//    
//    
//    boolean bangunan(){
//       if(this.getBersihlantai().equals("BERSIH")){
//            System.out.println("Kondisi lantai bersih, Sesuai");
//             
//        }   
//        else{
//            System.out.println("Kondisi lantai kotor, Tidak sesuai");
//            //return false;
//        }
//        
//        //atap
//        if(this.getBersihatap().equals("BERSIH")){
//            System.out.println("Kondisi atap bersih, Sesuai");
//           
//        }
//        else{
//            System.out.println("Kondisi atap kotor, Tidak sesuai");
//            //return false;
//        }
//        
//        //pintu
//         if(this.getBersihpintu().equals("BERSIH")){
//            System.out.println("Kondisi pintu bersih, Sesuai");
//            
//         }
//         else{
//            System.out.println("Kondisi pintu kotor, Tidak sesuai");
//            //return false;
//         }
//         
//           //jendela
//         if(this.getBersihjendela().equals("BERSIH")){
//            System.out.println("Kondisi jendela bersih, Sesuai");
//            //return true;
//         }
//         else{
//            System.out.println("Kondisi jendela kotor, Tidak sesuai"); 
//         }
//         
//         if(this.getKontak()>=4&&this.getKondisiKontak().equals("ya")&&this.getPosisiKontak().equals("ya")){
//            System.out.println("Sesuai");
//            //return true;
//         }
//        if(this.getKontak()<=4||this.getKondisiKontak().equals("tidak")||this.getPosisiKontak().equals("tidak")){
//            System.out.println("tidak Sesuai");
//            //return true;
//        }
//        
//        
         
         //return false;  
    //}

    /**
     * @return the jumlah_pintu
     */
    public int getJumlah_pintu() {
        return jumlah_pintu;
    }

    /**
     * @return the jumlah_jendela
     */
    public int getJumlah_jendela() {
        return jumlah_jendela;
    }

    /**
     * @return the kontak
     */
    public int getKontak() {
        return kontak;
    }

    /**
     * @return the kondisi_kontak
     */
    public String getKondisi_kontak() {
        return kondisi_kontak;
    }
    
    
    

    @Override
    boolean seleksi() {
        try{
            ObjectInputStream is=new ObjectInputStream(new FileInputStream("barang.txt"));
            this.jumlah_pintu=(int) is.readObject();
            this.jumlah_jendela=(int) is.readObject();
            this.kondisi_lantai=(int) is.readObject();
            this.kondisi_atap=(int) is.readObject();
            this.kondisi_pintu=(int) is.readObject();
            this.kondisi_jendela=(int) is.readObject();
            this.kondisi_kontak=(String) is.readObject();
            
            if(this.getJpintu()>=2){
                System.out.println("Jumlah pintu sesuai");
                return true;
            }else{
                System.out.println("Jumlah pintu tidak sesuai");
            }
            //ini yang jendela
            if(this.getJjendela()<1){
                System.out.println("Jumlah jendela sesuai");
                return true;
            }else{
                System.out.println("Jumlah jendela tidak sesuai");
            }
       
            if(this.getBersihlantai().equals("BERSIH")){
                System.out.println("Kondisi lantai bersih, Sesuai");
            }else{
                System.out.println("Kondisi lantai kotor, Tidak sesuai");
                //return false;
            }
        
            //atap
            if(this.getBersihatap().equals("BERSIH")){
                System.out.println("Kondisi atap bersih, Sesuai");
            }else{
                System.out.println("Kondisi atap kotor, Tidak sesuai");
                //return false;
            }
            //pintu
            if(this.getBersihpintu().equals("BERSIH")){
                System.out.println("Kondisi pintu bersih, Sesuai");
            }else{
                System.out.println("Kondisi pintu kotor, Tidak sesuai");
                //return false;
            }
            //jendela
            if(this.getBersihjendela().equals("BERSIH")){
                System.out.println("Kondisi jendela bersih, Sesuai");
                //return true;
            }else{
                System.out.println("Kondisi jendela kotor, Tidak sesuai"); 
            }
         
            if(this.getKontak()>=4&&this.getKondisiKontak().equals("ya")&&this.getPosisiKontak().equals("ya")){
               System.out.println("Sesuai");
               //return true;
            }
            
            if(this.getKontak()<=4||this.getKondisiKontak().equals("tidak")||this.getPosisiKontak().equals("tidak")){
               System.out.println("tidak Sesuai");
               //return true;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
         
        return false;  

        //return false; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void isi() {
        
        try{
            FileOutputStream fs= new FileOutputStream("barang.txt");
            ObjectOutputStream os= new ObjectOutputStream(fs);
            System.out.println("Masukkan jumlah pintu   : ");
            os.writeObject(this.jumlah_pintu);
            System.out.println("Masukkan jumlah jendela : ");
            os.writeObject(this.jumlah_jendela);
            // jumlah,kondisi dan posisi
            System.out.println("Jumlah stop kontak: ");
            os.writeObject(this.kontak);
            System.out.print("Kondisi stop kontak baik (ya/tidak): ");
            os.writeObject(this.kondisi_kontak);
            System.out.print("Posisi stop kontak dekat dosen & dipojok (ya/tidak): ");
            os.writeObject(this.posisi_kontak);
            // lingkungan
            System.out.println("Kondisi Lantai  : ");
            os.writeObject(this.kondisi_lantai);
            System.out.println("Kondisi Dinding : ");
            os.writeObject(this.kondisi_dinding);
            System.out.println("Kondisi Atap    : ");
            os.writeObject(this.kondisi_atap);
            System.out.println("Kondisi Pintu   : ");
            os.writeObject(this.kondisi_pintu);
            System.out.println("Kondisi Jendela : ");
            os.writeObject(this.kondisi_jendela);
        }catch(Exception ex){
            ex.printStackTrace();
        }
            
    }
    
}