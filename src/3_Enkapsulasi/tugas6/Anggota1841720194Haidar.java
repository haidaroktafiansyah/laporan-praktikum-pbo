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

    public Anggota1841720194Haidar(String newKTP, String newName, int limit) {
        this.mKTP = newKTP;
        this.mNama = newName;;
        this.mLimitPeminjaman = limit;
    }

    public String getNama(){
        return mNama;
    }
    
    public int getLimitPinjaman(){
        return mLimitPeminjaman;
    }
    
    public void pinjam(int pinjam){
        if(mJumlahPinjaman+pinjam < mLimitPeminjaman){
            mJumlahPinjaman+=pinjam;
        }
        else{
            System.out.println("sudah batas maksimal peminjaman");
        }
    }
    
    public int getJumlahPinjaman(){
        return mJumlahPinjaman;
    }
    
    public void angsur(int ngangsur){
        int limitbawah = 10 * mJumlahPinjaman /100;
        if(ngangsur < limitbawah) System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman”.");
        else{
            mJumlahPinjaman-=ngangsur;
        }
    }
    
    public void menuHaidar(){
        System.out.println("1. for pinjam");
        System.out.println("2. for cek pinjaman");
        System.out.println("3. for cek limit pinjaman");
        System.out.println("4. for bayar angsuran");
        System.out.println("pilihan ?");
    }
}
