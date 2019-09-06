/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

import java.util.Scanner;

/**
 *
 * @author Haidar
 */
public class main1841720194Haidar {
    public static void main(String[] args) {
        barang1841720194Haidar brg = new barang1841720194Haidar();
        Scanner sc = new Scanner(System.in);
               
        System.out.println("kode");
        brg.mKode=sc.nextLine();
        System.out.println("namaBarang ");
        brg.mNamaBarang=sc.nextLine();
        System.out.println("harga dasar ");
        brg.mHargaDasar = sc.nextInt();
        System.out.println("diskon ");
        brg.mDiskon = sc.nextFloat();
        System.out.println("harga jual "+brg.hitungHargaJualHaidar());
    }
}
