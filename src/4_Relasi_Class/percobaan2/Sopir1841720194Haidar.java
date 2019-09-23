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
public class Sopir1841720194Haidar {
    private String mNama;
    private int mBiaya;

    public Sopir1841720194Haidar() {
    }

    public String getmNama() {
        return mNama;
    }

    public int getmBiaya() {
        return mBiaya;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public void setmBiaya(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
    public int hitungBiayaSopirHaidar(int hari){
        return mBiaya * hari;
    }
}
