package Kondisi;

import java.util.Scanner;

public class Controlkondisi {
    Kenalkondisi kenal = new Kenalkondisi();
    Scanner scan = new Scanner(System.in);
    public void Input(){
        System.out.println("Masukkan panjang ruang  : ");
        kenal.setPanjang(scan.nextInt());
        System.out.println("--------------------");
        
        System.out.println("Masukkan lebar ruang    : ");
        kenal.setLebar(scan.nextInt());
        System.out.println("--------------------");
        
        System.out.println("Masukkan jumlah pintu   : ");
        kenal.setJpintu(scan.nextInt());
        System.out.println("--------------------");
        
        System.out.println("Masukkan jumlah jendela : ");
        kenal.setJjendela(scan.nextInt());
        System.out.println("--------------------");
        
    }
}
