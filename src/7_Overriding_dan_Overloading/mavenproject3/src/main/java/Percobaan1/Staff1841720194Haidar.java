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
public class Staff1841720194Haidar extends Karyawan1841720194Haidar{
    private int mLembur;
    private double mGajiLembur;

    public int getmLemburHaidar() {
        return mLembur;
    }

    public void setmLemburHaidar(int mLembur) {
        this.mLembur = mLembur;
    }

    public double getGajiLemburHaidar() {
        return mGajiLembur;
    }

    public void setGajiLemburHaidar(double gajiLembur) {
        this.mGajiLembur = gajiLembur;
    }
    
    public double getmGajiHaidar(int mLembur, double mGajiLembur){
        return (super.getmGajiHaidar() + mLembur * mGajiLembur);
    }

    @Override
    public double getmGajiHaidar() {
        return (super.getmGajiHaidar() + mLembur *mGajiLembur); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void lihatInfoHaidar(){
        System.out.println("nip :"+super.getmNipHaidar());
        System.out.println("nama :"+super.getmNamaHaidar());
        System.out.println("golongan :"+super.getmGolonganHaidar());
        System.out.println("jml lembur :"+this.getmLemburHaidar());
        System.out.printf("gaji lembur :%.0f\n", this.getGajiLemburHaidar());
        System.out.printf("gaji :%.0f\n", this.getmGajiHaidar());
    }
}
