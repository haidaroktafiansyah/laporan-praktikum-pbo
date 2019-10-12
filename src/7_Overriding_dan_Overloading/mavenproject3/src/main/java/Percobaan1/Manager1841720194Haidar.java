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
public class Manager1841720194Haidar extends Karyawan1841720194Haidar{
    private double mTunjangan;
    private String mBagian;
    private Staff1841720194Haidar mSt[];

    public double getmTunjanganHaidar() {
        return mTunjangan;
    }

    public void setmTunjanganHaidar(double mTunjangan) {
        this.mTunjangan = mTunjangan;
    }

    public String getmBagianHaidar() {
        return mBagian;
    }

    public void setmBagianHaidar(String mBagian) {
        this.mBagian = mBagian;
    }

    public Staff1841720194Haidar[] getmStHaidar() {
        return mSt;
    }

    public void setmSt(Staff1841720194Haidar[] mSt) {
        this.mSt = mSt;
    }
    
    public void viewStaffHaidar(){
        int i;
        System.out.println("----------------");
        for(i=0; i<mSt.length; i++){
            mSt[i].lihatInfoHaidar();
        }
        System.out.println("----------------");
    }
    
    public void lihatInfoHaidar(){
        System.out.println("Manager :"+this.getmBagianHaidar());
        System.out.println("NIP :"+this.getmNipHaidar());
        System.out.println("nama :"+this.getmNamaHaidar());
        System.out.println("golongan :"+this.getmGolonganHaidar());
        System.out.println("tunjangan :"+this.getmTunjanganHaidar());
        System.out.printf("gaji :%.0f\n",this.getmGajiHaidar());
        System.out.println("bagian :"+this.getmBagianHaidar());
        this.viewStaffHaidar();
    }
    
    public double getGajiHaidar(){
        return super.getmGajiHaidar()+ mTunjangan;
    }
}
