import java.util.Scanner;
public class Proses {
    kenalan kenal = new kenalan();
    Scanner scan = new Scanner (System.in);
    
    
    // kondisi ruang
    
   void ruang(){
       //cek luas
       kenal.setLuas(kenal.getPanjang()*kenal.getLebar());
       System.out.println("Luas ruang = "+kenal.getLuas());
       //cek bentuk ruang
        if(kenal.getPanjang()==kenal.getLebar()){
            System.out.print("Persegi, Tidak sesuai");
            //return false;
        }else{
            System.out.println("Persegi panjang, Sesuai");
            //return true;
        }
        //ini separator
        System.out.println("////////////////////////////////");
        //cek rasio
        kenal.setRasio(kenal.getLuas()/kenal.getJkursi());
        if(kenal.getRasio()>=1){
            System.out.println("Rasio = "+kenal.getRasio() +"Sesuai");
            
        }else{
            System.out.println("Rasio = "+kenal.getRasio() +"Tidak Sesuai");
        }
            
   }
   
   
   void kondisisarana(){
       //cek pintu dan jendela
       if(kenal.getJpintu()>=2){
            System.out.println("Jumlah pintu sesuai");
        }else{
            System.out.println("Jumlah pintu tidak sesuai");
        }
       //ini yang jendela
       if(kenal.getJendela()<1){
            System.out.println("Jumlah jendela sesuai");
        }else{
            System.out.println("Jumlah jendela tidak sesuai");
        }
       
       //ini cek listrik dan perangkat yang butuh listrik
        if(kenal.getKontak()>=4&&kenal.getKondisiKontak().equals("ya")&&kenal.getPosisiKontak().equals("ya"))
            System.out.println("Sesuai");
        if(kenal.getKontak()<=4||kenal.getKondisiKontak().equals("tidak")||kenal.getPosisiKontak().equals("tidak"))
            System.out.println("tidak Sesuai");
        
        //ini lcd cek nya
        
        if(kenal.getKabelLCD()>=1&&kenal.getKondisiKabelLCD().equals("ya")&&kenal.getPosisiKabelLCD().equals("ya"))
            System.out.println("Sesuai");
        if(kenal.getKabelLCD()<=1||kenal.getKondisiKabelLCD().equals("tidak")||kenal.getPosisiKabelLCD().equals("tidak"))
            System.out.println("tidak Sesuai");
        
        //ini lampu nya
        if(kenal.getLampu()>=18&&kenal.getKondisiLampu().equals("ya")&&kenal.getPosisiLampu().equals("ya"))
            System.out.println("Sesuai");
        if(kenal.getLampu()<=18||kenal.getKondisiLampu().equals("tidak")||kenal.getPosisiLampu().equals("tidak"))
            System.out.println("tidak Sesuai");
        
        //ini kipas
        if(kenal.getKipas()>=2&&kenal.getKondisiKipas().equals("ya")&&kenal.getPosisiKipas().equals("ya"))
            System.out.println("Sesuai");
        if(kenal.getKipas()<=2||kenal.getKondisiKipas().equals("tidak")||kenal.getPosisiKipas().equals("tidak"))
            System.out.println("tidak Sesuai");

        
        //ini ac cek 
        if(kenal.getAC()>=1&&kenal.getKondisiAC().equals("ya")&&kenal.getPosisiAC().equals("ya"))
            System.out.println("Sesuai");
        if(kenal.getAC()<=1||kenal.getKondisiAC().equals("tidak")||kenal.getPosisiAC().equals("tidak"))
            System.out.println("tidak Sesuai");
        
        //internet
        if(kenal.getSSID()==1)
            System.out.println("Sesuai");
        if(kenal.getSSID()!=1)
            System.out.println("tidak Sesuai");
        
        
        //ini cctv
        if(kenal.getCCTV()>=2&&kenal.getKondisiCCTV().equals("ya")&&kenal.getPosisiCCTV().equals("ya"))
            System.out.println("Sesuai");
        if(kenal.getCCTV()<=2||kenal.getKondisiCCTV().equals("tidak")||kenal.getPosisiCCTV().equals("tidak"))
            System.out.println("tidak Sesuai");
   }
     
    
    
    
   
    
           
   
    
    
        
    
        
    
       
    
        
    
   
    
    
    String kebersihan(){
        //lantai
        if(kenal.getKlantai()==1){
            System.out.println("Kondisi lantai bersih, Sesuai");
            return "sesuai"; 
        }   
        else{
            System.out.println("Kondisi lantai kotor, Tidak sesuai");
            return "tidak";
        }
        
        //atap
        if(kenal.getKatap()==1){
            System.out.println("Kondisi atap bersih, Sesuai");
           return "sesuai";
        }
        else{
            System.out.println("Kondisi atap kotor, Tidak sesuai");
            return "tidak";
        }
        
        //pintu
         if(kenal.getKpintu()==1){
            System.out.println("Kondisi pintu bersih, Sesuai");
            return "sesuai";
         }
         else{
            System.out.println("Kondisi pintu kotor, Tidak sesuai");
            return "tidak";
         }
         
           //jendela
         if(kenal.getKjendela()==1){
            System.out.println("Kondisi jendela bersih, Sesuai");
            return "sesuai";
         }
         else{
            System.out.println("Kondisi jendela kotor, Tidak sesuai"); 
            return "tidak";
         }
    }    
    
    
    
    String lingkungan_nyaman(){
        //di bawah cek udara
        if(kenal.getSirkulasi()>4){
            System.out.println("sirkulasi oke!!");
            return "sesuai";
        }else if(kenal.getSirkulasi()==4){
            System.out.println("sirkulasi lumayan");
            return "sesuai";
        }else{
            System.out.println("sirkulasi buruk");
            return "tidak";
        }
        
        //yang di bawah cahaya
        if(kenal.getPencahayaan()>=250){
            System.out.println("cahaya kurang");
            return "sesuai";
        }else if(kenal.getPencahayaan()<=350){
            System.out.println("cahaya sesuai");
            //return true;
        }else{
            System.out.println("cahaya oke");
            //return true;
        }
        
        //yang ini kelembapan
        if(kenal.getLembab()>=70){
            System.out.println("kelembapan parah");
        }else if(kenal.getLembab()==75){
            System.out.println("kelembapan rata-rata");
        }else{
            System.out.println("ruangan sesuai");
        }
        
        //suhu
        if(kenal.getSuhu()<=25){
            System.out.println("sangat lembab");
        }else if(kenal.getSuhu()<=35){
            System.out.println("suhu sesuai");
        }else{
            System.out.println("suhu terlalu panas");
        }
        
        
        //bising
        if(kenal.getTkebisingan()==1)
            System.out.println("Tidak sesuai");
        else
            System.out.println("Sesuai");
    
        //bau
        if(kenal.getTbau()==1)
            System.out.println("Tidak sesuai");
        else
            System.out.println("Sesuai");
        
        //bocor
        if(kenal.getTkebocoran()==1)
            System.out.println("Tidak sesuai");
        else
            System.out.println("Sesuai");
    }
 
    
    
    
   
    
    
    
 
        
    // kebersihan
    
    
    
    
        
   
    
    
    
    
    
    //ini batas lingkungan_nyaman()
    
    boolean rusak(){
        if(kenal.getTkerusakan()==1)
            System.out.println("Tidak sesuai");
        else
            System.out.println("Sesuai");
    }
    
    boolean aus(){
        if(kenal.getTkeausan()==1)
            System.out.println("Tidak sesuai");
        else
            System.out.println("Sesuai");
    }
        
    // keamanan
    boolean kondisi(){
        if(kenal.getKondisi().equals("oke"))
            System.out.println("bangunan oke sip");
        else
            System.out.println("bangunan perlu renofasi");
    }
    
    boolean jendela(){
        System.out.print("apakah jendela aman:");
        kenal.setJendela(scan.next());
        if(kenal.getKunci().equals("ada")&&kenal.getJendela().equals("aman")){
            System.out.println("keamanan oke sip");
            return true;
        }
        else{
            System.out.println("rawan pencurian");
            return false;
        }
    }    
    
    String keamanan(){
        System.out.println("Deteksi bahaya");
        if(kenal.getKondisi().equals("oke")&&kenal.getKunci().equals("ada")){
            System.out.println("bahaya teratasi");
            return "sesuai";
        }
        else{
            System.out.println("banyak bahaya di ruangan itu");
            return "tidak sesuai";
        }
    }
    
                
}    

