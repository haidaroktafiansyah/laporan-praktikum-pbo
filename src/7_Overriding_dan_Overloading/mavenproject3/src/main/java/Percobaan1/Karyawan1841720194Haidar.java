/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan1;

/**
 *
 * @author Haidar
 */
public class Karyawan1841720194Haidar {
    private String mNama;
    private String mNip;
    private String mGolongan;
    private double mGaji;

    public String getmNamaHaidar() {
        return mNama;
    }

    public void setmNamaHaidar(String mNama) {
        this.mNama = mNama;
    }

    public String getmNipHaidar() {
        return mNip;
    }

    public void setmNipHaidar(String mNip) {
        this.mNip = mNip;
    }

    public String getmGolonganHaidar() {
        return mGolongan;
    }

    public void setmGolonganHaidar(String mGolongan) {
        this.mGolongan = mGolongan;
        
        switch(mGolongan.charAt(0)){
            case '1': this.mGaji = 5000000;
                break;
            case '2': this.mGaji = 3000000;
                break;
            case '3': this.mGaji = 2000000;
                break;
            case '4': this.mGaji = 1000000;
                break;
            case '5': this.mGaji = 750000;
                break;
        }
    }

    public double getmGajiHaidar() {
        return mGaji;
    }

    public void setmGajiHaidar(double mGaji) {
        this.mGaji = mGaji;
    }

    
}
