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
public class Motor21841720194Haidar {

    private int mKecepatan = 0;
    private boolean mKontakOn = false;

    public void printStatusHaidar() {
        if (mKontakOn == true) {
            System.out.println("Kontak On");
        } else {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + mKecepatan + "\n");
    }
    
    public void nyalakanMesinHaidar(){
        mKontakOn = true;
    }
    
    public void matikanMesinHaidar(){
        mKontakOn = false;
        mKecepatan = 0;
    }
    
    public void tambahKecepatanHaidar(){
        if(mKontakOn==true){
            if(mKecepatan<100) mKecepatan +=5;
            else System.out.println("Udah Gas Poll Gan!");
        }
        else{
            System.out.println("kecepatan tidak bisa di tambah karena mesin off \n");
        }
    }
    
    public void kurangiKecepatanHaidar(){
        if(mKontakOn == true){
            mKecepatan -=5;
        }
        else{
            System.out.println("Kecepatan tidak bisa di kurangi karena mesin off \n");
        }
    }
}
