/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum_1;

/**
 *
 * @author Haidar
 */
public class Sepeda1841720194Haidar {
    private String mMerek;
    private int mKecepatan;
    private int mGear;
    
    public void setMerekHaidar(String newValue){
        mMerek = newValue;
    }
    
    public void gantiGearHaidar(int newValue){
        mGear = newValue;
    }
    
    public void tambahKecepatanHaidar(int increment){
        mKecepatan = mKecepatan + increment;
    }
    
    public void remHaidar(int decrement){
        mKecepatan = mKecepatan - decrement;
    }
    
    public void cetakStatusHaidar(){
        System.out.println("merek : " + mMerek);
        System.out.println("Kecepatan : "+ mKecepatan);
        System.out.println("Gear : "+mGear);
    }
}
