public class Proses {
void proses(){
    // identitas ruang
   

    // kondisi ruang
     kenal.setLuas(kenal.getPanjang()*kenal.getLebar());
    System.out.println("Luas ruang = "+kenal.getLuas());
    
    if(kenal.getPanjang()==kenal.getLebar()){
        System.out.print("Persegi, Tidak sesuai");
    }else{
        System.out.println("Persegi panjang, Sesuai");
    }
    
    kenal.setRasio(kenal.getLuas()/kenal.getJkursi());
    if(kenal.getRasio()>=1){
        System.out.println("Rasio = "+kenal.getRasio() +"Sesuai");
    }else{
        System.out.println("Rasio = "+kenal.getRasio() +"Tidak Sesuai");
    }
    
    if(kenal.getJpintu()>=2){
        System.out.println("Jumlah pintu sesuai");
    }else{
        System.out.println("Jumlah pintu tidak sesuai");
    }
    if(kenal.getJjendela()>=1){
        System.out.println("Jumlah jendela sesuai");
    }else{
        System.out.println("Jumlah jendela tidak sesuai");
    }
    
    // jumlah,kondisi dan posisi
    if(kenal.getKontak()>=4&&kenal.getKondisiKontak().equals("ya")&&kenal.getPosisiKontak().equals("ya"))
        System.out.println("Sesuai");  
    if(kenal.getKontak()<=4||kenal.getKondisiKontak().equals("tidak")||kenal.getPosisiKontak().equals("tidak"))
        System.out.println("tidak Sesuai");
        
    if(kenal.getKabelLCD()>=1&&kenal.getKondisiKabelLCD().equals("ya")&&kenal.getPosisiKabelLCD().equals("ya"))
        System.out.println("Sesuai");
    if(kenal.getKabelLCD()<=1||kenal.getKondisiKabelLCD().equals("tidak")||kenal.getPosisiKabelLCD().equals("tidak"))
        System.out.println("tidak Sesuai");
        
    if(kenal.getLampu()>=18&&kenal.getKondisiLampu().equals("ya")&&kenal.getPosisiLampu().equals("ya"))
        System.out.println("Sesuai");
    if(kenal.getLampu()<=18||kenal.getKondisiLampu().equals("tidak")||kenal.getPosisiLampu().equals("tidak"))
        System.out.println("tidak Sesuai");
        
    if(kenal.getKipas()>=2&&kenal.getKondisiKipas().equals("ya")&&kenal.getPosisiKipas().equals("ya"))
        System.out.println("Sesuai");
    if(kenal.getKipas()<=2||kenal.getKondisiKipas().equals("tidak")||kenal.getPosisiKipas().equals("tidak"))
        System.out.println("tidak Sesuai");
        
    if(kenal.getAC()>=1&&kenal.getKondisiAC().equals("ya")&&kenal.getPosisiAC().equals("ya"))
        System.out.println("Sesuai");
    if(kenal.getAC()<=1||kenal.getKondisiAC().equals("tidak")||kenal.getPosisiAC().equals("tidak"))
        System.out.println("tidak Sesuai");
    
    if(kenal.getSSID()==1)
        System.out.println("Sesuai");
    if(kenal.getSSID()!=1)
        System.out.println("tidak Sesuai");
    
    if(kenal.getCCTV()>=2&&kenal.getKondisiCCTV().equals("ya")&&kenal.getPosisiCCTV().equals("ya"))
        System.out.println("Sesuai");
    if(kenal.getCCTV()<=2||kenal.getKondisiCCTV().equals("tidak")||kenal.getPosisiCCTV().equals("tidak"))
        System.out.println("tidak Sesuai");
    
    // lingkungan
    if(kenal.getKlantai()==1)
        System.out.println("Kondisi lantai bersih, Sesuai");
    else
        System.out.println("Kondisi lantai kotor, Tidak sesuai");
    
    if(kenal.getKdinding()==1)
        System.out.println("Kondisi dinding bersih, Sesuai");
    else
        System.out.println("Kondisi dinding kotor, Tidak sesuai");
    
    if(kenal.getKatap()==1)
        System.out.println("Kondisi atap bersih, Sesuai");
    else
        System.out.println("Kondisi atap kotor, Tidak sesuai");
    
    if(kenal.getKpintu()==1)
        System.out.println("Kondisi pintu bersih, Sesuai");
    else
        System.out.println("Kondisi pintu kotor, Tidak sesuai");
    
    if(kenal.getKjendela()==1)
        System.out.println("Kondisi jendela bersih, Sesuai");
    else
        System.out.println("Kondisi jendela kotor, Tidak sesuai");
    
    // kebersihan
    if(kenal.getSirkulasi()>4){
        System.out.println("sirkulasi oke!!");
    }else if(kenal.getSirkulasi()==4){
        System.out.println("sirkulasi lumayan");
    }else{
        System.out.println("sirkulasi buruk");
    }
    
    if(kenal.getPencahayaan()>=250){
        System.out.println("cahaya kurang");
    }else if(kenal.getPencahayaan()<=350){
        System.out.println("cahaya sesuai");
    }else{
        System.out.println("cahaya oke");
    }
    
    if(kenal.getPencahayaan()>=70){
        System.out.println("kelembapan parah");
    }else if(kenal.getPencahayaan()==75){
        System.out.println("kelembapan rata-rata");
    }else{
        System.out.println("ruangan sesuai");
    }
    
    if(kenal.getSuhu()<=25){
        System.out.println("sangat lembab");
    }else if(kenal.getSuhu()<=35){
        System.out.println("suhu sesuai");
    }else{
        System.out.println("suhu terlalu panas");
    }
    
    // kenyamanan
    if(kenal.getTkebisingan()==1)
        System.out.println("Tidak sesuai");
    else
        System.out.println("Sesuai");
    
    if(kenal.getTbau()==1)
        System.out.println("Tidak sesuai");
    else
        System.out.println("Sesuai");
    
    if(kenal.getTkebocoran()==1)
        System.out.println("Tidak sesuai");
    else
        System.out.println("Sesuai");
    
    if(kenal.getTkerusakan()==1)
        System.out.println("Tidak sesuai");
    else
        System.out.println("Sesuai");
    
    if(kenal.getTkeausan()==1)
        System.out.println("Tidak sesuai");
    else
        System.out.println("Sesuai");
    
    // keamanan
    if(kenal.getKondisi().equals("oke"))
        System.out.println("bangunan oke sip");
    else
        System.out.println("bangunan perlu renofasi");
    
    System.out.print("apakah jendela aman:");
    kenal.setJendela(scan.next());
    if(kenal.getKunci().equals("ada")&&kenal.getJendela().equals("aman"))
        System.out.println("keamanan oke sip");
    else
        System.out.println("rawan pencurian");
    
    System.out.println("Deteksi bahaya");
    if(kenal.getKondisi().equals("oke")&&kenal.getKunci().equals("ada"))
        System.out.println("bahaya teratasi");
    else
        System.out.println("banyak bahaya di ruangan itu");
                
    }    
}
