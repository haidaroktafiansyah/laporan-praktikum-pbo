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
public class Anggota1841720194Haidar {

    private String mNama;
    private String mAlamat;
    private float mSimpanan;

    Anggota1841720194Haidar(String nama, String alamat) {
        this.mNama = nama;
        this.mAlamat = alamat;
        this.mSimpanan = 0;
    }

    public void setNamaHaidar(String nama) {
        this.mNama = nama;
    }

    public void setAlamatHaidar(String alamat) {
        this.mAlamat = alamat;
    }

    public String getNamaHaidar() {
        return mNama;
    }

    public String getAlamatHaidar() {
        return mAlamat;
    }

    public float getSimpananHaidar() {
        return mSimpanan;
    }

    public void setorHaidar(float uang) {
        mSimpanan += uang;
    }

    public void pinjamHaidar(float uang) {
        mSimpanan -= uang;
    }
}
