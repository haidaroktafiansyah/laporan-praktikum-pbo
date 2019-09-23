/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Haidar
 */
public class player {
    private String mHero;
    account pemain;

    public player() {
    }

    public player(String mHero, account pemain) {
        this.mHero = mHero;
        this.pemain = pemain;
    }

    public String getmHero() {
        return mHero;
    }

    public account getpemain() {
        return pemain;
    }

    public void setmHero(String mHero) {
        this.mHero = mHero;
    }

    public player(String mHero) {
        this.mHero = mHero;
    }

    public void setpemain(account penumpang) {
        this.pemain = penumpang;
    }
    
    public String info() {
        String info = "";
        info += "Nomor: " + mHero + "\n";
        if (this.pemain != null) {
            info += "Player: " + pemain.info() + "\n";
        }
        return info;
    }
}
