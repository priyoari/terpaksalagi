package Kenyaman;

import java.util.Scanner;

public class Controlkenyamanan {
    Kenalkenyamanan kenal = new Kenalkenyamanan();
    Scanner scan = new Scanner(System.in);
    public void input(){
        System.out.print("Tingkat kebisingan : \n");
        System.out.println("1. Bising");
        System.out.println("2. Tidak bising");
        System.out.print("Masukkan Pilihan    : ");
        kenal.setTkebisingan(scan.nextInt());
        System.out.println("--------------------");
        
        System.out.println("Tingkat bau : ");
        System.out.println("1. Bau");
        System.out.println("2. Tidak Bau");
        System.out.print("Masukkan Pilihan    : ");
        kenal.setTbau(scan.nextInt());
        System.out.println("--------------------");
        
        System.out.println("Tingkat kebocoran :");
        System.out.println("1. Bocor");
        System.out.println("2. Tidak bocor");
        System.out.print("Masukkan Pilihan    : ");
        kenal.setTkebocoran(scan.nextInt());
        System.out.println("--------------------");
        
        System.out.println("Tingkat kerusakan :");
        System.out.println("1. Rusak");
        System.out.println("2. Baik");
        System.out.print("Masukkan Pilihan    : ");
        kenal.setTkerusakan(scan.nextInt());
        System.out.println("--------------------");
        
        System.out.println("Tingkat keausan :");
        System.out.println("1. Aus");
        System.out.println("2. Baik");
        System.out.print("Masukkan Pilihan    : ");
        kenal.setTkeausan(scan.nextInt());
        System.out.println("--------------------");
    }
}
