/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan3;

/**
 *
 * @author Haidar
 */
public class testBarang1841720194Haidar {
    public static void main(String[] args) {
        barang1841720194Haidar sbrg1 = new barang1841720194Haidar();
        sbrg1.mNamaBrg = "pensil";
        sbrg1.mJenisBrg = "ATK";
        sbrg1.mStok = 10;
        sbrg1.tampilBarangHaidar();
        System.out.println("Stok baru adalah "+sbrg1.tambahStokHaidar(20));
    }
}
