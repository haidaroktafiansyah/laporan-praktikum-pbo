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
public class Mobil1841720194Haidar {
    private String mMerk;
    private int mBiaya;

    public Mobil1841720194Haidar(String mMerk, int mBiaya) {
        this.mMerk = mMerk;
        this.mBiaya = mBiaya;
    }

    public Mobil1841720194Haidar() {
    }

    public String getmMerk() {
        return mMerk;
    }

    public int getmBiaya() {
        return mBiaya;
    }

    public void setmMerk(String mMerk) {
        this.mMerk = mMerk;
    }

    public void setmBiaya(int mBiaya) {
        this.mBiaya = mBiaya;
    }
    
    public int hitungBiayaHariHaidar(int hari){
        return mBiaya * hari;
    }
}
