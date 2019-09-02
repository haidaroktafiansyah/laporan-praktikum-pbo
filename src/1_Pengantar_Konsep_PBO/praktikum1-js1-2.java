/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author Haidar
 */
public class sepeda {
    private String mMerek;
    private int mKecepatan;
    private int mGear;
    
    public void setMerekHaidar(String newValue){
        merek = newValue;
    }
    
    public void gantiGearHaidar(int newValue){
        gear = newValue;
    }
    
    public void tambahKecepatanHaidar(int increment){
        kecepatan = kecepatan + increment;
    }
    
    public void remHaidar(int decrement){
        kecepatan = kecepatan - decrement;
    }
    
    public void cetakStatusHaidar(){
        System.out.println("merek : " + merek);
        System.out.println("Kecepatan : "+ kecepatan);
        System.out.println("Gear : "+gear);
    }
}
