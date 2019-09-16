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
public class Anggota1841720194Haidar {

    private String mKTP;
    private String mNama;
    private int mLimitPeminjaman;
    private int mJumlahPinjaman;

    public Anggota1841720194Haidar(String newKTP, String newName, int pinjamanAwal) {
        this.mKTP = newKTP;
        this.mNama = newName;;
        this.mJumlahPinjaman = pinjamanAwal;
    }

    public String getNama(){
        return mNama;
    }
    
    public int getLimitPinjaman(){
        return mLimitPeminjaman;
    }
    
    public void pinjam(int pinjam){
        mJumlahPinjaman+=pinjam;
    }
    
    public int getJumlahPinjaman(){
        return mJumlahPinjaman;
    }
    
    public void angsur(int ngangsur){
        int limitbawah = 10 * mJumlahPinjaman /100;
        if(ngangsur < limitbawah) System.out.println("di bawah limit");
        else{
            mJumlahPinjaman-=ngangsur;
        }
    }
}
