/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author Haidar
 */
public class kipas1841720194Haidar1 {
    private String mBaling;
    private int mSpeed;
    private String mMode;
    public String mMerek;
    
    public void setBalingHaidar(){
        this.mBaling = "kotak";
    }
    
    public void setSpeedHaidar(){
        this.mSpeed = 2;
    }
    
    public void setMMode(){
        this.mMode = "muter-muter";
    }
    
    public void setmMerekhaidar(){
        this.mMerek = "maspion";
    }
    
    public void printHaidar(){
        System.out.println("jenis baling : "+mBaling);
        System.out.println("speed kipas : "+mSpeed);
        System.out.println("mode kipas : "+mMode);
        System.out.println("merek : "+mMerek);
    }
}
