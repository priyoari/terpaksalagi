package buku;

import java.util.Scanner;

public class AdminBuku {

    Buku book = new Buku();
    Scanner scan = new Scanner(System.in);
    Buku[] admin = new Buku[3];

    public void insertDataBuku() {
        for (int i = 0; i < admin.length; i++) {
            admin[i] = new Buku();
            System.out.print("Judul Buku    : ");
            admin[i].setJudul(scan.next());
            System.out.print("Penulis       : ");
            admin[i].setPenulis(scan.next());
            System.out.print("Jumlah Halaman  : ");
            admin[i].setJumlahHalaman(scan.nextInt());
            System.out.println("");
        }

    }

    void cetakDataBuku() {
        for (int i = 0; i < admin.length; i++) {
            System.out.println("");
            System.out.println("Judul Buku  : " + admin[i].getJudul());
            System.out.println("Penulis     : " + admin[i].getPenulis());
            System.out.println("Jumlah Halaman  : " + admin[i].getJumlahHalaman());
            System.out.println("");

        }

    }
    
    public
}
