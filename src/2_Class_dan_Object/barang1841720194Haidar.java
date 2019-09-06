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
public class barang1841720194Haidar {
    public String mNamaBrg;
    public String mJenisBrg;
    public int mStok;
    
    public void tampilBarangHaidar(){
        System.out.println("Nama Barang     : "+mNamaBrg);
        System.out.println("Jenis Barang    : "+mJenisBrg);
        System.out.println("Stok            : "+mStok);
    }
    
    public int tambahStokHaidar(int sBrgMasuk){
        int sStokbaru=sBrgMasuk+mStok;
        return sStokbaru;
    }
}