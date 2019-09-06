/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author Haidar
 */
public class barang1841720194Haidar {
    public String mKode;
    public String mNamaBarang;
    public int mHargaDasar;
    public float mDiskon ;
    
    public float hitungHargaJualHaidar(){
        return mHargaDasar - (mDiskon * mHargaDasar/100);
    }
    
    public void tampilDataHaidar(){
        System.out.println("kode "+mKode);
        System.out.println("namaBarang "+mNamaBarang);
        System.out.println("harga dasar "+mHargaDasar);
        System.out.println("diskon "+mDiskon);
        System.out.println("harga jual "+hitungHargaJualHaidar());
    }
}
