package Lingkungan;

import java.util.Scanner;

public class Controllingkungan {
    Kenallingkungan kenal = new Kenallingkungan();
    Scanner scan = new Scanner(System.in);
    public void input(){
        System.out.println("Kondisi Lantai  : ");
        System.out.println("1. Bersih");
        System.out.println("2. Kotor");
        System.out.print("Masukkan Pilihan    : ");
        kenal.setKlantai(scan.nextInt());
        System.out.println("--------------------");
        
        System.out.println("Kondisi Dinding : ");
        System.out.println("1. Bersih");
        System.out.println("2. Kotor");
        System.out.print("Masukkan Pilihan    : ");
        kenal.setKdinding(scan.nextInt());
        System.out.println("--------------------");
        
        System.out.println("Kondisi Atap    : ");
        System.out.println("1. Bersih");
        System.out.println("2. Kotor");
        System.out.print("Masukkan Pilihan    : ");
        kenal.setKatap(scan.nextInt());
        System.out.println("--------------------");
        
        System.out.println("Kondisi Pintu   : ");
        System.out.println("1. Bersih");
        System.out.println("2. Kotor");
        System.out.print("Masukkan Pilihan    : ");
        kenal.setKpintu(scan.nextInt());
        System.out.println("--------------------");
        
        System.out.println("Kondisi Jendela : ");
        System.out.println("1. Bersih");
        System.out.println("2. Kotor");
        System.out.print("Masukkan Pilihan    : ");
        kenal.setKjendela(scan.nextInt());
        System.out.println("--------------------");
        
    }
}
