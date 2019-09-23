/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan2;

/**
 *
 * @author Haidar
 */
public class Pelanggan1841720194Haidar {
    private String mNama ;
    private Mobil1841720194Haidar mMobil;
    private Sopir1841720194Haidar mSopir;
    private int mHari;

    public Pelanggan1841720194Haidar() {
    }
    
    

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public void setmMobil(Mobil1841720194Haidar mMobil) {
        this.mMobil = mMobil;
    }

    public void setmSopir(Sopir1841720194Haidar mSopir) {
        this.mSopir = mSopir;
    }

    public void setmHari(int mHari) {
        this.mHari = mHari;
    }

    public String getmNama() {
        return mNama;
    }

    public Mobil1841720194Haidar getmMobil() {
        return mMobil;
    }

    public Sopir1841720194Haidar getmSopir() {
        return mSopir;
    }

    public int getmHari() {
        return mHari;
    }
    
    public int hitungBiayaTotalHaidar(){
        return mMobil.hitungBiayaHariHaidar(mHari) + mSopir.hitungBiayaSopirHaidar(mHari);
    }
}
